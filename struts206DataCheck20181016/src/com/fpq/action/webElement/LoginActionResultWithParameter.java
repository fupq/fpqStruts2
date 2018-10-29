/**@Description:测试动态结果类型
 * @Title:  LoginActionGlobalResult.java
 * @Package com.fpq.action.webElement
 * @author: 付品欣
 * @date:   2018年10月27日 下午11:18:33
 * @Copyright: 2018 com.fpq
*/ 
package com.fpq.action.webElement;

import com.opensymphony.xwork2.ActionSupport;

/**@Description:TODO(这里用一句话描述这个类的作用)   
 * @ClassName:  LoginActionGlobalResult   
 * @author: 付品欣
 * @date:   2018年10月27日 下午11:18:33   
 *     
 * @Copyright: 2018 com.fpq
 * 
 * http://localhost:8080/struts206DataCheck20181016/dynamicResultType/resultTypeWithParameter.action?type=3
 */
public class LoginActionResultWithParameter extends ActionSupport{

	private int type;


	/**@Title:  getType <BR>  
	 * @Description:  <BR>  
	 * @return: int <BR>  
	 */
	public int getType() {
		return type;
	}



	/**@Description: please write your description <BR>  
	 * @Title:  setType <BR>  
	 * @return: int <BR>  
	 */
	public void setType(int type) {
		this.type = type;
	}


	@Override
	public String execute() {
		System.out.println("LoginActionDynamicResultType类,带参数的结果集");
		
		return SUCCESS;//"error";
	}
}