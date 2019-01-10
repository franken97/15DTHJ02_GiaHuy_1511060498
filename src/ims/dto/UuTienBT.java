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
public class UuTienBT {
    private String MaUTBT;
    private String LoaiUTBT;

    public UuTienBT() {
    }
    

    public UuTienBT(String MaUTBT, String LoaiUTBT) {
        this.MaUTBT = MaUTBT;
        this.LoaiUTBT = LoaiUTBT;
    }

    public String getMaUTBT() {
        return MaUTBT;
    }

    public void setMaUTBT(String MaUTBT) {
        this.MaUTBT = MaUTBT;
    }

    public String getLoaiUTBT() {
        return LoaiUTBT;
    }

    public void setLoaiUTBT(String LoaiUTBT) {
        this.LoaiUTBT = LoaiUTBT;
    }
    
}
