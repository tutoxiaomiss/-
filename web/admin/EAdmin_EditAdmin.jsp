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
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 修改管理员</strong></div>
  
    
  <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath}/findAllStaff"> 返回管理</a> </li>
      </ul>
  </div>
  
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/updateStaff">

      <div class="form-group">
        <div class="label">
          <label for="sitename">员工姓名：</label>
        </div>
        <div class="field">
          <input id="adminId" name="id" type="hidden" value="${c.a1}"/>
          <input type="text" class="input w50"  name="adminName1" value="${c.a2}" size="50" placeholder="请输入姓名" data-validate="required:请输入姓名" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName2" value="${c.a3}" size="50" placeholder="请输入性别" data-validate="required:请输入性别" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">身份证号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName3" value="${c.a4}" size="50" placeholder="请输入身份证号" data-validate="required:请输入身份证号" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">职位：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName4" value="${c.a5}" size="50" placeholder="请输入职位" data-validate="required:请输入职位" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">政治面貌：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName5" value="${c.a6}" size="50" placeholder="请输入政治面貌" data-validate="required:请输入政治面貌" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">电子邮箱：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName6" value="${c.a7}" size="50" placeholder="请输入电子邮箱" data-validate="required:请输入电子邮箱" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">联系电话：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName7" value="${c.a8}" size="50" placeholder="请输入联系电话" data-validate="required:请输入联系电话" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">联系地址：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName8" value="${c.a9}" size="50" placeholder="请输入地址" data-validate="required:请输入地址" />

        </div>
      </div>

      <div class="form-group">
        <div class="label">
          <label for="sitename">聘用形式：</label>
        </div>
        <div class="field">
          <input name="adminPwd9" value="${c.a10}" type="password9"   class="input w50" placeholder="请输入聘用形式" size="50" data-validate="required:请输入聘用形式" />
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">最高学历：</label>
        </div>
        <div class="field">
          <input name="adminPwd10" value="${c.a11}" type="password10"   class="input w50" placeholder="请输入最高学历" size="50" data-validate="required:请输入最高学历" />
        </div>
      </div>

      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 确认修改</button>
        </div>
      </div>      
    </form>
  </div>
</div>
${successee}
</body></html>