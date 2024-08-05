package com.example.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
//import com.example.mylibrary.views.FictionBookView;
//import com.example.mylibrary.views.NonFictionBookView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Button fictionButton;
    private Button nonFictionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fictionButton = findViewById(R.id.fictionButton);
        nonFictionButton = findViewById(R.id.nonFictionButton);

        fictionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FictionBooksActivity.class);
                startActivity(intent);
            }
        });

        nonFictionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NonFictionBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void readFile() throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(getFilesDir() + "/credentials.txt"));
            String line;
            if ((line = reader.readLine()) != null) {
                // Process the line here
                Log.d("MainActivity", "Read line: " + line);
            } else {
                Log.d("MainActivity", "No lines found in the file");
            }
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading credentials file", e);
            throw e;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    Log.e("MainActivity", "Error closing reader", e);
                }
            }
        }
    }
}
