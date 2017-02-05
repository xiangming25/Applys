<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>设置角色</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">设置角色</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<!-- 保存信息内容部分 -->
			<div class="save-content">
				<div class="form-group">
					<label class="col-2 text-right">所在学院</label>
					<div class="input-group col-4">
						<select multiple="multiple" size="5">
							<option value="">--请选择角色--</option>
							<option value="1" selected="selected">教师</option>
							<option value="2">学院管理员</option>
							<option value="3" selected="selected">教务处管理员</option>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right v-top">&nbsp;</label>
					<div class="input-group col-9">
						<a class="btn btn-primary btn-lg">提交</a>
					</div>
				</div>
			</div>
			
		</div>
		
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>