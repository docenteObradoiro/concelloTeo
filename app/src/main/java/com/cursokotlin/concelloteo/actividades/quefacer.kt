package com.cursokotlin.concelloteo.actividades

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class quefacer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que_facer)

        val botonactividades=findViewById<ImageButton>(R.id.botonactividades)
        val botonpiscina=findViewById<ImageButton>(R.id.botonpiscina)
        val botonmercados=findViewById<ImageButton>(R.id.botonmercados)
        val botonareas=findViewById<ImageButton>(R.id.botonareas)


        botonactividades.setOnClickListener {
            val acceder = Intent(this, actividadesdeportivas::class.java)
            startActivity(acceder)
        }

        botonpiscina.setOnClickListener {
            val acceder = Intent(this, piscinas::class.java)
            startActivity(acceder)
        }
        botonmercados.setOnClickListener {
            val acceder = Intent(this, mercados::class.java)
            startActivity(acceder)
        }
        botonareas.setOnClickListener {
            val acceder = Intent(this, areasrecreativas::class.java)
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
        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa6)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }
        val botonTeo = findViewById<ImageButton>(R.id.botonTeo6)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
    }
}