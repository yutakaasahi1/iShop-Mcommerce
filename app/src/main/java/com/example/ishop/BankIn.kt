package com.example.ishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BankIn : AppCompatActivity() {

    private lateinit var button13 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bank_in)

        button13 = findViewById<Button>(R.id.button13)

        button13.setOnClickListener {
            val i = Intent (this,CheckoutPage::class.java)
            startActivity(i)
        }

    }
}