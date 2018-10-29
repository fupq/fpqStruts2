/**
 * 
 */
package com.fpq.action.wildcard;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 *
 */
public class TeacherAction extends ActionSupport{

	/**
	 * http://localhost:8080/struts206DataCheck20181016/actions/Teacher_add.action
	 * @return
	 */
	public String add() {
		System.out.println("TeacherAction中的add方法正在执行... ...！");
		return SUCCESS;
	}
	
	/**
	 * 通过通通配到delete方法，<action name="*_*" class="com.fpq.action.wildcard.{1}Action" method="{2}">
	 * http://localhost:8080/struts206DataCheck20181016/actions/Teacher_delete.action
	 * @return
	 */
	public String delete() {
		System.out.println("TeacherAction中的delete方法正在执行... ...！");
		return SUCCESS;
	}
}
