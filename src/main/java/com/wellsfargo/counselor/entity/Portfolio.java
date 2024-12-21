package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Portfolio {

    @Id // meaning primary key
    @GeneratedValue // will be auto generated by the db
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false) // Foreign key to Client table
    private Client client;

    protected Portfolio() {

    }
    // Constructor
    public Portfolio(Client client) {
        this.client = client;
    }

    // Getters
    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    // Setters
    public void setClient(Client client) {
        this.client = client;
    }


}