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

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val botonTeo = findViewById<ImageButton>(R.id.logoTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val equis= findViewById<ImageButton>(R.id.atras)
        equis.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
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

        val accesoOndeComer = findViewById<TextView>(R.id.ondeComer)
        accesoOndeComer.setOnClickListener {
            val acceder = Intent(this,OndeComer::class.java)
            startActivity(acceder)
        }

        val accesoOndeDurmir = findViewById<TextView>(R.id.ondeDurmir)
        accesoOndeDurmir.setOnClickListener {
            val acceder = Intent(this,OndeDurmir::class.java)
            startActivity(acceder)
        }

        val accesoOndeCelebrar = findViewById<TextView>(R.id.ondeCelebrar)
        accesoOndeCelebrar.setOnClickListener {
            val acceder = Intent(this, OndeCelebrar::class.java)
            startActivity(acceder)
        }

        /*val accesoComoChegar = findViewById<TextView>(R.id.comoChegar)
        accesoComoChegar.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }*/

        val accesoAgenda = findViewById<TextView>(R.id.agenda)
        accesoAgenda.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teo.gal/axenda")))
        }

        val accesoContacto = findViewById<TextView>(R.id.contacto)
        accesoContacto.setOnClickListener {
            val acceder = Intent(this, Contacto::class.java)
            startActivity(acceder)

        }

        val accesoPrivacidade =findViewById<TextView>(R.id.politicaPrivacidad)
        accesoPrivacidade.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teo.gal/aviso-legal")))
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
        val wikiloc = findViewById<ImageButton>(R.id.wikiloc1)
        wikiloc.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/wikiloc/user.do?id=6776439")))
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