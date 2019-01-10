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
public class TpXuatThan {
    private String MaTPXT;
    private String TPXT;

    public TpXuatThan() {
    }
    

    public TpXuatThan(String MaTPXT, String TPXT) {
        this.MaTPXT = MaTPXT;
        this.TPXT = TPXT;
    }

    public String getMaTPXT() {
        return MaTPXT;
    }

    public void setMaTPXT(String MaTPXT) {
        this.MaTPXT = MaTPXT;
    }

    public String getTPXT() {
        return TPXT;
    }

    public void setTPXT(String TPXT) {
        this.TPXT = TPXT;
    }
    
    
}
