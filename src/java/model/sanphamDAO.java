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
public class sanphamDAO {
    ConnectDB db = new ConnectDB();
    Connection con = db.getConnect();
        Statement st = null;
        PreparedStatement pts = null;
        ResultSet rs = null;
    public ArrayList<sanpham> getAllsanpham() throws SQLException{
    ArrayList<sanpham> listsp = new ArrayList<>();
     st = con.createStatement();
         rs = st.executeQuery("select *,format(giatien,'#.##0') from sanpham inner join danhmuc on sanpham.hangsx = danhmuc.hangsx");
         int i=0;
        while(rs.next()){
            i++;
            int stt = i;
            String masp = rs.getString(1);
            String tensp = rs.getString(2);
            String giatien  = rs.getString(9);
            int soluong = rs.getInt(4);
           String hangsx = rs.getString(5);
           String loaisp =rs.getString(8);
        sanpham mobile = new sanpham(stt, masp, tensp, giatien, soluong,hangsx,loaisp);
        listsp.add(mobile);
        }
        con.close();
        return listsp;
    }
    public boolean deleteSanpham (String masp) throws SQLException{
        pts = con.prepareStatement("delete from sanpham where masp=?");
        pts.setString(1, masp); 
        return pts.executeUpdate() > 0;
        
    }
    public boolean insert(sanpham sp) throws SQLException{
    pts = con.prepareStatement("insert into sanpham(masp, tensp, giatien, soluong, hangsx, hinhanh) values (?, ?, ?, ?, ?,'')");
    pts.setString(1, sp.getMasp());
    pts.setString(2, sp.getTensp());
    pts.setFloat(3, Float.parseFloat(sp.getGiatien()));
    pts.setInt(4, sp.getSoluong());
    pts.setString(5, sp.getHangsx());
    return  pts.executeUpdate()>0;
            }
    public boolean update (sanpham sp) throws SQLException{
    pts = con.prepareStatement("UPDATE `sanpham` SET `tensp` = ?, `giatien` = ?, `soluong` = ?, `hangsx` = ? WHERE `sanpham`.`masp` = ?");
    pts.setString(1, sp.getTensp());
    pts.setFloat(2, Float.parseFloat(sp.getGiatien()));
    pts.setInt(3, sp.getSoluong());
    pts.setString(4, sp.getHangsx());
    pts.setString(5, sp.getMasp());
     if(pts.executeUpdate()>0){
    return true;
    };return false;
            }
    public sanpham getIdBySanpham(String masp) throws SQLException{
    pts = con.prepareStatement("select * from sanpham where masp = ? ");
    pts.setString(1, masp);
    rs = pts.executeQuery();
    sanpham sp = null;
    if(rs.next()){
    sp = new sanpham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
    }
    return sp;
    }
    public boolean insertcate (sanpham dm) throws SQLException{
     pts = con.prepareStatement("insert into danhmuc values (?,?)");
    pts.setString(1, dm.getHangsx());
pts.setString(2, dm.getLoaisp());
    return pts.executeUpdate()>0;
    }
 
}
