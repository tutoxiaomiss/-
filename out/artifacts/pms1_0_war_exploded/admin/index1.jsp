<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>人事管理系统</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/admin/css/admin.css">
<script src="${pageContext.request.contextPath}/admin/js/jquery.js"></script>
</head>
<body style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" />人事管理系统
			</h1>
		</div>
		<div class="head-l" style="float: right; margin-right: 2%;">
			<span style="color: white"><span style="color: lightblue">${message}</span>
				登录</span> <span style="margin-left: 20px; margin-right: 30px; color: white">身份：<span
				style="color: lightblue;">普通用户</span></span> <a
				class="button button-little bg-red"
				href="${pageContext.request.contextPath}/ExitServlet">
				<span class="icon-power-off"></span> 退出登录
			</a>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>


		
		<h2>
			<span class="icon-pencil-square-o"></span>员工资料管理
		</h2>
		<ul>
			<li><a href="${pageContext.request.contextPath}/goAddStaff"
				target="right"> <span class="icon-caret-right"></span>添加员工
			</a></li>
			<li><a href="${pageContext.request.contextPath}/findAllStaff"
				target="right"> <span class="icon-caret-right"></span>员工列表列表
			</a></li>
		</ul>
		
		<h2>
			<span class="icon-pencil-square-o"></span>工资管理
		</h2>
		<ul>
			<li><a href="${pageContext.request.contextPath}/goAddWages"
				target="right"> <span class="icon-caret-right"></span>发工资
			</a></li>
			<li><a href="${pageContext.request.contextPath}/findAllWages"
				target="right"> <span class="icon-caret-right"></span>工资列表
			</a></li>
		</ul>
		
		<h2>
			<span class="icon-pencil-square-o"></span>人事管理
		</h2>
		<ul>
			<li><a
				href="${pageContext.request.contextPath}/admin/RAdmin_AddAdmin.jsp"
				target="right"> <span class="icon-caret-right"></span>添加事件
			</a></li>

			<li><a href="${pageContext.request.contextPath}/findAllPmss"
				   target="right"> <span class="icon-caret-right"></span>人事管理列表
			</a></li>

		</ul>







		

		


        
        
		
		<ul>
			<li><a href="${pageContext.request.contextPath}/CusIndexServlet"
				target="_blank"> <span class="icon-caret-right"></span>进入首页
			</a></li>
		</ul>

	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		<li><a href="${pageContext.request.contextPath}/admin/index1.jsp"
			target="_blank" class="icon-home">系统首页</a></li>
		<li><a href="##" id="a_leader_txt">网站信息</a></li>
	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0" src="Main_info.jsp"
			name="right" width="100%" height="100%"></iframe>
	</div>
</body>
</html>