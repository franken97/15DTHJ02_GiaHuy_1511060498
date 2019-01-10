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
public class SucKhoe {
    private String MaSK;
    private String TTSK;

    public SucKhoe() {
    }
    
    

    public SucKhoe(String MaSK, String TTSK) {
        this.MaSK = MaSK;
        this.TTSK = TTSK;
    }

    public String getMaSK() {
        return MaSK;
    }

    public void setMaSK(String MaSK) {
        this.MaSK = MaSK;
    }

    public String getTTSK() {
        return TTSK;
    }

    public void setTTSK(String TTSK) {
        this.TTSK = TTSK;
    }
    
    
}
