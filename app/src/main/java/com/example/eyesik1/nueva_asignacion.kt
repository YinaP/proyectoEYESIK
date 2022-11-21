package com.example.eyesik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nueva_asignacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_asignacion)
        val boton7=findViewById<Button>(R.id.boton7)


        boton7.setOnClickListener {
            val intento1 = Intent(this, servicios::class.java)
            startActivity(intento1)
        }


    }
}