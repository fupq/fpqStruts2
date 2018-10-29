<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="GB18030">
		<title>activeMethod</title>
	</head>
	<body>
		<h1>取得Map类型request,session,application的信息</h1> <br>
		<h2>
			1.通过构造函数主动将ActionContext中的HttpRequest对象赋值给Map类型的request对象（很少用）;com.fpq.action.webElement.LoginAction1
			2.实现RequestAware接口，重载setRequest方法，在接口RequestAware中调用该方式将Request对象的内容赋值给request（常用）；com.fpq.action.webElement.LoginAction2
		</h2>
		<br>
		<ol>
			<li>依赖于容器</li>
			<li>IOC</li>
		</ol>
		
		<h1>取得真实类型HttpServletRequest,HttpSession,ServletContext的信息</h1> <br>
		<h2>
			1.通过ServletActionContext获取request,通过request获取session,通过session获取application（很少用）;com.fpq.action.webElement.LoginAction3
			2.实现ServletRequestAware接口：重载setServletRequest方法，在接口ServletRequestAware中调用该方式将HttpServletRequest对象的内容赋值给request（很少用）；com.fpq.action.webElement.LoginAction4
		</h2>
		<br>
		<ol>
			<li>依赖于容器</li>
			<li>IOC</li>
		</ol>
		
		<br>
		<form name="f" action="" method="post"> 
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