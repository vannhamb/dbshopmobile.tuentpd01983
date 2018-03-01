/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conmon.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class shopuser {
    private int stt;
    private String username;
    private String password;
    private String role;
    
    public int getStt() {
        return stt;
    }

    public shopuser(String username, String password, String role, String hoten, String sdt, String diachi, String gioitinh, String mail) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.mail = mail;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    private String hoten;
    private String sdt;
    private String diachi;
    private String gioitinh;
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    Connection con = null;    
    ConnectDB db = new ConnectDB();

    public shopuser() {
    }

    public shopuser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public shopuser(int stt, String username, String password, String role, String hoten, String sdt,String diachi,String gioitinh,String mail) {
        this.stt = stt;
        this.username = username;
        this.password = password;
        this.role = role;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.mail = mail;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

   

   
   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean Checkloginad(shopuser u){
        try {
            con = db.getConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM taikhoan");
            while(rs.next()){
            if(u.getUsername().equalsIgnoreCase(rs.getString(1)) && u.getPassword().equalsIgnoreCase(rs.getString(2)) && rs.getString(3).equalsIgnoreCase("AD")){
            return true;
            }
            }System.out.println("ok");
        } catch (SQLException ex) {
            
        }
return false;}

 public boolean Checkloginnv(shopuser u){
        try {
            con = db.getConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM taikhoan");
            while(rs.next()){
            if(u.getUsername().equalsIgnoreCase(rs.getString(1)) && u.getPassword().equalsIgnoreCase(rs.getString(2)) && rs.getString(3).equalsIgnoreCase("NV")){
            return true;
            }
            }System.out.println("ok");
        } catch (SQLException ex) {
            
        }
return false;}
}
