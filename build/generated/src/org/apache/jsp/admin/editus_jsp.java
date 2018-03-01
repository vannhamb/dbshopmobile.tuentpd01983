package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.List;
import java.util.ArrayList;
import javax.xml.ws.Response;
import model.userDAO;
import model.shopuser;
import java.io.OutputStream;
import java.sql.Statement;
import java.sql.Connection;
import conmon.ConnectDB;
import java.sql.ResultSet;

public final class editus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Dashboard - Deep Blue Admin</title>\n");
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
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- you need to include the shieldui css and js assets in order for the charts to work -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.shieldui.com/shared/components/latest/css/light-bootstrap/all.min.css\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.prepbootstrap.com/Content/js/gridData.js\"></script>\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Admin Panel</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                    <li ><a href=\"#\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\n");
      out.write("                    <li ><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachsp\"><i class=\"fa fa-tasks\"></i> List Products</a></li>\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachus\"><i class=\"fa fa-globe\"></i> List Users</a></li>\n");
      out.write("                    <li ><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/dangkyus.jsp\"><i class=\"fa fa-list-ol\"></i> Add Users</a></li>\n");
      out.write("                    <li ><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/themsanpham.jsp\"><i class=\"fa fa-font\"></i> Add Products</a></li>\n");
      out.write("                    <li ><a href=\"");
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
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1>Dashboard <small>Dashboard Home</small></h1>\n");
      out.write("                    <div class=\"alert alert-success alert-dismissable\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        Welcome to the admin dashboard! Feel free to review all pages and modify the layout to your needs. \n");
      out.write("                        <br />\n");
      out.write("                        This theme uses the <a href=\"https://www.shieldui.com\">ShieldUI</a> JavaScript library for the \n");
      out.write("                        additional data visualization and presentation functionality illustrated here.\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
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
      out.write("\n");
      out.write("             <div>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <h2>New Registration</h2>\n");
      out.write("        </div>\n");
      out.write("                 \n");
      out.write("                 <form action=\"/Assignemnt_gd1_tuentpd01983/updateuserServlet\" method=\"POST\">\n");
      out.write("                   \n");
      out.write("                     ");
 shopuser s = new userDAO().getUserByID(request.getParameter("username"));
                        String ass = null;
                        ass= s.getGioitinh();
                 
      out.write("  \n");
      out.write("        <div>\n");
      out.write("            <label for=\"fullname\" class=\"col-md-2\">\n");
      out.write("                Full Name:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"hoten\" placeholder=\"Enter Full Name\" value=\"");
      out.print( s.getHoten());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("                <i class=\"fa fa-lock fa-2x\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <div>\n");
      out.write("            <label for=\"username\" class=\"col-md-2\">\n");
      out.write("               Username:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Enter Username\"  value=\"");
      out.print( s.getUsername());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-md-1\">\n");
      out.write("                <i class=\"fa fa-lock fa-2x\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                     <div>\n");
      out.write("            <label for=\"password\" class=\"col-md-2\">\n");
      out.write("                Password:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Enter Password\"  value=\"");
      out.print( s.getPassword());
      out.write("\">\n");
      out.write("                <p class=\"help-block\">\n");
      out.write("                    Min: 6 characters (Alphanumeric only)\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-md-1\">\n");
      out.write("                <i class=\"fa fa-lock fa-2x\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"emailaddress\" class=\"col-md-2\">\n");
      out.write("                Email address:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"mail\" placeholder=\"Enter email address\"  value=\"");
      out.print( s.getMail());
      out.write("\">\n");
      out.write("                <p class=\"help-block\">\n");
      out.write("                    Example: yourname@domain.com\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-md-1\">\n");
      out.write("                <i class=\"fa fa-lock fa-2x\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        <div>\n");
      out.write("            <label for=\"role\" class=\"col-md-2\">\n");
      out.write("                Gender:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <select  name=\"gioitinh\" class=\"form-control\" >\n");
      out.write("                    <option value=\"Nam\"  ");
      out.print((s.getGioitinh().equals("Nam")?"selected='selected'":""));
      out.write(">Nam</option>\n");
      out.write("                    <option value=\"Nu\"  ");
      out.print((s.getGioitinh().equals("Nu")?"selected='selected'":""));
      out.write(">Nu</option>\n");
      out.write("                </select>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"role\" class=\"col-md-2\">\n");
      out.write("                Role:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                \n");
      out.write("                <select  name=\"role\" class=\"form-control\" >\n");
      out.write("                    <option value=\"AD\" ");
      out.print((s.getRole().equals("AD")?"selected='selected'":""));
      out.write(">AD</option>\n");
      out.write("                    <option value=\"NV\" ");
      out.print((s.getRole().equals("NV")?"selected='selected'":""));
      out.write(">NV</option>\n");
      out.write("                </select>\n");
      out.write("                    \n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"sdt\" class=\"col-md-2\">\n");
      out.write("                Phone:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"sdt\" placeholder=\"Enter Number\" value=\"");
      out.print( s.getSdt());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("                <i class=\"fa fa-lock fa-2x\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"diachi\" class=\"col-md-2\">\n");
      out.write("                Address:\n");
      out.write("            </label>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"diachi\" placeholder=\"Enter Address\" value=\"");
      out.print( s.getDiachi());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("                <i class=\"fa fa-lock fa-2x\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("                <label>\n");
      out.write("                    <input type=\"checkbox\">I hereby accept the terms and conditions for using this site</label>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info\" value=\"Update\"/>\n");
      out.write("            </div>\n");
      out.write("        </div></form>\n");
      out.write("    </div> \n");
      out.write("    </div>\n");
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
