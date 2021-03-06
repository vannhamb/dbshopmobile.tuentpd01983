package org.apache.jsp.pageshop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import conmon.ConnectDB;
import model.sanphamDAO;

public final class shoping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <meta name=\"description\" content=\"Free Bootstrap Themes by 365Bootstrap dot com - Free Responsive Html5 Templates\">\n");
      out.write("    <meta name=\"author\" content=\"https://www.365bootstrap.com\">\n");
      out.write("\t\n");
      out.write("   <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/css/bootstrap.min.css\"  type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t<!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/css/style.css\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- Custom Fonts -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/font-awesome/css/font-awesome.min.css\"  type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/fonts/font-slider.css\" type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t<!-- jQuery and Modernizr-->\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/js/jquery-2.1.1.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Core JavaScript Files -->  \t \n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--Top-->\n");
      out.write("\t<nav id=\"top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-6\">\n");
      out.write("\t\t\t\t\t<select class=\"language\">\n");
      out.write("\t\t\t\t\t\t<option value=\"English\" selected>English</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"France\">France</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"Germany\">Germany</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<select class=\"currency\">\n");
      out.write("\t\t\t\t\t\t<option value=\"USD\" selected>USD</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"EUR\">EUR</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"DDD\">DDD</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-6\">\n");
      out.write("\t\t\t\t\t<ul class=\"top-link\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/login.jsp\"><span class=\"glyphicon glyphicon-user\"></span> My Account</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\"><span class=\"glyphicon glyphicon-envelope\"></span> Contact</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!--Header-->\n");
      out.write("\t<header class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<div id=\"logo\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/logo.png\" /></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<form class=\"form-search\">  \n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-medium search-query\">  \n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn\"><span class=\"glyphicon glyphicon-search\"></span></button>  \n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<div id=\"cart\"><a class=\"btn btn-1\" href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/cart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\"></span>CART : 0 ITEM</a></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!--Navigation-->\n");
      out.write("    <nav id=\"menu\" class=\"navbar\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\"><span id=\"heading\" class=\"visible-xs\">Categories</span>\n");
      out.write("\t\t\t  <button type=\"button\" class=\"btn btn-navbar navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">PC Computers</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Window</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">MacBook</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Laptops &amp; Notebooks</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Dell</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Asus</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Lenovo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Acer</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Mobiles &amp; Tablet</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu\" style=\"margin-left: -203.625px;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Iphone</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Nokia</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Lenovo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Google</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Nexus</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Dell</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Oppo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Blackberry</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">HTC</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">LG</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Q-Mobiles</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Sony</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">Wiko</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"category.html\">T&T</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"category.html\">Software</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t\n");
      out.write("\t<!--//////////////////////////////////////////////////-->\n");
      out.write("\t<!--///////////////////Category Page//////////////////-->\n");
      out.write("\t<!--//////////////////////////////////////////////////-->\n");
      out.write("\t<div id=\"page-content\" class=\"single-page\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"category.html\">Category : Mobile</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                 \n");
      out.write("\t\t\t\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"products\">       ");
     
                                    ConnectDB condb = new ConnectDB();
                                    Connection con = condb.getConnect();
                                    Statement st = con.createStatement();
                                    ResultSet rs = st.executeQuery("select * from sanpham where hangsx= 'Apple'");
                                    while(rs.next()){
                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                                                             \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("                                                                            <div class=\"image\"><a href=\"product.html\"><img  src=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(rs.getString("hinhanh"));
      out.write("\" /></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"buttons\">\n");
      out.write("                                                                                    <a class=\"btn cart\" href=\"");
      out.print(request.getContextPath());
      out.write("/themcartServlet?masp=");
      out.print(rs.getString("masp"));
      out.write("&tensp=");
      out.print(rs.getString("tensp"));
      out.write("&giatien=");
      out.print(rs.getString("giatien"));
      out.write("&hinhanh=");
      out.print(rs.getString("hinhanh"));
      out.write("\"><span class=\"glyphicon glyphicon-shopping-cart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn wishlist\" href=\"#\"><span class=\"glyphicon glyphicon-heart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn compare\" href=\"#\"><span class=\"glyphicon glyphicon-transfer\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("                                                                                    <div class=\"name\"><h3><a href=\"product.html\">");
      out.print(rs.getString("tensp"));
      out.write("</a></h3></div>\n");
      out.write("                                                                                        <div class=\"price\">");
      out.print(rs.getString("giatien"));
      out.write(" VND</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t </div>\t\t\t\t\t");

                            }
                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                                                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("                            <div id=\"sidebar\" class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"widget wid-categories\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>CATEGORIES</h4></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">PC Computers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Laptops & Notebooks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mobiles & Tablet</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Software</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget wid-type\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>TYPE</h4></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"EL\" selected>Electronics</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"MT\">Mice and Trackballs</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"WC\">Web Cameras</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"TA\">Tablates</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"AP\">Audio Parts</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget wid-discouts\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>DISCOUNTS</h4></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"discount\" checked=\"\">Upto - 10% (20)</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"discount\">40% - 50% (5)</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"discount\">30% - 20% (7)</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"discount\">10% - 5% (2)</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"discount\">Other(50)</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget wid-brand\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>BRAND</h4></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">Nokia</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">Samsung</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">Iphone</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">HTC</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">Oppo</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">Kings</label>\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"brand\">Zumba</label>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget wid-product\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>LATEST</h4></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/galaxy-note.jpg\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"#\">Samsung Galaxy Tab</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/galaxy-s4.jpg\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"#\">Samsung Galaxy Tab</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/Z1.png\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"#\">Samsung Galaxy Tab</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"wrap-footer\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-footer footer-1\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/logofooter.png\" />\n");
      out.write("\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-footer footer-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>Customer Service</h4></div>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-footer footer-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>My Account</h4></div>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">My Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Brands</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Gift Vouchers</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Specials</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Site Map</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-footer footer-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"heading\"><h4>Contact Us</h4></div>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-home\"></span>California, United States 3000009</li>\n");
      out.write("\t\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-earphone\"></span>+91 8866888111</li>\n");
      out.write("\t\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-envelope\"></span>infor@yoursite.com</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\tYour Store ? 20xx - Designed by <a href=\"https://www.365bootstrap.com\" target=\"_blank\">365bootstrap</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/visa-curved-32px.png\" /></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/paypal-curved-32px.png\" /></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/discover-curved-32px.png\" /></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/maestro-curved-32px.png\" /></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
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
