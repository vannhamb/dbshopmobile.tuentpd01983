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
public class giohangDAO {
   ConnectDB db = new ConnectDB();
    Connection con = db.getConnect();
        Statement st = null;
        PreparedStatement pts = null;
        ResultSet rs = null;
    public ArrayList<giohang> getAllsanpham() throws SQLException{
    ArrayList<giohang> listsp = new ArrayList<>();
     st = con.createStatement();
         rs = st.executeQuery("select * from giohang");
         int i=0;
        while(rs.next()){
            i++;
            int stt = i;
            String maspmua = rs.getString(1);
            String tenspmua = rs.getString(2);
            String giatiensp  = rs.getString(8);
            String soluongmua = String.valueOf(rs.getInt(4));
        giohang gh = new giohang(maspmua, tenspmua, giatiensp, soluongmua);
        listsp.add(gh);
        }
        con.close();
        return listsp;
    }
   public boolean insert(giohang gh) throws SQLException{
    pts = con.prepareStatement("INSERT INTO `giohang` VALUES (?, ?, ?, ?, ?)");
    pts.setString(1, gh.getMaspmua());
    pts.setString(2, gh.getTenspmua());
    pts.setFloat(3, Float.parseFloat(gh.getGiatiensp()));
    pts.setInt(4, Integer.parseInt(gh.getSoluongmua()));
    pts.setString(5, gh.getHinhanh());
    return pts.executeUpdate()>0;
    }
  public boolean update (giohang gh) throws SQLException{
    pts = con.prepareStatement("UPDATE `giohang` SET `soluong` = ? WHERE `giohang`.`maspmua` = ?");
    pts.setString(1, gh.getSoluongmua());
    pts.setString(2, gh.getMaspmua());
    return   pts.executeUpdate()>0;
    }
  public boolean delete (String gh) throws SQLException{
        pts = con.prepareStatement("delete from giohang where maspmua=?");
        pts.setString(1, gh); 
        return pts.executeUpdate() > 0;
        
    }
  public boolean deletecart() throws SQLException{
    pts = con.prepareCall("delete from giohang");
    return pts.executeUpdate()>0;
}
}
