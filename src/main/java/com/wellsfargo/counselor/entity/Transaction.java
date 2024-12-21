package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private long transactionId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false);
    private Portfolio portfolio;

    @ManyToMany
    @JoinColumn(name = "securityId", nullable = false);
    private Securities securities;

    @Enumerated(EnumType.STRING) // Persist the enum as a string
    @Column(nullable = false)
    private TransactionalType transactionType;

    @ManyToMany
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date transactionDate;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float pricePerUnit;

    @Column(nullable = false)
    private float totalAmount;


    protected Transaction() {

    }

    // Constructor
    public Transaction(Portfolio portfolio, Securities securities, TransactionalType transactionType, Date transactionDate, int quantity, float pricePerUnit, float totalAmount) {
        this.portfolio = portfolio;
        this.securities = securities;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.totalAmount = totalAmount;
    }

    // Getters
    public long getTransactionId() {
        return transactionId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public Securities gSecurities() {
        return securities;
    }

    public TransactionalType getTransactionType() {
        return transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    // Setters
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setSecurities(Securities securities) {
        this.securities = securities;
    }
    
    public void setTransactionType(TransactionalType transactionType) {
        this.transactionType = transactionType;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }


}