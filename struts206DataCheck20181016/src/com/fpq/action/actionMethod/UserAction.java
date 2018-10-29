/**
 * 
 */
package com.fpq.action.actionMethod;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 *
 */
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3666581217254392421L;

	/**
	 * 返回path,到struts.xml文件action标签里的result标签中查询name为path的result来显示其jsp
	 */
	@Override
	public String execute() {
		System.out.println("执行UserAction的execute方法！");
		return SUCCESS;
	}
	
	/**
	 * http://localhost:8080/struts206DataCheck20181016/user/user!add
	 * @return
	 */
	public String add() {
		System.out.println("执行类com.fpq.action.actionMethod.UserAction中的add方法");
		return "add";
	}
	
	/**
	 * http://localhost:8080/struts206DataCheck20181016/user/user!delete
	 * @return
	 */
	public String delete() {
		System.out.println("执行类com.fpq.action.actionMethod.UserAction中的delete方法");
		return "delete";
	}
}
