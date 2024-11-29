package com.example.practiceappall

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar // Correct import

import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActionBarHereMenuOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_action_bar_here_menu_options)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    //go project new, new resoure directoy, name menu,type menu,  ok
    val t: Toolbar = findViewById<Toolbar>(R.id.yoolo)
    setSupportActionBar(t)

}




    override  fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.file_menu, menu)
//
    return super.onCreateOptionsMenu(menu)
}

override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return when (item.itemId) {
        R.id.One -> {
            Toast.makeText(this, "You select Search", Toast.LENGTH_LONG).show()
            true
        }

        R.id.Two -> {
            Toast.makeText(this, "You select Share", Toast.LENGTH_LONG).show()
            true
        }
        R.id.Facebook -> {
            Toast.makeText(this, "You select FaceBook", Toast.LENGTH_LONG).show()
            true
        }
        R.id.Whatapp -> {
            Toast.makeText(this, "You select Whatapps", Toast.LENGTH_LONG).show()
            true
        }


        else -> super.onOptionsItemSelected(item)
    }
    }
}

