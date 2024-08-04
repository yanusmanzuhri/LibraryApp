package com.example.mylibrary;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            readFile();
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading file", e);
        }
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
