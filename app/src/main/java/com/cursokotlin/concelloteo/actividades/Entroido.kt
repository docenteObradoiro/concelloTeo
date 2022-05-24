package com.cursokotlin.concelloteo.actividades

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.R

class entroido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entroido)

        val botonRaris = findViewById<ImageButton>(R.id.botonRaris)
        val botonReis = findViewById<ImageButton>(R.id.botonReis)
        val botonVilariño = findViewById<ImageButton>(R.id.botonVilariño)
        val botonTeo = findViewById<ImageButton>(R.id.botonTeo)



        botonRaris.setOnClickListener {
            val acceder = Intent(this, mapaRaris::class.java)
            startActivity(acceder)
        }
        botonReis.setOnClickListener {
            val acceder = Intent(this, mapaReis::class.java)
            startActivity(acceder)
        }
        botonVilariño.setOnClickListener {
            val acceder = Intent(this, mapaVilarino::class.java)
            startActivity(acceder)
        }
        botonTeo.setOnClickListener {
            val acceder = Intent(this, mapaTeo::class.java)
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