/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class sanpham {
    private int stt;
    private String masp;
    private String tensp;
    private String giatien;
    private int soluong;
    private String hangsx;
    private String loaisp;
    
    public sanpham() {
    }

    public sanpham(int stt, String masp, String tensp, String giatien, int soluong, String hangsx, String loaisp) {
        this.stt = stt;
        this.masp = masp;
        this.tensp = tensp;
        this.giatien = giatien;
        this.soluong = soluong;
        this.hangsx = hangsx;
        this.loaisp = loaisp;
    }

   

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public sanpham(String hangsx, String loaisp) {
        this.hangsx = hangsx;
        this.loaisp = loaisp;
    }

    public sanpham(String masp, String tensp, String giatien, int soluong, String hangsx) {
        this.masp = masp;
        this.tensp = tensp;
        this.giatien = giatien;
        this.soluong = soluong;
        this.hangsx = hangsx;
    }

  

    

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

}