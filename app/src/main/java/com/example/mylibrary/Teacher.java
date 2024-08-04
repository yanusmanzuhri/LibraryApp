package com.example.mylibrary;

public class Teacher extends User {
    public Teacher(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(getName() + " (Teacher) borrowed " + book.getTitle());
    }
}
