<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>人事管理系统</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/admin/css/style.css">
</head>



<script language="javascript" type="text/javascript">
    //【1】登录操作事件
	function submitForm_filter_platform() {
		
		var form1 = document.getElementById("form1");
		form1.submit();//form表单提交
	}

	  //【2】注册操作事件
	function checkForm() {
		  
		//校验用户名
		//1.获取用户输入的数据
		var uValue = document.getElementById("username").value;
		//alert(uValue);
		if (uValue == "") {
			alert("提示：您用户名输入不能为空！")
			return false;
		}
		
		//校验密码信息
		var pValue = document.getElementById("password").value;
		if (pValue == "") {
			alert("提示：您密码输入不能为空！")
			return false;
		}
		
		//校验确认密码信息
		var rpValue = document.getElementById("repassword").value;
		if (rpValue == "") {
			alert("提示：您第二次输入的密码为空，请重新输入！");
			return false;
		} else if (pValue != rpValue) {

			alert("提示：您两次输入密码输入不一致，请重新输入！");
			return false;
		}
		
		//获取form表单对象,提交选择项目
		var form2 = document.getElementById("form2");
		form2.submit();//form表单提交
	}
</script>


<body>
	<div class="container right-panel-active">
		<!-- 注册 -->
<%--		<div class="container__form container--signup">--%>
<%--			<form method="post"--%>
<%--				action="${pageContext.request.contextPath}/register"--%>
<%--				class="form" id="form2">--%>
<%--				<h2 class="form__title">注册账号</h2>--%>
<%--				<input type="text" id="username" name="adminName" placeholder="账号:"--%>
<%--					class="input" /> <input type="password" id="password"--%>
<%--					name="adminPwd" placeholder="密码：" class="input" /> <input--%>
<%--					type="password" id="repassword" name="repassword"--%>
<%--					placeholder="确认密码：" class="input" />--%>
<%--				<button class="btn" onClick="return checkForm()">点击注册</button>--%>
<%--			</form>--%>
<%--		</div>--%>

		<!-- 登录 -->
		<div class="container__form container--signin">
			<form method="post"
				action="${pageContext.request.contextPath}/Login"
				class="form" id="form1">
				<h2 class="form__title">欢迎登录</h2>
				<input type="text" id="username" name="adminName"
					value="${cookie.username.value}" placeholder="账号:" class="input" />
				<input type="password" id="password" name="adminPwd"
					value="${cookie.password.value}" placeholder="密码：" class="input" />
				</br>
				<div>
					<input type="checkbox" value="yes" name="remember" class="checkbox" />
					记住密码!
				</div>
				</br>
				<button class="btn" onClick="submitForm_filter_platform()">登录</button>
			</form>
		</div>

		<!-- 叠加部分 -->
		<!-- 叠加部分 -->
<%--		<div class="container__overlay">--%>
<%--			<div class="overlay">--%>
<%--				<div class="overlay__panel overlay--left">--%>
<%--					<button class="btn" id="signIn">已有账号，直接登录</button>--%>
<%--				</div>--%>
<%--&lt;%&ndash;				<div class="overlay__panel overlay--right">&ndash;%&gt;--%>
<%--&lt;%&ndash;					<button class="btn" id="signUp">没有账号，点击注册</button>&ndash;%&gt;--%>
<%--&lt;%&ndash;				</div>&ndash;%&gt;--%>
<%--			</div>--%>
<%--		</div>--%>
<%--	</div>--%>
	${successl}
</body>
<script src="${pageContext.request.contextPath}/admin/js/script.js"></script>
</html>