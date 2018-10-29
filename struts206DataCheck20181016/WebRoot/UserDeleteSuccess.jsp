<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>activeMethod</title>
</head>
<body>
	<h1>删除用户成功！DMI</h1> <br>
	<h2>
		Action执行的时候并不一定执行execute方法； <br>
		方案1：可以在配置文件中配置Action的时候用method=来指定执行哪个方法;(产生太多的action,不推荐使用)<br>
		方案2：在url地址中动态指定，即动态方法调用DMI（Dynamic Method Invocation，推荐使用此方法）<br>
	</h2>
	<a href="http://localhost:8080/struts206DataCheck20181016/user/user">user主页</a> <br>
	<a href="http://localhost:8080/struts206DataCheck20181016/user/user!add">添加用户(DMI) user!add</a> <br>
	<a href="http://localhost:8080/struts206DataCheck20181016/user/user!delete">删除用户(DMI) user!delete</a>
</body>
</html>