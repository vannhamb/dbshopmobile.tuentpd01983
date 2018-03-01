
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="conmon.ConnectDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
             if(${thongbaodm == 'true'}){
      alert("Thêm Thành công!");
      
  }  
 else if(${thongbaodm == 'false'}){
      alert("Thêm Thấtt bại! vui lòng kiểm tra lại?");
      
  }
  else if(${thongbaodm1 == 'true'}){
      alert("Xóa thành công!");
      
  }
  else if(${thongbaodm1 == 'false'}){
      alert("Xóa Thấtt bại! vui lòng kiểm tra lại?");
      
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
                    <li class="active"><a href="<%=request.getContextPath()%>/admin/themdanhmuc.jsp"><i class="fa fa-font"></i> Add Category</a></li>
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
                    <h1>Products <small>Add Products</small></h1>
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
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i>New Category</h3>
                        </div>
                       
                                       
                 
                 <form action="<%=request.getContextPath()%>/themdmServlet" method="POST">
        <div>
            <label for="hangsx" class="col-md-2">
                Category Name:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="hangsx" placeholder="Enter Name" >
            </div>
        </div>    
        
        <div>
            <label for="loaisp" class="col-md-2">
               Role Product:
            </label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="loaisp" placeholder="Enter Role EX:SmartPhone">
            </div>
        
        <br/>
        <div class="row">
            <div class="col-md-2">
            </div>
            <div class="col-md-10">
                <input type="submit" class="btn btn-info" value="ADD Category"/>
            </div>
        </div>
    </form>
    </div> 
        </div>
    </div>    
                 </div>
        <br/>
        <div class="row">
                <div class="col-lg-12">              
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i>Danh Sách Danh Mục</h3>
                        </div>
                        <div class="panel-body">
                            <div id="shieldui-grid1">
                                <div class="container">
                                    
                                        <table  style="width: 82%" class="table table-bordered">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Produce</th>
                        <th>Type</th>
                    </tr>
                </thead>
                <tbody>
                    <% st = con.createStatement();
                        rs = st.executeQuery("select * from danhmuc");
                        int i = 0;
                        while(rs.next()){
                            i++;
                    %>
                    <tr>
                        <td><%=i%></td>                         
                        <td><%=rs.getString(1)%></td> 
			<td><%=rs.getString(2)%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
            </div>
</body>
</html>
