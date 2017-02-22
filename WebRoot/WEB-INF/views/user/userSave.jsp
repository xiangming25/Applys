<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>用户保存</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">用户保存</div>
				<div class="operation">
					<span class="create back" onclick="history.go(-1);"><i class="icon icon-arrow-down"></i>返回上一级</span>
				</div>
			</div>
			
			<!-- 保存信息内容部分 -->
			<div class="save-content">
				<div class="form-group">
					<label class="col-2 text-right">用户名</label>
					<div class="input-group col-4">
						<input type="text" placeholder="请输入用户名" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">姓名</label>
					<div class="input-group col-4">
						<input type="text" placeholder="请输入姓名" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">所在学院</label>
					<div class="input-group col-4">
						<select>
							<option value="">--请选择所在学院--</option>
							<option value="1">信息科学与技术学院</option>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">职称</label>
					<div class="input-group col-4">
						<select>
							<option value="">--请选择职称--</option>
							<option value="1">教授</option>
							<option value="1">副教授</option>
							<option value="1">讲师</option>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">联系电话</label>
					<div class="input-group col-4">
						<input type="text" placeholder="请输入联系电话" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right">电子邮件</label>
					<div class="input-group col-4">
						<input type="text" placeholder="请输入电子邮件" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-2 text-right v-top">设置角色</label>
					<div class="input-group col-4">
						<select multiple="multiple" size="5">
							<option value="">--请选择角色--</option>
							<option value="1">教师</option>
							<option value="2">学院管理员</option>
							<option value="3">教务处管理员</option>
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