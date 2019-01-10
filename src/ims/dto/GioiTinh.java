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
public class GioiTinh {
    private String MaGT;
    private String GT;

    public GioiTinh() {
    }
    
    

    public GioiTinh(String MaGT, String GT) {
        this.MaGT = MaGT;
        this.GT = GT;
    }

    public String getMaGT() {
        return MaGT;
    }

    public void setMaGT(String MaGT) {
        this.MaGT = MaGT;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }
    
    
}
