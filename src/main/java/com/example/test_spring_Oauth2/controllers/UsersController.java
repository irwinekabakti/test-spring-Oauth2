package com.example.test_spring_Oauth2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UsersController {

    @GetMapping("/")
    public String helloUserController(){
        return "User access level";
    }
    
}
