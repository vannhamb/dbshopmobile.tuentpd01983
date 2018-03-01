package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.io.OutputStream;
import java.sql.Statement;
import java.sql.Connection;
import conmon.ConnectDB;
import java.sql.ResultSet;

public final class danhsachsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <script>if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao5 == 'true'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("  alert(\"Thêm thành công!\");\n");
      out.write("  \n");
      out.write("}else if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao5 == 'false'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("      alert(\"Thêm Thất bại! vui lòng kiểm tra lại?\");\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("  else if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao6 == 'true'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("      alert(\"Sửa thành công!\");\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("  else if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao6 == 'false'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("      alert(\"Sửa Thất bại! vui lòng kiểm tra lại?\");\n");
      out.write("      \n");
      out.write("  }\n");
      out.write(" else if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbaoxoasp == 'true'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("      alert(\"Xóa thành công!\");\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("\n");
      out.write("          </script>\n");
      out.write("          <script>\n");
      out.write("function myFunction() {\n");
      out.write("  // Declare variables \n");
      out.write("  var input, filter, table, tr, td, i;\n");
      out.write("  input = document.getElementById(\"myInput\");\n");
      out.write("  filter = input.value.toUpperCase();\n");
      out.write("  table = document.getElementById(\"myTable\");\n");
      out.write("  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write("  // Loop through all table rows, and hide those who don't match the search query\n");
      out.write("  for (i = 0; i < tr.length; i++) {\n");
      out.write("    td = tr[i].getElementsByTagName(\"td\")[1];\n");
      out.write("    if (td) {\n");
      out.write("      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("        tr[i].style.display = \"\";\n");
      out.write("      } else {\n");
      out.write("        tr[i].style.display = \"none\";\n");
      out.write("      }\n");
      out.write("    } \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
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
      out.write("                     <li ><a href=\"#\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachsp\"><i class=\"fa fa-tasks\"></i> List Products</a></li>\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/danhsachus\"><i class=\"fa fa-globe\"></i> List Users</a></li>\n");
      out.write("                    <li ><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/dangkyus.jsp\"><i class=\"fa fa-list-ol\"></i> Add Users</a></li>\n");
      out.write("                    <li><a href=\"");
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
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1>Products <small>List Products</small></h1>\n");
      out.write("                   \n");
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
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">              \n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\"><i class=\"fa fa-bar-chart-o\"></i>Danh Sách Sản Phẩm</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div id=\"shieldui-grid1\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for names..\">\n");
      out.write("                                    <br/>\n");
      out.write("                                        <table id=\"myTable\" style=\"width: 82%\" class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>Mã SP</th>\n");
      out.write("                        <th>Tên SP</th>\n");
      out.write("                        <th>Giá Tiền</th>\n");
      out.write("                        <th>Số Lượng</th>\n");
      out.write("                        <th>Hãng sx</th>\n");
      out.write("                        <th>Loại SP</th>\n");
      out.write("                        <th>action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    \n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("sp");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listsp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("                        <td>");
            if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>                         \n");
            out.write("                        <td><a style=\"color: blue;\" href=\"");
            out.print(request.getContextPath());
            out.write("/editspServlet?masp=");
            if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write('"');
            out.write('>');
            if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</a></td> \n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                        ");
DecimalFormat dc = new DecimalFormat("###,###,###"); 
            out.write("\n");
            out.write("                        <td>");
            if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td> \n");
            out.write("                        <td>");
            if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td> \n");
            out.write("                        <td>");
            if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td> \n");
            out.write("                        <td>");
            if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td> \n");
            out.write("                        <td><a href=\"");
            out.print(request.getContextPath());
            out.write("/deleteSanpham?masp=");
            if (_jspx_meth_c_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\">Delete</a></td>      \n");
            out.write("                    </tr>\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.stt}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.masp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.masp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.tensp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.giatien} VND", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.soluong}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.hangsx}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.loaisp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sp.masp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }
}
