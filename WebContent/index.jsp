<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<meta charset="utf-8">
<head>
	<title>首页</title>
	<script src="jquery-3.2.1.min.js"></script>
	<link rel="shortcut icon" href="imgs/logoIco.ico">
	<link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css" />
	<script src="Bootstrap/js/bootstrap.min.js"></script>
	<script src="Bootstrap/docs.min.js"></script>
	<style type="text/css">
	.nav{
		height: 110px;
		border-bottom: 2px solid #ccc;
	}
	.nav img{
		float: left;
		margin-left: 80px;
		line-height: 100px;
		width: 100px;
		height: 100px;
	}
	.nav a{
		font-size: 25px;
		line-height: 80px;
		margin-left: 15px;
	}
	.check{
		background: #fff8f0;
		font-size: 12px;
		color: #666;
		text-align: center;
		margin-top: 10px;
	}
	.navrig{
		float: right;
		display: inline;
		margin-top: 35px;
	}
	.navrig ul li{
		list-style: none;
		float: left;

	}
	.navrig ul li a{
		font-size: 15px;
	}
	span{
		font-size: 25px;
		line-height: 75px;
		margin-left: 20px;
	}
	.bold{
	font-weight: bold;
	}
	</style>
</head>
<body>
	<div class="container">
		<div class="nav">
		<img src="imgs/logo2.jpg">
		<span>Welcome</span>
		<div class="navrig">
			<ul>
				<li><a href="login.jsp">登录&nbsp;&nbsp;|</a></li>
				<li><a href="register.jsp">注册&nbsp;&nbsp;|</a></li>
				<li><a href="#">我的收藏&nbsp;&nbsp;|</a></li>
				<li><a href="#">简介&nbsp;&nbsp;|</a></li>
				<li><a href="loginOut.action">注销</a></li>
				
			</ul>
			<!-- <span><a href="login.html">登录</a></span>
			<span><a href="instruction.html">简介</a></span> -->
		</div>
	</div>
	<div class="check">
	<div class="bold">#day day up!&nbsp;&nbsp;&nbsp;&nbsp;欢迎您 &nbsp;&nbsp;${username }</div>
	</div>

	<div id="mycarousel" class="carousel slide" data-ride="carousel">
		<div class="carousel-inner">
			<div class="item active">
				<img src="imgs/1.jpg" alt="" width="1140px" height="500px">
			</div>
			<div class="item">
				<img src="imgs/2.jpg" alt="" width="1140px" height="500px">
			</div>
			<div class="item">
				<img src="imgs/3.jpg" alt="" width="1140px" height="500px">
			</div>
		</div>
		<ol class="carousel-indicators">
			<li data-target="#mycarousel" data-slide-to='0' class="active"></li>
			<li data-target="#mycarousel" data-slide-to='1'></li>
			<li data-target="#mycarousel" data-slide-to='2'></li>
		</ol>
		<a href="#mycarousel" class="left carousel-control" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span>
		</a>
		<a href="#mycarousel" class="right carousel-control" data-slide="next">
		    <sapn class="glyphicon glyphicon-chevron-right"></sapn>
		</a>
	</div>
</div>
</body>
<script type="text/javascript">
// alert($);
</script>
</html>