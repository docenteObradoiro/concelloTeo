package com.cursokotlin.concelloteo.patrimonio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R
import com.cursokotlin.concelloteo.redDeRutas.Ruta1
import com.cursokotlin.concelloteo.redDeRutas.Ruta10

class informacion_marco_medieval_porto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_marco_medieval_porto)

        val botonTeo = findViewById<ImageButton>(R.id.botonTeoMapa)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        val ruta1= findViewById<ImageButton>(R.id.botonRuta1)
        ruta1.setOnClickListener {
            val acceder = Intent(this, Ruta1::class.java)
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
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo/")))
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/42%C2%B046'37.9%22N+8%C2%B037'34.0%22W/@42.7771973,-8.6282985,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x17e1865f53c4570b!8m2!3d42.7771973!4d-8.6261098")))
        }

        val informacion = findViewById<ImageView>(R.id.info)
        informacion.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
    }
}