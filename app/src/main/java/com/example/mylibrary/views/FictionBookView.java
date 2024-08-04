package com.example.mylibrary.views;

import com.example.mylibrary.controllers.FictionBookController;
import com.example.mylibrary.models.FictionBook;
import java.util.Scanner;

public class FictionBookView {
    private FictionBookController fictionBookController;

    public FictionBookView(FictionBookController fictionBookController) {
        this.fictionBookController = fictionBookController;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter ISBN:");
        String ISBN = scanner.nextLine();
        System.out.println("Enter genre:");
        String genre = scanner.nextLine();

        FictionBook book = new FictionBook(title, author, ISBN, genre);
        fictionBookController.addFictionBook(book);
        System.out.println("Fiction book added successfully!");
    }
}
