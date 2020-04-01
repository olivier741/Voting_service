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
public class Motion {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    private String m_id;
    private String text;
    private int votes;
    private int in_favour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getIn_favour() {
        return in_favour;
    }

    public void setIn_favour(int in_favour) {
        this.in_favour = in_favour;
    }

    @Override
    public String toString() {
        return "Motion{" + "m_id=" + m_id + ", text=" + text + ", votes=" + votes + ", in_favour=" + in_favour + '}';
    }

}
