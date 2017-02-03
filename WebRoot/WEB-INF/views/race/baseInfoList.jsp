<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>竞赛基本信息列表</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">竞赛列表</div>
				<div class="operation">
					<a href="javascript:void(0);" class="delete"><i class="icon icon-bin"></i>批量删除</a>
					<a href="<%=basePath %>race_baseInfoSave" class="create"><i class="icon icon-plus"></i>添加</a>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<thead>
						<tr>
							<th class="col-1"><input type="checkbox" name="checkall" title="全选" /></th>
							<th class="col-2">竞赛名称</th>
							<th class="col-1">竞赛级别</th>
							<th class="col-2">竞赛方式</th>
							<th class="col-1">人数范围</th>
							<th class="col-3">参赛对象</th>
							<th class="col-2">操作</th>
						</tr>						
					</thead>
					<tbody>
						<tr>
							<td class="text-center col-1"><input type="checkbox" name="checkbox" /></td>
							<td class="text-center col-2">2016年第九届全国大学生信息安全竞赛</td>
							<td class="text-center col-1">国家级</td>
							<td class="text-center col-2">团体赛</td>
							<td class="text-center col-1">5</td>
							<td class="text-center col-3">具有正式学籍的全日制在校大学生</td>
							<td class="text-center table-operate col-2">
								<a href="<%=basePath%>race_baseInfoDetail">查看</a>
								<a href="#">修改</a>
								<a href="#">删除</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>