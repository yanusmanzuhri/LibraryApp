package com.example.mylibrary;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mylibrary.controllers.*;
import com.example.mylibrary.models.User;
import com.example.mylibrary.services.*;
import com.example.mylibrary.views.*;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout); // Use the layout you want to display

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
