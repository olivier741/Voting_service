/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olivier.worksheet.beans;

import java.util.Date;

/**
 *
 * @author olivier.tatsinkou
 */
public class VotingResp {
    
   private String error_code ;
   private String description;
   private Date process_time;

    public VotingResp(String error_code, String description, Date process_time) {
        this.error_code = error_code;
        this.description = description;
        this.process_time = process_time;
    }

   
   
    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getProcess_time() {
        return process_time;
    }

    public void setProcess_time(Date process_time) {
        this.process_time = process_time;
    }

    @Override
    public String toString() {
        return "VotingResp{" + "error_code=" + error_code + ", description=" + description + ", process_time=" + process_time + '}';
    }
   
   
   
}
