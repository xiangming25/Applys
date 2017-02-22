<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>用户信息详情</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">用户信息详情</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<tbody>
						<tr>
							<td class="col-2 text-center">姓名</td>
							<td class="col-4">向明</td>
							<td class="col-2 text-center">用户名</td>
							<td class="col-4">100624</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">所在学院</td>
							<td class="col-4">成都信息科学与技术学院</td>
							<td class="col-2 text-center">职称</td>
							<td class="col-4">教授</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">联系电话</td>
							<td class="col-4">18012345678</td>
							<td class="col-2 text-center">电子邮件</td>
							<td class="col-4">xiangming25@163.com</td>
						</tr>
						
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>