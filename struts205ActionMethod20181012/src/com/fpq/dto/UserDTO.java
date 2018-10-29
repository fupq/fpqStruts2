/**
 * 
 */
package com.fpq.dto;

/**
 * @author fpq
 *
 */
public class UserDTO {

	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 年龄
	 * 参数传递时，不需要进行数据类型的显式转换，自动转换为int了。
	 */
	private int age;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 确认密码
	 */
	private String confirmPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
}
