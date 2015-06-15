<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>班级列表</title>
<body>
	<div>班级列表&gt;<a href="gradeAdd">添加</a><br><br>
		<table width="98%" border="1">
			<tr>
				<td width="10%">序号</td>
				<td width="30%">名称</td>
				<td width="50%">描述</td>
				<td width="10%">操作</td>
			</tr>
			<c:forEach items="${page.list }" var="grade" varStatus="i">
			<tr>
				<td>${i.index + 1 + (page.pageNum-1)*(page.pageSize) }</td>
				<td>${grade.name }</td>
				<td>${grade.description }</td>
				<td><a href="gradeEdit${grade.id}">编辑</a> | <a href="gradeDel${grade.id}" onclick="return confirm('确定要删除吗？')">删除</a></td>
			</tr>
		</c:forEach>
		</table>
          	<!-- 分页插件  -->
          	<div align="center">
          		<tags:pager/>
          	</div>
		</div> 
</body>
</html>