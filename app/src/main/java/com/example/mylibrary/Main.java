package com.example.mylibrary;

import com.example.mylibrary.controllers.*;
import com.example.mylibrary.services.*;
import com.example.mylibrary.views.*;
import com.example.mylibrary.models.*;

public class Main {
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        UserService userService = new UserService();
        BookService bookService = new BookService();

        LoginController loginController = new LoginController(authService, userService);
        FictionBookController fictionBookController = new FictionBookController(bookService);
        NonFictionBookController nonFictionBookController = new NonFictionBookController(bookService);

        LoginView loginView = new LoginView(loginController);
        FictionBookView fictionBookView = new FictionBookView(fictionBookController);
        NonFictionBookView nonFictionBookView = new NonFictionBookView(nonFictionBookController);

        // Adding some test data
        userService.addUser(new User("admin", "password", "admin"));

        // Displaying views for testing
        loginView.display();
        fictionBookView.display();
        nonFictionBookView.display();
    }
}
