package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Advisor_Rating {
    
    @Id
    @GeneratedValue
    private long ratingId;

    @ManyToOne // Foreign key to Advisor table
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;

    @ManyToMany
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = true)
    private String feedback;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private Date createDate;



    protected Advisor_Rating() {

    }

    // Constructor
    public Advisor_Rating(Advisor advisor, Client client, String feedback, int rating, Date createDate) {
        this.advisor = advisor;
        this.client = client;
        this.feedback = feedback;
        this.rating = rating;
        this.createDate = createDate;
    }

    // Getters

    public long getRatingId() {
        return ratingId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public Client getClient() {
        return client;
    }

    public String getFeedback() {
        return feedback;
    }

    public int getRating() {
        return rating;
    }

    public Date getCreateDate() {
        return createDate;
    }


    // Setters
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.rating = rating;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    

}