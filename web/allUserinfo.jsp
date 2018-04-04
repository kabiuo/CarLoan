<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List" %>
<%@ page import="com.woniu.carloan.bean.IDcardInfo" %>
<%@ page import="com.woniu.carloan.bean.Customerinfo" %>
<%@ page import="com.woniu.carloan.bean.Carinfo" %>
<%@ page import="com.woniu.carloan.bean.Creditinfo" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>车贷管理</title>
    <!-- <link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css"> -->
    <link rel="stylesheet" type="text/css" href="demo/css/nav.css">
    <link rel="stylesheet" type="text/css" href="demo/css/unnav.css">
    <link rel="stylesheet" type="text/css" href="demo/fonts/iconfont.css">
    <link href="demo/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="demo/js/jquery-3.3.1.js" type="text/javascript"></script>
    <script src="demo/js/formselect.js" type="text/javascript"></script>
    <script type="text/javascript" src="demo/js/nav.js"></script>
    <script src="demo/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
<div class="nav" style="height: 250%;">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid #37c6c0"><img src="demo/images/mini.png"></div>
    </div>
    <ul>
        <li class="nav-item">
            <a style="text-decoration: none; color: white;" href="javascript:;"><i
                    class="my-icon nav-icon icon_1"></i><span>信审业务管理</span><i class="my-icon nav-more"></i></a>
            <ul>
                <li>
                    <a style="text-decoration: none; color: white;" href="javascript:;"><span>总公司信审</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="javascript:;"><span>车贷签约复核</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="javascript:;"><span>车贷放款</span></a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a style="text-decoration: none; color: white;" href="javascript:;"><i
                    class="my-icon nav-icon icon_2"></i><span>车贷管理</span><i class="my-icon nav-more"></i></a>
            <ul>
                <li>
                    <a style="text-decoration: none; color: white;" href="selectUserInfoServlet"><span>客户身份证信息列表</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="IDcardinfo.jsp"><span>车贷读取身份证</span></a>
                </li>
            </ul>
        </li>
    </ul>
</div>
<div class="unnav" style="height: 250%;">
    <div class="tablebottom" style="height: 95%;">
        <p style="margin-top: 22px;">当前位置：车贷管理 > 客户申请信息资料</p>
        <!--<tr>
            <th>序号</th>
            <th>合同编号</th>
            <th>借款人</th>
            <th>身份证号</th>
            <th>分公司</th>
            <th>操作</th>
        </tr>-->
        <div class="table-responsive">
            <table class="table table-bordered">
                <%
                    IDcardInfo userinfolist = (IDcardInfo) request.getAttribute("userinfolist");
                    Customerinfo customerinfoslist = (Customerinfo) request.getAttribute("customerinfoslist");
                    Carinfo carinfoslist = (Carinfo) request.getAttribute("carinfoslist");
                    Creditinfo creditinfoslist = (Creditinfo) request.getAttribute("creditinfoslist");
                %>
                <tr>
                    <td colspan="4"><p>身份证信息</p></td>
                </tr>
                <tr>
                    <td>
                        <p>合同编号</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getUserNumber()%></p>
                    </td>
                    <td>
                        <p>分公司</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getCompany()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>姓名</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getUsername()%></p>
                    </td>
                    <td>
                        <p>性别</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getSex()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>民族</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getNation()%></p>
                    </td>
                    <td>
                        <p>出生年月</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getBirthday()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>地址</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getAddress()%></p>
                    </td>
                    <td>
                        <p>身份证号</p>
                    </td>
                    <td>
                        <p><%=userinfolist.getIDcard()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>发证机关</p></td>
                    <td>
                        <p><%=userinfolist.getIssuingorgan()%></p>
                    </td>
                    <td><p>有效期开始</p></td>
                    <td>
                        <p><%=userinfolist.getStarttime()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>有效期结束</p></td>
                    <td>
                        <p><%=userinfolist.getStoptime()%></p>
                    </td>
                    <td><p>产品类型</p></td>
                    <td>
                        <p><%=userinfolist.getProducttype()%></p>
                    </td>
                </tr>

                <%--个人基本信息--%>
                <tr>
                    <td colspan="4">
                        <p>个人基本信息</p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>申请人姓名</p>
                    </td>
                    <td>
                        <p><%=customerinfoslist.getUsername()%></p>
                    </td>
                    <td>
                        <p>身份证号码</p>
                    </td>
                    <td>
                        <p><%=customerinfoslist.getIDcard()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>户籍地址</p>
                    </td>
                    <td>
                        <p><%=customerinfoslist.getPeraddress()%></p>
                    </td>
                    <td>
                        <p>申请人手机号码</p>
                    </td>
                    <td>
                        <p><%=customerinfoslist.getUsertel()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>工作单位全称</p>
                    </td>
                    <td>
                        <p><%=customerinfoslist.getUnit()%></p>
                    </td>
                    <td>
                        <p>工作单位地址</p></td>
                    <td>
                        <p><%=customerinfoslist.getUnitaddress()%></p>
                    </td>
                </tr>

                <tr>
                    <td><p>单位性质</p></td>
                    <td>
                        <p><%=customerinfoslist.getUnitpro()%></p>
                    </td>
                    <td><p>单位电话</p></td>
                    <td>
                        <p><%=customerinfoslist.getUnittel()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>月收入</p></td>
                    <td>
                        <p><%=customerinfoslist.getSalary()%></p>
                    </td>
                    <td><p>业务员姓名</p></td>
                    <td>
                        <p><%=customerinfoslist.getSalesman()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>车贷专员</p></td>
                    <td>
                        <p><%=customerinfoslist.getCommissioner()%></p>
                    </td>
                    <td colspan="2">
                    </td>
                </tr>
                <%--车辆信息--%>
                <tr>
                    <td colspan="4"><p>车辆信息</p></td>
                </tr>
                <tr>
                    <td>
                        <p>机动车辆号牌</p>
                    </td>
                    <td>
                        <p><%=carinfoslist.getLicenseplate()%></p>
                    </td>
                    <td>
                        <p>发动机号</p>
                    </td>
                    <td>
                        <p><%=carinfoslist.getEngineno()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>颜色</p>
                    </td>
                    <td>
                        <p><%=carinfoslist.getColor()%></p>
                    </td>
                    <td>
                        <p>厂牌型号</p>
                    </td>
                    <td>
                        <p><%=carinfoslist.getBrandmodel()%></p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>初次登记日期</p>
                    </td>
                    <td>
                        <p><%=carinfoslist.getFristdate()%></p>
                    </td>
                    <td>
                        <p>年检有限期</p></td>
                    <td>
                        <p><%=carinfoslist.getDeadline()%></p>
                    </td>
                </tr>

                <tr>
                    <td><p>车架号</p></td>
                    <td>
                        <p><%=carinfoslist.getChassisnumber()%></p>
                    </td>
                    <td><p>车辆评估价格</p></td>
                    <td>
                        <p><%=carinfoslist.getPrice()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>目前已行驶里程数</p></td>
                    <td>
                        <p><%=carinfoslist.getMileage()%></p>
                    </td>
                    <td><p>身份证</p></td>
                    <td>
                        <p><%=carinfoslist.getIDcard()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>车辆购置证发票</p></td>
                    <td>
                        <p><%=carinfoslist.getNvoice()%></p>
                    </td>
                    <td><p>交强保险单</p></td>
                    <td>
                        <p><%=carinfoslist.getOpenpolicy()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>车辆钥匙</p></td>
                    <td>
                        <p><%=carinfoslist.getCarkey()%></p>
                    </td>
                    <td><p>机动车登记证</p></td>
                    <td>
                        <p><%=carinfoslist.getCertificate()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>商业保险单</p></td>
                    <td>
                        <p><%=carinfoslist.getCompolicy()%></p>
                    </td>
                    <td><p>车辆行驶证</p></td>
                    <td>
                        <p><%=carinfoslist.getLicense()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>车辆原始发票</p></td>
                    <td>
                        <p><%=carinfoslist.getOriginalinvoice()%></p>
                    </td>
                    <td><p>车辆完税证</p></td>
                    <td>
                        <p><%=carinfoslist.getTaxcertificate()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>进口车辆证明</p></td>
                    <td>
                        <p><%=carinfoslist.getCarimport()%></p>
                    </td>
                    <td colspan="2">
                    </td>
                </tr>
                <%--客户信用信息--%>
                <tr>
                    <td colspan="4"><p>客户信用信息</p></td>
                </tr>
                <tr>
                    <td>
                        <p>姓名</p>
                    </td>
                    <td>
                        <p><%=creditinfoslist.getUsername()%></p>
                    </td>
                    <td>
                        <p>身份证号</p>
                    </td>
                    <td>
                        <p><%=creditinfoslist.getIDcard()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>有无房产</p></td>
                    <td>
                        <p><%=creditinfoslist.getEstate()%></p>
                    </td>
                    <td><p>有无房贷</p></td>
                    <td>
                        <p><%=creditinfoslist.getMortgage()%></p>
                    </td>
                </tr>
                <tr>
                    <td><p>有无车产</p></td>
                    <td>
                        <p><%=creditinfoslist.getCarproduction()%></p>
                    </td>
                    <td><p>有无车贷</p></td>
                    <td>
                        <p><%=creditinfoslist.getCarloans()%></p>
                    </td>
                </tr>

                <tr>
                    <td><p>信用卡、贷款累计预期次数（24个月内）</p></td>
                    <td>
                        <p><%=creditinfoslist.getCreditcard()%></p>
                    </td>
                    <td colspan="2">
                    </td>
                </tr>
            </table>
            <a style="float: right; margin-right: 65px;" class="btn btn-default" href="selectUserInfoServlet" role="button">返回客户身份证信息列表</a>
        </div>
    </div>
</div>

</body>

</html>