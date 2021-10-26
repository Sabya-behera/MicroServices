package com.example.Microservices.Contact_Service.Repository;

import com.example.Microservices.Contact_Service.Model.Contact;

import java.util.List;

public interface ContactRepo {

    public List<Contact> getContactsOfUser(Long userId);
}
