package com.example.mylibrary

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            val username = findViewById<EditText>(R.id.username).text.toString()
            val password = findViewById<EditText>(R.id.password).text.toString()

            if (username == "admin" && password == "admin") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                // Handle invalid login
            }
        }
    }
}