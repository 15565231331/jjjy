<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
<style type="text/css">

table tr td{
	font-size:35px;
	color:white;
}
</style>
</head>
<body style="background-image:url(IMG/background/img3.jpg);">
<%
Cookie[] cookies=request.getCookies();
String name="";
String pass="";
if(cookies!=null){
	for(Cookie c:cookies){
		if(c.getName().equals("username")){
			name=c.getValue();
		}
		if(c.getName().equals("password")){
			pass=c.getValue();
		}
	}
}
%>

<%
String message="";
if(session.getAttribute("message")!=null){
	message=(String)session.getAttribute("message");
}
%>
	<h1 style="color:red;" align="center"><%=message%></h1>
	<!-- 表单数据的提交方式为POST -->
	<form action=/WEB05/login_servlet method="post">
	<table cellpadding="2" align="center" style="margin-top:220px;">
		<tr>
			<td colspan="2" align="center" style="font-size:50px;color:#159ac7">
				杰捷教育登录系统
			</td>
		</tr>
		<tr>
			<td><br/></td>
		</tr>
		<tr>
			<td align="right">用户名:</td>
			<td>
				<!-- 文本输入框控件 --> <input type="text" style="height:35px;width:250px;font-size:32px;" name="username" value="<%=name %>" />
			</td>
		</tr>
		<tr>
			<td align="right">密码:</td>
			<td>
				<input type="password" style="height:35px;width:250px;font-size:32px;" name="password" value="<%=pass %>" />
			</td>
		</tr>
		<tr>
			<td align="right" ><input type="checkbox" name="remember" value="3600" style="height:30px;width:30px;" /></td>
			<td>记住我</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" style="font-size:32px;margin-right:20px" value="登录" />
				<a href="http://localhost:8080/WEB05/register.jsp"><input type="button" style="font-size:32px" value="注册" /></a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>