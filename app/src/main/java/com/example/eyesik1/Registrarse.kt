package com.example.eyesik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val registrarse=findViewById<Button>(R.id.boton3)

        registrarse.setOnClickListener {
            val intento1 = Intent(this, login::class.java)
            startActivity(intento1)
        }
    }

}