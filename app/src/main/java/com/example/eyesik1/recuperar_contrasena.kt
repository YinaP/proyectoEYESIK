package com.example.eyesik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class recuperar_contrasena : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_contrasena)
        val aceptar=findViewById<Button>(R.id.boton6)

        aceptar.setOnClickListener {
            val intento = Intent(this, nueva_asignacion::class.java)
            startActivity(intento)
        }

    }
}