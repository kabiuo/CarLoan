package com.woniu.carloan.servelt;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.service.Impl.selcetUserInfoServiceImpl;
import com.woniu.carloan.service.selcetUserInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/selectAllUserInfoServlet")
public class selectAllUserInfoServlet extends HttpServlet {
    private com.woniu.carloan.service.selcetUserInfoService selcetUserInfoService = new selcetUserInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        IDcardInfo userinfolist = new IDcardInfo();
        Customerinfo customerinfoslist = new Customerinfo();
        Carinfo carinfoslist = new Carinfo();
        Creditinfo creditinfoslist = new Creditinfo();

        int uid = Integer.valueOf(request.getParameter("id"));
        if (selcetUserInfoService.inspect(uid)){
            userinfolist = selcetUserInfoService.selectAllUserinfo(uid);
            customerinfoslist = selcetUserInfoService.selectAllCustomerinfo(uid);
            carinfoslist = selcetUserInfoService.selectAllCarinfo(uid);
            creditinfoslist = selcetUserInfoService.selectAllCreditinfo(uid);

            request.setAttribute("userinfolist",userinfolist);
            request.setAttribute("customerinfoslist",customerinfoslist);
            request.setAttribute("carinfoslist",carinfoslist);
            request.setAttribute("creditinfoslist",creditinfoslist);

            request.getRequestDispatcher("allUserinfo.jsp").forward(request, response);
        } else {
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('该客户车贷申请信息未被录入！点击车贷信息录入进行录入！');window.location.href='selectUserInfoServlet';</script>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
