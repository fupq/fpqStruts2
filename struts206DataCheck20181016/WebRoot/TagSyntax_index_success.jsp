<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>��ǩ�﷨�ĵ�</title>
</head>
<body>
	<h1>��ǩ�﷨</h1>	<br>
	<h2>������̬�����ֶ�</h2> <br>
	��ǩ������ʾ��̬���ݡ�Ҫ������ʾ���ԡ�postalCode���������ֶΣ����ǽ��ַ�����postalCode�����ݸ�textfield��ǡ�<br>
	eg:<s:textfield name="postalCode"/>	<br>
	���ֵ��ջ���С�postalCode�����ԣ�����ֵ������Ϊ�����ֶΡ����ֶ��ύ�ؿ��ʱ���ؼ���ֵ�������ûء�postalCode�����ԡ�<br>
	
	<h2>ʹ�ñ���ʽ���ñ�ǩ</h2>
	��ʱ������ϣ������̬���ݴ��ݸ���ǡ����磬���ǿ���ϣ����ʾ���������ֶεı�ǩ�����ǿ���ϣ����Ӧ�ó������Ϣ��Դ�л�ȡ��ǩ����ˣ���ܽ�������������еı���ʽ���Ա����ǿ���������ʱ����̬���ݺϲ�����������С�����ʽת�������ǡ���{...}����Ƕ����ת�������е��κ��ı�������Ϊ����ʽ����������<br>
	eg:<s:textfield key="postalCode.label" name="postalCode"/> <br>
	����ʽ���ԣ�OGNL���������ǵ��÷������������ԡ��÷���getText��ActionSupport�ṩ�����Ǵ����Actions�Ļ��ࡣ����Action�ڶ�ջ�ϣ����ǿ��Դӱ���ʽ���������κη���������getText�� <br>
	
	
	<h1>���ַ�������</h1> <br>
	HTTPЭ���ǻ����ı��ģ���ĳЩ��ǩ���з�String�������ͣ���bool��int��Ϊ��ʹ��String���Ծ���ֱ���ԣ���ܽ����з�String������Ϊ����ʽ��������������������£�������Ҫʹ��ת����š������ǣ���������ˣ���ܽ��������롣�� <br>
	<h2>��������ֵ</h2> <br>
	eg:<s:select list="{'true','false'}"  key="state.label" name="state" multiple="true"  /> <br>
	���ڸ�����multipleӳ�䵽�������ԣ���˿�ܲ��Ὣ��ֵ����ΪString����ֵ������Ϊ����ʽ���Զ�ת��Ϊ����ֵ��<br>
	���ں�����������Щ������String����Щ�����Ƿ�String���������Ȼ����ʹ��ת����š�<br>
	<h2>Evaluating booleans (verbose):�����������߳���</h2> <br>
	eg:<s:select list="{'true','false'}" key="state.label" name="state" multiple="%{true}"/> <br>
	<h2>Evaluating booleans (with property):���������������ԣ�</h2> <br>
	eg��<s:select list="{'fupinxin','wangshuhua','fukexiang'}" key="state.label" name="state" multiple="allowMultiple"/> <br>
	<h2>Evaluating booleans (verbose with property):��������ֵ��������ԣ�</h2> <br>
	eg:<s:select list="{'fupinxin','wangshuhua','fukexiang'}" key="state.label" name="state" multiple="%{allowMultiple}"/> <br>
	
	
	<h1>value ��һ������</h1> <br>
	���������£�value�������Զ����õģ���Ϊname����ͨ������߿��Ҫ�����ĸ�����������value�����ǣ����������valueֱ�����ã���ע��value ���� ���� �ַ�����<br>
	����value����String����˴��ݸ�value�����κ����ݶ�������Ϊ����ʽ - �������ַ������֡� <br>
	�����Ǵ��ģ�:<s:textfield key="state.label" name="state" value="ca"/>	<br>
	���a textfield������value����"ca"����ܽ�������Ϊ������getCa��һ����˵���ⲻ�����ǵ���˼������Ҫ�����Ǵ���һ�������ַ������ڱ���ʽ�����У����ַ���������<br>
	����ȷ�ķ�ʽ��������ֵ:<s:textfield key="state.label" name="state" value="%{'ca'}" /> <br>
	��һ�ַ�����ʹ�ó���value="'ca'"��������������£�����ʹ�ñ���ʽ��ʾ����<br>
	�򻯣�ʹ��������������������ԡ�<br>

	1.��������String�������͵ġ���{...}����ʾ����<br>
	2.���������з�String�������ͣ�����ֱ����Ϊ����ʽ��ֵ <br>
	3.����2����������ǣ������String����ʹ��ת������{}��������Ž�������Ϊ���࣬���������ݡ�<br>
	
	���סaltTeyntaxѡ���ֵ������Ϊ����ʽʱ���Ը��� - Alt�﷨<br>
	<h2>����ʽ���Է���</h2>
	Freemarker��Velocity��JSTL EL����OGNL���б�׼�������е�JavaBean����: <p>Username: ${user.username}</p>  <br>
	ֵջ�ϵ��û������ԡ�:<s:textfield name="username"/> <br>
	��һ���������ڼ�ֵ��ջ�ϵ����Եķ�����:
	<s:url id="es" action="Hello">
	<s:param name="request_locale">
	  es
	</s:param>
	</s:url>
	<s:a href="%{es}">Espanol</s:a> <br>
	Session������User�����username���ԡ�:<s:property value="#session.user.username" />
	��̬��ͼ����put�����û���������trillian������:<s:select label="FooBar" name="foo" list="#{'username':'trillian','username':'zaphod'}" />
	
	<h1>������ʹ����������</h1>
	������ʹ�������������ƣ�<br>
	parameters	<br>
    application	<br>
    session	<br>
    struts	<br>
    request	<br>
    servletRequest	<br>
    servletResponse	<br>
	<br> <br>
	<table>
		<tr>
			<td>�﷨</td>
			<td>����</td>
			<td>ʾ��</td>
		</tr>
		<tr>
			<td>if</td>
			<td>ִ�л����������̡�'if'��ǩ���Ե���ʹ�ã�Ҳ���Ը�������'Else if'��ǩ������һ��'Else'��ǩ��</td>
			<td>
				<s:if test="%{false}">
				    <div>Will Not Be Executed</div>
				</s:if>
				<s:elseif test="%{true}">
				    <div>Will Be Executed</div>
				</s:elseif>
				<s:else>
				    <div>Will Not Be Executed</div>
				</s:else>
			</td>
		</tr>
	</table>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<br> <s:debug></s:debug> <br />
</body>
</html>