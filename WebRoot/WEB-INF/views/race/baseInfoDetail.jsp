<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>竞赛基本信息详情</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">竞赛基本信息详情</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<tbody>
						<tr>
							<td class="col-2 text-center">竞赛名称</td>
							<td colspan="3" class="col-10">2016第九届全国大学生信息安全竞赛</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">主办单位</td>
							<td class="col-4">教育部</td>
							<td class="col-2 text-center">参赛对象</td>
							<td class="col-4">具有正式学籍的全日制在校大学生</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">参赛时间</td>
							<td class="col-4">2016-01-01</td>
							<td class="col-2 text-center">竞赛级别</td>
							<td class="col-4">省级</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">竞赛方式</td>
							<td class="col-4">团体赛</td>
							<td class="col-2 text-center">参赛人数</td>
							<td class="col-4">5</td>
						</tr>
						
						<tr>
							<td class="col-2 text-center">赛事简介</td>
							<td colspan="3" class="col-10">这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介，这里是赛事简介</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>