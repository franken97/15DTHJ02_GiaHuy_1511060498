/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

/**
 *
 * @author MSI
 */
public class Tinh {
    private String MaTinh;
    private String TenTinh;

    public Tinh() {
    }
    

    public Tinh(String MaTinh, String TenTinh) {
        this.MaTinh = MaTinh;
        this.TenTinh = TenTinh;
    }

    public String getMaTinh() {
        return MaTinh;
    }

    public void setMaTinh(String MaTinh) {
        this.MaTinh = MaTinh;
    }

    public String getTenTinh() {
        return TenTinh;
    }

    public void setTenTinh(String TenTinh) {
        this.TenTinh = TenTinh;
    }
    
    
}
