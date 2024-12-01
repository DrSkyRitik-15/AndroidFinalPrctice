package com.example.practiceappall

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EndTermPrctical : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_end_term_prctical)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnclick=findViewById<Button>(R.id.bnttnnn)


        btnclick.setOnClickListener {

            findViewById<TextView>(R.id.T1).setBackgroundColor(Color.RED)
            findViewById<TextView>(R.id.T2).setBackgroundColor(Color.GREEN)
            findViewById<TextView>(R.id.T3).setBackgroundColor(Color.YELLOW)


        }
    }
}