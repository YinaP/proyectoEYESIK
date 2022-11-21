package com.example.eyesik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registrarse=findViewById<Button>(R.id.boton1)
        val login=findViewById<Button>(R.id.boton2)

        registrarse.setOnClickListener {
        val intento = Intent(this, Registrarse::class.java)
            startActivity(intento)
        }

        login.setOnClickListener {
            val intento1 = Intent(this, login::class.java)
            startActivity(intento1)
        }
    }
}