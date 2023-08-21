package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtLabel : TextView = findViewById(R.id.txtLabel)
        val btnChange : Button = findViewById(R.id.btnChange)

        btnChange.setOnClickListener {
            txtLabel.text = "Soy Claudia"
        }
    }
}