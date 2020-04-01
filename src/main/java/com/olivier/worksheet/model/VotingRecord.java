/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olivier.worksheet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

/**
 *
 * @author olivier.tatsinkou
 */
@Entity
public class VotingRecord {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    private String vr_id;
    
    private boolean vote_cast;
    private boolean voted_yes;
    
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date transaction_time;

    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "motion_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Motion motion;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "voter_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Voter voter;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getVr_id() {
        return vr_id;
    }

    public void setVr_id(String vr_id) {
        this.vr_id = vr_id;
    }

    public boolean isVote_cast() {
        return vote_cast;
    }

    public void setVote_cast(boolean vote_cast) {
        this.vote_cast = vote_cast;
    }

    public boolean isVoted_yes() {
        return voted_yes;
    }

    public void setVoted_yes(boolean voted_yes) {
        this.voted_yes = voted_yes;
    }

    
    public Date getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(Date transaction_time) {
        this.transaction_time = transaction_time;
    }

    public Motion getMotion() {
        return motion;
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public Voter getVoter() {
        return voter;
    }

    public void setVoter(Voter voter) {
        this.voter = voter;
    }
    
    
    

    @Override
    public String toString() {
        return "Voter{" + "vr_id=" + vr_id + ", vote_cast=" + vote_cast + ", voted_yes=" + voted_yes + '}';
    }

}
