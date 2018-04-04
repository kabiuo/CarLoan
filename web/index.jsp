<%--
  Created by IntelliJ IDEA.
  User:kabiuo
  Date: 2018/3/21
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="login/css/reset.css">
    <link rel="stylesheet" href="login/css/supersized.css">
    <link rel="stylesheet" href="login/css/style.css">
    <link href="demo/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="login/js/jquery-1.8.2.min.js"></script>
    <script src="login/js/supersized.3.2.7.min.js"></script>
    <script src="login/js/supersized-init.js"></script>
    <script src="login/js/scripts.js"></script>
    <script src="demo/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="demo/js/formselect.js" type="text/javascript"></script>
</head>
    <body style="margin-top: -20px;">
        <div class="page-container">
            <h1 style="color: white;">登陆</h1>
            <form action="adminLoginServlet" method="post" onsubmit="return checkuseername()">
                <input style="color: white;" type="text" id="username" name="username" class="username" placeholder="账户">
                <input style="color: white; margin-top: 20px;" id="password" type="password" name="password" class="password" placeholder="密码">
                <select id="select" name="atuser" style="margin-top: 20px; border: 1px solid rgba(0,0,0,.15); margin-left: 18px; width: 270px; height: 42px; background-color: rgba(0,0,0,.15);color: white;" class="form-control">
                    <option>管理员</option>
                    <option>客服</option>
                </select>
                <%--<select>--%>
                    <%--<option>客服</option>--%>
                    <%--<option>管理员</option>--%>
                <%--</select>--%>
                <button style="margin-top: 20px; color: white;" type="submit">登陆</button>
                <%--<div class="error"><span>+</span></div>--%>
            </form>
        </div>
    </body>
</html>
