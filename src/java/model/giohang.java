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
public class giohang {
     private String maspmua;
    private String tenspmua;
    private String giatiensp;
    private String soluongmua;
    private String hinhanh;
    public giohang() {
    }

    public giohang(String maspmua, String tenspmua, String giatiensp, String hinhanh) {
        this.maspmua = maspmua;
        this.tenspmua = tenspmua;
        this.giatiensp = giatiensp;
        this.hinhanh = hinhanh;
    }

    public giohang(String maspmua, String soluongmua) {
        this.maspmua = maspmua;
        this.soluongmua = soluongmua;
    }

    public giohang(String maspmua, String tenspmua, String giatiensp, String soluongmua, String hinhanh) {
        this.maspmua = maspmua;
        this.tenspmua = tenspmua;
        this.giatiensp = giatiensp;
        this.soluongmua = soluongmua;
        this.hinhanh = hinhanh;
    }


    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    

    public String getMaspmua() {
        return maspmua;
    }

    public void setMaspmua(String maspmua) {
        this.maspmua = maspmua;
    }

    public String getTenspmua() {
        return tenspmua;
    }

    public void setTenspmua(String tenspmua) {
        this.tenspmua = tenspmua;
    }

    public String getGiatiensp() {
        return giatiensp;
    }

    public void setGiatiensp(String giatiensp) {
        this.giatiensp = giatiensp;
    }

    public String getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(String soluongmua) {
        this.soluongmua = soluongmua;
    }

}