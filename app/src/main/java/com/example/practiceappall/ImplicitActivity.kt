package com.example.practiceappall

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val b1 = findViewById<Button>(R.id.CAMERA)
        val b2 = findViewById<Button>(R.id.URL)
        val b3 = findViewById<Button>(R.id.DAIL)

        b1.setOnClickListener {

            val aa = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(aa)


        }
        b2.setOnClickListener {
            val bb = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=9FPAdxhYZIc&list=RD_kHxCDfXL2I&index=4")
            )
            startActivity(bb)
        }
        b3.setOnClickListener {
            val cc = Intent(Intent.ACTION_DIAL).apply {

                data = Uri.parse("tel:9616963957")

            }
            startActivity(cc)


        }


    }
}