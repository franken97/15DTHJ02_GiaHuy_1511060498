/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

import com.mysql.jdbc.Blob;

/**
 *
 * @author MSI
 */
public class DanToc {
    private String MaDT;
    private String TenDT;

    public DanToc() {
    }
    
    

    public DanToc(String MaDT, String TenDT) {
        this.MaDT = MaDT;
        this.TenDT = TenDT;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public String getTenDT() {
        return TenDT;
    }

    public void setTenDT(String TenDT) {
        this.TenDT = TenDT;
    }
    
    
}
