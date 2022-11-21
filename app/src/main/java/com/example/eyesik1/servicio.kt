package com.example.eyesik1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class servicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio)
        val si=findViewById<Button>(R.id.boton14)
        val no=findViewById<Button>(R.id.boton15)

        si.setOnClickListener {
            Toast.makeText(this, "Agendar cita", Toast.LENGTH_LONG).show()}

        no.setOnClickListener {
            Toast.makeText(this, "Agendamiento cancelado", Toast.LENGTH_LONG).show()}
    }
}