package com.example.scannpay

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class PaymentMethod : AppCompatActivity() {

    private lateinit var editTextCardNumber: EditText
    private lateinit var editTextCardholderName: EditText
    private lateinit var editTextCVV: EditText
    private lateinit var editTextValidThru: EditText
    private lateinit var btnSaveCard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paymentmethodform)

        editTextCardNumber = findViewById<EditText>(R.id.editTextCardNumber)
        editTextCardholderName = findViewById<EditText>(R.id.editTextCardHolderName)
        editTextCVV = findViewById<EditText>(R.id.editTextCVV)
        editTextValidThru = findViewById<EditText>(R.id.editTextValidThru)
        btnSaveCard = findViewById<Button>(R.id.btnSaveCard)

        btnSaveCard.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun addPaymentMethod() {
        var cardNo = editTextCardNumber.text.toString();
        var cardholderName = editTextCardholderName.text.toString()
        var cvv = editTextCVV.text.toString()
        var validThru = editTextValidThru.text.toString()


    }
}