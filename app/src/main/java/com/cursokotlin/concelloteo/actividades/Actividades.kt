package com.cursokotlin.concelloteo.actividades

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.concelloteo.*

class actividades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividades)


        val boton6=findViewById<ImageButton>(R.id.boton6)
        val boton7=findViewById<ImageButton>(R.id.boton7)
        val boton5=findViewById<ImageButton>(R.id.boton5)


        boton5.setOnClickListener {
            val acceder = Intent(this, sanmartino::class.java)
            startActivity(acceder)
        }

        boton6.setOnClickListener {
            val acceder = Intent(this, entroido::class.java)
            startActivity(acceder)
        }
        boton7.setOnClickListener {
            val acceder = Intent(this, batalla::class.java)
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
        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa3)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }
        val botonTeo = findViewById<ImageButton>(R.id.botonTeo4)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
    }

}