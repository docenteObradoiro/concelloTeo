package com.cursokotlin.concelloteo.artesania


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.*
import com.cursokotlin.concelloteo.*

class PaginaPrincipalArtesania : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ConcelloTeo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal_artesania)

        val tv1 = findViewById<TextView>(R.id.tv1)

        val logoTeo = findViewById<ImageButton>(R.id.logoTeo)

        logoTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val informacionBoton = findViewById<ImageButton>(R.id.info)
        informacionBoton.setOnClickListener {startActivity(Intent
            (Intent.ACTION_VIEW, Uri.parse("https://www.teo.gal/")))
        }

        val botonFacebook = findViewById<ImageButton>(R.id.facebook)
        botonFacebook.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }

        val botonInstagram = findViewById<ImageButton>(R.id.instagram)
        botonInstagram.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo/")))
        }
        val botonTwitter = findViewById<ImageButton>(R.id.twitter)
        botonTwitter.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }

        val brigantiaOrfebre = findViewById<ImageButton>(R.id.boton1)
        brigantiaOrfebre.setOnClickListener {
            val acceder = Intent(this, BrigantiaOrfebres::class.java)
            startActivity(acceder)
        }
        val oliXiraldez = findViewById<ImageButton>(R.id.boton2)
        oliXiraldez.setOnClickListener {
            val acceder = Intent(this, OliXiraldez::class.java)
            startActivity(acceder)
        }
//        val silvereira = findViewById<ImageButton>(R.id.boton3)
//        silvereira.setOnClickListener {
//            val acceder = Intent(this, Silvereira::class.java)
//            startActivity(acceder)
//        }
        val xeroca = findViewById<ImageButton>(R.id.boton3)
        xeroca.setOnClickListener {
            val acceder = Intent(this, Xeroca::class.java)
            startActivity(acceder)
        }
        val spacioB = findViewById<ImageButton>(R.id.boton4)
        spacioB.setOnClickListener {
            val acceder = Intent(this, SpaciobInteriorismo::class.java)
            startActivity(acceder)
        }
        val rosamendez = findViewById<ImageButton>(R.id.boton5)
        rosamendez.setOnClickListener {
            val acceder = Intent(this, RosaMendez::class.java)
            startActivity(acceder)
        }
        val macala = findViewById<ImageButton>(R.id.boton6)
        macala.setOnClickListener {
            val acceder = Intent(this, MacalaXoias::class.java)
            startActivity(acceder)
        }
        val tresOficios = findViewById<ImageButton>(R.id.boton7)
        tresOficios.setOnClickListener {
            val acceder = Intent(this, TresOficios::class.java)
            startActivity(acceder)
        }
//        val arteCelta = findViewById<ImageButton>(R.id.boton8)
//        arteCelta.setOnClickListener {
//            val acceder = Intent(this, ArteCelta::class.java)
//            startActivity(acceder)
//        }
        val cuchillosVillar = findViewById<ImageButton>(R.id.boton8)
        cuchillosVillar.setOnClickListener {
            val acceder = Intent(this, CuchillosVillar::class.java)
            startActivity(acceder)
        }
        val alalaCouture = findViewById<ImageButton>(R.id.boton9)
        alalaCouture.setOnClickListener {
            val acceder = Intent(this, AlalaCouture::class.java)
            startActivity(acceder)
        }
        val iagoSalgado = findViewById<ImageButton>(R.id.boton10)
        iagoSalgado.setOnClickListener {
            val acceder = Intent(this, IagoSalgado::class.java)
            startActivity(acceder)
        }
        val pabloSeoane = findViewById<ImageButton>(R.id.boton11)
        pabloSeoane.setOnClickListener {
            val acceder = Intent(this, PabloSeoane::class.java)
            startActivity(acceder)
        }
        val olgaMartinez = findViewById<ImageButton>(R.id.boton12)
        olgaMartinez.setOnClickListener {
            val acceder = Intent(this, OlgaMartinez::class.java)
            startActivity(acceder)
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
    }

}