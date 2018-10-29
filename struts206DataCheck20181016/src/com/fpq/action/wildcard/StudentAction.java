/**
 * 使用通配符来调用action内部的方法
 */
package com.fpq.action.wildcard;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 *
 */
public class StudentAction extends ActionSupport {

	/**
	 * execute方法
	 */
//	@Override
//	public String execute() {
//		System.out.println("StudentAction中的execute方法正在执行... ...！");
//		return SUCCESS;
//	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6868639421253897984L;

	/**
	 * 通过通配符Student*统配到Studentadd方法
	 * http://localhost:8080/struts206DataCheck20181016/actions/Studentadd.action
	 * @return
	 */
	public String add() {
		System.out.println("StudentAction中的add方法正在执行... ...！");
		return SUCCESS;
	}
	
	/**
	 * 通过通配符Student*统配到Studentadd方法
	 * 
	 * @return
	 */
	public String delete() {
		System.out.println("StudentAction中的delete方法正在执行... ...！");
		return SUCCESS;
	}
}
