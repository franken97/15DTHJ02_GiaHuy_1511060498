/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

import javax.swing.JComboBox;

/**
 *
 * @author AigYuh
 */
public class LoadDataCbox {
    String sql;
    JComboBox cb;
    String bien;

    public LoadDataCbox() {
    }

    public LoadDataCbox(String sql, JComboBox cb, String bien) {
        this.sql = sql;
        this.cb = cb;
        this.bien = bien;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public JComboBox getCb() {
        return cb;
    }

    public void setCb(JComboBox cb) {
        this.cb = cb;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }
    
    
    
}
