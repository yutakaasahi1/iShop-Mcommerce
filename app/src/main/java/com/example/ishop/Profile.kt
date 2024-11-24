package com.example.ishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {

    private lateinit var button2 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button2 = findViewById<Button>(R.id.button2)
        button7 = findViewById<Button>(R.id.button7)
        button8 = findViewById<Button>(R.id.button8)

        button2.setOnClickListener {
            val i = Intent (this,Home::class.java)
            startActivity(i)
        }

        button7.setOnClickListener {
            val i = Intent (this,Notifications::class.java)
            startActivity(i)
        }

        button8.setOnClickListener {
            val i = Intent (this,Profile::class.java)
            startActivity(i)
        }


    }
}