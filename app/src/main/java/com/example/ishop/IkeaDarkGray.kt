package com.example.ishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IkeaDarkGray : AppCompatActivity() {

    private lateinit var button13 : Button
    private lateinit var button16 : Button
    private lateinit var button19 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikea_dark_gray)

        button13 = findViewById<Button>(R.id.button13)
        button16 = findViewById<Button>(R.id.button16)
        button19 = findViewById<Button>(R.id.button19)

        button13.setOnClickListener {
            val i = Intent (this,Home::class.java)
            startActivity(i)
        }

        button16.setOnClickListener {
            val i = Intent (this,Cart::class.java)
            startActivity(i)
        }

        button19.setOnClickListener {
            val i = Intent (this,CheckoutPage::class.java)
            startActivity(i)
        }


    }
}