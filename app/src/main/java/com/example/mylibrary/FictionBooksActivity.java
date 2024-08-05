package com.example.mylibrary;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class FictionBooksActivity extends AppCompatActivity {

    private ListView fictionListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction_books);

        fictionListView = findViewById(R.id.fictionListView);

        List<String> fictionBooks = new ArrayList<>();
        fictionBooks.add("The Great Gatsby");
        fictionBooks.add("To Kill a Mockingbird");
        fictionBooks.add("1984");

        ArrayAdapter<String> fictionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fictionBooks);
        fictionListView.setAdapter(fictionAdapter);
    }
}
