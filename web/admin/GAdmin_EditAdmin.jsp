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
  <div class="panel-head"><strong><span class="icon-key"></span> 修改工资</strong></div>
  
    
  <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath}/findAllWages"> 返回工资管理</a> </li>
      </ul>
  </div>
  
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/updateWage">

<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label for="sitename">员工编号：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="text" class="input w50"  name="adminName1" value="${c.id}" size="50" placeholder="请输入员工编号" data-validate="required:请输入员工编号" />--%>

<%--        </div>--%>
<%--      </div>--%>
      <div class="form-group">
        <div class="label">
          <label for="sitename">职位：</label>
        </div>
        <div class="field">
            <input id="adminId" name="adminName1" type="hidden" value="${c.id}"/>
          <input type="text" class="input w50"  name="adminName2" value="${c.position}" size="50" placeholder="请输入职位" data-validate="required:请输入职位" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">基本工资：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName3" value="${c.basic}" size="50" placeholder="请输入基本工资" data-validate="required:请输入基本工资" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">考勤工资：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName4" value="${c.attendance}" size="50" placeholder="请输入考勤工资" data-validate="required:请输入考勤工资" />

        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">公司福利：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="adminName5" value="${c.welfare}" size="50" placeholder="请输入公司福利" data-validate="required:请输入公司福利" />

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
${successeg}
</body></html>