package com.example.HospitalManagement.controller;

import com.example.HospitalManagement.dto.LoginRequest;
import com.example.HospitalManagement.dto.UserRequest;
import com.example.HospitalManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public  String registerUser( @RequestBody UserRequest req){
        return  userService.registerUser(req);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.loginUser(request); // Returns JWT token
    }

}
