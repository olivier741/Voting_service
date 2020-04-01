/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olivier.worksheet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author olivier.tatsinkou
 */
@Entity
public class Voter {

    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = false, unique = true)
    private String v_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getV_id() {
        return v_id;
    }

    public void setV_id(String v_id) {
        this.v_id = v_id;
    }

    @Override
    public String toString() {
        return "Voter{" + "v_id=" + v_id + '}';
    }
    
    

}
