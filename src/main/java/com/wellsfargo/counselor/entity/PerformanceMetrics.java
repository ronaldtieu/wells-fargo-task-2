package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

public class PerformanceMetrics {
    
    @Id
    @GeneratedValue
    private long metricId;

    @OneToMany
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private Date timestamp;

    @Column(nullable = false)
    private long value;


    protected PerformanceMetrics() {

    }

    // Constructor

    public PerformanceMetrics(Portfolio portfolio, Date timestamp, long value) {
        this.portfolio = portfolio;
        this.timestamp = timestamp;
        this.value = value;
    }

    // Getters

    public long getMetricId() {
        return metricId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public long getValue() {
        return value;
    }

    // Setters
    
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setValue(long value) {
        this.value = value;
    }

}