package com.example.API_Gateway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback()
    {
        return "User service is down for this time";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback()
    {
        return "Contact service is down for the moment";
    }
}
