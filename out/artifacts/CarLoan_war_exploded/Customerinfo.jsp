<%--客户基本信息--%>
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
        <p style="margin-top: 22px;">当前位置：车贷管理 > 录入个人基本信息</p>
        <%
            String userid = request.getParameter("id");
            String username = request.getParameter("username");
            String idcard = request.getParameter("idcard");
        %>
        <form action="insertCustomerInfoServlet" method="post" onsubmit="return CustomerinfoFrom()">
            <table class="table table-bordered">
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
                        <input id="username" name="username" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" value="<%=request.getAttribute("username")%>">
                    </td>
                    <td>
                        <p>身份证号码</p>
                    </td>
                    <td>
                        <input id="IDcard" name="IDcard" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                type="text" class="form-control" value="<%=request.getAttribute("Idcard")%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>户籍地址</p>
                    </td>
                    <td>
                        <input id="peraddress" name="peraddress" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="户籍地址">
                    </td>
                    <td>
                        <p>申请人手机号码</p>
                    </td>
                    <td>
                        <input id="usertel" name="usertel" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="申请人手机号码" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>工作单位全称</p>
                    </td>
                    <td>
                        <input id="unit" name="unit" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="工作单位全称">
                    </td>
                    <td>
                        <p>工作单位地址</p></td>
                    <td>
                        <input id="unitaddress" name="unitaddress" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="工作单位地址">
                    </td>
                </tr>

                <tr>
                    <td><p>单位性质</p></td>
                    <td>
                        <select id="unitpro" name="unitpro" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                                class="form-control">
                            <option style="background-color: rgba(0,0,0,0.2)">个体户</option>
                            <option style="background-color: rgba(0,0,0,0.2)">国有企业</option>
                        </select>
                    </td>
                    <td><p>单位电话</p></td>
                    <td>
                        <input id="unittel" name="unittel" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="单位电话">
                    </td>
                </tr>
                <tr>
                    <td><p>月收入</p></td>
                    <td>
                        <input id="salary" name="salary"
                               style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="月收入">
                    </td>
                    <td><p>业务员姓名</p></td>
                    <td>
                        <input id="salesman" name="salesman"
                               style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="业务员姓名">
                    </td>
                </tr>
                <tr>
                    <td><p>车贷专员</p></td>
                    <td>
                        <input id="commissioner" name="commissioner" style="width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" placeholder="车贷专员">
                    </td>
                    <td colspan="2">
                        <input id="userid" name="userid" style="display: none; width: 100%; margin-top: 4px;background-color: rgba(0,0,0,.1);color: white;"
                               type="text" class="form-control" value="<%=request.getAttribute("uid")%>">
                    </td>
                </tr>
            </table>
            <input style="float: right; margin-right: 65px;" class="btn btn-default" type="submit" value="录入客户信息"/>
        </form>
    </div>
</div>

</body>

</html>