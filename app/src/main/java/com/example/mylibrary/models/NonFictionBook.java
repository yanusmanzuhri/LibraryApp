package com.example.mylibrary.models;

public class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String ISBN, String subject) {
        super(title, author, ISBN);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
