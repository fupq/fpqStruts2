<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>�������Ľ����</title>
</head>
<body>
	<h1>
		һ�η��ʶ��ڷ���˵Ķ��forword��תʹ�õ���ͬһ��valueStack��
		���ڿͻ��˵�redirect���ڶ�η��ʣ�������Ƕ��valueStack,���valueStack����Ҫֵ����
	</h1>
	��actionContext��ȡ����r��ֵ: <s:property value="#parameters.r"/>
	<br>
	jsp��#��ʹ�ã���ǩs:property value="#parameters.r"���ڴ�actionContext�л�ȡ��r��ֵ<br>
	strust.xml��$��ʹ�ã�/withParameter.jsp?r=${type},��valueStack�л�ȡtype���Ե�ֵ
	
	<s:debug></s:debug> <br />
</body>
</html>