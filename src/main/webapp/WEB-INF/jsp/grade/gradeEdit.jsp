<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>班级列表-编辑</title>
<body>
	<div>班级列表&gt;编辑   &nbsp; <a href="javascript:history.go(-1)">返回</a><br><br>
	<form action="gradeEdit" method="post">
		<input type="hidden" name="id" value="${grade.id }">
		<table width="98%" border="1">
			<tr>
				<td>班级名称</td>
				<td align="center"><input type="text" name="name" value="${grade.name }"> </td>
			</tr>
			<tr>
				<td>班级描述</td>
				<td align="center">
					<textarea rows="10" cols="50" name="description">${grade.description}</textarea>
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="编辑">&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></td>
			</tr>
		</table>
		
</form>
		</div> 
</body>
</html>