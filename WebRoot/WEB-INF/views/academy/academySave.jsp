<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>保存学院信息</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">保存学院信息</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<!-- 保存信息内容部分 -->
			<div class="save-content">
				<div class="form-group">
					<label class="col-2 text-right">学院代号</label>
					<div class="input-group col-6">
						<input type="text" placeholder="学院代号" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">学院名称</label>
					<div class="input-group col-6">
						<input type="text" placeholder="学院名称" />
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
	<script type="text/javascript" src="<%=basePath %>plugins/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" src="<%=basePath %>plugins/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript">
		var ue = UE.getEditor('raceDesc');
	</script>
<%@include file="/WEB-INF/template/footer.jsp" %>