/**@Description:
 * @Title:  ResultTypeAction.java
 * @Package com.fpq.action.resultType
 * @author: 付品欣
 * @date:   2018年10月20日 下午12:58:08
 * @Copyright: 2018 com.fpq
*/ 
package com.fpq.action.resultType;

import com.opensymphony.xwork2.ActionSupport;

/**@Description:TODO(这里用一句话描述这个类的作用)   
 * @ClassName:  ResultTypeAction   
 * @author: 付品欣
 * @date:   2018年10月20日 下午12:58:08   
 *     
 * @Copyright: 2018 com.fpq
 * http://localhost:8080/struts206DataCheck20181016/resultType/useChainToAction.action
 *  等同于
 * http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action
 */
public class ResultTypeActionDispatcher extends ActionSupport {

	public String execute() {
		System.out.println("ResultType的chain类型跳转到ResultTypeActionDispatcher,不常用");
		return "achain";
	}
}
