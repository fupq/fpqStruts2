/**
 * 
 */
package com.fpq.action.pathAction;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 *
 */
public class PathAction extends ActionSupport{

	/**
	 * 返回path,到struts.xml文件action标签里的result标签中查询name为path的result来显示其jsp
	 */
	@Override
	public String execute() {
		System.out.println("struts2的路径问题！");
		return "path";
	}
}
