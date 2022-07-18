package com.cursokotlin.concelloteo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class OndeDurmir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ondedormir)

        val botonTeo = findViewById<ImageButton>(R.id.logoTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val accesoMenu = findViewById<ImageButton>(R.id.menu)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }
    }
}