
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License. 
-->
<html>
<head>
    <link type="text/css" rel="stylesheet" href="https://struts.apache.org/css/default.css">
    <style type="text/css">
        .dp-highlighter {
            width:95% !important;
        }
    </style>
    <style type="text/css">
        .footer {
            background-image:      url('https://cwiki.apache.org/confluence/images/border/border_bottom.gif');
            background-repeat:     repeat-x;
            background-position:   left top;
            padding-top:           4px;
            color:                 #666;
        }
    </style>
    <script type="text/javascript" language="javascript">
        var hide = null;
        var show = null;
        var children = null;

        function init() {
            /* Search form initialization */
            var form = document.forms['search'];
            if (form != null) {
                form.elements['domains'].value = location.hostname;
                form.elements['sitesearch'].value = location.hostname;
            }

            /* Children initialization */
            hide = document.getElementById('hide');
            show = document.getElementById('show');
            children = document.all != null ?
                    document.all['children'] :
                    document.getElementById('children');
            if (children != null) {
                children.style.display = 'none';
                show.style.display = 'inline';
                hide.style.display = 'none';
            }
        }

        function showChildren() {
            children.style.display = 'block';
            show.style.display = 'none';
            hide.style.display = 'inline';
        }

        function hideChildren() {
            children.style.display = 'none';
            show.style.display = 'inline';
            hide.style.display = 'none';
        }
    </script>
    <title>Generic Tag Reference</title>
</head>
<body onload="init()">
<table border="0" cellpadding="2" cellspacing="0" width="100%">
    <tr class="topBar">
        <td align="left" valign="middle" class="topBarDiv" align="left" nowrap>
            &nbsp;<a href="home.html">Home</a>&nbsp;&gt;&nbsp;<a href="guides.html">Guides</a>&nbsp;&gt;&nbsp;<a href="tag-developers-guide.html">Tag Developers Guide</a>&nbsp;&gt;&nbsp;<a href="struts-tags.html">Struts Tags</a>&nbsp;&gt;&nbsp;<a href="tag-reference.html">Tag Reference</a>&nbsp;&gt;&nbsp;<a href="generic-tag-reference.html">Generic Tag Reference</a>
        </td>
        <td align="right" valign="middle" nowrap>
            <form name="search" action="https://www.google.com/search" method="get">
                <input type="hidden" name="ie" value="UTF-8" />
                <input type="hidden" name="oe" value="UTF-8" />
                <input type="hidden" name="domains" value="" />
                <input type="hidden" name="sitesearch" value="" />
                <input type="text" name="q" maxlength="255" value="" />
                <input type="submit" name="btnG" value="Google Search" />
            </form>
        </td>
    </tr>
</table>

<div id="PageContent">
    <div class="pageheader" style="padding: 6px 0px 0px 0px;">
        <!-- We'll enable this once we figure out how to access (and save) the logo resource -->
        <!--img src="/wiki/images/confluence_logo.gif" style="float: left; margin: 4px 4px 4px 10px;" border="0"-->
        <div style="margin: 0px 10px 0px 10px" class="smalltext">Apache Struts 2 Documentation</div>
        <div style="margin: 0px 10px 8px 10px"  class="pagetitle">Generic Tag Reference</div>

        <div class="greynavbar" align="right" style="padding: 2px 10px; margin: 0px;">
            <a href="https://cwiki.apache.org/confluence/pages/editpage.action?pageId=19735">
                <img src="https://cwiki.apache.org/confluence/images/icons/notep_16.gif"
                     height="16" width="16" border="0" align="absmiddle" title="Edit Page"></a>
            <a href="https://cwiki.apache.org/confluence/pages/editpage.action?pageId=19735">Edit Page</a>
            &nbsp;
            <a href="https://cwiki.apache.org/confluence/pages/listpages.action?key=WW">
                <img src="https://cwiki.apache.org/confluence/images/icons/browse_space.gif"
                     height="16" width="16" border="0" align="absmiddle" title="Browse Space"></a>
            <a href="https://cwiki.apache.org/confluence/pages/listpages.action?key=WW">Browse Space</a>
            &nbsp;
            <a href="https://cwiki.apache.org/confluence/pages/createpage.action?spaceKey=WW&fromPageId=19735">
                <img src="https://cwiki.apache.org/confluence/images/icons/add_page_16.gif"
                     height="16" width="16" border="0" align="absmiddle" title="Add Page"></a>
            <a href="https://cwiki.apache.org/confluence/pages/createpage.action?spaceKey=WW&fromPageId=19735">Add Page</a>
            &nbsp;
            <a href="https://cwiki.apache.org/confluence/pages/createblogpost.action?spaceKey=WW&fromPageId=19735">
                <img src="https://cwiki.apache.org/confluence/images/icons/add_blogentry_16.gif"
                     height="16" width="16" border="0" align="absmiddle" title="Add News"></a>
            <a href="https://cwiki.apache.org/confluence/pages/createblogpost.action?spaceKey=WW&fromPageId=19735">Add News</a>
        </div>
    </div>

    <div class="pagecontent">
        <div class="wiki-content">
            <div id="ConfluenceContent"><p>
</p><p>Struts Generic Tags control the execution flow as pages render.</p>

<div class="table-wrap"><table class="confluenceTable"><tbody><tr><th colspan="1" rowspan="1" class="confluenceTh"><p>Control Tags </p></th><td colspan="1" rowspan="1" class="confluenceTd"><ul><li><a shape="rect" href="if.html">if</a></li><li><a shape="rect" href="elseif.html">elseif</a></li><li><a shape="rect" href="else.html">else</a></li><li><a shape="rect" href="append.html">append</a></li><li><a shape="rect" href="generator.html">generator</a></li><li><a shape="rect" href="iterator.html">iterator</a></li><li><a shape="rect" href="merge.html">merge</a></li><li><a shape="rect" href="sort.html">sort</a></li><li><a shape="rect" href="subset.html">subset</a></li></ul>
</td><th colspan="1" rowspan="1" class="confluenceTh"><p> Data Tags </p></th><td colspan="1" rowspan="1" class="confluenceTd"><ul><li><a shape="rect" href="a.html">a</a></li><li><a shape="rect" href="action.html">action</a></li><li><a shape="rect" href="bean.html">bean</a></li><li><a shape="rect" href="date.html">date</a></li><li><a shape="rect" href="debug.html">debug</a></li><li><a shape="rect" href="i18n.html">i18n</a></li><li><a shape="rect" href="include.html">include</a></li><li><a shape="rect" href="param.html">param</a></li><li><a shape="rect" href="property.html">property</a></li><li><a shape="rect" href="push.html">push</a></li><li><a shape="rect" href="set.html">set</a></li><li><a shape="rect" href="text.html">text</a></li><li><a shape="rect" href="url.html">url</a></li></ul>
</td></tr></tbody></table></div>

<h2 id="GenericTagReference-Next:">Next: <a shape="rect" href="ui-tags.html">UI Tags</a></h2></div>
        </div>

                    <div class="tabletitle">
                Children
            <span class="smalltext" id="show" style="display: inline;">
              <a href="javascript:showChildren()">Show Children</a></span>
            <span class="smalltext" id="hide" style="display: none;">
              <a href="javascript:hideChildren()">Hide Children</a></span>
            </div>
            <div class="greybox" id="children" style="display: none;">
                                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                                    $page.link($child)
                    <span class="smalltext">(Apache Struts 2 Documentation)</span>
                    <br>
                            </div>
        
    </div>
</div>
<div class="footer">
    Generated by CXF SiteExporter
</div>
</body>
</html>
