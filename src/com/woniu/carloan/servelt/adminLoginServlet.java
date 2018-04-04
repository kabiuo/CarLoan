package com.woniu.carloan.servelt;

import com.woniu.carloan.service.Impl.adminLoginServiceImpl;
import com.woniu.carloan.service.adminLoginService;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends javax.servlet.http.HttpServlet {
    private adminLoginService adminService=new adminLoginServiceImpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String adminName = request.getParameter("username");
        String adminPassword = request.getParameter("password");
        String atuser = request.getParameter("atuser");
        String user1 = "管理员";
        String user2 = "客服";
//        request.setAttribute("username", adminName);
//        System.out.println(atuser);
        if (atuser.equals(user1)){
            if(adminService.login(adminName, adminPassword)){
                request.getRequestDispatcher("selectUserInfoServlet").forward(request, response);
            }else{
                response.setContentType("text/html;charset=utf-8");

                PrintWriter out=response.getWriter();

                out.print("<script language='javascript'>alert('登陆失败，重新登陆');window.location.href='index.jsp';</script>");
            }
        }else if(atuser.equals(user2)){
//            CusserLoginServlet
            request.getRequestDispatcher("CusserLoginServlet").forward(request, response);
        }else {

        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
