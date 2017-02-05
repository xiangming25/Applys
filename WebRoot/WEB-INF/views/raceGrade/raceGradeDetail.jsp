<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>竞赛等级</li>
				<li>详情</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">竞赛等级详情</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<tbody>
						<tr>
							<td class="col-2 text-center">名称</td>
							<td class="col-10">国家级</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">描述</td>
							<td colspan="3" class="col-10">这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>