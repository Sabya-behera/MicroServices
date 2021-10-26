package com.example.Microservices.Contact_Service.Model;

public class Contact {
    private Long cId;
    private String email;
    private String contactId;
    private Long userId;

    public Contact() {
    }

    public Contact(Long cId, String email, String contactId, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactId = contactId;
        this.userId = userId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}