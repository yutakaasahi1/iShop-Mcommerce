package com.example.ishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Notifications : AppCompatActivity() {

    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button6 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        button2 = findViewById<Button>(R.id.button2)
        button3 = findViewById<Button>(R.id.button3)
        button4 = findViewById<Button>(R.id.button4)
        button5 = findViewById<Button>(R.id.button5)
        button6 = findViewById<Button>(R.id.button6)
        button7 = findViewById<Button>(R.id.button7)
        button8 = findViewById<Button>(R.id.button8)

        button2.setOnClickListener {
            val i = Intent (this,Home::class.java)
            startActivity(i)
        }

        button3.setOnClickListener {
            val i = Intent (this,Sports::class.java)
            startActivity(i)
        }

        button4.setOnClickListener {
            val i = Intent (this,Clothes::class.java)
            startActivity(i)
        }

        button5.setOnClickListener {
            val i = Intent (this,HomeLiving::class.java)
            startActivity(i)
        }

        button6.setOnClickListener {
            val i = Intent (this,Cart::class.java)
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