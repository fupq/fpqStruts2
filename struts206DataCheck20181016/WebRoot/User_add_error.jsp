<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="GB18030">
		<title>activeMethod</title>
	</head>
	<body>
		<h1>����û��쳣</h1> <br>
		<h2>
			��name����У��ʱ����
		</h2>
		<br>
			ȡ��request,session,application,HttpServletRequest,HttpSession,ServletContext������
		<br>
		<ol>
			<li>ǰ���ߣ�����������</li>
			<li>ǰ���ߣ�IOC</li>
			<li>�����ߣ�����������</li>
			<li>�����ߣ�IOC</li>
		</ol>
		<br>
		<form name="f" action="${pageContext.request.contextPath }/attrParamInput/User_add.action" method="post"> 
			�û�����<input type="text" name="name"> 
			<s:fielderror fieldName="admin.name"> 
			</s:fielderror> <br/> 
			���룺<input type="text" name="password"> 
			<s:fielderror fieldName="admin.password"> 
			</s:fielderror> <br/> 
			<input type="submit" value="��¼"> 
			<input type="button" value="submit1" onclick="javascript:document.f.action='login/login1;'document.f.submit();"/>
			<input type="button" value="submit2" onclick="javascript:document.f.action='login/login2;'document.f.submit();"/>
			<input type="button" value="submit3" onclick="javascript:document.f.action='login/login3;'document.f.submit();"/>
			<input type="button" value="submit4" onclick="javascript:document.f.action='login/login4;'document.f.submit();"/>
		</form>
	</body>
</html>