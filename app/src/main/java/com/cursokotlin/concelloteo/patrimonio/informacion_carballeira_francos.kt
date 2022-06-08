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

class informacion_carballeira_francos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_carballeira_francos)

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

        val facebook = findViewById<ImageButton>(R.id.facebook_3_)
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }

        val twitter = findViewById<ImageButton>(R.id.twitter_4_)
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }

        val instagram = findViewById<ImageButton>(R.id.instagram_3_)
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo/")))
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/42%C2%B048'54.5%22N+8%C2%B037'19.1%22W/@42.8151251,-8.624168,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0xb763a8e60fa1d8f6!8m2!3d42.8151251!4d-8.6219793")))
        }

        val informacion = findViewById<ImageView>(R.id.informacion)
        informacion.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }

        val sonido = findViewById<ImageButton>(R.id.sonido)
        sonido.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://soundcloud.com/user-261518003/03-carballeira-de-francos-gal?in=user-261518003/sets/audios-sentir-teo-no-camino")
                )
            )
        }

    }
    }
