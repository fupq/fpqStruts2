<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>activeMethod</title>
</head>
<body>
	<h1>添加用户成功</h1> <br>
	<h2>
		Action执行的时候并不一定执行execute方法； <br>
		方案1：在url地址中动态指定，即动态方法调用DMI（Dynamic Method Invocation，推荐使用此方法）<br>
		方案2：调用方法的方式：actionNme!method
	</h2>
	<a href="http://localhost:8080/struts205ActionMethod20181012/user/user">user主页</a> <br>
	<a href="http://localhost:8080/struts205ActionMethod20181012/user/user!add">添加用户(DMI) user!add</a> <br>
	<a href="http://localhost:8080/struts205ActionMethod20181012/user/user!delete">删除用户(DMI) user!delete</a>
</body>
</html>