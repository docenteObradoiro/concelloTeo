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

class informacion_ponte_lavadoiro_rio_tinto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_ponte_lavadoiro_rio_tinto)

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
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/42%C2%B048'56.2%22N+8%C2%B037'37.2%22W/@42.815615,-8.6291887,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x8a7305bbae3b8afb!8m2!3d42.8156222!4d-8.6270028")))
        }

        val informacion = findViewById<ImageView>(R.id.info)
        informacion.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
        val sonido = findViewById<ImageButton>(R.id.sonido)
        sonido.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://soundcloud.com/user-261518003/06-ponte-medieval-e-lavadoiro?in=user-261518003/sets/audios-sentir-teo-no-camino")
                )
            )
        }
    }
}