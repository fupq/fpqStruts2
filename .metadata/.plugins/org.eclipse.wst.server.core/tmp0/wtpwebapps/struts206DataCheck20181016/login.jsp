<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="GB18030">
		<title>activeMethod</title>
	</head>
	<body>
		<h1>ȡ��Map����request,session,application����Ϣ</h1> <br>
		<h2>
			1.ͨ�����캯��������ActionContext�е�HttpRequest����ֵ��Map���͵�request���󣨺����ã�;com.fpq.action.webElement.LoginAction1
			2.ʵ��RequestAware�ӿڣ�����setRequest�������ڽӿ�RequestAware�е��ø÷�ʽ��Request��������ݸ�ֵ��request�����ã���com.fpq.action.webElement.LoginAction2
		</h2>
		<br>
		<ol>
			<li>����������</li>
			<li>IOC</li>
		</ol>
		
		<h1>ȡ����ʵ����HttpServletRequest,HttpSession,ServletContext����Ϣ</h1> <br>
		<h2>
			1.ͨ��ServletActionContext��ȡrequest,ͨ��request��ȡsession,ͨ��session��ȡapplication�������ã�;com.fpq.action.webElement.LoginAction3
			2.ʵ��ServletRequestAware�ӿڣ�����setServletRequest�������ڽӿ�ServletRequestAware�е��ø÷�ʽ��HttpServletRequest��������ݸ�ֵ��request�������ã���com.fpq.action.webElement.LoginAction4
		</h2>
		<br>
		<ol>
			<li>����������</li>
			<li>IOC</li>
		</ol>
		
		<br>
		<form name="f" action="" method="post"> 
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