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
public class Phuong {
    private String MaPhuong;
    private String TenPhuong;

    public Phuong() {
    }
    
    

    public Phuong(String MaPhuong, String TenPhuong) {
        this.MaPhuong = MaPhuong;
        this.TenPhuong = TenPhuong;
    }

    public String getMaPhuong() {
        return MaPhuong;
    }

    public void setMaPhuong(String MaPhuong) {
        this.MaPhuong = MaPhuong;
    }

    public String getTenPhuong() {
        return TenPhuong;
    }

    public void setTenPhuong(String TenPhuong) {
        this.TenPhuong = TenPhuong;
    }
    
    
}
