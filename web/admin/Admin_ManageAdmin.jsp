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
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/admin.css">
<script src="${pageContext.request.contextPath}/admin/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/admin/js/pintuer.js"></script>
</head>
<body>
	<script type="text/javascript">
		function deleteAdmin(param) {
			if (window.confirm("您确定要删除该条新闻吗？")) {
				document.location = "deleteAdmin?&id=" + param
			}
		}
	</script>



<form method="post" action="deleteByIdsAdmin" onsubmit="return del()">
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder"> 管理员管理</strong>
		</div>
		
	   
	    
    <div class="padding border-bottom">
      <ul class="search">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath}/goAddAdmin"> 添加用户</a> </li>
<%--        <li>--%>
<%--          <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>--%>
<%--&lt;%&ndash;          <button type="submit" class="button border-red" onclick="DelSelect()"><span class="icon-trash-o"></span> 批量删除</button>&ndash;%&gt;--%>
<%--        </li>--%>
      </ul>
    </div>
    
    
		<table class="table table-hover text-center">
			<tr>
			        
<%--			    <th><input type="checkbox" name="ck" value="1" /> </th>--%>
			    <th width="120">序列编号</th>
				<th>ID</th>
				<th>管理员账号</th>
				<th>管理员密码</th>
				<th>状态</th>
				<th>管理员操作</th>
			</tr>
			<c:forEach items="${list}" var="c" varStatus="vs">
				<tr>
<%--				    <th><input type="checkbox" name="ck" value="${c.id}" /></th>--%>
				    <td>【${vs.count}】</td>
					<td>${c.id}</td>
					<td>${c.adminName}</td>
					<td>${c.adminPwd}</td>
					<td>${c.state}</td>
					<td>
						<div class="button-group">
						<a class="button border-red" href="/pms1_0_war_exploded/Disable?&id=${c.id}">禁用</a>
						</div>
						<div class="button-group">
							<a class="button border-green" href="/pms1_0_war_exploded/Enable?&id=${c.id}">启用</a>
						</div>

					</td>
				</tr>
			</c:forEach>

<%--			<tr>--%>
<%--				<td colspan="6"><%@include file="Page.jsp"%></td>--%>
<%--			</tr>--%>
		</table>
	</div>
</form>

<script type="text/javascript">
//搜索
function changesearch(){	
		
}

//全选
$("#checkall").click(function(){ 
  $("input[name='ck']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})

//单个删除
function del(){
	    if(confirm("您确定真的要删除吗？")){
		     return true;
	    }
	         return false;
       } 


//批量删除
function DelSelect(){
	var Checkbox=false;
	 $("input[name='ck']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false; 		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
	
	
//		function addUser() {
//			location.href = "${pageContext.request.contextPath}/AdminServlet?method=goAddAdmin";
//		}
	
}

</script>




${success}
</body>
</html>