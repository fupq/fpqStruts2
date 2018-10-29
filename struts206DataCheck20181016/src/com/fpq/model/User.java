/**
 * 
 */
package com.fpq.model;

/**
 * @author fpq
 *
 */
public class User {
	
	public User() {
		
	}
	
	public User(String name,int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 年龄
	 * 参数传递时，不需要进行数据类型的显式转换，自动转换为int了。
	 */
	private int age;

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
	
	
}
