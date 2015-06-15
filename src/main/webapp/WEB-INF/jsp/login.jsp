<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
    String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=big5">
<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href="../css/main.css" rel="stylesheet">
<style type="text/css">
.background1 {
	background-color: white;
	width: 960px;
	height: 643px;
	margin-left: auto;
	margin-right: auto;
	margin-left: auto;
}

.tile-image {
	
}

.col-sm-3 {
	width: 50%;
}

.btn-group>.btn:first-child {
	margin-left: 410px;
}

.form-horizontal .form-group {
	margin-left: 225px;
	margin-right: -65px;
	margin-top: 3px;
}

.navbar-form {
	margin-left: 485px;
	font-size: 20px;
}

.form-control {
	width: 70%;
}

.breadcrumb {
	margin-bottom: 3px;
}

#fname {
	font-weight: normal;
	font-size: 13px;
	margin-left: 148px;
}

#spwd {
	font-weight: normal;
	font-size: 13px;
	margin-left: 148px;
}

#srpwd {
	font-weight: normal;
	font-size: 13px;
	margin-left: -124px;
}

.frred {
	font-weight: normal;
	font-size: 13px;
	margin-left: 148px;
}

.radio label, .checkbox label {
	padding-left: 35px;
}
</style>
</head>
<body class="Context" id="body1" background="../images/1.jpg">
	<div class="background1">
		<ul class="breadcrumb">
			<li><a href="<%=basePath%>/show/index"> <span
					class="glyphicon glyphicon-home"
					style="color: rgb(54, 140, 167); font-size: 16px;"> Home</span></a> <span
				class="divider"></span></li>
			<li class="active1"><a href="#"><span
					class="glyphicon glyphicon-question-sign"
					style="color: rgb(54, 140, 167); font-size: 17px;"> Help</span></a> <span
				class="divider"></span></li>
			<li class="active1"><span class="glyphicon glyphicon-phone-alt"
				style="color: rgb(64, 114, 145); font-size: 16px;">
					Phone:010-12345678</span></li>
		</ul>
		<div class="form1">
			<form class="form-horizontal" role="userLogin" method="post"
				action="<%=basePath%>/login">
				<div class="form-group">
					<label class="col-sm-2 control-label">用户名：</label>
					<div class="col-sm-3">
						<input class="form-control" id="focusedInput" type="text"
							name="username" placeholder="">
					</div>
					
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">密码：</label>
					<div class="col-sm-3">
						<input class="form-control" id="pwd" type="password" name="password"
							placeholder="" onblur="checkPwd();">
					</div>
				</div>
				<div class="btn-group btn-group-lg">
					<button type="submit" class="btn btn-lg btn-success">确认</button>
					<button type="button" class="btn btn-lg btn-success">取消</button>
				</div>
			</form>
		</div>

	</div>
	<script type="text/javascript">
		function checkPwd() {
			var fpwd = document.getElementById("pwd");
			var ftpwd = document.getElementById("spwd");
			if (fpwd.value == "" || fpwd.value.length > 6
					|| fpwd.value.length < 6) {
				ftpwd.className = "frred";
				ftpwd.innerHTML = "× 请输入6位用户密码！";
			} else {
				ftpwd.className = "fgren";
				ftpwd.innerHTML = "                                     √ 密码可用！"
			}
		}
		function recheckPwd() {
			var fpwd = document.getElementById("pwd");
			var frpwd = document.getElementById("rpwd");
			var ftrpwd = document.getElementById("srpwd");
			if (frpwd.value == "") {
				ftrpwd.className = "frred";
				ftrpwd.innerHTML = "× 请输入您的重复密码！"
			} else {
				if (frpwd.value != fpwd.value) {
					ftrpwd.className = "frred";
					ftrpwd.innerHTML = "× 俩次密码输入不一致，请重新输入！";
				} else {
					ftrpwd.className = "fgren";
					ftrpwd.innerHTML = " √ 密码输入正确"
				}
			}
		}
		function checkEmail() {
			var regemail = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*(;\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*)*$/;
			var femail = document.getElementById("email");
			var ftemail = document.getElementById("semail");
			if (femail.value == "") {
				ftemail.className = "frred";
				ftemail.innerHTML = "× 电子邮箱不能为空！";
			} else {
				if (femail.value.match(regemail)) {
					ftemail.className = "fgren";
					ftemail.innerHTML = "√ 邮箱地址正确！";
				} else {
					ftemail.className = "frred";
					ftemail.innerHTML = "× 邮箱格式输入错误，请检查！";
				}
			}
		}
	</script>
</body>
</html>


