package com.example.mylibrary;

public class Student extends User {
    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(getName() + " (Student) borrowed " + book.getTitle());
    }
}
