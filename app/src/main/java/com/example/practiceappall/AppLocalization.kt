package com.example.practiceappall

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class AppLocalization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_localization)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val helloMessage = getString(R.string.app_name)
//        val personalizedWelcome = getString(R.string.Text1)
//
//        println(helloMessage)          // Output: "Hello" (or "Hola" if the locale is Spanish)
//        println(personalizedWelcome)   // Output: "Welcome to the app, Hrithik!" (or localized equivalent)

val b1= findViewById<Button>(R.id.English)
b1.setOnClickListener{
    setLocale("en")
}
        val b2= findViewById<Button>(R.id.Hindi)
        b2.setOnClickListener{
            setLocale("hi")
        }

    }
   /* fun setLocale(localeCode: String) {
        val locale = Locale(localeCode)
        Locale.setDefault(locale)

        val config:Configuration = Configuration()
        config.setLocale(locale)
       baseContext. resources.updateConfiguration(config,baseContext.resources.displayMetrics)

        // Restart activity to apply changes
        recreate()
    } */
   fun setLocale(localeCode: String) {
       val locale = Locale(localeCode)
       Locale.setDefault(locale)

       val config = resources.configuration
       config.setLocale(locale)
       resources.updateConfiguration(config, resources.displayMetrics)

       // Restart activity to apply changes
       recreate()
   }


}