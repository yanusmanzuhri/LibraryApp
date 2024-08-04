package com.example.mylibrary.views;

import com.example.mylibrary.controllers.LoginController;
import java.util.Scanner;

public class LoginView {
    private LoginController loginController;

    public LoginView(LoginController loginController) {
        this.loginController = loginController;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (loginController.login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }
}
