package com.example.MicroservicesUser_service.Controller;
import com.example.MicroservicesUser_service.Model.User;
import com.example.MicroservicesUser_service.Service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "welcomeFallBack")
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId )
    {
        User user=this.userService.getUser(userId);
        List contacts = this.restTemplate.getForObject("http://Contact-Service/contact/user/"+user.getUserId(), List.class);

        user.setContacts(contacts);
        return user;
    }

    //First connect to user service then through restTemplate connect through another service

    public String welcomeFallBack()
    {
        return "Welcome to FallBack Method";   //Here we can return some different service as well
    }
}
