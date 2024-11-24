package com.example.ishop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.DecimalFormat

class CheckoutPage : AppCompatActivity() {

    private lateinit var button13 : Button
    private lateinit var button17 : Button
    private lateinit var button18 : Button
    private lateinit var tvCheckoutStatus : TextView
    private lateinit var editTextText : EditText
    private lateinit var editTextText2 : EditText
    private lateinit var editTextText3 : EditText
    private lateinit var editTextText4 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_page)

        button17 = findViewById<Button>(R.id.button17)
        button18 = findViewById<Button>(R.id.button18)
        button13 = findViewById<Button>(R.id.button13)
        tvCheckoutStatus = findViewById<TextView>(R.id.tvCheckoutStatus)
        editTextText =findViewById<EditText>(R.id.editTextText)
        editTextText2 =findViewById<EditText>(R.id.editTextText2)
        editTextText3 =findViewById<EditText>(R.id.editTextText3)
        editTextText4 =findViewById<EditText>(R.id.editTextText4)


        button13.setOnClickListener {
            val i = Intent (this,Home::class.java)
            startActivity(i)
        }

        button17.setOnClickListener {

            var status = ""
            status = "Thank you, buy with iShop. See You Next Time"

            val i = Intent (this,BankIn::class.java)
            startActivity(i)

            tvCheckoutStatus.text = status

        }

        button18.setOnClickListener {  //Reset

            editTextText.setText("")
            editTextText2.setText("")
            editTextText3.setText("")
            editTextText4.setText("")
            tvCheckoutStatus.text=""

        }



    }
}