package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import conmon.ConnectDB;

public final class themsanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Forms - Deep Blue Admin</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/support/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/support/font-awesome/css/font-awesome.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/support/css/local.css\" />\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/admin/support/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/admin/support/bootstrap/js/bootstrap.min.js\"></script>        \n");
      out.write("    <script>\n");
      out.write("                if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao4 == 'true'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("  alert(\"Thêm thành công!\");\n");
      out.write("  \n");
      out.write("}else if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao4 == 'false'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("      alert(\"Thêm Th?t b?i! vui lòng ki?m tra l?i?\");\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Back to Admin</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                   <li ><a href=\"#\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\n");
      out.write("                    <li ><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachsp\"><i class=\"fa fa-tasks\"></i> List Products</a></li>\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachus\"><i class=\"fa fa-globe\"></i> List Users</a></li>\n");
      out.write("                    <li ><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/dangkyus.jsp\"><i class=\"fa fa-list-ol\"></i> Add Users</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/themsanpham.jsp\"><i class=\"fa fa-font\"></i> Add Products</a></li>\n");
      out.write("                     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/themdanhmuc.jsp\"><i class=\"fa fa-font\"></i> Add Category</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("                    <li class=\"dropdown messages-dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">2</span> <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li class=\"dropdown-header\">2 New Messages</li>\n");
      out.write("                            <li class=\"message-preview\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                                    <span class=\"message\">Security alert</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li class=\"message-preview\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\n");
      out.write("                                    <span class=\"message\">Security alert</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"#\">Go to Inbox <span class=\"badge\">2</span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"dropdown user-dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Steve Miller<b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("       <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1>Products <small>Add Products</small></h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("<div class=\"row\">\n");
      out.write("                ");
 
                        ConnectDB db = new ConnectDB();
                    Connection con = db.getConnect();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT COUNT(`username`) FROM `taikhoan`");
                    if(rs.next()){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachus\"><div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"panel panel-default \">\n");
      out.write("                        <div class=\"panel-body alert-info\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <i class=\"fa fa-user fa-5x\">&nbsp");
      out.print(rs.getInt(1));
      out.write("</i>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <p style=\"font-size: 25px;text-align: center\"><strong>USERS</strong></p>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                               </div></a>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
 
                        
                    st = con.createStatement();
                     rs = st.executeQuery("SELECT COUNT(`masp`) FROM `sanpham`");
                    if(rs.next()){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachsp\"><div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"panel panel-default \">\n");
      out.write("                        <div class=\"panel-body alert-info\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <i class=\"fa fa-list-alt fa-5x\">&nbsp");
      out.print(rs.getInt(1));
      out.write("</i>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <p style=\"font-size: 25px;text-align: center\"><strong>LIST PRODUCT</strong></p>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                               </div></a>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("               ");
 
                       
                    st = con.createStatement();
                   rs = st.executeQuery("SELECT COUNT(`hangsx`) FROM `danhmuc`");
                    if(rs.next()){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/themdanhmuc.jsp\"><div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"panel panel-default \">\n");
      out.write("                        <div class=\"panel-body alert-info\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <i class=\"fa fa-tags fa-5x\">&nbsp");
      out.print(rs.getInt(1));
      out.write("</i>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <p style=\"font-size: 25px;text-align: center\"><strong>CATEGORY</strong></p>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                               </div></a>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
 
                       
                    st = con.createStatement();
                   rs = st.executeQuery("SELECT sum(soluong) FROM `sanpham`");
                    if(rs.next()){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <a href=\"#\"><div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"panel panel-default \">\n");
      out.write("                        <div class=\"panel-body alert-info\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <i class=\"fa fa-th fa-5x\">&nbsp");
      out.print(rs.getInt(1));
      out.write("</i>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <p style=\"font-size: 25px;text-align: center\"><strong>All Quantity</strong></p>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                               </div></a>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("                 <div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <div >              \n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\"><i class=\"fa fa-bar-chart-o\"></i>New Products</h3>\n");
      out.write("                        </div>\n");
      out.write("                 \n");
      out.write("                 <form action=\"");
      out.print(request.getContextPath());
      out.write("/themspServlet\" method=\"POST\">\n");
      out.write("<div>\n");
      out.write("            <label for=\"tensp\" class=\"col-md-2\">\n");
      out.write("                Product Name:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"tensp\" placeholder=\"Enter Name\">\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <div>\n");
      out.write("            <label for=\"masp\" class=\"col-md-2\">\n");
      out.write("               ID Product:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"masp\" placeholder=\"Enter ID\" >\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                     <div>\n");
      out.write("            <label for=\"giatien\" class=\"col-md-2\">\n");
      out.write("                Cost Price:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"giatien\" placeholder=\"Enter VND\"  >\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"soluong\" class=\"col-md-2\">\n");
      out.write("                Quantity:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"number\" class=\"form-control\" name=\"soluong\" placeholder=\"Enter Number\" >\n");
      out.write("            </div>\n");
      out.write("        </div>              \n");
      out.write("        <div>\n");
      out.write("            <label for=\"hangsx\" class=\"col-md-2\">\n");
      out.write("                produce:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("               \n");
      out.write("                <select  name=\"hangsx\" class=\"form-control\"> \n");
      out.write("                    ");
 
                    st = con.createStatement();
                    rs = st.executeQuery("select hangsx from danhmuc");
                    while(rs.next()){    
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(1));
      out.write("\" >");
      out.print(rs.getString(1));
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info\" value=\"ADD PRODUCT\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    </div> \n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("                 </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
