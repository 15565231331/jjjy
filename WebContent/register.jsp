<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册界面</title>
<style type="text/css">
fieldset {
    margin: 0 auto;
    float: none;
    background:white;
}
table tr td{
	font-size:30px;
	color:white;
}
</style>
</head>
<body style="background-image:url(IMG/background/img5.jpg);">
<!--  <fieldset style="width:600px;height:400px;">
		<legend><h3>注册新用户</h3></legend>  --> 
		<!-- 表单数据的提交方式为POST -->
		<form action=/WEB05/register_servlet method="post">
		<table cellpadding="2" align="center" style="margin-top:180px;">
			<tr>
				<td colspan="2" align="center" style="font-size:50px;color:#159ac7">
					杰捷教育注册系统
				</td>
			</tr>
			<tr>
				<td><br/></td>
			</tr>
			<tr>
				<td align="right">用户名:</td>
				<td>
					<!-- 文本输入框控件 --> <input type="text" style="height:25px;width:250px;font-size:25px;" name="user" />
				</td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td>
					<input type="password" style="height:25px;width:250px;font-size:25px;" name="pass1" />
				</td>
			</tr>
			<tr>
				<td align="right">确认密码:</td>
				<td>
					<input type="password" style="height:25px;width:250px;font-size:25px;" name="pass2" />
				</td>
			</tr>
			<tr>
				<td align="right">性别:</td>
				<td>
					<input type="radio" name="gender" value="male" />男
					<input type="radio" name="gender" value="female" />女
				</td>
			</tr>
			<tr>
				<td align="right">兴趣:</td>
				<td>
					<input type="checkbox" name="interest" value="moive" />看电影
					<input type="checkbox" name="interest" value="song" />唱歌
					<input type="checkbox" name="interest" value="game" />打游戏
				</td>
			</tr>
			<tr>
				<td align="right">头像:</td>
				<td>
					<input type="file" style="font-size:20px" name="photo" />
				</td>
			</tr>
			<tr>
				<td><br/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" style="font-size:30px;margin-right:20px;" value="注册" />
					<input type="reset" style="font-size:30px" value="重填" />
				</td>
			</tr>
		</table>
		</form>
		
<!--  </fieldset>-->	
</body>
</html>