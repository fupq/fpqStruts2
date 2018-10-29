/**
 * 
 */
package com.fpq.action.attrParamInput;

import com.fpq.dto.UserDTO;
import com.fpq.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author fpq
 * 使用demain model接收参数
 * ModelDriven
 */
public class ModelDrivenAction extends ActionSupport  implements ModelDriven<User>{

	/**
	 * 定义model对象user
	 * 定义User对象时，ModelDriven认为user是一个model,需要手动创建new出这个对象，
	 */
	private User user = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	/*
     * http://localhost:8080/struts206DataCheck20181016/attrParamInput/ModelDriven_add.action?user.name=carson&user.age=5
     * @return
	 */
	public String add() {
		System.out.println("使用DomainModel接收参数,action找那个存储的成员变量是个domain,实体类");
		
		
		System.out.println("DomainModelAction类中add（）方法：name="+this.user.getName());
		System.out.println("DomainModelAction类中add（）方法：age="+this.user.getAge());
		return SUCCESS;
	}

	/*
     * http://localhost:8080/struts206DataCheck20181016/attrParamInput/ModelDriven_delete.action?user.name=carson&user.age=5
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
