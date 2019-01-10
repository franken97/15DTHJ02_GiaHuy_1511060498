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
public class QuocTich {
    private String MaQT;
    private String TenQT;

    public QuocTich() {
    }
    
    

    public QuocTich(String MaQT, String TenQT) {
        this.MaQT = MaQT;
        this.TenQT = TenQT;
    }

    public String getMaQT() {
        return MaQT;
    }

    public void setMaQT(String MaQT) {
        this.MaQT = MaQT;
    }

    public String getTenQT() {
        return TenQT;
    }

    public void setTenQT(String TenQT) {
        this.TenQT = TenQT;
    }
    
    
}
