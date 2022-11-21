package com.example.eyesik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val boton4=findViewById<Button>(R.id.boton4)
        val boton5=findViewById<Button>(R.id.boton5)


        boton4.setOnClickListener {
            val intento1 = Intent(this, recuperar_contrasena::class.java)
            startActivity(intento1)
        }

        boton5.setOnClickListener {
            val intento1 = Intent(this, menu::class.java)
            startActivity(intento1)
        }
    }
}