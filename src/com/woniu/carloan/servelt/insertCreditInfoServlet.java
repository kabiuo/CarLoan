package com.woniu.carloan.servelt;

import com.woniu.carloan.bean.Creditinfo;
import com.woniu.carloan.service.Impl.insertIDcardInfoServiceImpl;
import com.woniu.carloan.service.insertIDcardInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insertCreditInfoServlet")
public class insertCreditInfoServlet extends HttpServlet {
    private com.woniu.carloan.service.insertIDcardInfoService insertIDcardInfoService = new insertIDcardInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int userID = Integer.valueOf(request.getParameter("userid"));;
        String IDcard = request.getParameter("IDcard");
        String username = request.getParameter("username");
        String estate = request.getParameter("estate");
        String mortgage = request.getParameter("mortgage");
        String carproduction = request.getParameter("carproduction");
        String carloans = request.getParameter("carloans");
        String creditcard = request.getParameter("creditcard");

        Creditinfo creditinfo = new Creditinfo(userID,IDcard,username,estate,mortgage,carproduction,carloans,creditcard);

        if (insertIDcardInfoService.addCreditinfo(creditinfo)){
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('所有信息录入成功！将返回主页面！');window.location.href='selectUserInfoServlet';</script>");
        }else {
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('录入失败！');window.location.href='Creditinfo.jsp';</scrip>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
