package com.example.eyesik1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class servicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios)
        val maquillaje=findViewById<Button>(R.id.boton8)

        maquillaje.setOnClickListener {
            val intento = Intent(this, servicio::class.java)
            startActivity(intento)
        }
    }
}