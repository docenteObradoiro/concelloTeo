package com.cursokotlin.concelloteo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.cursokotlin.concelloteo.actividades.actividades
import com.cursokotlin.concelloteo.artesania.PaginaPrincipalArtesania
import com.cursokotlin.concelloteo.patrimonio.tipos_patrimonio
import com.cursokotlin.concelloteo.redDeRutas.PaxinaPrincipalRedeDeRutas

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val botonTeo = findViewById<ImageButton>(R.id.logoTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val equis= findViewById<ImageButton>(R.id.atras)
        equis.setOnClickListener {
            finish()
        }

        val accesoRutas = findViewById<TextView>(R.id.redderutas)
        accesoRutas.setOnClickListener {
            val acceder = Intent(this, PaxinaPrincipalRedeDeRutas::class.java)
            startActivity(acceder)
        }

        val accesoPatrimonio = findViewById<TextView>(R.id.patrimonio)
        accesoPatrimonio.setOnClickListener {
            val acceder = Intent(this, tipos_patrimonio::class.java)
            startActivity(acceder)
        }

        val accesoArtesania = findViewById<TextView>(R.id.artesania)
        accesoArtesania.setOnClickListener {
            val acceder = Intent(this, PaginaPrincipalArtesania::class.java)
            startActivity(acceder)
        }


        val accesoActividades = findViewById<TextView>(R.id.actividades)
        accesoActividades.setOnClickListener {
            val acceder = Intent(this, actividades::class.java)
            startActivity(acceder)
        }

        val accesoAgenda = findViewById<TextView>(R.id.agenda)
        accesoAgenda.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teo.gal/axenda")))
        }

        /*val accesoContacto = findViewById<TextView>(R.id.contacto)
        accesoContacto.setOnClickListener {
            val acceder = Intent(this, Contacto::class.java)
            startActivity(acceder)
        }*/

        val accesoPrivacidade =findViewById<TextView>(R.id.politicaPrivacidad)
        accesoPrivacidade.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teo.gal/aviso-legal")))
        }
    }
}