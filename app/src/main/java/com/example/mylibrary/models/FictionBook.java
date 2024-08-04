package com.example.mylibrary.models;

public class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String ISBN, String genre) {
        super(title, author, ISBN);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
