
<%@page import="model.sanpham"%>
<%@page import="model.sanphamDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="conmon.ConnectDB"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forms - Deep Blue Admin</title>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/admin/support/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/admin/support/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/admin/support/css/local.css" />

    <script type="text/javascript" src="<%=request.getContextPath()%>/admin/support/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/admin/support/bootstrap/js/bootstrap.min.js"></script>        
    <script>
                if(${thongbao4 == 'true'}){
  alert("Th�m th�nh c�ng!");
  
}else if(${thongbao4 == 'false'}){
      alert("Th�m Th?t b?i! vui l�ng ki?m tra l?i?");
      
  }
    </script>
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
                <a class="navbar-brand" href="index.html">Back to Admin</a>
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
            <h2>New Product</h2>
        </div>
                  <% sanpham s = new sanphamDAO().getIdBySanpham(request.getParameter("masp"));
                 %>  
                 <form action="<%=request.getContextPath()%>/updatespServlet" method="POST">
        <div>
            <label for="tensp" class="col-md-2">
                Product Name:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="tensp" placeholder="Enter Name" value="<%= s.getTensp()%>" >
            </div>
        </div>        
        <div>
            <label for="masp" class="col-md-2">
               ID Product:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="masp" placeholder="Enter ID"   value="<%= s.getMasp()%>">
            </div>
        </div>
                     <div>
            <label for="giatien" class="col-md-2">
                Cost Price:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="giatien" placeholder="Enter VND"  value="<%= s.getGiatien()%>">
            </div>
        </div>
        <div>
            <label for="soluong" class="col-md-2">
                Quantity:
            </label>
            <div class="col-md-9">
                <input type="number" class="form-control" name="soluong" placeholder="Enter Number"  value="<%= s.getSoluong()%>" >
            </div>
        </div>        
        <div>
            <label for="hangsx" class="col-md-2">
                produce:
            </label>
            <div class="col-md-9">
                <select  name="hangsx" class="form-control"> 
                    <% 
                    st = con.createStatement();
                    rs = st.executeQuery("select hangsx from danhmuc");
                    while(rs.next()){
                    %>
                    <option value="<%=rs.getString(1)%>" <%= (rs.getString(1).equals(s.getHangsx())?"selected='selected'":"")%>><%=rs.getString(1)%></option>
                    <%}%>
                </select>
            </div>            
        </div>
        <div class="row">
            <div class="col-md-2">
            </div>
            <div class="col-md-10">
                <input type="submit" class="btn btn-info" value="UPDATE PRODUCT"/>
            </div>
        </div>
    </form>
    </div> 
        </div>
    </div>    

</body>
</html>
