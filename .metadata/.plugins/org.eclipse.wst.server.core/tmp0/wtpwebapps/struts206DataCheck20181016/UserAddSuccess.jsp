<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>activeMethod</title>
</head>
<body>
	<h1>����û��ɹ�</h1> <br>
	<h2>
		Actionִ�е�ʱ�򲢲�һ��ִ��execute������ <br>
		����1����url��ַ�ж�ָ̬��������̬��������DMI��Dynamic Method Invocation���Ƽ�ʹ�ô˷�����<br>
		����2�����÷����ķ�ʽ��actionNme!method
	</h2>
	<a href="http://localhost:8080/struts206DataCheck20181016/user/user">user��ҳ</a> <br>
	<a href="http://localhost:8080/struts206DataCheck20181016/user/user!add">����û�(DMI) user!add</a> <br>
	<a href="http://localhost:8080/struts206DataCheck20181016/user/user!delete">ɾ���û�(DMI) user!delete</a>
</body>
</html>