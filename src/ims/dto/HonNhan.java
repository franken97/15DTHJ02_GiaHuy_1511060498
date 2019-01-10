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
public class HonNhan {
    private String MaHN;
    private String TTrang;

    public HonNhan() {
    }
    
    

    public HonNhan(String MaHN, String TTrang) {
        this.MaHN = MaHN;
        this.TTrang = TTrang;
    }

    public String getMaHN() {
        return MaHN;
    }

    public void setMaHN(String MaHN) {
        this.MaHN = MaHN;
    }

    public String getTTrang() {
        return TTrang;
    }

    public void setTTrang(String TTrang) {
        this.TTrang = TTrang;
    }
    
    
}
