package com.jonathastassi.money2money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val confirmButton = findViewById<Button>(R.id.confirm_btn)
        val dollarTodayEdt = findViewById<EditText>(R.id.dollar_today_edt)
        val dollarValueEdt = findViewById<EditText>(R.id.dollar_value_edt)
        val resultTxt = findViewById<TextView>(R.id.result_lbl)

        confirmButton.setOnClickListener {
            try {
                val dollar = dollarTodayEdt.text.toString().toDouble()
                val dollarValue = dollarValueEdt.text.toString().toDouble()

                resultTxt.text = "O valor de $dollarValue em reais é: ${dollar * dollarValue}"
            } catch (e: NumberFormatException) {
                resultTxt.text = "Dados incorretos"
            }


        }
    }
}