/**@Description:实现ServletRequestAware接口：重载setServletRequest方法，在接口ServletRequestAware中调用该方式将HttpServletRequest对象的内容赋值给request</p>  用的少
 * @Title:  真实类型HttpServletRequest,HttpSession,ServletContext-2
 * @Package com.fpq.action.webElement
 * @author: 付品欣
 * @date:   2018年10月18日 下午11:40:11
 * @Copyright: 2018 com.fpq
*/ 
package com.fpq.action.webElement;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**@Description:TODO(这里用一句话描述这个类的作用)   
 * @ClassName:  LoginAction4   
 * @author: 付品欣
 * @date:   2018年10月18日 下午11:40:11   
 *     
 * @Copyright: 2018 com.fpq
 * 
 * http://localhost:8080/struts206DataCheck20181016/login/login4.action
 */
public class LoginAction4 extends ActionSupport implements ServletRequestAware{

	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	/**
	 * <p>Title: 重载setServletRequest方法，在接口ServletRequestAware中调用该方式将HttpServletRequest对象的内容赋值给request</p>
	 * <p>Description: </p>
	 * @param request
	 * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
		this.application = session.getServletContext();
		
		
		
		
		
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
