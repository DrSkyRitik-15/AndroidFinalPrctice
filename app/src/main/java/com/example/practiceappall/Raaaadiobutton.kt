package com.example.practiceappall

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class Raaaadiobutton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_raaaadiobutton)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val A1 = findViewById<RadioButton>(R.id.R1)
        val A2 = findViewById<RadioButton>(R.id.R2)

        A1.setOnCheckedChangeListener { buttonView, isChecked ->

            Toast.makeText(this,"You Love Java",Toast.LENGTH_SHORT).show()
        }
        A2.setOnCheckedChangeListener { buttonView, isChecked ->

            Toast.makeText(this,"You Love C++",Toast.LENGTH_SHORT).show()
        }
    }
}