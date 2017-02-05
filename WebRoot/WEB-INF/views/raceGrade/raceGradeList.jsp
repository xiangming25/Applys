<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>竞赛等级列表</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">竞赛等级列表</div>
				<div class="operation">
					<a href="<%=basePath %>racegrade_save" class="create"><i class="icon icon-plus"></i>添加</a>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<thead>
						<tr>
							<th class="col-1"><input type="checkbox" name="checkall" title="全选" /></th>
							<th class="col-4">竞赛等级名称</th>
							<th class="col-5">描述</th>
							<th class="col-2">操作</th>
						</tr>						
					</thead>
					<tbody>
						<tr>
							<td class="text-center col-1"><input type="checkbox" name="checkbox" /></td>
							<td class="text-center col-4">国家级</td>
							<td class="text-center col-5">国家级比赛</td>
							<td class="text-center table-operate col-2">
								<a href="<%=basePath%>racegrade_detail">查看</a>
								<a href="#">修改</a>
								<a href="#">删除</a>
							</td>
						</tr>
						
						<tr>
							<td class="text-center col-1"><input type="checkbox" name="checkbox" /></td>
							<td class="text-center col-4">国家级</td>
							<td class="text-center col-5">国家级比赛</td>
							<td class="text-center table-operate col-2">
								<a href="<%=basePath%>racegrade_detail">查看</a>
								<a href="#">修改</a>
								<a href="#">删除</a>
							</td>
						</tr>
						
						<tr>
							<td class="text-center col-1"><input type="checkbox" name="checkbox" /></td>
							<td class="text-center col-4">国家级</td>
							<td class="text-center col-5">国家级比赛</td>
							<td class="text-center table-operate col-2">
								<a href="<%=basePath%>racegrade_detail">查看</a>
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