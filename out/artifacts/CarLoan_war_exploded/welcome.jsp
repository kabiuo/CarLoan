<%--Create by 杨彩霞    2017年11月29日下午4:22:01 --%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<script type="text/javascript" src="./to/js/tupian.js" ></script>
	<title>跳转中...</title>
	<link rel="stylesheet" href="./to/css/style.css">
</head>
<body onload="tupian()">
	<div class="top">
		<div class="top1">
			<h1 style="color:white;">登录成功，欢迎<span><%=request.getAttribute("username") %></span>来到学生管理系统！</h1>
			<center><p>6秒钟后系统会自动跳转到<a href="findAllServlet">我管理的全部学生信息页面...</a></p></center>
			<%--<%response.setHeader("refresh","6;url=findAllServlet"); %>--%>
		</div>
		<img id="images" src="./to/img/demo-bg1.jpg" />
	</div>
</body>
</html>