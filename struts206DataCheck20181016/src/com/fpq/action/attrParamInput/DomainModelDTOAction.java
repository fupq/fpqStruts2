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
public class DomainModelDTOAction extends ActionSupport{

	/**
	 * 定义model对象user
	 */
	private User user;
	
	/**
	 * DTO:Data Transfer Object
	 */
	private UserDTO userDTO;
	
	/**
	 * http://localhost:8080/struts206DataCheck20181016/attrParamInput/DomainModelDTO_add.action?userDTO.name=carson&userDTO.age=5&userDTO.password=Carson@20131111&userDTO.confirmPassword=Carson@20131111
	 * @return
	 */
	public String add() {
		try {
			System.out.println("使用DomainModel接收参数,action找那个存储的成员变量是个domain,实体类");
			if(this.userDTO.getPassword().isEmpty()) {
				System.out.println("密码不允许为空，请重新输入");
				return SUCCESS;
			}
			if(this.userDTO.getConfirmPassword().isEmpty()) {
				System.out.println("确认密码不允许为空，请重新输入");
				return SUCCESS;
			}
			System.out.println(this.userDTO.getPassword());
			System.out.println(this.userDTO.getConfirmPassword());
			System.out.println(this.userDTO.getName());
			System.out.println(this.userDTO.getAge());
			if(this.userDTO.getPassword().equals("Carson@20131111") && this.userDTO.getConfirmPassword().equals("Carson@20131111")) {
				this.user = new User(this.userDTO.getName(),this.userDTO.getAge());
				System.out.println("DomainModelDTOAction类中add（）方法：name="+this.user.getName());
				System.out.println("DomainModelDTOAction类中add（）方法：age="+this.user.getAge());
			}else {
				System.out.println("输入的确认密码和密码不一致，请重新输入");
			}
		}catch(Exception e) {
			System.out.println("程序出现异常");
			System.out.println(e.getMessage());
		}
		return SUCCESS;
	}
	
	/**
	 * http://localhost:8080/struts206DataCheck20181016/attrParamInput/DomainModelDTO_delete.action?userDTO.name=carson&userDTO.age=5&password=Carson@20131111&confirmPassword=Carson@20131111
	 * @return
	 */
	public String delete() {
		System.out.println("使用Action中的DTO对象接收参数");
		System.out.println("DomainModelDTOAction类中delete（）方法：name="+this.userDTO.getName());
		System.out.println("DomainModelDTOAction类中delete（）方法：age="+this.userDTO.getAge());
		return SUCCESS;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}


	
	
}
