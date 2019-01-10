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
public class NhomMau {
    private String MaNM;
    private String TenNM;

    public NhomMau() {
    }
    
    

    public NhomMau(String MaNM, String TenNM) {
        this.MaNM = MaNM;
        this.TenNM = TenNM;
    }

    public String getMaNM() {
        return MaNM;
    }

    public void setMaNM(String MaNM) {
        this.MaNM = MaNM;
    }

    public String getTenNM() {
        return TenNM;
    }

    public void setTenNM(String TenNM) {
        this.TenNM = TenNM;
    }
    
    
}
