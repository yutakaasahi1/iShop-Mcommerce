package com.example.ishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cart : AppCompatActivity() {

    private lateinit var button13 : Button
    private lateinit var button17 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        button13 = findViewById<Button>(R.id.button13)
        button17 = findViewById<Button>(R.id.button17)

        button13.setOnClickListener {
            val i = Intent (this,Home::class.java)
            startActivity(i)
        }

        button17.setOnClickListener {
            val i = Intent (this,CheckoutPage::class.java)
            startActivity(i)
        }

    }
}