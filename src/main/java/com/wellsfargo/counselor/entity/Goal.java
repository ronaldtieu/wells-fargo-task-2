package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Goal {

    @Id
    @GeneratedValue
    private long goalId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private Date deadline;

    @Column(nullable = true)
    private String goalDescription;

    @Column(nullable = false)
    private int targetValue;

    @Column(nullable = false)
    private int currentValue;

    @ManyToMany
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    protected Goal() {

    }

    // Constructor
    public Goal(Portfolio portfolio, Date deadline, String goalDescription, int targetValue, int currentValue, Client client) {
        this.portfolio = portfolio;
        this.deadline = deadline;
        this.goalDescription = goalDescription;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.client = client;
    }

    // Getters
    public long getGoalId() {
        return goalId;
    }
    
    public Portfolio getPortfolio() {
        return portfolio;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public Client getClient() {
        return client;
    }

    // Setters

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public void setClient(Client client) {
        this.client = client;
    }  
    
}
