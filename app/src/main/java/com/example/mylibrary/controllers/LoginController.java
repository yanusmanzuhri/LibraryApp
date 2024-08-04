package com.example.mylibrary.controllers;

import com.example.mylibrary.models.User;
import com.example.mylibrary.services.AuthService;
import com.example.mylibrary.services.UserService;

public class LoginController {
    private AuthService authService;
    private UserService userService;

    public LoginController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    public boolean login(String username, String password) {
        User user = userService.getUserByUsername(username);
        if (user != null) {
            return authService.authenticate(user, password);
        }
        return false;
    }
}
