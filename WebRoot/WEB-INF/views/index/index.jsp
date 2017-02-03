<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<%@include file="/WEB-INF/template/header.jsp" %>
	<div class="main-container">
		<div class="container">
			<div class="welcome">Hello,<span>xiangming</span></div>
			<div class="index-static-title">竞赛信息统计</div>
			<div class="index-static">
				<div class="col-4">
					<div class="name">竞赛申请数</div>
					<div class="value">12345次</div>
				</div>
				
				<div class="col-4">
					<div class="name">经费申请数</div>
					<div class="value">2323万</div>
				</div>
				
				<div class="col-4">
					<div class="name">获奖数</div>
					<div class="value">2323万</div>
				</div>
			</div>
			
			<div class="index-line"><span>排行统计</span></div>
			
			<div class="index-rank">
				<div class="rank-block f-l">
					<div class="title">学院竞赛申请数排行</div>
					<div class="content"></div>
				</div>
				<div class="rank-block f-r">
					<div class="title">项目结题排行</div>
					<div class="content"></div>
				</div>
				<div class="rank-block f-l">
					<div class="title">学院竞赛申请金额排行</div>
					<div class="content"></div>
				</div>
				<div class="rank-block f-r">
					<div class="title">学院获奖排行</div>
					<div class="content"></div>
				</div>
			</div>
		</div>
	</div>
<%@include file="/WEB-INF/template/footer.jsp" %>