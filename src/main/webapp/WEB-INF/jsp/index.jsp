<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>mybatis</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <table border="1" width="100%" height="100%">
    	<tr height="50px">
    		<td colspan="3">header(盒子模型)</td>
    	</tr>
    	<tr height="10px">
    		<td colspan="3">state</td>
    	</tr>
    	<tr>
    		<td width="120px">
    			
    			<br/>
				<a href="gradeList" target="content">班级列表</a><br/>
				<a href="studentList" target="content">学生列表</a><br/>
				<br/>
				<br/>
			</td>
    		<td width="7px">b</td>
    		<td>
				<iframe id="content" name="content" width="100%" height="100%"></iframe>
			</td>
    	</tr>
    	<tr height="10px">
    		<td colspan="3">footer</td>
    	</tr>
    </table>
    
    
  </body>
</html>
