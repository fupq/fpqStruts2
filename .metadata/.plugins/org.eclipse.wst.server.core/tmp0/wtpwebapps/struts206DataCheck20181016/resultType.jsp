<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>resultType</title>
</head>
<body>
	<h1>struts2的Action的Result的类型：</h1>
	<h2>
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_dispatcher.action">dispatcher:默认类型,服务器端跳转到页面（url中显示的是ResultType_dispatcher.action），（只能）跳转到jsp页面，html页面，freemarker页面等页面	，常用</a><br>
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_redirect.action">redirect：客户端跳转到页面（只能）重定向到视图或页面,常用(客户端跳转，显示的是url中显示的是resultTypeRedirect.jsp)	<br></a> 
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action">chain:服务端跳转forward到一个action（url中显示的是/useChainToAction.action）,不常用，</a> 等同于<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action">http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action</a> <br>
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_redirectAction.action">redirectAction：客户端跳转到Action(url中显示的是/resultTypeRedirect.jsp)客户端跳转到一个Action,不常用</a><br>
		freemarker：前端框架，非常少用<br>
		httpheader：放一个http的头，非常少用<br>
		stream：下载，非常少用<br>
		velocity：和freemarker类似的一个前端框架，非常少用<br>
		xslt：和xml相关的修饰，非常少用<br>
		plaintext:显示页面的源码（翻译成html之前的源码），非常少用<br>
		tiles：把页面分成多块，可指定没块的内容，非常少用<br>
	</h2>
</body>
</html>