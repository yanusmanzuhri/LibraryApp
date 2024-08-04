package com.example.mylibrary.controllers;

import com.example.mylibrary.models.FictionBook;
import com.example.mylibrary.services.BookService;
import java.util.List;

public class FictionBookController {
    private BookService bookService;

    public FictionBookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void addFictionBook(FictionBook book) {
        bookService.addBook(book);
    }

    public List<FictionBook> getFictionBooks() {
        return bookService.getBooks().stream()
                .filter(book -> book instanceof FictionBook)
                .map(book -> (FictionBook) book)
                .toList();
    }
}
