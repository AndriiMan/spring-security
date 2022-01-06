package com.example.spring.security.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/authenticated")
    public String authenticatedUsers(Principal principal) {
        return "Authenticated user "+ principal.getName();
    }

    @GetMapping("/read_profile")
    public String readProfile() {
        return "Read profile";
    }

    @GetMapping("/only_for_admins")
    public String onlyForAdmins() {
        return "Admins Page";
    }


}
