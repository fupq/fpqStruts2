<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtm">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030" charset="GB18030">
		<title>login成功</title>
	</head>
	<body>
	 	<h1>登入成功！</h1>
	 	<br />
	 	<s:property value="#request.r1"/> | <%=request.getAttribute("r1") %> <br />
	 	<s:property value="#session.s1"/> | <%=session.getAttribute("s1") %> <br />
	 	<s:property value="#application.a1"/> | <%=application.getAttribute("a1") %> <br />
	 	<s:debug></s:debug> <br />
	 	
	 	<h2>HttpRequest中的内容</h2> <br />
	 	<s:property value="#request"/> <br /><br /><br />
	 	
	 	<h2>HttpSession中的内容</h2>
	 	<s:property value="#session"/> <br /><br /><br />
	 	
	 	<h2>HttpApplication中的内容</h2>
	 	<s:property value="#application"/> <br /><br /><br />
	 	
	 	<h2>action中的内容</h2>
	 	<s:property value="#action"/> <br /><br /><br />
	 	
	 	<h2>parameters中的内容</h2>
	 	<s:property value="#parameters"/> <br /><br /><br />
	 	
	 	<h2>attr中的内容</h2>  <!-- attr.key的功能：是从httpRequest,httpSession,httpApplicaton中查询key的值，查询到就显示出来 -->
	 	<s:property value="#attr.r1"/> <br /><br /><br />
	 	<s:property value="#attr.s1"/> <br /><br /><br />
	 	<s:property value="#attr.a1"/> <br /><br /><br />
	</body>
</html>