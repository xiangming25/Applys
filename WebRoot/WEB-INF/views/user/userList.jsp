<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<ul class="breadcrumb">
				<li><i class="icon icon-home2"></i>首页</li>
				<li>用户列表</li>
			</ul>
			
			<div class="row m-t-xs">
				<div class="title">用户列表</div>
				<div class="operation">
					<div class="search-group">
						<input type="text" placeholder="请输入查询内容" />
						<button type="button"><i class="icon icon-search"></i>搜索</button>
					</div>
					<a href="javascript:void(0);" class="delete"><i class="icon icon-bin"></i>批量删除</a>
					<a href="<%=basePath %>user_save" class="create"><i class="icon icon-plus"></i>添加</a>
				</div>
			</div>
			
			<div class="lists">
				<table class="table" rules="all">
					<thead>
						<tr>
							<th class="col-1"><input type="checkbox" name="checkall" title="全选" /></th>
							<th class="col-1">姓名</th>
							<th class="col-2">所在学院</th>
							<th class="col-1">职称</th>
							<th class="col-2">联系电话</th>
							<th class="col-2">电子邮件</th>
							<th class="col-3">操作</th>
						</tr>						
					</thead>
					<tbody>
						<tr>
							<td class="text-center col-1"><input type="checkbox" name="checkbox" /></td>
							<td class="text-center col-1">向明</td>
							<td class="text-center col-2">信息科学与技术</td>
							<td class="text-center col-1">教授</td>
							<td class="text-center col-2">13812345678</td>
							<td class="text-center col-2">xiangming25@163.com</td>
							<td class="text-center table-operate col-3">
								<a href="<%=basePath%>user_detail">查看</a>
								<a href="<%=basePath%>user_save">修改</a>
								<a href="#">初始化密码</a>
								<a href="#">删除</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>