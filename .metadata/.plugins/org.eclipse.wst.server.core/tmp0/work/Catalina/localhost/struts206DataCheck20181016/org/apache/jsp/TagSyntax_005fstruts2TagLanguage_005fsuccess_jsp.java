/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2018-10-28 17:15:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TagSyntax_005fstruts2TagLanguage_005fsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<!-- \r\n");
      out.write("Licensed to the Apache Software Foundation (ASF) under one\r\n");
      out.write("or more contributor license agreements.  See the NOTICE file\r\n");
      out.write("distributed with this work for additional information\r\n");
      out.write("regarding copyright ownership.  The ASF licenses this file\r\n");
      out.write("to you under the Apache License, Version 2.0 (the\r\n");
      out.write("\"License\"); you may not use this file except in compliance\r\n");
      out.write("with the License.  You may obtain a copy of the License at\r\n");
      out.write("\r\n");
      out.write(" http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("Unless required by applicable law or agreed to in writing,\r\n");
      out.write("software distributed under the License is distributed on an\r\n");
      out.write("\"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n");
      out.write("KIND, either express or implied.  See the License for the\r\n");
      out.write("specific language governing permissions and limitations\r\n");
      out.write("under the License. \r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"https://struts.apache.org/css/default.css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .dp-highlighter {\r\n");
      out.write("            width:95% !important;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .footer {\r\n");
      out.write("            background-image:      url('https://cwiki.apache.org/confluence/images/border/border_bottom.gif');\r\n");
      out.write("            background-repeat:     repeat-x;\r\n");
      out.write("            background-position:   left top;\r\n");
      out.write("            padding-top:           4px;\r\n");
      out.write("            color:                 #666;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("        var hide = null;\r\n");
      out.write("        var show = null;\r\n");
      out.write("        var children = null;\r\n");
      out.write("\r\n");
      out.write("        function init() {\r\n");
      out.write("            /* Search form initialization */\r\n");
      out.write("            var form = document.forms['search'];\r\n");
      out.write("            if (form != null) {\r\n");
      out.write("                form.elements['domains'].value = location.hostname;\r\n");
      out.write("                form.elements['sitesearch'].value = location.hostname;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Children initialization */\r\n");
      out.write("            hide = document.getElementById('hide');\r\n");
      out.write("            show = document.getElementById('show');\r\n");
      out.write("            children = document.all != null ?\r\n");
      out.write("                    document.all['children'] :\r\n");
      out.write("                    document.getElementById('children');\r\n");
      out.write("            if (children != null) {\r\n");
      out.write("                children.style.display = 'none';\r\n");
      out.write("                show.style.display = 'inline';\r\n");
      out.write("                hide.style.display = 'none';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function showChildren() {\r\n");
      out.write("            children.style.display = 'block';\r\n");
      out.write("            show.style.display = 'none';\r\n");
      out.write("            hide.style.display = 'inline';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function hideChildren() {\r\n");
      out.write("            children.style.display = 'none';\r\n");
      out.write("            show.style.display = 'inline';\r\n");
      out.write("            hide.style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <title>Generic Tag Reference</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"init()\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("    <tr class=\"topBar\">\r\n");
      out.write("        <td align=\"left\" valign=\"middle\" class=\"topBarDiv\" align=\"left\" nowrap>\r\n");
      out.write("            &nbsp;<a href=\"home.html\">Home</a>&nbsp;&gt;&nbsp;<a href=\"guides.html\">Guides</a>&nbsp;&gt;&nbsp;<a href=\"tag-developers-guide.html\">Tag Developers Guide</a>&nbsp;&gt;&nbsp;<a href=\"struts-tags.html\">Struts Tags</a>&nbsp;&gt;&nbsp;<a href=\"tag-reference.html\">Tag Reference</a>&nbsp;&gt;&nbsp;<a href=\"generic-tag-reference.html\">Generic Tag Reference</a>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\" valign=\"middle\" nowrap>\r\n");
      out.write("            <form name=\"search\" action=\"https://www.google.com/search\" method=\"get\">\r\n");
      out.write("                <input type=\"hidden\" name=\"ie\" value=\"UTF-8\" />\r\n");
      out.write("                <input type=\"hidden\" name=\"oe\" value=\"UTF-8\" />\r\n");
      out.write("                <input type=\"hidden\" name=\"domains\" value=\"\" />\r\n");
      out.write("                <input type=\"hidden\" name=\"sitesearch\" value=\"\" />\r\n");
      out.write("                <input type=\"text\" name=\"q\" maxlength=\"255\" value=\"\" />\r\n");
      out.write("                <input type=\"submit\" name=\"btnG\" value=\"Google Search\" />\r\n");
      out.write("            </form>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div id=\"PageContent\">\r\n");
      out.write("    <div class=\"pageheader\" style=\"padding: 6px 0px 0px 0px;\">\r\n");
      out.write("        <!-- We'll enable this once we figure out how to access (and save) the logo resource -->\r\n");
      out.write("        <!--img src=\"/wiki/images/confluence_logo.gif\" style=\"float: left; margin: 4px 4px 4px 10px;\" border=\"0\"-->\r\n");
      out.write("        <div style=\"margin: 0px 10px 0px 10px\" class=\"smalltext\">Apache Struts 2 Documentation</div>\r\n");
      out.write("        <div style=\"margin: 0px 10px 8px 10px\"  class=\"pagetitle\">Generic Tag Reference</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"greynavbar\" align=\"right\" style=\"padding: 2px 10px; margin: 0px;\">\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/editpage.action?pageId=19735\">\r\n");
      out.write("                <img src=\"https://cwiki.apache.org/confluence/images/icons/notep_16.gif\"\r\n");
      out.write("                     height=\"16\" width=\"16\" border=\"0\" align=\"absmiddle\" title=\"Edit Page\"></a>\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/editpage.action?pageId=19735\">Edit Page</a>\r\n");
      out.write("            &nbsp;\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/listpages.action?key=WW\">\r\n");
      out.write("                <img src=\"https://cwiki.apache.org/confluence/images/icons/browse_space.gif\"\r\n");
      out.write("                     height=\"16\" width=\"16\" border=\"0\" align=\"absmiddle\" title=\"Browse Space\"></a>\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/listpages.action?key=WW\">Browse Space</a>\r\n");
      out.write("            &nbsp;\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/createpage.action?spaceKey=WW&fromPageId=19735\">\r\n");
      out.write("                <img src=\"https://cwiki.apache.org/confluence/images/icons/add_page_16.gif\"\r\n");
      out.write("                     height=\"16\" width=\"16\" border=\"0\" align=\"absmiddle\" title=\"Add Page\"></a>\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/createpage.action?spaceKey=WW&fromPageId=19735\">Add Page</a>\r\n");
      out.write("            &nbsp;\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/createblogpost.action?spaceKey=WW&fromPageId=19735\">\r\n");
      out.write("                <img src=\"https://cwiki.apache.org/confluence/images/icons/add_blogentry_16.gif\"\r\n");
      out.write("                     height=\"16\" width=\"16\" border=\"0\" align=\"absmiddle\" title=\"Add News\"></a>\r\n");
      out.write("            <a href=\"https://cwiki.apache.org/confluence/pages/createblogpost.action?spaceKey=WW&fromPageId=19735\">Add News</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"pagecontent\">\r\n");
      out.write("        <div class=\"wiki-content\">\r\n");
      out.write("            <div id=\"ConfluenceContent\"><p>\r\n");
      out.write("</p><p>Struts Generic Tags control the execution flow as pages render.</p>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table-wrap\"><table class=\"confluenceTable\"><tbody><tr><th colspan=\"1\" rowspan=\"1\" class=\"confluenceTh\"><p>Control Tags </p></th><td colspan=\"1\" rowspan=\"1\" class=\"confluenceTd\"><ul><li><a shape=\"rect\" href=\"if.html\">if</a></li><li><a shape=\"rect\" href=\"elseif.html\">elseif</a></li><li><a shape=\"rect\" href=\"else.html\">else</a></li><li><a shape=\"rect\" href=\"append.html\">append</a></li><li><a shape=\"rect\" href=\"generator.html\">generator</a></li><li><a shape=\"rect\" href=\"iterator.html\">iterator</a></li><li><a shape=\"rect\" href=\"merge.html\">merge</a></li><li><a shape=\"rect\" href=\"sort.html\">sort</a></li><li><a shape=\"rect\" href=\"subset.html\">subset</a></li></ul>\r\n");
      out.write("</td><th colspan=\"1\" rowspan=\"1\" class=\"confluenceTh\"><p> Data Tags </p></th><td colspan=\"1\" rowspan=\"1\" class=\"confluenceTd\"><ul><li><a shape=\"rect\" href=\"a.html\">a</a></li><li><a shape=\"rect\" href=\"action.html\">action</a></li><li><a shape=\"rect\" href=\"bean.html\">bean</a></li><li><a shape=\"rect\" href=\"date.html\">date</a></li><li><a shape=\"rect\" href=\"debug.html\">debug</a></li><li><a shape=\"rect\" href=\"i18n.html\">i18n</a></li><li><a shape=\"rect\" href=\"include.html\">include</a></li><li><a shape=\"rect\" href=\"param.html\">param</a></li><li><a shape=\"rect\" href=\"property.html\">property</a></li><li><a shape=\"rect\" href=\"push.html\">push</a></li><li><a shape=\"rect\" href=\"set.html\">set</a></li><li><a shape=\"rect\" href=\"text.html\">text</a></li><li><a shape=\"rect\" href=\"url.html\">url</a></li></ul>\r\n");
      out.write("</td></tr></tbody></table></div>\r\n");
      out.write("\r\n");
      out.write("<h2 id=\"GenericTagReference-Next:\">Next: <a shape=\"rect\" href=\"ui-tags.html\">UI Tags</a></h2></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"tabletitle\">\r\n");
      out.write("                Children\r\n");
      out.write("            <span class=\"smalltext\" id=\"show\" style=\"display: inline;\">\r\n");
      out.write("              <a href=\"javascript:showChildren()\">Show Children</a></span>\r\n");
      out.write("            <span class=\"smalltext\" id=\"hide\" style=\"display: none;\">\r\n");
      out.write("              <a href=\"javascript:hideChildren()\">Hide Children</a></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"greybox\" id=\"children\" style=\"display: none;\">\r\n");
      out.write("                                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                                    $page.link($child)\r\n");
      out.write("                    <span class=\"smalltext\">(Apache Struts 2 Documentation)</span>\r\n");
      out.write("                    <br>\r\n");
      out.write("                            </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    Generated by CXF SiteExporter\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
