/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-12 15:55:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/todo/../common/header.jspf", Long.valueOf(1534060011000L));
    _jspx_dependants.put("/WEB-INF/views/todo/../common/footer.jspf", Long.valueOf(1534089246000L));
    _jspx_dependants.put("/WEB-INF/views/todo/../common/sidebar.jspf", Long.valueOf(1534060011000L));
    _jspx_dependants.put("/WEB-INF/views/todo/../common/navigationbar.jspf", Long.valueOf(1534089269000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005frequired_005fpath_005fid_005fautofocus_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fselect_0026_005fpath_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005frequired_005fpath_005fid_005fautofocus_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fselect_0026_005fpath_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005frequired_005fpath_005fid_005fautofocus_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fselect_0026_005fpath_005fid.release();
    _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"shortcut icon\" href=\"/static/img/todolist.ico\"/>\n");
      out.write("\n");
      out.write("<title>Todolist MVC</title>\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"/static/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"/static/css/datepicker.css\" rel=\"stylesheet\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    body {\n");
      out.write("        padding-top: 60px;\n");
      out.write("        /* 60px to make the container go all the way to the bottom of the topbar */\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- Le javascript -->\n");
      out.write("<script src=\"/static/js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/static/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/static/js/bootstrap-datepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navbar navbar-fixed-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"brand\" href=\"/index\">Todolist MVC</a>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span3\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"well sidebar-nav\">\n");
      out.write("    <ul class=\"nav nav-list\">\n");
      out.write("        <li class=\"nav-header\">Hi ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.sessionData'].user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" !</li>\n");
      out.write("        <li><a href=\"/user/todos\"><i class=\"icon-home\"></i> Home</a></li>\n");
      out.write("        <li><a href=\"/user/account\"><i class=\"icon-user\"></i> My account</a></li>\n");
      out.write("        <li><a href=\"/user/todos/new\"><i class=\"icon-file\"></i> Create a todo</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li class=\"nav-header\">Search todo</li>\n");
      out.write("        <li>\n");
      out.write("            <form class=\"form-search\" action=\"/user/todos/search\" id=\"searchForm\" method=\"get\">\n");
      out.write("                <div class=\"input-append\">\n");
      out.write("                    <input type=\"text\" name=\"title\" class=\"input-small search-query\" placeholder=\"search by title\" required=\"required\">\n");
      out.write("                    <button type=\"submit\" class=\"btn\">Go!</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span9\">\n");
      out.write("            <div class=\"well\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h1>Create a new todo</h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005fform_005f0.setParent(null);
      // /WEB-INF/views/todo/create.jsp(19,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setId("createTodoForm");
      // /WEB-INF/views/todo/create.jsp(19,16) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setAction("/user/todos/new.do");
      // /WEB-INF/views/todo/create.jsp(19,16) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setMethod("post");
      // /WEB-INF/views/todo/create.jsp(19,16) null
      _jspx_th_sf_005fform_005f0.setDynamicAttribute(null, "class", "form-horizontal");
      // /WEB-INF/views/todo/create.jsp(19,16) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005fform_005f0.setModelAttribute("todo");
      int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
        if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("                    <fieldset>\n");
            out.write("\n");
            out.write("                        <div class=\"control-group\">\n");
            out.write("                            <label class=\"control-label\" for=\"title\">Title:</label>\n");
            out.write("                            <div class=\"controls\">\n");
            out.write("                                ");
            if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
              return;
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                        </div>\n");
            out.write("\n");
            out.write("\n");
            out.write("                        <div class=\"control-group\">\n");
            out.write("                            <label class=\"control-label\" for=\"priority\">Priority:</label>\n");
            out.write("                            <div class=\"controls\">\n");
            out.write("                                ");
            //  sf:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_sf_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fsf_005fselect_0026_005fpath_005fid.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_sf_005fselect_005f0.setPageContext(_jspx_page_context);
            _jspx_th_sf_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
            // /WEB-INF/views/todo/create.jsp(34,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005fselect_005f0.setId("priority");
            // /WEB-INF/views/todo/create.jsp(34,32) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_sf_005fselect_005f0.setPath("priority");
            int[] _jspx_push_body_count_sf_005fselect_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_005fselect_005f0 = _jspx_th_sf_005fselect_005f0.doStartTag();
              if (_jspx_eval_sf_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                                  ");
                  //  sf:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_sf_005foption_005f0 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_sf_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_sf_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fselect_005f0);
                  // /WEB-INF/views/todo/create.jsp(35,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_sf_005foption_005f0.setValue("LOW");
                  int[] _jspx_push_body_count_sf_005foption_005f0 = new int[] { 0 };
                  try {
                    int _jspx_eval_sf_005foption_005f0 = _jspx_th_sf_005foption_005f0.doStartTag();
                    if (_jspx_eval_sf_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_sf_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_sf_005foption_005f0[0]++;
                        _jspx_th_sf_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_sf_005foption_005f0.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write('L');
                        out.write('o');
                        out.write('w');
                        int evalDoAfterBody = _jspx_th_sf_005foption_005f0.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_sf_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_sf_005foption_005f0[0]--;
                      }
                    }
                    if (_jspx_th_sf_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_sf_005foption_005f0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_sf_005foption_005f0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_sf_005foption_005f0.doFinally();
                    _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.reuse(_jspx_th_sf_005foption_005f0);
                  }
                  out.write("\n");
                  out.write("                                  ");
                  //  sf:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_sf_005foption_005f1 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_sf_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_sf_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fselect_005f0);
                  // /WEB-INF/views/todo/create.jsp(36,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_sf_005foption_005f1.setValue("MEDIUM");
                  int[] _jspx_push_body_count_sf_005foption_005f1 = new int[] { 0 };
                  try {
                    int _jspx_eval_sf_005foption_005f1 = _jspx_th_sf_005foption_005f1.doStartTag();
                    if (_jspx_eval_sf_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_sf_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_sf_005foption_005f1[0]++;
                        _jspx_th_sf_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_sf_005foption_005f1.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("Medium");
                        int evalDoAfterBody = _jspx_th_sf_005foption_005f1.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_sf_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_sf_005foption_005f1[0]--;
                      }
                    }
                    if (_jspx_th_sf_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_sf_005foption_005f1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_sf_005foption_005f1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_sf_005foption_005f1.doFinally();
                    _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.reuse(_jspx_th_sf_005foption_005f1);
                  }
                  out.write("\n");
                  out.write("                                  ");
                  //  sf:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_sf_005foption_005f2 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_sf_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_sf_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fselect_005f0);
                  // /WEB-INF/views/todo/create.jsp(37,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_sf_005foption_005f2.setValue("HIGH");
                  int[] _jspx_push_body_count_sf_005foption_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_sf_005foption_005f2 = _jspx_th_sf_005foption_005f2.doStartTag();
                    if (_jspx_eval_sf_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_sf_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_sf_005foption_005f2[0]++;
                        _jspx_th_sf_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_sf_005foption_005f2.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("High");
                        int evalDoAfterBody = _jspx_th_sf_005foption_005f2.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_sf_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_sf_005foption_005f2[0]--;
                      }
                    }
                    if (_jspx_th_sf_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_sf_005foption_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_sf_005foption_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_sf_005foption_005f2.doFinally();
                    _005fjspx_005ftagPool_005fsf_005foption_0026_005fvalue.reuse(_jspx_th_sf_005foption_005f2);
                  }
                  out.write("\n");
                  out.write("                                ");
                  int evalDoAfterBody = _jspx_th_sf_005fselect_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_sf_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_005fselect_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_005fselect_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_005fselect_005f0.doFinally();
              _005fjspx_005ftagPool_005fsf_005fselect_0026_005fpath_005fid.reuse(_jspx_th_sf_005fselect_005f0);
            }
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                        </div>\n");
            out.write("\n");
            out.write("                        <div class=\"form-actions\">\n");
            out.write("                            <button type=\"submit\" class=\"btn btn-primary\"> <i class=\"icon-ok icon-white\"></i> Create</button>\n");
            out.write("                            <button type=\"button\" class=\"btn\" onclick=\"history.go(-1)\"><i class=\"icon-remove\"></i> Cancel</button>\n");
            out.write("                        </div>\n");
            out.write("\n");
            out.write("                    </fieldset>\n");
            out.write("\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fsf_005fform_0026_005fmodelAttribute_005fmethod_005fid_005fclass_005faction.reuse(_jspx_th_sf_005fform_005f0);
      }
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write('\n');
      out.write("<footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row well\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <p>Todolist with Spring</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/todo/../common/navigationbar.jspf(11,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.sessionData'].user != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <ul class=\"nav\">\n");
        out.write("                <li class=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${homeTabStyle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"><a href=\"/user/todos\">Home</a></li>\n");
        out.write("            </ul>\n");
        out.write("            <div class=\"btn-group pull-right\">\n");
        out.write("                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
        out.write("                    <i class=\"icon-user\"></i> Hi ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.sessionData'].user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(" ! <span class=\"caret\"></span>\n");
        out.write("                </a>\n");
        out.write("                <ul class=\"dropdown-menu\">\n");
        out.write("                    <li><a href=\"/user/account\">My account</a></li>\n");
        out.write("                    <li class=\"divider\"></li>\n");
        out.write("                    <li><a href=\"/user/logout\">Sign out</a></li>\n");
        out.write("                </ul>\n");
        out.write("            </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/todo/../common/navigationbar.jspf(28,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope['scopedTarget.sessionData'].user == null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <ul class=\"nav pull-right\">\n");
        out.write("                <li class=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${registerTabStyle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"><a href=\"/register\">Register</a></li>\n");
        out.write("                <li class=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginTabStyle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"><a href=\"/login\">Login</a></li>\n");
        out.write("            </ul>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005frequired_005fpath_005fid_005fautofocus_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
    // /WEB-INF/views/todo/create.jsp(26,32) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "type", "text");
    // /WEB-INF/views/todo/create.jsp(26,32) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setId("title");
    // /WEB-INF/views/todo/create.jsp(26,32) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sf_005finput_005f0.setPath("title");
    // /WEB-INF/views/todo/create.jsp(26,32) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "required", "required");
    // /WEB-INF/views/todo/create.jsp(26,32) null
    _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "autofocus", "autofocus");
    int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
      if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005frequired_005fpath_005fid_005fautofocus_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
    }
    return false;
  }
}
