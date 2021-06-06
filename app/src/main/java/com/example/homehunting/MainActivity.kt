package com.example.homehunting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = findViewById< EditText>(R.id.etname)
        var spgender =findViewById<Spinner>(R.id.spinnergender)
        var email = findViewById<EditText>(R.id.etemail)
        var phone = findViewById<EditText>(R.id.etphone)
        var password = findViewById<EditText>(R.id.etpassword)
        var btnsignup = findViewById<Button>(R.id.btnsignup)



        val gender= arrayOf("Male","Female","Others",)
        var adapter= ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter=adapter


        btnsignup.setOnClickListener {
            var intent = Intent(baseContext, registerActivity::class.java)
            startActivity(intent)



//            Toast.makeText(baseContext, name, Toast.LENGTH_LONG).show()
//            var intents = Intent(baseContext, registerActivity::class.java)
//            startActivity(intents)
        }

    }
}

