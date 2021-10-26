package com.example.Microservices.Repository;


import com.example.Microservices.Model.User;

public interface UserRepo  {
    public User getUser(Long id);
}
