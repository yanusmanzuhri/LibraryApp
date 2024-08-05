package com.example.mylibrary;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class NonFictionBooksActivity extends AppCompatActivity {

    private ListView nonFictionListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_fiction_books);

        nonFictionListView = findViewById(R.id.nonFictionListView);

        List<String> nonFictionBooks = new ArrayList<>();
        nonFictionBooks.add("Sapiens: A Brief History of Humankind");
        nonFictionBooks.add("Educated");
        nonFictionBooks.add("The Immortal Life of Henrietta Lacks");

        ArrayAdapter<String> nonFictionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nonFictionBooks);
        nonFictionListView.setAdapter(nonFictionAdapter);
    }
}
