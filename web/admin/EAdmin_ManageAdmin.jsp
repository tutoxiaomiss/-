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

	<form method="post" action="/pms1_0_war_exploded/selectStaff" align="center" id="form1">
		<div class="padding border-bottom">
			<ul class="search" style="padding-left: 25px;">
				<li>搜索：</li>


				<li><input type="text" name="title1" id="title" placeholder="请输入搜索员工姓名"  class="input"
						   style="width: 250px; line-height: 17px; display: inline-block" />
					<a href="#" class="button border-main icon-search" onclick="changesearch()"> 搜索</a></li>


				<li>
					<a href="/pms1_0_war_exploded/findAllStaff" class="button border-main icon-search6" onclick="changesearch()"> 返回</a></li>

			</ul>
		</div>
	</form>

<form method="post" action="deleteByIdsAdmin" onsubmit="return del()">
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder"> 员工管理</strong>
		</div>
		
	   
	    
    <div class="padding border-bottom">
      <ul class="search">
        <li> <a class="button border-main icon-plus-square-o" href="${pageContext.request.contextPath}/goAddStaff"> 添加员工</a> </li>
<%--        <li>--%>
<%--          <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>--%>
<%--          <button type="submit" class="button border-red" onclick="DelSelect()"><span class="icon-trash-o"></span> 批量删除</button>--%>
<%--        </li>--%>
      </ul>
    </div>
    
    
		<table class="table table-hover text-center">
			<tr>
			        
<%--			    <th><input type="checkbox" name="ck" value="1" /> </th>--%>
			    <th width="120">序列编号</th>
				<th>员工编号</th>
				<th>员工姓名</th>
				<th>性别</th>
				<th>身份证号</th>
				<th>职位</th>
				<th>政治面貌</th>
				<th>电子邮箱</th>
				<th>联系电话</th>
				<th>联系地址</th>
				<th>聘用形式</th>
				<th>最高学历</th>
	            <th>管理操作</th>
			</tr>
			<c:forEach items="${list}" var="c" varStatus="vs">
				<tr>
<%--				    <th><input type="checkbox" name="ck" value="${c.a1}" /></th>--%>
				    <td>【${vs.count}】</td>
					<td>${c.a1}</td>
					<td>${c.a2}</td>
					<td>${c.a3}</td>
					<td>${c.a4}</td>
					<td>${c.a5}</td>
					<td>${c.a6}</td>
					<td>${c.a7}</td>
					<td>${c.a8}</td>
					<td>${c.a9}</td>
					<td>${c.a10}</td>
					<td>${c.a11}</td>


					<td>
						<div class="button-group">
						<a class="button border-green" href="${pageContext.request.contextPath}/findOneStaff?&id=${c.a1}">修改</a>
						</div>
						<div class="button-group">
							<a class="button border-red" href="${pageContext.request.contextPath}/deleteStaff?&id=${c.a1}">删除</a>
						</div>

					</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</form>

<script type="text/javascript">
//搜索
function changesearch(){
	//获取form表单对象,提交选择项目
	var form1 = document.getElementById("form1");
	form1.submit();//form表单提交
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




${successae}
</body>
</html>