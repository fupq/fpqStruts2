<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%
String path = request.getContextPath(); //��ȡ������·����struts206DataCheck20181016��
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>" /> <!-- base��ǩָ��basePath�ĵ�ǰ·�� -->
	<meta charset="GB18030">
	<title>path.jsp</title>
</head>
<body>
<h1>struts2��·������</h1>
struts2�е�·�������Ǹ���action��·��������jsp��·����ȷ�������Ծ�����Ҫʹ�����·������bead�в����base��ǩ�ᱨ��<a href="index.jsp">index.jsp</a> </br>
��Ȼ������redirect��ʽ�������redirect��ʽ���Ǳ�Ҫ�� </br>
���������<br />
1.ͳһʹ�þ���·����<a href="<%=basePath %>index.jsp">index.jsp</a>����jsp����request.getContextRoot��ʽ���õ�webapp��·����<br />
2.��head�����base��ǩָ����ǰ·����Ȼ��ǰҳ�������е��൱·��ǰ�涼���Զ���Ӹ�baseָ���ĵ�ǰ·����<a href="index.jsp">index.jsp</a> </br>
��ֵʹ��basePath
�����ʸ�·��http://localhost:8080/struts206DataCheck20181016/ʱ��</br>
��struts.xml�ļ���û���ҵ���Ӧ��namespace-->����ת��web.xml�ж����welcome-file-list�ж����index.jsp��-->����tomcat������ʾ��ҳ�档</br>
</body>
</html>