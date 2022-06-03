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

class tipos_patrimonio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipos_patrimonio2)

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

        val boton2 = findViewById<ImageButton>(R.id.boton2)
        boton2.setOnClickListener {
            val accederPatrimonioNatural = Intent(this, patrimonio_natural::class.java)
            startActivity(accederPatrimonioNatural)
        }
        val boton3 = findViewById<ImageButton>(R.id.boton3)
        boton3.setOnClickListener {
            val accederPatrimonioEtnográfico = Intent(this, patrimonio_etnografico::class.java)
            startActivity(accederPatrimonioEtnográfico)
        }
        val boton4 = findViewById<ImageButton>(R.id.boton4)
        boton4.setOnClickListener {
            val accederPatrimonioEclesiastico = Intent(this, patrimonio_eclesiastico::class.java)
            startActivity(accederPatrimonioEclesiastico)
        }

        val boton5 = findViewById<ImageButton>(R.id.boton5)
        boton5.setOnClickListener {
            val accederPatrimonioArqueoloxico = Intent(this, patrimonio_arqueoloxico::class.java)
            startActivity(accederPatrimonioArqueoloxico)
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