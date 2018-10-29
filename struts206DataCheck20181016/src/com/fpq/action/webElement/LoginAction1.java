/**
 * 获取Map类型的request,session,application信息-1 
 * 通过构造函数主动将ActionContext中的HttpRequest对象赋值给Map类型的request对象      基本不用这种方式
 */
package com.fpq.action.webElement;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 方式1：使用struts2的ActionContext获取request,session,application信息
 * @author fpq
 * http://localhost:8080/struts206DataCheck20181016/login/login1.action
 */
public class LoginAction1 extends ActionSupport{

	private Map request;
	private Map session;
	private Map application;
	
	public LoginAction1() {
		//ActionContext.getContext():获取Action执行的上下文（环境）；
		request = (Map)ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
	
	public String execute() {
		System.out.println("LoginAction1的execute方法正在执行");
		request.put("r1", "r1");
		session.put("s1","s1");
		application.put("a1","a1");
		System.out.println("request"+request.toString());
		System.out.println("session"+session.toString());
		System.out.println("application:"+application.toString());
		return SUCCESS;
	}
}
