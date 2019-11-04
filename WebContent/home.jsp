<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>杰捷教育</title>
<link href="CSS/style01.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	window.onload=function(){
		var Img=document.getElementById('img1');
		var i='10';
		function show(){
			if(i=='10'){
				Img.src='IMG/lb/'+i+'.jpeg';
				i='11';
			}else if(i=='11'){
				Img.src='IMG/lb/'+i+'.jpeg';
				i='12';
			}else if(i=='12'){
				Img.src='IMG/lb/'+i+'.jpeg';
				i='10';
			}
		}
		setInterval(show,2000);
		show();
	}
</script>
<link id="link1" href="CSS/style4.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function green(){
		var doc=document.getElementById('link1');
		doc.href='CSS/style1.css';
	}
	function yellow(){
		var doc=document.getElementById('link1');
		doc.href='CSS/style2.css';
	}
	function hui(){
		var doc=document.getElementById('link1');
		doc.href='CSS/style3.css';
	}
	function back(){
		var doc=document.getElementById('link1');
		doc.href='CSS/style4.css';
	}
</script>
</head>
<body>
<div id="div-top" align="center">
	<div id="div-top-in" align="center" >
		<ul class=meun_left>
			<li >
				<a href="">首页</a>
			</li>
			<li>
				<a href="">课程分类</a>
			</li>
			<li>
				<a href="">最新发布</a>
			</li>
			<li>
				<a href="">线下培训</a>
			</li>
		</ul>
		<ul class=meun_right>
			<li>
				<input type="button" value="绿色"  onclick="green()" />
			</li>
			<li>
				<input type="button" value="黄色"  onclick="yellow()" />
			</li>
			<li>
				<input type="button" value="灰色"  onclick="hui()" />
			</li>
			<li>
				<input type="button" value="复原"  onclick="back()" />
			</li>
		</ul>
	</div>
</div>
<hr>
<div align="center">
<a href="https://duyi.ke.qq.com" target="_blank"><img id="img1" src="IMG/lb/10.jpeg" /></a>
</div>
<table align="center" >
	<tr>
		<td>
		<select style="font-size:15px;height:25px;">
			<option>计算机</option>
			<option>英语</option>
			<option>政治</option>
			<option>数学</option>
			<option>力学</option>
		</select>
		</td>
		<td>
		<input type="text"  style="border-radius:10px;width:180px;height:23px;font-size:18px;" />
		<input type="button" style="border-radius:5px;background:#80ade8;height:28px;" value="搜索" />
		</td>
		<td width="600px">
		</td>
		<td style="font-size:20px;color:#80ade8">
		欢迎您进入!
		<a id="a1" href="http://localhost:8080/WEB05/login.jsp" target="_blank">登录</a>
		</td>
	</tr>
	<tr>
		<td colspan="4" style="height:30px"></td>
	</tr>
	<tr>
		<td style="font-size:22px">
			课程内容
		</td>
		<td colspan="2"></td>
		<td align="right">
			<a target="_blank" href="http://xxu.fanya.chaoxing.com/portal/schoolCourseInfo/columnCourse?columnId=19876" style="text-decoration:none;font-size:20px;color:blue;">更多>>></a>
		</td>
	</tr>
</table>
<table id="table1" align="center" >
	<tr>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/201403330.html"><img alt="" src="IMG/kc/1.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200699988.html"><img alt="" src="IMG/kc/2.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200717534.html"><img alt="" src="IMG/kc/3.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200676984.html"><img alt="" src="IMG/kc/4.jpg"></a></td>
	</tr>
	<tr>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/201403330.html">大学日语1</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200699988.html">大学英语3（全新版）</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200717534.html">大学英语 1 (全新版)</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200676984.html">大学英语四六级考试诚信考试教育课程</a></td>
	<tr>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200512679.html"><img alt="" src="IMG/kc/5.png"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200516580.html"><img alt="" src="IMG/kc/6.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200511192.html"><img alt="" src="IMG/kc/7.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200373860.html"><img alt="" src="IMG/kc/8.png"></a></td>
	</tr>
	<tr>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200512679.html">教育原理</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200516580.html">初等数论（数学与应用数学专业）</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200511192.html">小学语文课程与教学论</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200373860.html">外国文学史</a></td>
	</tr>
	<tr>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200619265.html"><img alt="" src="IMG/kc/9.png"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200491517.html"><img alt="" src="IMG/kc/10.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/93090638.html"><img alt="" src="IMG/kc/11.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200422141.html"><img alt="" src="IMG/kc/12.jpg"></a></td>
	</tr>
	<tr>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200619265.html">管理学</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200491517.html">流体力学</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/93090638.html">结构力学</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200422141.html">运动解剖学</a></td>
	</tr>
	<tr>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200380803.html"><img alt="" src="IMG/kc/13.jpg"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200373906.html"><img alt="" src="IMG/kc/14.png"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200436614.html"><img alt="" src="IMG/kc/15.png"></a></td>
		<td align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200405123.html"><img alt="" src="IMG/kc/16.jpg"></a></td>
	</tr>
	<tr>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200380803.html">C语言程序设计基础</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200373906.html">中国古代文学3</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200436614.html">经济法</a></td>
		<td style="height:30px" align="center"><a target="_blank" href="http://mooc1.chaoxing.com/course/200405123.html">公共关系</a></td>
	</tr>
</table>
</body>
</html>