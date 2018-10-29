/**
 * 
 * 获取Map类型的request,session,application信息-2  最常用
 * 实现RequestAware接口，重载setRequest方法，在接口RequestAware中调用该方式将Request对象的内容赋值给request
 * Aware：知道
 * 
 * Ioc(也称DI)编程思想
 * DI:dependency injection 依赖注入：request成员变量依赖于Struts注入HttpRequest对象（调用setRequest()）后才能使用Map<String,Object>类型的request对象
 * IoC: inverse of control 控制反转：把Map<String,Object>类型的request对象的控制权交给IoC容器来控制
 */
package com.fpq.action.webElement;

import java.util.Map;

/**
 * 实现此接口的类，就知道Application的存储
 */
import org.apache.struts2.interceptor.ApplicationAware;
/**
 * 实现此接口的类，就知道Request的存在
 */
import org.apache.struts2.interceptor.RequestAware;
/**
 * 实现此接口的类，就知道Session的存在
 */
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @ClassName:  LoginAction2   
 * @author: 付品欣
 * @date:   2018年10月18日 下午10:11:44   
 *     
 * @Copyright: 2018 com.fpq
 *  http://localhost:8080/struts206DataCheck20181016/login/login2.action
 */
public class LoginAction2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	/**
	 * 使用Map的泛型
	 */
	private Map<String,Object> request;
	private Map<String,Object> session;
	private Map<String,Object> application;
	
	public String execute() {
		System.out.println("LoginAction2的execute方法正在执行");
		request.put("r1", "r1");
		session.put("s1","s1");
		application.put("a1","a1");
		System.out.println("request"+request.toString());
		System.out.println("session"+session.toString());
		System.out.println("application:"+application.toString());
		return SUCCESS;
	}


	/**
	 * <p>重载setRequest方法，在接口RequestAware中调用该方式将Request对象的内容赋值给request</p>
	 * <p>Description: </p>
	 * @param request
	 * @see org.apache.struts2.interceptor.RequestAware#setRequest(java.util.Map)
	 */
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	/**
	 * <p>Title: 重新setSession方法，在接口SessionAware中调用该方式将Session对象的内容赋值给session</p>
	 * <p>Description: </p>
	 * @param session
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	/**
	 * <p>Title: 重新setApplication方法，在接口ApplicationAware中调用该方式将Session对象的内容赋值给application</p>
	 * <p>Description: </p>
	 * @param application
	 * @see org.apache.struts2.interceptor.ApplicationAware#setApplication(java.util.Map)
	 */
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	
	/**
	 * @return the request
	 */
	public Map<String, Object> getRequest() {
		return request;
	}

	

	/**
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	

	/**
	 * @return the application
	 */
	public Map<String, Object> getApplication() {
		return application;
	}

	/**
	 * @param application the application to set
	 */
	
	
	
	
}
