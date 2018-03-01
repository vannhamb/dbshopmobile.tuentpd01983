
<%@page import="java.text.DecimalFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script>if(${thongbao5 == 'true'}){
  alert("Thêm thành công!");
  
}else if(${thongbao5 == 'false'}){
      alert("Thêm Thất bại! vui lòng kiểm tra lại?");
      
  }
  else if(${thongbao6 == 'true'}){
      alert("Sửa thành công!");
      
  }
  else if(${thongbao6 == 'false'}){
      alert("Sửa Thất bại! vui lòng kiểm tra lại?");
      
  }
 else if(${thongbaoxoasp == 'true'}){
      alert("Xóa thành công!");
      
  }

          </script>
          <script>
function myFunction() {
  // Declare variables 
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    } 
  }
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
                <a class="navbar-brand" href="index.html">Admin Panel</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                     <li ><a href="#"><i class="fa fa-bullseye"></i> Dashboard</a></li>
                    <li class="active"><a href="<%=request.getContextPath()%>/admin/danhsachsp"><i class="fa fa-tasks"></i> List Products</a></li>
                    <li><a href="<%=request.getContextPath()%>/admin/danhsachus"><i class="fa fa-globe"></i> List Users</a></li>
                    <li ><a href="<%=request.getContextPath()%>/admin/dangkyus.jsp"><i class="fa fa-list-ol"></i> Add Users</a></li>
                    <li><a href="<%=request.getContextPath()%>/admin/themsanpham.jsp"><i class="fa fa-font"></i> Add Products</a></li>
                     <li><a href="<%=request.getContextPath()%>/admin/themdanhmuc.jsp"><i class="fa fa-font"></i> Add Category</a></li>
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
                    <h1>Products <small>List Products</small></h1>
                   
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

            <div class="row">
                <div class="col-lg-12">              
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i>Danh Sách Sản Phẩm</h3>
                        </div>
                        <div class="panel-body">
                            <div id="shieldui-grid1">
                                <div class="container">
                                    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names..">
                                    <br/>
                                        <table id="myTable" style="width: 82%" class="table table-bordered">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Mã SP</th>
                        <th>Tên SP</th>
                        <th>Giá Tiền</th>
                        <th>Số Lượng</th>
                        <th>Hãng sx</th>
                        <th>Loại SP</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                    
                <c:forEach var="sp" items="${listsp}">
                    <tr>
                        <td><c:out value="${sp.stt}" /></td>                         
                        <td><a style="color: blue;" href="<%=request.getContextPath()%>/editspServlet?masp=<c:out value='${sp.masp}' />"><c:out value="${sp.masp}" /></a></td> 
			<td><c:out value="${sp.tensp}" /></td>
                        <%DecimalFormat dc = new DecimalFormat("###,###,###"); %>
                        <td><c:out value="${sp.giatien} VND" /></td> 
                        <td><c:out value="${sp.soluong}" /></td> 
                        <td><c:out value="${sp.hangsx}" /></td> 
                        <td><c:out value="${sp.loaisp}" /></td> 
                        <td><a href="<%=request.getContextPath()%>/deleteSanpham?masp=<c:out value='${sp.masp}'/>">Delete</a></td>      
                    </tr>
                </c:forEach>
                    
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
