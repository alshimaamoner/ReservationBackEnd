package com.org.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/authenticate")
public class BasicAuthController {
    @GetMapping("/login")
    public String login() {
        System.out.println("login");
       return "login";
    }
}
