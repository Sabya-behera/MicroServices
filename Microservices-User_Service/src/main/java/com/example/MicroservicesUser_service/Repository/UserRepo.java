package com.example.MicroservicesUser_service.Repository;


import com.example.MicroservicesUser_service.Model.User;

public interface UserRepo  {
    public User getUser(Long id);
}

