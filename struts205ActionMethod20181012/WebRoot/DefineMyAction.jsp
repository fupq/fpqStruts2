<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>自定义Action</title>
</head>
<body>
   执行了自定义的action:com.fpq.action.difineAction.MyAction1;</br>
   当action标签中不写class属性指定action的类是，默认执行的类是：com.opensymphony.xwork2.ActionSupport;</br>
 自定义Action的方法：</br>
 	1.struts2中若类中包含public String execute()方法，则该类就是一个action；此方法不建议使用.</br>
 	2.通过实行接口Action接口（com.opensymphony.xwork2.Action）来自定义定义Action；此方法不建议使用.</br>
 	3.从ActionSupport（com.opensymphony.xwork2.ActionSupport）父类继承定义Action子类；推荐使用此方法创建Action.</br>
</body>
</html>