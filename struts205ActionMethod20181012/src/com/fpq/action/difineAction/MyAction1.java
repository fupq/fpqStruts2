/**
 * 自定义action
 */
package com.fpq.action.difineAction;

/**
 * @author fpq
 * struts2中若类中包含public String execute()方法，则该类就是一个action
 */
public class MyAction1{

	public String execute() {
		System.out.println("第一种自定义Action的方法：struts2中若类中包含public String execute()方法，则该类就是一个action,此方法不建议使用");
		return "success";
	}
}
