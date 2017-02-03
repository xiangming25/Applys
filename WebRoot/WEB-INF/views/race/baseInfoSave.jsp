<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>竞赛基本信息列表</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">竞赛保存</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<!-- 保存信息内容部分 -->
			<div class="save-content">
				<div class="form-group">
					<label class="col-2 text-right">竞赛名称</label>
					<div class="input-group col-6">
						<input type="text" placeholder="请输入竞赛名称" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">主办单位</label>
					<div class="input-group col-6">
						<input type="text" placeholder="请输入主办单位" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">参赛时间</label>
					<div class="input-group col-2">
						<input type="text" placeholder="请选择参赛时间" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">竞赛级别</label>
					<div class="input-group col-2">
						<select>
							<option value="">--请选择竞赛级别--</option>
							<option value="1">国家级</option>
							<option value="2">省级</option>
							<option value="3">校级</option>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">竞赛方式</label>
					<div class="input-group col-2">
						<select>
							<option value="">--请选择竞赛方式--</option>
							<option value="1">团体赛</option>
							<option value="2">个人赛</option>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">参赛人数范围</label>
					<div class="input-group col-2">
						<input type="text" placeholder="请输入参赛人数范围" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">参赛对象</label>
					<div class="input-group col-6">
						<input type="text" placeholder="请输入参赛对象" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right v-top">赛事简介</label>
					<div class="input-group col-9">
						<script id="raceDesc" name="content" type="text/plain" class="ueditorInitHeight" ></script>
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