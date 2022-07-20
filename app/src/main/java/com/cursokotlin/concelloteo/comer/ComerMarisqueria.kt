package com.cursokotlin.concelloteo.comer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class ComerMarisqueria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_marisqueria)

        val botonTeo = findViewById<ImageButton>(R.id.logoTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val accesoMenu = findViewById<ImageButton>(R.id.menu)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        val direccionPortico = findViewById<TextView>(R.id.direccionPortico)
        direccionPortico.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/D1t8fnUxKLg2nf8F6")))
        }

        val telefonoPortico = findViewById<TextView>(R.id.telefonoPortico)
        telefonoPortico.setOnClickListener {
            val phone = "tel: +34 981807497";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailPortico = findViewById<TextView>(R.id.emailPortico)
        emailPortico.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("restaurante@restauranteportico.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webPortico = findViewById<TextView>(R.id.webPortico)
        webPortico.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restauranteportico.es")))
        }

    }
}