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
public class UuTienGD {
    private String MaUTGD;
    private String LoaiUTGD;

    public UuTienGD() {
    }
    

    public UuTienGD(String MaUTGD, String LoaiUTGD) {
        this.MaUTGD = MaUTGD;
        this.LoaiUTGD = LoaiUTGD;
    }

    public String getMaUTGD() {
        return MaUTGD;
    }

    public void setMaUTGD(String MaUTGD) {
        this.MaUTGD = MaUTGD;
    }

    public String getLoaiUTGD() {
        return LoaiUTGD;
    }

    public void setLoaiUTGD(String LoaiUTGD) {
        this.LoaiUTGD = LoaiUTGD;
    }
    
    
}
