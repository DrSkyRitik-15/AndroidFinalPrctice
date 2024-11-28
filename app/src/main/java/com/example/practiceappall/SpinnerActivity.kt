package com.example.practiceappall

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Objects

class SpinnerActivity : AppCompatActivity() {
    private lateinit var adapter: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sp : Spinner = findViewById<Spinner>(R.id.mySpinner)

        val item = listOf("Apple 🍎","Mango 🍔","Banana 🍿")

        val ad = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,item)

        sp. adapter = ad

        sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val s = parent?.getItemAtPosition(position).toString()

                Toast.makeText(this@SpinnerActivity, "You select $s", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@SpinnerActivity, "You not select", Toast.LENGTH_LONG).show()
            }

        }

    }
}