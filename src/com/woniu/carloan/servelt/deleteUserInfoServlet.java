package com.woniu.carloan.servelt;

import com.woniu.carloan.service.Impl.selcetUserInfoServiceImpl;
import com.woniu.carloan.service.deleteUserInfoService;
import com.woniu.carloan.service.Impl.deleteUserInfoServiceImpl;
import com.woniu.carloan.service.selcetUserInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteUserInfoServlet")
public class deleteUserInfoServlet extends HttpServlet {
    private selcetUserInfoService selcetUserInfoService = new selcetUserInfoServiceImpl();
    private deleteUserInfoService deleteUserInfoService = new deleteUserInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int uid = Integer.valueOf(request.getParameter("id"));
//        System.out.print("\n"+uid);

        if (selcetUserInfoService.inspect(uid)){
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('正在删除该客户所有信息！');window.location.href='selectUserInfoServlet';</script>");
//            request.getRequestDispatcher("selectUserInfoServlet").forward(request, response);
        } else {
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('该客户申请信息未录入！已删除身份证信息！');window.location.href='selectUserInfoServlet';</script>");
//            request.getRequestDispatcher("selectUserInfoServlet").forward(request, response);
        }

        if (deleteUserInfoService.deleteUserInfo(uid)){
            response.sendRedirect("selectUserInfoServlet");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
