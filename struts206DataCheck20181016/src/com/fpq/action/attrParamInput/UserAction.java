/**
 * 
 */
package com.fpq.action.attrParamInput;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 * url中参数的名称和Action中的成员变量是一一对应的，参数可传递到成员变量中
 */
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7015215339133324391L;

	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 年龄
	 * 参数传递时，不需要进行数据类型的显式转换，自动转换为int了。
	 * http://localhost:8080/struts206DataCheck20181016/attrParamInput/User_add.action?name=carson&age=5
	 */
	private int age;
	
	public String add() {
		if(name == null || !name.equals("admin")) {
			this.addFieldError("name","name is error");
			this.addFieldError("name", "name is too long");
			return ERROR;
		}
		System.out.println("UserAction的add方法：测试url中参数传递到action的方法的输入参数中,url中参数的名称和Action中的成员变量是一一对应的，参数可传递到成员变量中");
		System.out.println("UserAction类中add（）方法：name="+this.name);
		System.out.println("UserAction类中add（）方法：age="+this.age);
		return SUCCESS;
	}

	public String delete() {
		System.out.println("UserAction的add方法：测试url中参数传递到action的方法的输入参数中,url中参数的名称和Action中的成员变量是一一对应的，参数可传递到成员变量中");
		return SUCCESS;
	}
	
	/**
	 *  url中的参数是个action中成员变量的get方法中get后的属性名称匹配的（属性名称第一个字母修改为小写就是url中参数名称）
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
