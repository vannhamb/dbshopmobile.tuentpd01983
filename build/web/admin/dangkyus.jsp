
<%@page import="model.userDAO"%>
<%@page import="model.shopuser"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="conmon.ConnectDB"%>
<%@page import="java.sql.ResultSet"%>
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
    <script>
if(${thongbao == 'false'}){
      alert("Thêm Th?tt b?i! vui lòng ki?m tra l?i?");
  }</script>
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
                    <li class="active"><a href="<%=request.getContextPath()%>/admin/dangkyus.jsp"><i class="fa fa-list-ol"></i> Add Users</a></li>
                    <li><a href="<%=request.getContextPath()%>/admin/themsanpham.jsp"><i class="fa fa-font"></i> Add Products</a></li>
                    <li><a href="<%=request.getContextPath()%>/admin/themdanhmuc.jsp"><i class="fa fa-font"></i> Add Category</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right navbar-user">
                    <li class="dropdown messages-dropdown">
                        <a href="#"><i class="fa fa-user" ></i> Messages</a>
                    </li>
                     <li class="dropdown user-dropdown">
                        <a href="#" ><i class="fa fa-power-off"></i> Steve Miller</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1>Users <small>Register</small></h1>
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
       <div class="row">
                <div >              
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i>New Users</h3>
                        </div>
                 
                 <form action="<%=request.getContextPath()%>/dangkynvServlet" method="POST">
        <div>
            <label for="fullname" class="col-md-2">
                Full Name:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="hoten" placeholder="Enter Full Name" >
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
                <input type="text" class="form-control" name="username" placeholder="Enter Username">
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
                <input type="password" class="form-control" name="password" placeholder="Enter Password">
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
                <input type="email" class="form-control" name="mail" placeholder="Enter email address">
                <p class="help-block">
                    Example: yourname@domain.com
                </p>
            </div>
             <div class="col-md-1">
                <i class="fa fa-lock fa-2x"></i>
            </div>
        </div>        
        <div>
            <label for="sex" class="col-md-2">
                Gender:
            </label>
            <div class="col-md-10">
                <label class="radio">
                    <input type="radio" name="gioitinh" id="sex" value="Nam" checked>
                    Male
                </label>
                <label class="radio">
                    <input type="radio" name="gioitinh" id="Radio1" value="Nu">
                    Female
                </label>
            </div>             
        </div>
        <div>
            <label for="role" class="col-md-2">
                Role:
            </label>
            <div class="col-md-9">
                <select  name="role" class="form-control">
                    <option>--Please Select--</option>
                    <option>AD</option>
                    <option >NV</option>
                    
                </select>
            </div>            
        </div>
        <div>
            <label for="sdt" class="col-md-2">
                Phone:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="sdt" placeholder="Enter Number">
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
                <input type="text" class="form-control" name="diachi" placeholder="Enter Address">
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
                <input type="submit" class="btn btn-info" value="Register"/>
            </div>
        </div></form>
    </div> 
    </div>
       </div>
</body>
</html>
