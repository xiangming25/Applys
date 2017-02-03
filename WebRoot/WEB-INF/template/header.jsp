<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>项目申报系统</title>
	<meta name="keywords" content="项目申报系统，成都大学项目申报系统">
	<meta name="description" content="项目申报系统，成都大学项目申报系统">
	<link rel="icon" href="<%=basePath%>/images/logo.png" type="image/x-icon" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/font.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/common.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/header.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/reset.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/margin.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/grid.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/text.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/table.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/form.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base/btn.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/pages/index.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/pages/race.css" />
	<!-- <link rel="stylesheet" type="text/css" href="/Applys/plugins/bootstrap/css/bootstrap.css" /> -->
</head>
<body>
  <aside>
  	<div class="logo">
  		<img alt="成都大学项目申报系统" src="<%=basePath%>images/logo.png">
  		<h1>成都大学项目申报管理系统</h1>
  	</div>
  	<ul>
  		<li class="first-li active"><a href="<%=basePath%>index"><i class="icon icon-home2"></i>首页</a></li>
  		<li class="first-li hide">
  			<a href="#"><i class="icon icon-home2"></i>学科竞赛</a>
  			<ul class="sub-ul">
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>竞赛管理</a></li>
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>经费管理</a></li>
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>获奖管理</a></li>
  			</ul>
  		</li>
  		<li class="first-li hide">
  			<a href="#"><i class="icon icon-home2"></i>审批相关</a>
  			<ul class="sub-ul">
				<li><a href="#"><i class="sub-icon icon-file-text"></i>竞赛审批</a></li>
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>经费审批</a></li>
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>获奖审批</a></li>  				
  			</ul>
  		</li>
  		<li class="first-li hide">
  			<a href="#"><i class="icon icon-home2"></i>统计相关</a>
  			<ul class="sub-ul">
				<li><a href="#"><i class="sub-icon icon-file-text"></i>竞赛统计</a></li>
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>经费统计</a></li>
  				<li><a href="#"><i class="sub-icon icon-file-text"></i>获奖统计</a></li>  				
  			</ul>
  		</li>
  		<!-- 系统管理 -->
  		<li class="first-li"><a href="<%=basePath%>race_baseInfoList"><i class="icon icon-home2"></i>竞赛基本信息</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>竞赛级别管理</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>用户管理</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>学院管理</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>角色管理</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>经费管理</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>获奖管理</a></li>
  		<li class="first-li"><a href="#"><i class="icon icon-home2"></i>密码修改</a></li>
  	</ul>
  	<h2><i class="icon icon-switch"></i>退出</h2>
  </aside>