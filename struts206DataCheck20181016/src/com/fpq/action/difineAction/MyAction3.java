/**
 * 自定义action
 */
package com.fpq.action.difineAction;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author fpq
 * 第三种自定义Action的方法：从ActionSupport（com.opensymphony.xwork2.ActionSupport）父类继承定义Action子类；
 */
public class MyAction3 extends ActionSupport{

	@Override
	public String execute() {
		System.out.println("第三种自定义Action的方法：从ActionSupport（com.opensymphony.xwork2.ActionSupport）父类继承定义Action子类；推荐使用此方法创建Action.");
		return "success";
	}
}
