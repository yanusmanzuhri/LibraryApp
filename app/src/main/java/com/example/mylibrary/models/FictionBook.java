package com.example.mylibrary.models;

public class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }

    @Override
    public String getCategory() {
        return "Fiction";
    }
}
