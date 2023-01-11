<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/admin.css">
<script src="${pageContext.request.contextPath}/admin/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/admin/js/pintuer.js"></script>
  <style>
    input{
      height:30px;
    }
    .form-group{
      margin-bottom: -3px;
    }
  </style>
</head>
<script language="javascript" type="text/javascript">
function check()
{
	  if (document.form2.adminName.value==""){
		  alert("请输入登录账号!");
		  return false;
	  }
	  if (document.form2.adminPwd.value==""){
		  alert("请输入登录密码!");
		  return false;
	  }
	  if (document.form2.adminPwd2.value==""){
		  alert("请输入重复密码!");
		  return false;
	  }
	  // if (document.form2.adminPwd.value!=document.form2.adminPwd2.value){
		//   alert("对不起!重复密码不等于登录密码");
		//   return false;
	  // }
	  
	  return true;

}
</script> 
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 添加员工</strong></div>
  
  <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath}/findAllStaff"> 返回员工列表</a> </li>
      </ul>
  </div>
  
  
  <div class="body-content">
    <form name="form2" method="post" class="form-x" action="${pageContext.request.contextPath}/addStaff">

      <div class="form-group">
        <div class="label">
          <label for="sitename">员工姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName1" value="${adminName}" size="50" placeholder="请输入姓名" data-validate="required:请输入姓名" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName2" value="${adminName}" size="50" placeholder="请输入性别" data-validate="required:请输入性别" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">身份证号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName3" value="${adminName}" size="50" placeholder="请输入身份证号" data-validate="required:请输入身份证号" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">职位：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName4" value="${adminName}" size="50" placeholder="请输入职位" data-validate="required:请输入职位" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">政治面貌：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName5" value="${adminName}" size="50" placeholder="请输入政治面貌" data-validate="required:请输入政治面貌" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">电子邮箱：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName6" value="${adminName}" size="50" placeholder="请输入电子邮箱" data-validate="required:请输入电子邮箱" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">联系电话：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName7" value="${adminName}" size="50" placeholder="请输入联系电话" data-validate="required:请输入联系电话" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">联系地址：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="adminName8" value="${adminName}" size="50" placeholder="请输入地址" data-validate="required:请输入地址" />

        </div>
      </div>

      <div class="form-group">
        <div class="label">
          <label for="sitename">聘用形式：</label>
        </div>
        <div class="field">
          <input name="adminPwd9" value="${adminPwd}" type="password9"   class="input w50" placeholder="请输入聘用形式" size="50" data-validate="required:请输入聘用形式" />
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">最高学历：</label>
        </div>
        <div class="field">
          <input name="adminPwd10" value="${adminPwd}" type="password10"   class="input w50" placeholder="请输入最高学历" size="50" data-validate="required:请输入最高学历" />
        </div>
      </div>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label for="sitename">最高学历：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="password" class="input w50" name="adminPwd2" value="${adminPwd2}" size="50" placeholder="请再次输入新密码" data-validate="required:请再次输入新密码,repeat#adminPwd:两次输入的密码不一致" />--%>
<%--        </div>--%>
<%--      </div>--%>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" onClick="return check()"> 确认添加</button>
        </div>
      </div>      
    </form>
  </div>
</div>
${successaef}
</body></html>