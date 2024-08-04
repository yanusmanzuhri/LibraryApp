package com.example.mylibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create library
        val library = Library()

        // Create books
        val book1 = FictionBook("Harry Potter", "J.K. Rowling", "123456789")
        val book2 = NonFictionBook("Sapiens", "Yuval Noah Harari", "987654321")

        // Add books to library
        library.addBook(book1)
        library.addBook(book2)

        // Create users
        val student = Student("Alice", "S1")
        val teacher = Teacher("Bob", "T1")

        // Add users to library
        library.addUser(student)
        library.addUser(teacher)

        // Borrow book
        library.borrowBook(student, book1)
        library.borrowBook(teacher, book2)
    }
}
