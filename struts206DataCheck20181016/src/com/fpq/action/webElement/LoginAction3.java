/**@Description: 通过ServletActionContext获取request,通过request获取session,通过session获取application    基本不用这种方式
 * @Title: 获取真实类型HttpServletRequest,HttpSession,ServletContext的信息-1
 * @Package com.fpq.action.webElement
 * @author: 付品欣
 * @date:   2018年10月18日 下午11:28:50
 * @Copyright: 2018 com.fpq
*/ 
package com.fpq.action.webElement;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**@Description:TODO(这里用一句话描述这个类的作用)   
 * @ClassName:  LoginAction3   
 * @author: 付品欣
 * @date:   2018年10月18日 下午11:28:50   
 *     
 * @Copyright: 2018 com.fpq
 * http://localhost:8080/struts206DataCheck20181016/login/login3.action
 */
public class LoginAction3 extends ActionSupport{

	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	/**
	 * @Description:通过ServletActionContext获取request,通过request获取session,通过session获取application
	 * @Title:  LoginAction3
	 * @param:  
	 * @throws
	 */
	public LoginAction3() {
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}
	
	public String execute() {
		System.out.println("LoginAction3的execute方法正在执行");
		request.setAttribute("r1", "r1");
		session.setAttribute("s1","s1");
		application.setAttribute("a1","a1");
		System.out.println("request"+request.toString());
		System.out.println("session"+session.toString());
		System.out.println("application:"+application.toString());
		return SUCCESS;
	}
}
