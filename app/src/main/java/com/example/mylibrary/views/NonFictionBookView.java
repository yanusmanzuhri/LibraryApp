package com.example.mylibrary.views;

import com.example.mylibrary.controllers.NonFictionBookController;
import com.example.mylibrary.models.NonFictionBook;
import java.util.Scanner;

public class NonFictionBookView {
    private NonFictionBookController nonFictionBookController;

    public NonFictionBookView(NonFictionBookController nonFictionBookController) {
        this.nonFictionBookController = nonFictionBookController;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter ISBN:");
        String ISBN = scanner.nextLine();
        System.out.println("Enter subject:");
        String subject = scanner.nextLine();

        NonFictionBook book = new NonFictionBook(title, author, ISBN, subject);
        nonFictionBookController.addNonFictionBook(book);
        System.out.println("Non-fiction book added successfully!");
    }
}
