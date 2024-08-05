package com.example.mylibrary.models;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }

    @Override
    public String getCategory() {
        return "Non-Fiction";
    }
}
