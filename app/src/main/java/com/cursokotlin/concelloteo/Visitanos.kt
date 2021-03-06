package com.cursokotlin.concelloteo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.R

class Visitanos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitanos)

        val botonTeo = findViewById<ImageButton>(R.id.logoTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
        val accesoMenu= findViewById<ImageButton>(R.id.menu)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        val accesoComoChegar= findViewById<ImageButton>(R.id.botonComoChegar)
        accesoComoChegar.setOnClickListener {
            val acceder = Intent(this, ComoChegar::class.java)
            startActivity(acceder)
        }
        val accesoOndeComer= findViewById<ImageButton>(R.id.botonOndeComer)
        accesoOndeComer.setOnClickListener {
            val acceder = Intent(this, OndeComer::class.java)
            startActivity(acceder)
        }
        val accesoOndeDurmir= findViewById<ImageButton>(R.id.botonOndeDurmir)
        accesoOndeDurmir.setOnClickListener {
            val acceder = Intent(this, OndeDurmir::class.java)
            startActivity(acceder)
        }
        val accesoOndeCelebrar= findViewById<ImageButton>(R.id.botonOndeCelebrar)
        accesoOndeCelebrar.setOnClickListener {
            val acceder = Intent(this, OndeCelebrar::class.java)
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
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
    }
}