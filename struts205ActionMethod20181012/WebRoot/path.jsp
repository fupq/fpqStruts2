<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%
String path = request.getContextPath(); //获取上下文路径“struts205ActionMethod20181012”
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>" /> <!-- base标签指定basePath的当前路径 -->
	<meta charset="GB18030">
	<title>path.jsp</title>
</head>
<body>
<h1>struts2的路径问题</h1>
struts2中的路径问题是根据action的路径而不是jsp的路径来确定，所以尽量不要使用相对路径。（bead中不添加base标签会报错）<a href="index.jsp">index.jsp</a> </br>
虽然可以用redirect方式解决，但redirect方式并非必要。 </br>
解决方案：<br />
1.统一使用绝对路径。<a href="<%=basePath %>index.jsp">index.jsp</a>（在jsp中用request.getContextRoot方式来拿到webapp的路径）<br />
2.在head中添加base标签指定当前路径，然后当前页面中所有的相当路径前面都会自动添加该base指定的当前路径。<a href="index.jsp">index.jsp</a> </br>
货值使用basePath
当访问根路径http://localhost:8080/struts205ActionMethod20181012/时，</br>
在struts.xml文件中没有找到对应的namespace-->在跳转到web.xml中定义的welcome-file-list中定义的index.jsp，-->交由tomcat处理显示该页面。</br>
</body>
</html>