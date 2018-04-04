<%@ page import="com.woniu.carloan.bean.Creditinfo" %>
<%@ page import="java.util.List" %>
<%@ page import="com.woniu.carloan.bean.IDcardInfo" %><%--客户信用信息--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>车贷管理</title>
    <link rel="stylesheet" type="text/css" href="demo/css/nav.css">
    <link rel="stylesheet" type="text/css" href="demo/css/unnav.css">
    <link rel="stylesheet" type="text/css" href="demo/fonts/iconfont.css">
    <link href="demo/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="demo/js/jquery-3.3.1.js" type="text/javascript"></script>
    <script src="demo/js/formselect.js" type="text/javascript"></script>
    <script type="text/javascript" src="demo/js/nav.js"></script>
    <script src="demo/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="demo/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
</head>

<body>
<div class="nav">
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
<div class="unnav">
    <div class="tablebottom">
        <p style="margin-top: 22px;">当前位置：车贷管理 > 客户信用信息</p>
        <%
            List<IDcardInfo> ss = (List<IDcardInfo>) request.getAttribute("userinfolist");
        %>
        <form action="insertCreditInfoServlet" method="post" onsubmit="return CreditinfoFrom()">
            <table class="table table-bordered">
                <tr>
                    <td colspan="4"><p>客户信用信息</p></td>
                </tr>
                <%
                    for (IDcardInfo s: ss
                         ) {
                %>
                <tr>
                    <td>
                        <p>姓名</p>
                    </td>
                    <td>
                        <input id="username" name="username" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" value="<%=s.getUsername()%>" />
                    </td>
                    <td>
                        <p>身份证号</p>
                    </td>
                    <td>
                        <input id="IDcard" name="IDcard" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" value="<%=s.getIDcard()%>">
                    </td>
                </tr>
                <tr>
                    <td><p>有无房产</p></td>
                    <td>
                        <select id="estate" name="estate" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">有</option>
                            <option style="background-color: rgba(0,0,0,0.2)">无</option>
                        </select>
                    </td>
                    <td><p>有无房贷</p></td>
                    <td>
                        <select id="mortgage" name="mortgage" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">有</option>
                            <option style="background-color: rgba(0,0,0,0.2)">无</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><p>有无车产</p></td>
                    <td>
                        <select id="carproduction" name="carproduction" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">有</option>
                            <option style="background-color: rgba(0,0,0,0.2)">无</option>
                        </select>
                    </td>
                    <td><p>有无车贷</p></td>
                    <td>
                        <select id="carloans" name="carloans" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">有</option>
                            <option style="background-color: rgba(0,0,0,0.2)">无</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td><p>信用卡、贷款累计预期次数（24个月内）</p></td>
                    <td>
                        <input id="creditcard" name="creditcard"
                               style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="信用卡、贷款累计预期次数（24个月内）">
                    </td>
                    <td colspan="2">
                        <input id="userid" name="userid" style="display: none; width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" value="<%=s.getUserID()%>">
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
            <input style="float: right; margin-right: 65px;" class="btn btn-default" type="submit" value="录入客户信用信息 "/>
        </form>
    </div>
</div>

</body>

</html>