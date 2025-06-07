package com.example.SanChoi247.model.entity;

import java.sql.Timestamp;

public class FeedbackDTO {
    private int feedbackId;
    private int userId;
    private String userName;
    private String userAvatar;
    private int rating;
    private String feedbackText;
    private Timestamp feedbackDate;
    
    // Getters and setters
    public int getFeedbackId() { return feedbackId; }
    public void setFeedbackId(int feedbackId) { this.feedbackId = feedbackId; }
    
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getUserAvatar() { return userAvatar; }
    public void setUserAvatar(String userAvatar) { this.userAvatar = userAvatar; }
    
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    
    public String getFeedbackText() { return feedbackText; }
    public void setFeedbackText(String feedbackText) { this.feedbackText = feedbackText; }
    
    public Timestamp getFeedbackDate() { return feedbackDate; }
    public void setFeedbackDate(Timestamp feedbackDate) { this.feedbackDate = feedbackDate; }
}