package com.example.practiceappall

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intentclass1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intentclass1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//
        val btn = findViewById<Button>(R.id.Send)
        val nameText :EditText = findViewById(R.id.Fill)

        btn.setOnClickListener {
            // Creating an Intent to start the second activity
            val intent = Intent(this, intentclass12::class.java)
            val input = nameText.text.toString() // Get the input from EditText
            intent.putExtra("Zoom", input) // Pass the value to the second activity
            startActivity(intent) // Start the second activity
        }
    }
}