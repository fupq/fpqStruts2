<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>resultType</title>
</head>
<body>
	<h1>struts2��Action��Result�����ͣ�</h1>
	<h2>
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_dispatcher.action">dispatcher:Ĭ������,����������ת��ҳ�棨url����ʾ����ResultType_dispatcher.action������ֻ�ܣ���ת��jspҳ�棬htmlҳ�棬freemarkerҳ���ҳ��	������</a><br>
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_redirect.action">redirect���ͻ�����ת��ҳ�棨ֻ�ܣ��ض�����ͼ��ҳ��,����(�ͻ�����ת����ʾ����url����ʾ����resultTypeRedirect.jsp)	<br></a> 
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action">chain:�������תforward��һ��action��url����ʾ����/useChainToAction.action��,�����ã�</a> ��ͬ��<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action">http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action</a> <br>
		<a href="http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_redirectAction.action">redirectAction���ͻ�����ת��Action(url����ʾ����/resultTypeRedirect.jsp)�ͻ�����ת��һ��Action,������</a><br>
		freemarker��ǰ�˿�ܣ��ǳ�����<br>
		httpheader����һ��http��ͷ���ǳ�����<br>
		stream�����أ��ǳ�����<br>
		velocity����freemarker���Ƶ�һ��ǰ�˿�ܣ��ǳ�����<br>
		xslt����xml��ص����Σ��ǳ�����<br>
		plaintext:��ʾҳ���Դ�루�����html֮ǰ��Դ�룩���ǳ�����<br>
		tiles����ҳ��ֳɶ�飬��ָ��û������ݣ��ǳ�����<br>
	</h2>
</body>
</html>