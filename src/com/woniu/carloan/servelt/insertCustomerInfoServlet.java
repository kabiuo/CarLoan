package com.woniu.carloan.servelt;

import com.woniu.carloan.bean.Customerinfo;
import com.woniu.carloan.service.Impl.insertIDcardInfoServiceImpl;
import com.woniu.carloan.service.insertIDcardInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insertCustomerInfoServlet")
public class insertCustomerInfoServlet extends HttpServlet {
    private insertIDcardInfoService insertIDcardInfoService = new insertIDcardInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");


        int userid = Integer.valueOf(request.getParameter("userid"));
        String username = request.getParameter("username");
        String IDcard = request.getParameter("IDcard");
        String peraddress = request.getParameter("peraddress");
        String usertel = request.getParameter("usertel");
        String unit = request.getParameter("unit");
        String unitaddress = request.getParameter("unitaddress");
        String unitpro = request.getParameter("unitpro");
        String unittel = request.getParameter("unittel");
        String salary = request.getParameter("salary");
        String salesman = request.getParameter("salesman");
        String commissioner = request.getParameter("commissioner");

//        carinfo.setUserID(userid);
//        System.out.print(carinfo.getUserID());
        request.setAttribute("iduser",userid);
        Customerinfo customerinfo = new Customerinfo(userid,username,IDcard,peraddress,usertel,unit,unitaddress,unitpro,unittel,salary,salesman,commissioner);



        if (insertIDcardInfoService.addCustomerInfo(customerinfo)){
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('录入成功！开始录入车辆信息!');</script>");
            request.getRequestDispatcher("Carinfo.jsp").forward(request, response);
        }else {
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();

            out.print("<script language='javascript'>alert('录入失败！');window.location.href='Customerinfo.jsp';</scrip>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
