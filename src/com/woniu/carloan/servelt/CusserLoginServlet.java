package com.woniu.carloan.servelt;

import com.woniu.carloan.service.Impl.adminLoginServiceImpl;
import com.woniu.carloan.service.adminLoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CusserLoginServlet")
public class CusserLoginServlet extends HttpServlet {
    private adminLoginService adminService=new adminLoginServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String adminName = request.getParameter("username");
        String adminPassword = request.getParameter("password");

        if(adminService.Cusserlogin(adminName, adminPassword)){
            request.getRequestDispatcher("selectUserInfoServlet").forward(request, response);
        }else{
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('登陆失败，重新登陆');window.location.href='index.jsp';</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
