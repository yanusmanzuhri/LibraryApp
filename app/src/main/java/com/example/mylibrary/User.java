package com.example.mylibrary;

public class User {
    private String name;
    private String id;

    // Constructor
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Method to be overridden
    public void borrowBook(Book book) {
        System.out.println(name + " borrowed " + book.getTitle());
    }
}
