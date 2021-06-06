package com.example.homehunting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var email = findViewById<EditText>(R.id.etemail)
        var password = findViewById<EditText>(R.id.etpassword)
        var btnlogin = findViewById<Button>(R.id.btnlogin)
        btnlogin.setOnClickListener {
            intent = Intent(baseContext, registerActivity::class.java)
            startActivity(intent)

            }
        }
    }
