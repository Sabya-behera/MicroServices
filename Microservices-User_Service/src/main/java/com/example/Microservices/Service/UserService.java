package com.example.Microservices.Service;

import com.example.Microservices.Model.User;
import com.example.Microservices.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements UserRepo {

    @Autowired
    private UserRepo userRepo;

//    public User getUserById(Long id)
//    {
//       return userRepo.getById(id);
//    }
//    public List<User> getUser()
//    {
//        return userRepo.findAll();
//    }
//    public User save(User user)
//    {
//        return userRepo.save(user);
//    }

    List<User> list = List.of(
            new User(1311L, "Sabyasachi Behera", "793322232"),
            new User(1312L, "Abhishek", "7933332320"),
            new User(1313L, "Ramesh", "7933254423"),
            new User(1314L, "Rakesh", "7933225432")

    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}