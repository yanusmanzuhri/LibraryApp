package com.example.libraryapp;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public String getCategory() {
        return "Non-Fiction";
    }
}
