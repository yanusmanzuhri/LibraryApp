package com.example.libraryapp;

public class FictionBook extends Book {
    public FictionBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public String getCategory() {
        return "Fiction";
    }
}
