<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtm">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030" charset="GB18030">
		<title>login�ɹ�</title>
	</head>
	<body>
	 	<h1>����ɹ���</h1>
	 	<br />
	 	<s:property value="#request.r1"/> | <%=request.getAttribute("r1") %> <br />
	 	<s:property value="#session.s1"/> | <%=session.getAttribute("s1") %> <br />
	 	<s:property value="#application.a1"/> | <%=application.getAttribute("a1") %> <br />
	 	<s:debug></s:debug> <br />
	 	
	 	<h2>HttpRequest�е�����</h2> <br />
	 	<s:property value="#request"/> <br /><br /><br />
	 	
	 	<h2>HttpSession�е�����</h2>
	 	<s:property value="#session"/> <br /><br /><br />
	 	
	 	<h2>HttpApplication�е�����</h2>
	 	<s:property value="#application"/> <br /><br /><br />
	 	
	 	<h2>action�е�����</h2>
	 	<s:property value="#action"/> <br /><br /><br />
	 	
	 	<h2>parameters�е�����</h2>
	 	<s:property value="#parameters"/> <br /><br /><br />
	 	
	 	<h2>attr�е�����</h2>  <!-- attr.key�Ĺ��ܣ��Ǵ�httpRequest,httpSession,httpApplicaton�в�ѯkey��ֵ����ѯ������ʾ���� -->
	 	<s:property value="#attr.r1"/> <br /><br /><br />
	 	<s:property value="#attr.s1"/> <br /><br /><br />
	 	<s:property value="#attr.a1"/> <br /><br /><br />
	</body>
</html>