/**
 * 
 */
package com.fpq.action.webElement;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 * http://localhost:8080/struts206DataCheck20181016/login/login0.action
 */
public class LoginAction0 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6288995366911486083L;

	public String execute() {
		System.out.println("LoginAction0,打开login。jsp页面！");
		return "login";
	}
}
