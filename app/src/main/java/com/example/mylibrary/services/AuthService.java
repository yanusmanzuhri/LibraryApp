package com.example.mylibrary.services;

import com.example.mylibrary.models.User;

public class AuthService {
    public boolean authenticate(User user, String password) {
        return user.getPassword().equals(password);
    }
}
