package com.woniu.carloan.servelt;

import com.woniu.carloan.service.Impl.selcetUserInfoServiceImpl;
import com.woniu.carloan.service.selcetUserInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/inspectServlet")
public class inspectServlet extends HttpServlet {
    private selcetUserInfoService selcetUserInfoService = new selcetUserInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int uid = Integer.valueOf(request.getParameter("id"));
        String username = request.getParameter("username");
        String Idcard = request.getParameter("idcard");

        request.setAttribute("uid",uid);
        request.setAttribute("username",username);
        request.setAttribute("Idcard",Idcard);

        if (selcetUserInfoService.inspect(uid)){
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('该客户信息已录入！');window.location.href='selectUserInfoServlet';</script>");
        } else {
            request.getRequestDispatcher("Customerinfo.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
