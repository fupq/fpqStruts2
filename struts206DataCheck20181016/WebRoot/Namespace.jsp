<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	1.namespace决定了action的访问路径，namespace默认值为空“”，其含义是：只要action匹配无论namespace是什么都可映射过来（可以接受所有路径的action）。
	2.namespace可以写为/,或者/fpq,或者/struts/fpq,对应的action访问路径为/index.action,/fpq/index.action,或者/struts/fpq/index.action。
	3.namespace最好用模块名来命名。
</body>
</html>