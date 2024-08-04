package com.example.mylibrary.controllers;

import com.example.mylibrary.models.NonFictionBook;
import com.example.mylibrary.services.BookService;
import java.util.List;

public class NonFictionBookController {
    private BookService bookService;

    public NonFictionBookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void addNonFictionBook(NonFictionBook book) {
        bookService.addBook(book);
    }

    public List<NonFictionBook> getNonFictionBooks() {
        return bookService.getBooks().stream()
                .filter(book -> book instanceof NonFictionBook)
                .map(book -> (NonFictionBook) book)
                .toList();
    }
}
