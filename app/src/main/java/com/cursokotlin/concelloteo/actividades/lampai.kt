package com.cursokotlin.concelloteo.actividades

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class lampai: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lampai)

        val botonTeo = findViewById<ImageButton>(R.id.botonTeo100)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val consultar = findViewById<TextView>(R.id.consultar)
        consultar.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/gl/actividades/17/ruta-teatralizada-per-caminho-de-lampai")))
        }

        val formulario = findViewById<ImageButton>(R.id.botonformularioLampai)
        formulario.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/gl/actividades/17/ruta-teatralizada-per-caminho-de-lampai/inscricion")))
        }

        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa100)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        val facebook = findViewById<ImageButton>(R.id.facebook)
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }

        val twitter = findViewById<ImageButton>(R.id.twitter)
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }

        val instagram = findViewById<ImageButton>(R.id.instagram)
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?next=/turismoteo/")))
        }

        val info = findViewById<ImageButton>(R.id.info)
        info.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
    }
}
