/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-03-03 14:32:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/T:/softwares%20pro/Bumble%20bee/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Bumble/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1660112728163L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("textarea{\n");
      out.write("	resize:none;\n");
      out.write("	font-size:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Tahoma, Serif;\n");
      out.write("  color: #263238;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content:space-between; \n");
      out.write("  align-items: center;\n");
      out.write("  padding: 1rem 2rem;\n");
      out.write("  background: #e06666;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul {\n");
      out.write("  display: flex;\n");
      out.write("  list-style: none; \n");
      out.write("}\n");
      out.write("\n");
      out.write("nav li {\n");
      out.write("  padding-left: 1rem; \n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: black;\n");
      out.write("  font-weight:bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write(" text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".txt_input{\n");
      out.write("\n");
      out.write("	width:30%;\n");
      out.write("	height:auto;\n");
      out.write("	margin:10px;\n");
      out.write("	padding:10px;\n");
      out.write("	font-size:100%;\n");
      out.write("	border-color:#e06666;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".createAccount{\n");
      out.write("\n");
      out.write("	background-color:#e06666;\n");
      out.write("	outline: none;\n");
      out.write("    border: none;\n");
      out.write("    width:20%;\n");
      out.write("    height:50px;;\n");
      out.write("    font-size:100%;\n");
      out.write("    padding:10px;\n");
      out.write("    font-weight:bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".msg{\n");
      out.write("	color:red;\n");
      out.write("	\n");
      out.write("	font-weight:bold;\n");
      out.write("	\n");
      out.write("\n");
      out.write("}\n");
      out.write(" /* \n");
      out.write("  Extra small devices (phones, 600px and down) \n");
      out.write("*/\n");
      out.write("@media only screen and (max-width: 600px) {\n");
      out.write("  nav {\n");
      out.write("    flex-direction: column;\n");
      out.write("  }\n");
      out.write("  nav ul {\n");
      out.write("    flex-direction: column;\n");
      out.write("    padding-top: 0.5rem;\n");
      out.write("  }\n");
      out.write("  nav li {\n");
      out.write("    padding: 0.5rem 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Customer Registration</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("<div  class=\"container\">\n");
      out.write("<div id=\"msg\" class=\"msg\"></div>\n");
      out.write("<p class=\"msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<p>\n");
      out.write("<form action=\"addData\" method=\"post\">\n");
      out.write("<input type=\"text\" name=\"fname\" placeholder=\"First Name\" required class=\"txt_input\"><br>\n");
      out.write("<input type=\"text\" name=\"lname\" placeholder=\"Last Name\" required class=\"txt_input\"><br>\n");
      out.write("<input type=\"date\" name=\"dob\" required class=\"txt_input\" id=\"dob\" onChange=\"ageCalculator()\"><br>\n");
      out.write("<textarea placeholder=\"Address\" required name=\"adress\" required class=\"txt_input\"></textarea ><br>\n");
      out.write("<input type=\"text\" name=\"nic\" placeholder=\"Nic\" required class=\"txt_input\"><br>\n");
      out.write("<input type=\"email\" name=\"email\" placeholder=\"Email\" required class=\"txt_input\"><br>\n");
      out.write("<input type=\"password\" name=\"password\" placeholder=\"Password\" required class=\"txt_input\"><br><br>\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"addClient\">\n");
      out.write("<button type=\"submit\" class=\"btn btn-success createAccount\">Create Account</button>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("<script>  \n");
      out.write("function ageCalculator() {  \n");
      out.write("    var userinput = document.getElementById(\"dob\").value;  \n");
      out.write("    var dob = new Date(userinput);  \n");
      out.write(" \n");
      out.write("      \n");
      out.write("    //calculate month difference from current date in time  \n");
      out.write("    var month_diff = Date.now() - dob.getTime();  \n");
      out.write("      \n");
      out.write("    //convert the calculated difference in date format  \n");
      out.write("    var age_dt = new Date(month_diff);   \n");
      out.write("      \n");
      out.write("    //extract year from date      \n");
      out.write("    var year = age_dt.getUTCFullYear();  \n");
      out.write("      \n");
      out.write("    //now calculate the age of the user  \n");
      out.write("    var age = Math.abs(year - 1970);  \n");
      out.write("    \n");
      out.write("    if(age>=18){\n");
      out.write("    \n");
      out.write("\n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("        \n");
      out.write("       document.getElementById(\"dob\").value = \"\";\n");
      out.write("       document.getElementById(\"msg\").innerHTML = \"*** Sorry Age not enough ***\";\n");
      out.write("         \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //display the calculated age  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("}  \n");
      out.write("</script> \n");
      out.write("</body>\n");
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
