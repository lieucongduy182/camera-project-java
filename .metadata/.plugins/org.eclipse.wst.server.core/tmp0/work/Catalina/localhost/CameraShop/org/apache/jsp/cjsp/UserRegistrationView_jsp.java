/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2021-01-10 10:07:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import onlinefruitshop.controller.UserRegistrationCtl;
import onlinefruitshop.util.DataUtility;
import onlinefruitshop.util.ServletUtility;
import onlinefruitshop.util.ServletUtility;
import onlinefruitshop.controller.UserProductCtl;
import java.util.List;
import onlinefruitshop.bean.CartBean;
import onlinefruitshop.model.CartModel;
import onlinefruitshop.controller.LoginCtl;
import onlinefruitshop.controller.SOTGView;
import onlinefruitshop.bean.UserBean;

public final class UserRegistrationView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/cjsp/Header.jsp", Long.valueOf(1602328684000L));
    _jspx_dependants.put("/cjsp/Footer.jsp", Long.valueOf(1602328684000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("onlinefruitshop.controller.UserRegistrationCtl");
    _jspx_imports_classes.add("onlinefruitshop.controller.UserProductCtl");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("onlinefruitshop.controller.LoginCtl");
    _jspx_imports_classes.add("onlinefruitshop.model.CartModel");
    _jspx_imports_classes.add("onlinefruitshop.controller.SOTGView");
    _jspx_imports_classes.add("onlinefruitshop.bean.CartBean");
    _jspx_imports_classes.add("onlinefruitshop.util.ServletUtility");
    _jspx_imports_classes.add("onlinefruitshop.bean.UserBean");
    _jspx_imports_classes.add("onlinefruitshop.util.DataUtility");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Registration</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"/OnlineFruitShop/css/style.css\" rel=\"stylesheet\" >\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    var quantity = 1;\r\n");
      out.write("\r\n");
      out.write("    $('.quantity-right-plus').click(function(e){\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        var quantity = parseInt($('#quantity').val());\r\n");
      out.write("        $('#quantity').val(quantity + 1);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $('.quantity-left-minus').click(function(e){\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        var quantity = parseInt($('#quantity').val());\r\n");
      out.write("        if(quantity > 1){\r\n");
      out.write("            $('#quantity').val(quantity - 1);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");

    UserBean userBean = (UserBean) session.getAttribute("user");

    boolean userLoggedIn = userBean != null;

    String welcomeMsg = "Hi, ";

    if (userLoggedIn) {
        String role = (String) session.getAttribute("role");
        welcomeMsg += userBean.getFirstName() + " (" + role + ")";
    } else {
        welcomeMsg += "Guest";
    }


      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Online Fruits Shop<br><font style=\"font-size:13px\" >(Buy It Now)</font></a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarsExampleDefault\">\r\n");
      out.write("            <ul class=\"navbar-nav m-auto\">\r\n");
      out.write("            \r\n");
      out.write("            ");
if(userLoggedIn){ 
      out.write("\r\n");
      out.write(" \t\t\t\t\t");
if(userBean.getRoleId()==1){
      out.write("              \r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.HOME_CTL);
      out.write("\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item \">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.ADMIN_CTL);
      out.write("\">Add Admin</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item \">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.CATEGORY_LIST_CTL);
      out.write("\">Categories </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.PRODUCT_LIST_CTL);
      out.write("\">Product</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.INVOICE_LIST_CTL);
      out.write("\">Sell History</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            \r\n");
      out.write("             \r\n");
      out.write("               ");
}else if(userBean.getRoleId()==2){ 
      out.write("\r\n");
      out.write("              \r\n");
      out.write("               \t<li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.HOME_CTL);
      out.write("\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("               \r\n");
      out.write("               <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.USER_PRODUCT_LIST_CTL);
      out.write("\">Product</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.INVOICE_LIST_CTL);
      out.write("\">History</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            \r\n");
      out.write("               ");
} 
      out.write("\r\n");
      out.write("              ");
}else{
      out.write("\r\n");
      out.write("              \t<li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.HOME_CTL);
      out.write("\">Home <span class=\"sr-only\">(current)</span> </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                 <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(SOTGView.USER_PRODUCT_LIST_CTL);
      out.write("\">Product</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              \r\n");
      out.write("              ");
}
      out.write("\r\n");
      out.write("             \r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("            ");
if(userLoggedIn){
      out.write("\r\n");
      out.write("            ");
if(userBean.getRoleId()==2){ 
      out.write("\r\n");
      out.write("           \t <form class=\"form-inline my-2 my-lg-0\" action=\"");
      out.print(SOTGView.USER_PRODUCT_LIST_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" aria-label=\"Small\" name=\"name\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Search Product...\" value=\"");
      out.print(ServletUtility.getParameter("name", request));
      out.write("\" >\r\n");
      out.write("                    <div class=\"input-group-append\">\r\n");
      out.write("                        <input type=\"submit\" name=\"operation\" class=\"btn btn-info\" value=\"");
      out.print(UserProductCtl.OP_SEARCH);
      out.write("\"/>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                ");
}else{
      out.write("\r\n");
      out.write("                 <form class=\"form-inline my-2 my-lg-0\" action=\"");
      out.print(SOTGView.USER_PRODUCT_LIST_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" aria-label=\"Small\" name=\"name\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Search Product...\" value=\"");
      out.print(ServletUtility.getParameter("name", request));
      out.write("\">\r\n");
      out.write("                    <div class=\"input-group-append\">\r\n");
      out.write("                       <input type=\"submit\" name=\"operation\" class=\"btn btn-info\" value=\"");
      out.print(UserProductCtl.OP_SEARCH);
      out.write("\"/>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                ");
if(userLoggedIn){
      out.write("\r\n");
      out.write("                \t ");
if(userBean.getRoleId()==2){ 
      out.write("\r\n");
      out.write("                <a class=\"btn btn-success btn-sm ml-3\" href=\"");
      out.print(SOTGView.CART_LIST_CTL);
      out.write("\">\r\n");
      out.write("                    <i class=\"fa fa-shopping-cart\"></i> Cart\r\n");
      out.write("                    \r\n");
      out.write("    \t\t\t\t");
  CartModel cModel=new CartModel();
                    		CartBean cBean=new CartBean();
                    		cBean.setUserId(userBean.getId());
                    	 List list=cModel.search(cBean);
                    
      out.write("\r\n");
      out.write("                    <span class=\"badge badge-light\">");
      out.print(list.size());
      out.write("</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                <a class=\"btn btn-success btn-sm ml-3\" href=\"");
      out.print(SOTGView.MY_PROFILE_CTL);
      out.write("\">\r\n");
      out.write("                    <i class=\"fa fa-user\"></i>My Profile\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"btn btn-success btn-sm ml-3\" href=\"");
      out.print(SOTGView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">\r\n");
      out.write("                    <i class=\"fa fa-sign-out\"></i> Logout\r\n");
      out.write("                </a>  \r\n");
      out.write("                ");
}else{
      out.write("\r\n");
      out.write("                <a class=\"btn btn-success btn-sm ml-3\" href=\"");
      out.print(SOTGView.LOGIN_CTL);
      out.write("\">\r\n");
      out.write("                    <i class=\"fa fa-sign-in\"></i> Login\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"btn btn-success btn-sm ml-3\" href=\"");
      out.print(SOTGView.USER_REGISTRATION_CTL);
      out.write("\">\r\n");
      out.write("                     <i class=\"fa fa-user-plus\"></i> Register\r\n");
      out.write("                </a>\r\n");
      out.write("                ");
} 
      out.write(" \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<section class=\"jumbotron text-center\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1 class=\"jumbotron-heading\">Registration</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                <ol class=\"breadcrumb\">\r\n");
      out.write("                    <li class=\"breadcrumb-item\"><a href=\"");
      out.print(SOTGView.WELCOME_CTL);
      out.write("\">Home</a></li>\r\n");
      out.write("                    <li class=\"breadcrumb-item\"><a href=\"");
      out.print(SOTGView.LOGIN_CTL);
      out.write("\">Login</a></li>\r\n");
      out.write("                    <li class=\"breadcrumb-item active\"><a href=\"");
      out.print(SOTGView.USER_REGISTRATION_CTL);
      out.write("\">Registration</a></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header bg-primary text-white\"> Registration\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\r\n");
      out.write("                    <font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                   <form action=\"");
      out.print(SOTGView.USER_REGISTRATION_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("                   \r\n");
      out.write("                   ");
      onlinefruitshop.bean.UserBean bean = null;
      bean = (onlinefruitshop.bean.UserBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new onlinefruitshop.bean.UserBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"createdBy\" value=\"");
      out.print(bean.getCreatedBy());
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"modifiedBy\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(bean.getModifiedBy());
      out.write("\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\tname=\"createdDatetime\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDatetime()));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"modifiedDatetime\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDatetime()));
      out.write("\">\r\n");
      out.write("                   \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"name\">First Name</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"firstName\" placeholder=\"Enter First Name...\" \r\n");
      out.write("                                value=\"");
      out.print(DataUtility.getStringData(bean.getFirstName()));
      out.write("\" >\r\n");
      out.write("                                <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("firstName", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"name\">Last Name</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"lastName\" placeholder=\"Enter Last Name...\" \r\n");
      out.write("                                alue=\"");
      out.print(DataUtility.getStringData(bean.getLastName()));
      out.write("\" >\r\n");
      out.write("                            <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("lastName", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"email\">Login Id</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"login\" placeholder=\"Enter Login Id...\" \r\n");
      out.write("                                value=\"");
      out.print(DataUtility.getStringData(bean.getLogin()));
      out.write("\" >\r\n");
      out.write("                               <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("login", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"password\">Password</label>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Enter Password Here..\" \r\n");
      out.write("                                value=\"");
      out.print(DataUtility.getStringData(bean.getPassword()));
      out.write("\" >\r\n");
      out.write("                                <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("password", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"password\">Confirm Password</label>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"confirmPassword\" placeholder=\"ReEnter Password Here..\" \r\n");
      out.write("                                value=\"");
      out.print(DataUtility.getStringData(bean.getConfirmPassword()));
      out.write("\" >\r\n");
      out.write("                                <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("confirmPassword", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"email\">Email  Address</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Enter Email Address...\" \r\n");
      out.write("                                value=\"");
      out.print(DataUtility.getStringData(bean.getLogin()));
      out.write("\" >\r\n");
      out.write("                               <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("email", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"name\">Mobile No.</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"mobile\" placeholder=\"Enter 10 Digits mobile No.\"\r\n");
      out.write("                                value=\"");
      out.print(DataUtility.getStringData(bean.getMobileNo()));
      out.write("\" >\r\n");
      out.write("                                <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("mobile", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"message\">Shipping Address</label>\r\n");
      out.write("                           <textarea rows=\"5\" class=\"form-control\" name=\"shippingAdd\" placeholder=\"Enter Shipping Address Here..\" >");
      out.print(DataUtility.getStringData(bean.getShippingAddress()) );
      out.write("</textarea>\r\n");
      out.write("                            <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("shippingAdd", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"message\">Billing Address</label>\r\n");
      out.write("                            <textarea rows=\"5\" class=\"form-control\" name=\"billingAdd\" placeholder=\"Enter Billing Address Here..\" >");
      out.print(DataUtility.getStringData(bean.getBillingAddress()) );
      out.write("</textarea>\r\n");
      out.write("                            <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("billingAdd", request));
      out.write("</font>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mx-auto\">\r\n");
      out.write("                        <input type=\"submit\" name=\"operation\" class=\"btn btn-primary text-right\" value=\"");
      out.print(UserRegistrationCtl.OP_SIGN_UP);
      out.write("\">\r\n");
      out.write("                                <input type=\"submit\" name=\"operation\" class=\"btn btn-primary text-right\" value=\"");
      out.print(UserRegistrationCtl.OP_RESET);
      out.write("\"></div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("             </div>\r\n");
      out.write("        <div class=\"col-12 col-sm-4\">\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a:hover{\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write(".section-padding {\r\n");
      out.write("\tpadding: 14px 0;\r\n");
      out.write("}\r\n");
      out.write(".bottom {\r\n");
      out.write("    background-color: #0a1c2e;\r\n");
      out.write("}\r\n");
      out.write(".bottom .copyright {\r\n");
      out.write("    color: #e5e5e5;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write(".copyright a {\r\n");
      out.write("    color: #f2ff49;\r\n");
      out.write("    margin-left: 3px;\r\n");
      out.write("    padding-right: 3px;\r\n");
      out.write("}\r\n");
      out.write(".bottom p {\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("    line-height: 50px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write(".copyright p span {\r\n");
      out.write("    color: #d1caca;\r\n");
      out.write("}\r\n");
      out.write(".bottom .copyright p, .bottom .copyright a:hover{\r\n");
      out.write("    color: #6c6d83;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"bottom section-padding\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>?? <span>2019</span> <a href=\"#\" class=\"transition\">Online Fruits Shop.</a> All rights reserved.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
