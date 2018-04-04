package com.woniu.carloan.servelt;

import com.woniu.carloan.bean.Carinfo;
import com.woniu.carloan.bean.IDcardInfo;
import com.woniu.carloan.service.Impl.insertIDcardInfoServiceImpl;
import com.woniu.carloan.service.Impl.selcetUserInfoServiceImpl;
import com.woniu.carloan.service.insertIDcardInfoService;
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

@WebServlet("/insertCarinfoServlet")
public class insertCarinfoServlet extends HttpServlet {
    private insertIDcardInfoService insertIDcardInfoService = new insertIDcardInfoServiceImpl();
    private selcetUserInfoService selcetUserInfoService = new selcetUserInfoServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        List<IDcardInfo> uilist = new ArrayList<IDcardInfo>();

        int userID = Integer.valueOf(request.getParameter("userid"));
        String licenseplate = request.getParameter("licenseplate");
        String engineno = request.getParameter("engineno");
        String color = request.getParameter("color");
        String brandmodel = request.getParameter("brandmodel");
        String fristdate = request.getParameter("fristdate");
        String deadline = request.getParameter("deadline");
        String chassisnumber = request.getParameter("chassisnumber");
        String price = request.getParameter("price");
        String mileage = request.getParameter("mileage");
        String IDcard = request.getParameter("IDcard");
        String nvoice = request.getParameter("nvoice");
        String openpolicy = request.getParameter("openpolicy");
        String carkey = request.getParameter("carkey");
        String certificate = request.getParameter("certificate");
        String compolicy = request.getParameter("compolicy");
        String license = request.getParameter("license");
        String originalinvoice = request.getParameter("originalinvoice");
        String taxcertificate = request.getParameter("taxcertificate");
        String carimport = request.getParameter("carimport");

        uilist = selcetUserInfoService.selectUserinfo(userID);
        request.setAttribute("userinfolist", uilist);
        Carinfo carinfo = new Carinfo(userID, licenseplate, engineno, color, brandmodel, fristdate, deadline, chassisnumber, price, mileage, IDcard, nvoice, openpolicy,
                carkey, certificate, compolicy, license, originalinvoice, taxcertificate, carimport);
        if (!carinfo.getPrice().equals(null)) {
            if (insertIDcardInfoService.addCarInfo(carinfo)) {
                response.setContentType("text/html;charset=utf-8");

                PrintWriter out = response.getWriter();

                out.print("<script language='javascript'>alert('录入成功！将开始录入客户信用信息！');</script>");

                request.getRequestDispatcher("Creditinfo.jsp").forward(request, response);
            } else {
                response.setContentType("text/html;charset=utf-8");

                PrintWriter out = response.getWriter();

                out.print("<script language='javascript'>alert('录入失败！');window.location.href='Carinfo.jsp';</scrip>");
            }
        }else{
            response.setContentType("text/html;charset=utf-8");

            PrintWriter out = response.getWriter();

            out.print("<script language='javascript'>alert('车辆评估价格不能为空！');window.location.href='Carinfo.jsp';</scrip>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
