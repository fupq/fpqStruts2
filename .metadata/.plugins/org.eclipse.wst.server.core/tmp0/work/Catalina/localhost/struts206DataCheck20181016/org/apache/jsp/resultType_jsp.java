/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2018-10-22 17:45:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resultType_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"GB18030\">\r\n");
      out.write("<title>resultType</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>struts2的Action的Result的类型：</h1>\r\n");
      out.write("\t<h2>\r\n");
      out.write("\t\t<a href=\"http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_dispatcher.action\">dispatcher:默认类型,运用服务器端跳转（url中显示的是ResultType_dispatcher.action），（只能）跳转到jsp页面，html页面，freemarker页面等页面\t，常用</a><br>\r\n");
      out.write("\t\t<a href=\"http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_redirect.action\">redirect：（只能）重定向到视图或页面,常用(客户端跳转，显示的是url中显示的是resultTypeRedirect.jsp)\t<br></a> \r\n");
      out.write("\t\t<a href=\"http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action\">chain:forward到一个action,不常用，</a> 等同于<a href=\"http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action\">http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_chain.action</a> <br>\r\n");
      out.write("\t\t<a href=\"http://localhost:8080/struts206DataCheck20181016/resultType/ResultType_redirectAction.action\">redirectAction：客户端跳转到一个Action,不常用</a><br>\r\n");
      out.write("\t\tfreemarker：前端框架，非常少用<br>\r\n");
      out.write("\t\thttpheader：放一个http的头，非常少用<br>\r\n");
      out.write("\t\tstream：下载，非常少用<br>\r\n");
      out.write("\t\tvelocity：和freemarker类似的一个前端框架，非常少用<br>\r\n");
      out.write("\t\txslt：和xml相关的修饰，非常少用<br>\r\n");
      out.write("\t\tplaintext:显示页面的源码（翻译成html之前的源码），非常少用<br>\r\n");
      out.write("\t\ttiles：把页面分成多块，可指定没块的内容，非常少用<br>\r\n");
      out.write("\t</h2>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
