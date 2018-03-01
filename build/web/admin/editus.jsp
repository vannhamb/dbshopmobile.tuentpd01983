
<%@page import="java.awt.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.xml.ws.Response"%>
<%@page import="model.userDAO"%>
<%@page import="model.shopuser"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="conmon.ConnectDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - Deep Blue Admin</title>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/admin/support/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/admin/support/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/admin/support/css/local.css" />

    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

    <!-- you need to include the shieldui css and js assets in order for the charts to work -->
    <link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/light-bootstrap/all.min.css" />
    <script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
    <script type="text/javascript" src="http://www.prepbootstrap.com/Content/js/gridData.js"></script>
   
</head>
<body>
    
    <div id="wrapper">
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Admin Panel</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li ><a href="#"><i class="fa fa-bullseye"></i> Dashboard</a></li>
                    <li ><a href="<%=request.getContextPath()%>/admin/danhsachsp"><i class="fa fa-tasks"></i> List Products</a></li>
                    <li><a href="<%=request.getContextPath()%>/admin/danhsachus"><i class="fa fa-globe"></i> List Users</a></li>
                    <li ><a href="<%=request.getContextPath()%>/admin/dangkyus.jsp"><i class="fa fa-list-ol"></i> Add Users</a></li>
                    <li ><a href="<%=request.getContextPath()%>/admin/themsanpham.jsp"><i class="fa fa-font"></i> Add Products</a></li>
                    <li ><a href="<%=request.getContextPath()%>/admin/themdanhmuc.jsp"><i class="fa fa-font"></i> Add Category</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right navbar-user">
                    <li class="dropdown messages-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> Messages <span class="badge">2</span> <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li class="dropdown-header">2 New Messages</li>
                            <li class="message-preview">
                                <a href="#">
                                    <span class="avatar"><i class="fa fa-bell"></i></span>
                                    <span class="message">Security alert</span>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li class="message-preview">
                                <a href="#">
                                    <span class="avatar"><i class="fa fa-bell"></i></span>
                                    <span class="message">Security alert</span>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="#">Go to Inbox <span class="badge">2</span></a></li>
                        </ul>
                    </li>
                     <li class="dropdown user-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Steve Miller<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
                            <li><a href="#"><i class="fa fa-gear"></i> Settings</a></li>
                            <li class="divider"></li>
                            <li><a href="#"><i class="fa fa-power-off"></i> Log Out</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1>Dashboard <small>Dashboard Home</small></h1>
                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        Welcome to the admin dashboard! Feel free to review all pages and modify the layout to your needs. 
                        <br />
                        This theme uses the <a href="https://www.shieldui.com">ShieldUI</a> JavaScript library for the 
                        additional data visualization and presentation functionality illustrated here.
                    </div>
                </div>
            </div>
            <div class="row">
                <% 
                        ConnectDB db = new ConnectDB();
                    Connection con = db.getConnect();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT COUNT(`username`) FROM `taikhoan`");
                    if(rs.next()){
                    %>
                    
                    <a href="<%=request.getContextPath()%>/admin/danhsachus"><div class="col-lg-3">
                    <div class="panel panel-default ">
                        <div class="panel-body alert-info">
                            <div class="text-center">
                                <i class="fa fa-user fa-5x">&nbsp<%=rs.getInt(1)%></i>
                            </div>
                            
                           
                            <p style="font-size: 25px;text-align: center"><strong>USERS</strong></p>
                            
                        </div>
                    </div>
                               </div></a>
                <%}%>
                <% 
                        
                    st = con.createStatement();
                     rs = st.executeQuery("SELECT COUNT(`masp`) FROM `sanpham`");
                    if(rs.next()){
                    %>
                    
                    <a href="<%=request.getContextPath()%>/admin/danhsachsp"><div class="col-lg-3">
                    <div class="panel panel-default ">
                        <div class="panel-body alert-info">
                            <div class="text-center">
                                <i class="fa fa-list-alt fa-5x">&nbsp<%=rs.getInt(1)%></i>
                            </div>
                            
                           
                            <p style="font-size: 25px;text-align: center"><strong>LIST PRODUCT</strong></p>
                            
                        </div>
                    </div>
                               </div></a>
                <%}%>
               <% 
                       
                    st = con.createStatement();
                   rs = st.executeQuery("SELECT COUNT(`hangsx`) FROM `danhmuc`");
                    if(rs.next()){
                    %>
                    
                    <a href="<%=request.getContextPath()%>/admin/themdanhmuc.jsp"><div class="col-lg-3">
                    <div class="panel panel-default ">
                        <div class="panel-body alert-info">
                            <div class="text-center">
                                <i class="fa fa-tags fa-5x">&nbsp<%=rs.getInt(1)%></i>
                            </div>
                            
                           
                            <p style="font-size: 25px;text-align: center"><strong>CATEGORY</strong></p>
                            
                        </div>
                    </div>
                               </div></a>
                <%}%>
                <% 
                       
                    st = con.createStatement();
                   rs = st.executeQuery("SELECT sum(soluong) FROM `sanpham`");
                    if(rs.next()){
                    %>
                    
                    <a href="#"><div class="col-lg-3">
                    <div class="panel panel-default ">
                        <div class="panel-body alert-info">
                            <div class="text-center">
                                <i class="fa fa-th fa-5x">&nbsp<%=rs.getInt(1)%></i>
                            </div>
                            
                           
                            <p style="font-size: 25px;text-align: center"><strong>All Quantity</strong></p>
                            
                        </div>
                    </div>
                               </div></a>
                <%}%>
            </div>

             <div>
        <div class="row text-center">
            <h2>New Registration</h2>
        </div>
                 
                 <form action="/Assignemnt_gd1_tuentpd01983/updateuserServlet" method="POST">
                   
                     <% shopuser s = new userDAO().getUserByID(request.getParameter("username"));
                        String ass = null;
                        ass= s.getGioitinh();
                 %>  
        <div>
            <label for="fullname" class="col-md-2">
                Full Name:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="hoten" placeholder="Enter Full Name" value="<%= s.getHoten()%>">
            </div>
            <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>        
        <div>
            <label for="username" class="col-md-2">
               Username:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="username" placeholder="Enter Username"  value="<%= s.getUsername()%>">
            </div>
             <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>
                     <div>
            <label for="password" class="col-md-2">
                Password:
            </label>
            <div class="col-md-9">
                <input type="password" class="form-control" name="password" placeholder="Enter Password"  value="<%= s.getPassword()%>">
                <p class="help-block">
                    Min: 6 characters (Alphanumeric only)
                </p>
            </div>
             <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>
        <div>
            <label for="emailaddress" class="col-md-2">
                Email address:
            </label>
            <div class="col-md-9">
                <input type="email" class="form-control" name="mail" placeholder="Enter email address"  value="<%= s.getMail()%>">
                <p class="help-block">
                    Example: yourname@domain.com
                </p>
            </div>
             <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>        
        <div>
            <label for="role" class="col-md-2">
                Gender:
            </label>
            <div class="col-md-9">
                <select  name="gioitinh" class="form-control" >
                    <option value="Nam"  <%=(s.getGioitinh().equals("Nam")?"selected='selected'":"")%>>Nam</option>
                    <option value="Nu"  <%=(s.getGioitinh().equals("Nu")?"selected='selected'":"")%>>Nu</option>
                </select>
            </div>            
        </div>
        <div>
            <label for="role" class="col-md-2">
                Role:
            </label>
            <div class="col-md-9">
                
                <select  name="role" class="form-control" >
                    <option value="AD" <%=(s.getRole().equals("AD")?"selected='selected'":"")%>>AD</option>
                    <option value="NV" <%=(s.getRole().equals("NV")?"selected='selected'":"")%>>NV</option>
                </select>
                    
            </div>            
        </div>
        <div>
            <label for="sdt" class="col-md-2">
                Phone:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="sdt" placeholder="Enter Number" value="<%= s.getSdt()%>">
            </div>
            <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>
        <div>
            <label for="diachi" class="col-md-2">
                Address:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="diachi" placeholder="Enter Address" value="<%= s.getDiachi()%>">
            </div>
            <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>
        <div>
            <div class="col-md-2">
            </div>
            <div class="col-md-10">
                <label>
                    <input type="checkbox">I hereby accept the terms and conditions for using this site</label>
            </div>            
        </div>
        <div class="row">
            <div class="col-md-2">
            </div>
            <div class="col-md-10">
                <input type="submit" class="btn btn-info" value="Update"/>
            </div>
        </div></form>
    </div> 
    </div>
</body>
</html>
