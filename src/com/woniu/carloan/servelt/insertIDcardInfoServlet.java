package com.woniu.carloan.servelt;

import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.service.insertIDcardInfoService;
import com.woniu.carloan.service.Impl.insertIDcardInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insertIDcardInfoServlet")
public class insertIDcardInfoServlet extends HttpServlet {
    private insertIDcardInfoService insertIDcardInfoService = new insertIDcardInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String sex = request.getParameter("sex");
        String nation = request.getParameter("nation");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        String IDcard = request.getParameter("IDcard");
        String issuingorgan = request.getParameter("issuingorgan");
        String starttime = request.getParameter("starttime");
        String stoptime = request.getParameter("stoptime");
        String producttype = request.getParameter("producttype");
        int useid = -1;
        String userNumber = request.getParameter("usernumber");
        String company = request.getParameter("company");
        IDcardInfo idinfo = new IDcardInfo(useid,userNumber,company,username,sex,nation,birthday,address,IDcard,issuingorgan,starttime,stoptime,producttype);
        if (insertIDcardInfoService.addUserInfo(idinfo)){
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('录入成功！');window.location.href='selectUserInfoServlet';</script>");
        }else {
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('录入失败！');window.location.href='IDcardinfo.jsp';</scrip>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
