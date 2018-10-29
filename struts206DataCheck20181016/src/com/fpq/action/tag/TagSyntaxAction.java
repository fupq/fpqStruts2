/**@Description:
 * @Title:  TagSyntaxAction.java
 * @Package com.fpq.action.tag
 * @author: 付品欣
 * @date:   2018年10月28日 下午11:40:10
 * @Copyright: 2018 com.fpq
*/ 
package com.fpq.action.tag;

import com.opensymphony.xwork2.ActionSupport;

/**@Description:TODO(这里用一句话描述这个类的作用)   
 * @ClassName:  TagSyntaxAction   
 * @author: 付品欣
 * @date:   2018年10月28日 下午11:40:10   
 *     
 * @Copyright: 2018 com.fpq
 */
public class TagSyntaxAction extends ActionSupport{

	private String postalCode;
	
	/**
	 * boolean类型的属性
	 */
	private boolean state;
	
	
	private String ca;
	
	
	/**
	 * @Description:
	 * @Title: index 
	 * @return  
	 * @throws
	 *  http://localhost:8080/struts206DataCheck20181016/tag/TagSyntax_index.action?postalCode=fpq&state=true&ca=test
	 */
	public String index() {
		System.out.println("TagSyntaxAction:查看标签的语法文档！");
		return SUCCESS;
	}


	/**
	 * 通用标签的语法
	 * http://localhost:8080/struts206DataCheck20181016/tag/TagSyntax_struts2TagLanguage.action
	 */
	public String struts2TagLanguage() {
		System.out.println("TagSyntaxAction:通用标记参考！");
		return SUCCESS;
	}
	
	/**@Title:  getPostalCode <BR>  
	 * @Description:  <BR>  
	 * @return: String <BR>  
	 */
	public String getPostalCode() {
		return postalCode;
	}


	/**@Description: please write your description <BR>  
	 * @Title:  setPostalCode <BR>  
	 * @return: String <BR>  
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	/**@Title:  isState <BR>  
	 * @Description:  <BR>  
	 * @return: boolean <BR>  
	 */
	public boolean isState() {
		return state;
	}


	/**@Description: please write your description <BR>  
	 * @Title:  setState <BR>  
	 * @return: boolean <BR>  
	 */
	public void setState(boolean state) {
		this.state = state;
	}


	/**@Title:  getCa <BR>  
	 * @Description:  <BR>  
	 * @return: String <BR>  
	 */
	public String getCa() {
		return ca;
	}


	/**@Description: please write your description <BR>  
	 * @Title:  setCa <BR>  
	 * @return: String <BR>  
	 */
	public void setCa(String ca) {
		this.ca = ca;
		System.out.println("ca:"+ca);
	}
	
	
	
	
	
	
}
