/**
 * 自定义action
 */
package com.fpq.action.difineAction;

import com.opensymphony.xwork2.Action;
/**
 * @author fpq
 * 通过实行接口Action接口（com.opensymphony.xwork2.Action）来自定义定义Action
 */
public class MyAction2 implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("第二种自定义Action的方法：通过实行接口Action接口（com.opensymphony.xwork2.Action）来自定义定义Action,此方法不建议使用");
		return "success";
	}
}
