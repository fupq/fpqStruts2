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
 * http://localhost:8080/struts206DataCheck20181016/login/packageGlobalType.action?type=3
 */
public class LoginActionDynamicResultType extends ActionSupport{

	private int type;
	
	private String r;
	
	
	
	
	/**@Title:  getR <BR>  
	 * @Description:  <BR>  
	 * @return: String <BR>  
	 */
	public String getR() {
		return r;
	}



	/**@Description: please write your description <BR>  
	 * @Title:  setR <BR>  
	 * @return: String <BR>  
	 */
	public void setR(String r) {
		this.r = r;
	}



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
		System.out.println("LoginActionGlobalResult类,globalResult:全局结果。同一个package内的多个action可共用，不同package中的action通过package的extends属性集成globalResult所在的package也可共用");
		if(type == 1) {
			System.out.println("type=1"); //http://localhost:8080/struts206DataCheck20181016/dynamicResultType/dynamicResultType.action?type=1
			r = "/user_login_success.jsp";
		}else if(type == 2){
			System.out.println("type=2"); //http://localhost:8080/struts206DataCheck20181016/dynamicResultType/dynamicResultType.action?type=2
			r = "/error.jsp";
		}else {
			System.out.println("type="+getType());
			r = "/globalResult.jsp"; //http://localhost:8080/struts206DataCheck20181016/dynamicResultType/dynamicResultType.action?type=3
		}
		return SUCCESS;//"error";
	}
}
