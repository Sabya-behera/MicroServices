package com.example.Microservices.Contact_Service.SErvice;

import com.example.Microservices.Contact_Service.Model.Contact;
import com.example.Microservices.Contact_Service.Repository.ContactRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService implements ContactRepo {
    //Fake contacts
    List<Contact> list=List.of(
            new Contact(1L,"AMit@gmail.com","Sabyasachi Behera",1311L),
            new Contact(2L,"HMibhi@gmail.com","Abhishek",1312L),
            new Contact(3L,"rMddsdt@gmail.com","Ramesh",1313L),
            new Contact(4L,"Rakesh@gmail.com","Rakesh",1313L)
);
    @Override
    public List<Contact> getContactsOfUser(Long userId)
    {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
