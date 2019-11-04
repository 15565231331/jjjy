<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="refresh" content="5;url=/WEB05/login.jsp">
<title>Insert title here</title>
</head>
<%String contextpath=request.getContextPath(); %>
<body style="background-image:url(IMG/background/img7.jpg);">
	<h1 align="center">SUCESS</h1>
	<div align="center">
		<h2>注册成功，5秒后跳转到登录页面。</h2><br/>
		<h2>点击此处立即跳转>>><a href="<%=contextpath %>/login.jsp" style="text-decoratin:none;">登录</a></h2>
	</div>
</body>
</html>