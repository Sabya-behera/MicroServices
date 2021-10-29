package com.example.MicroservicesUser_service.Model;

public class Contact {
    private long cId;
    private String email;
    private String contactId;
    private Long userId;

    public Contact(long cId, String email, String contactId, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactId = contactId;
        this.userId = userId;
    }

    public Contact() {
    }

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
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

