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
public class ThanhPho {
    private String MaTP;
    private String TenTP;

    public ThanhPho() {
    }

    
    
    public ThanhPho(String MaTP, String TenTP) {
        this.MaTP = MaTP;
        this.TenTP = TenTP;
    }

    public String getMaTP() {
        return MaTP;
    }

    public void setMaTP(String MaTP) {
        this.MaTP = MaTP;
    }

    public String getTenTP() {
        return TenTP;
    }

    public void setTenTP(String TenTP) {
        this.TenTP = TenTP;
    }
    
    
}
