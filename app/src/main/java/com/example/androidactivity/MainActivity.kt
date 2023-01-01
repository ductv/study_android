package com.example.androidactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtA = findViewById<EditText>(R.id.edtA)
        val edtB = findViewById<EditText>(R.id.edtB)
        val txtResult = findViewById<TextView>(R.id.txtDisplayResult)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            if (edtA.text.toString().equals("") || edtB.text.toString().equals("")) {
                Toast.makeText(this, "Enter valid value", Toast.LENGTH_LONG).show()
            } else {
                var firstNum = edtA.text.toString().toDouble()

                var secondNum = edtB.text.toString().toDouble()
                txtResult.setText(sumTwoDouble(firstNum, secondNum).toString())
            }
        }
    }

    /**
     * Sum of 2 double number
     */
    fun sumTwoDouble(firstNum: Double, secondNum: Double): Double {
        return firstNum + secondNum
    }

}