<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="GB18030">
		<title>activeMethod</title>
	</head>
	<body>
		<h1>添加用户异常</h1> <br>
		<h2>
			对name参数校验时出错！
		</h2>
		<br>
			取得request,session,application,HttpServletRequest,HttpSession,ServletContext的引用
		<br>
		<ol>
			<li>前三者：依赖于容器</li>
			<li>前三者：IOC</li>
			<li>后三者：依赖于容器</li>
			<li>后三者：IOC</li>
		</ol>
		<br>
		<form name="f" action="${pageContext.request.contextPath }/attrParamInput/User_add.action" method="post"> 
			用户名：<input type="text" name="name"> 
			<s:fielderror fieldName="admin.name"> 
			</s:fielderror> <br/> 
			密码：<input type="text" name="password"> 
			<s:fielderror fieldName="admin.password"> 
			</s:fielderror> <br/> 
			<input type="submit" value="登录"> 
			<input type="button" value="submit1" onclick="javascript:document.f.action='login/login1;'document.f.submit();"/>
			<input type="button" value="submit2" onclick="javascript:document.f.action='login/login2;'document.f.submit();"/>
			<input type="button" value="submit3" onclick="javascript:document.f.action='login/login3;'document.f.submit();"/>
			<input type="button" value="submit4" onclick="javascript:document.f.action='login/login4;'document.f.submit();"/>
		</form>
	</body>
</html>