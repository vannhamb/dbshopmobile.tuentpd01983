package org.apache.jsp.pageshop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.sanphamDAO;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import conmon.ConnectDB;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>Mobile Shop | Free Bootstrap Themes by 365bootstrap.com</title>\n");
      out.write("\t\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav id=\"top\">\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/contact.html\"><span class=\"glyphicon glyphicon-envelope\"></span> Contact</a></li>\n");
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
      out.write("\t\t\t");
     
                                    ConnectDB condb = new ConnectDB();
                                    Connection con = condb.getConnect();
                                    Statement st = con.createStatement();
                                    ResultSet rs = st.executeQuery("select count(tenspmua) from giohang");
                                    while(rs.next()){

                        
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("                            <div id=\"cart\"><a class=\"btn btn-1\" href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/cart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\"></span>CART : ");
      out.print(rs.getInt(1) );
      out.write(" ITEM</a></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        ");
}
      out.write("\n");
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
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
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
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/shoping.jsp\">Iphone</a></li>\n");
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
      out.write("\t<!--//////////////////////////////////////////////////-->\n");
      out.write("\t<!--///////////////////HomePage///////////////////////-->\n");
      out.write("\t<!--//////////////////////////////////////////////////-->\n");
      out.write("\t<div id=\"page-content\" class=\"home-page\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<!-- Carousel -->\n");
      out.write("\t\t\t\t\t<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t<!-- Indicators -->\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t\t<!-- Wrapper for slides -->\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/main-banner1-1903x600.jpg\" alt=\"First slide\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Static Header -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-text hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /header-text -->\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/main-banner2-1903x600.jpg\" alt=\"Second slide\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Static Header -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-text hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /header-text -->\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/main-banner3-1903x600.jpg\" alt=\"Third slide\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Static Header -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-text hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /header-text -->\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- Controls -->\n");
      out.write("\t\t\t\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div><!-- /carousel -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"banner\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/sub-banner1.png\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/sub-banner2.png\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/sub-banner3.png\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<div class=\"heading\"><h2>SPECIAL PRODUCTS</h2></div>\n");
      out.write("\t\t\t\t\t<div class=\"products\">\n");
      out.write("\t\t\t\t\t\t");
     
                                     condb = new ConnectDB();
                                     con = condb.getConnect();
                                     st = con.createStatement();
                                     rs = st.executeQuery("select * from sanpham");
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
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"banner\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/sub-banner4.jpg\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/sub-banner5.png\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<div class=\"heading\"><h2>FEATURED PRODUCTS</h2></div>\n");
      out.write("\t\t\t\t\t<div class=\"products\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"image\"><a href=\"product.html\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/iphone.png\" /></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn cart\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn wishlist\" href=\"#\"><span class=\"glyphicon glyphicon-heart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn compare\" href=\"#\"><span class=\"glyphicon glyphicon-transfer\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"name\"><h3><a href=\"product.html\">Aliquam erat volutpat</a></h3></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122<span>$98</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"image\"><a href=\"product.html\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/galaxy-s4.jpg\" /></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn cart\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn wishlist\" href=\"#\"><span class=\"glyphicon glyphicon-heart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn compare\" href=\"#\"><span class=\"glyphicon glyphicon-transfer\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"name\"><h3><a href=\"product.html\">Aliquam erat volutpat</a></h3></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122<span>$98</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"image\"><a href=\"product.html\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/galaxy-note.jpg\" /></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn cart\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn wishlist\" href=\"#\"><span class=\"glyphicon glyphicon-heart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn compare\" href=\"#\"><span class=\"glyphicon glyphicon-transfer\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"name\"><h3><a href=\"product.html\">Aliquam erat volutpat</a></h3></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122<span>$98</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star-empty\"></span><span class=\"glyphicon glyphicon-star-empty\"></span><span class=\"glyphicon glyphicon-star-empty\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"image\"><a href=\"product.html\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/Z1.png\" /></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn cart\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn wishlist\" href=\"#\"><span class=\"glyphicon glyphicon-heart\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn compare\" href=\"#\"><span class=\"glyphicon glyphicon-transfer\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"name\"><h3><a href=\"product.html\">Aliquam erat volutpat</a></h3></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">$122<span>$98</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rating\"><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span><span class=\"glyphicon glyphicon-star\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      out.write("\t\t\t\t\t\tYour Store ?? 20xx - Designed by <a href=\"https://www.365bootstrap.com\">365BOOTSTRAP</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/images/visa-curved-32px.png\" /></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.print(request.getContextPath());
      out.write("/pageshop/support/paypal-curved-32px.png\" /></li>\n");
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
      out.write("    </body>\n");
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
