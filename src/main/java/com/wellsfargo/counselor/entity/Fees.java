package com.wellsfargo.counselor.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Fees {

    @Id
    @GeneratedValue
    private long feeId;

    @Column(nullable = false)
    private String feeDescription;

    @Column(nullable = false)
    private int feeAmount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FeeType feeType;

    protected Fees() {

    }

    // Constructor
    public Fees(String feeDescription, int feeAmount, FeeType feeType) {
        this.feeDescription = feeDescription;
        this.feeAmount = feeAmount;
        this.feeType = feeType;
    }

    // Getters

    public long getFeeId() {
        return feeId;
    }

    public String getFeeDescription() {
        return feeDescription;
    }

    public int getFeeAmount() {
        return feeAmount;
    }

    public FeeType getFeeType() {
        return feeType;
    }

    // Setters

    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    public void setFeeAmount(int feeAmount) {
        this.feeAmount = feeAmount;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    } 
    
}
