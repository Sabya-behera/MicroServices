package com.example.Microservices.Controller;

import com.example.Microservices.Model.User;
import com.example.Microservices.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/get")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping("/get")
//    public List<User> getUser()
//    {
//        return userService.getUser();
//    }
//
//    @GetMapping("/get/{id}")
//    public User getUserById(@PathVariable(value = "id") Long id)
//    {
//        return userService.getUserById(id);
//    }
//    @PostMapping("/post")
//    public User save(@RequestBody User user)
//    {
//        return userService.save(user);
//    }

    //Rest template made sure that there is a communication between two services
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId )
    {
        User user=this.userService.getUser(userId);
        List contacts = this.restTemplate.getForObject("http://Contact-Service/contact/user/"+user.getUserId(), List.class);

        user.setContacts(contacts);
        return user;
    }




}
