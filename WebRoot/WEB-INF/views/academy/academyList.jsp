<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>学院列表</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">学院列表</div>
				<div class="operation">
					<div class="search-group">
						<input type="text" placeholder="请输入查询内容" />
						<button type="button"><i class="icon icon-search"></i>搜索</button>
					</div>
					<a href="javascript:void(0);" class="delete"><i class="icon icon-bin"></i>批量删除</a>
					<a href="<%=basePath %>academy_save" class="create"><i class="icon icon-plus"></i>添加</a>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<thead>
						<tr>
							<th class="col-1"><input type="checkbox" name="checkall" title="全选" /></th>
							<th class="col-5">学院名称</th>
							<th class="col-4">学院代码</th>
							<th class="col-2">操作</th>
						</tr>						
					</thead>
					<tbody>
						<tr>
							<td class="text-center col-1"><input type="checkbox" name="checkbox" /></td>
							<td class="text-center col-5">信息科学与技术学院</td>
							<td class="text-center col-4">10001</td>
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