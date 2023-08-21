package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txtLabel : TextView
    private lateinit var btnChange : Button

    private val textToShow = "Soy Claudia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtLabel = findViewById(R.id.txtLabel)
        btnChange = findViewById(R.id.btnChange)

        btnChange.setOnClickListener {
            txtLabel.text = textToShow
        }
    }
}