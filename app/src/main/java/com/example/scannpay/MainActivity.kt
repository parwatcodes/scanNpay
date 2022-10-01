package com.example.scannpay

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Variable defined.
    private lateinit var btnScan: Button
    private lateinit var btnAddPaymentMethod: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing defined variables with button widgets.
        btnScan = findViewById<Button>(R.id.btnScan)
        btnAddPaymentMethod = findViewById<Button>(R.id.addPayment)

        // onClick handler to scan.
        btnScan.setOnClickListener {
            println("scan card clicked")
        }

        // onClick handler to open payment method form.
        btnAddPaymentMethod.setOnClickListener {
            val intent = Intent(this, PaymentMethod::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
