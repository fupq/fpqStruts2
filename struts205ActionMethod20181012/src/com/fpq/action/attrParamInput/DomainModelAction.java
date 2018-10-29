/**
 * 
 */
package com.fpq.action.attrParamInput;

import com.fpq.dto.UserDTO;
import com.fpq.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fpq
 * 使用demain model接收参数
 */
public class DomainModelAction extends ActionSupport{

	/**
	 * 定义model对象user
	 * User是个model类，Struts自动为这个类创建new出了对象（struts从url中的参数赋值过来是创建new出了这个对象，并未对象中的成员变量赋值（调用set方法赋值）），不需要手动写代码创建new出对象了
	 */
	private User user;
	
	
	/*
     * http://localhost:8080/struts205ActionMethod20181012/attrParamInput/DomainModel_add.action?user.name=carson&user.age=5
     * @return
	 */
	public String add() {
		System.out.println("使用DomainModel接收参数,action找那个存储的成员变量是个domain,实体类");
		
		
		System.out.println("DomainModelAction类中add（）方法：name="+this.user.getName());
		System.out.println("DomainModelAction类中add（）方法：age="+this.user.getAge());
		return SUCCESS;
	}

	/*
     * http://localhost:8080/struts205ActionMethod20181012/attrParamInput/DomainModel_delete.action?user.name=carson&user.age=5
     * @return
	 */
	public String delete() {
		System.out.println("使用DomainModel接收参数,action找那个存储的成员变量是个domain,实体类");
		System.out.println("DomainModelAction类中delete（）方法：name="+this.user.getName());
		System.out.println("DomainModelAction类中delete（）方法：age="+this.user.getAge());
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
