/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conmon.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class userDAO {
    ConnectDB db = new ConnectDB();
    Connection con = db.getConnect();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pts = null;
    public ArrayList getAllUser() throws SQLException{
    ArrayList<shopuser> listus = new ArrayList<>();
        st = con.createStatement();
        rs = st.executeQuery("select * from taikhoan");
        int i = 0;
        while(rs.next()){
        i++;int stt=i;
         String username = rs.getString(1);
     String password = rs.getString(2);
     String role = rs.getString(3);
    String hoten = rs.getString(4);
     String sdt = rs.getString(5);
     String diachi = rs.getString(6);
     String gioitinh= rs.getString(7);
     String mail= rs.getString(8);
     shopuser list = new shopuser(stt,username, password, role, hoten, sdt,diachi,gioitinh,mail);
     listus.add(list);
        }
        con.close();
        return listus;
    }
    public boolean deleteUser(String username) throws SQLException{
    pts = con.prepareStatement("delete from taikhoan where userName = ?");
    pts.setString(1, username);
    return pts.executeUpdate()>0;
    }
    
    public boolean insertUser(shopuser us)throws SQLException{
    pts = con.prepareStatement("INSERT INTO `taikhoan`(`userName`, `passWord`, `role`, `hoTen`, `sdt`, `diachi`, `gioitinh`, `email`) VALUES (?,?,?,?,?,?,?,?)");
    pts.setString(1, us.getUsername());
    pts.setString(2, us.getPassword());
    pts.setString(3, us.getRole());
    pts.setString(4, us.getHoten());
    pts.setString(5, us.getSdt());
    pts.setString(6, us.getDiachi());
    pts.setString(7, us.getGioitinh());
    pts.setString(8, us.getMail());
    boolean insert = pts.executeUpdate()>0;
    pts.close();
   return insert;
    }
     public shopuser getUserByID(String us) throws Exception {
        pts = con.prepareStatement("select * from taikhoan where userName = ?");
        pts.setString(1, us);
         rs = pts.executeQuery();
        shopuser user = null;
        if (rs.next()) {
            String username = rs.getString(1);
            String password = rs.getString(2);
            String role = rs.getString(3);
            String hoten = rs.getString(4);
            String sdt = rs.getString(5);
            String diachi = rs.getString(6);
            String gioitinh = rs.getString(7);
            String mail = rs.getString(8);
            user = new shopuser(username, password, role, hoten, sdt, diachi, gioitinh, mail);
            
        }
        return user;
    }
     public boolean updateUser(shopuser us) throws SQLException{
     pts = con.prepareStatement("UPDATE taikhoan SET passWord=?,role=?,hoTen=?,sdt=?,diachi=?,gioitinh=?,email=? where userName=?");
     pts.setString(1, us.getPassword());
     pts.setString(2, us.getRole());
     pts.setString(3, us.getHoten());
     pts.setString(4, us.getSdt());
     pts.setString(5, us.getDiachi());
     pts.setString(6, us.getGioitinh());
     pts.setString(7, us.getMail());
     pts.setString(8, us.getUsername());
     return pts.executeUpdate()>0;
             }
}
