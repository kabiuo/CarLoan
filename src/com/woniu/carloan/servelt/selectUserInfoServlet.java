package com.woniu.carloan.servelt;

import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.service.selcetUserInfoService;
import com.woniu.carloan.service.Impl.selcetUserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/selectUserInfoServlet")
public class selectUserInfoServlet extends HttpServlet {
    private selcetUserInfoService selcetUserInfoService = new selcetUserInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        List<IDcardInfo> uilist = new ArrayList<IDcardInfo>();

        String userNumber = request.getParameter("userNumber");
        String userName = request.getParameter("userName");
        String company = request.getParameter("company");

        if (userNumber != null && userName != null && company != null){
            uilist = selcetUserInfoService.selectUserinfo(userNumber,userName,company);
            request.setAttribute("userinfolist", uilist);
            request.getRequestDispatcher("userinfo.jsp").forward(request, response);
        } else {
            uilist = selcetUserInfoService.selectUserinfo();
            request.setAttribute("userinfolist", uilist);
            request.getRequestDispatcher("userinfo.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
