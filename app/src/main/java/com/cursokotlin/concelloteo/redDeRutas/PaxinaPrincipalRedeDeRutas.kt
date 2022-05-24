package com.cursokotlin.concelloteo.redDeRutas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class PaxinaPrincipalRedeDeRutas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paxina_principal_rede_de_rutas)

        val botonTeo = findViewById<ImageButton>(R.id.botonTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa )
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        val redeRutas = findViewById<ImageButton>(R.id.botonTeo2)
        redeRutas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/storage/attachments/50aGWdgYuYtFhm3AeipFktHw42vhrx3uMfAmykpF.pdf")))
        }

        val ruta1 = findViewById<ImageButton>(R.id.boton1)
        ruta1.setOnClickListener {
            val acceder = Intent(this, Ruta1::class.java)
            startActivity(acceder)
        }

        val ruta2 = findViewById<ImageButton>(R.id.boton2)
        ruta2.setOnClickListener {
            val acceder = Intent(this, Ruta2::class.java)
            startActivity(acceder)
        }

        val ruta3 = findViewById<ImageButton>(R.id.boton3)
        ruta3.setOnClickListener {
            val acceder = Intent(this, Ruta3::class.java)
            startActivity(acceder)
        }

        val ruta4 = findViewById<ImageButton>(R.id.boton4)
        ruta4.setOnClickListener {
            val acceder = Intent(this, Ruta4::class.java)
            startActivity(acceder)
        }

        val ruta5 = findViewById<ImageButton>(R.id.boton5)
        ruta5.setOnClickListener {
            val acceder = Intent(this, Ruta5::class.java)
            startActivity(acceder)
        }

        val ruta6 = findViewById<ImageButton>(R.id.boton6)
        ruta6.setOnClickListener {
            val acceder = Intent(this, Ruta6::class.java)
            startActivity(acceder)
        }

        val ruta7 = findViewById<ImageButton>(R.id.boton7)
        ruta7.setOnClickListener {
            val acceder = Intent(this, Ruta7::class.java)
            startActivity(acceder)
        }

        val ruta8 = findViewById<ImageButton>(R.id.boton8)
        ruta8.setOnClickListener {
            val acceder = Intent(this, Ruta8::class.java)
            startActivity(acceder)
        }

        val ruta9 = findViewById<ImageButton>(R.id.boton9)
        ruta9.setOnClickListener {
            val acceder = Intent(this, Ruta9::class.java)
            startActivity(acceder)
        }

        val ruta10 = findViewById<ImageButton>(R.id.boton10)
        ruta10.setOnClickListener {
            val acceder = Intent(this, Ruta10::class.java)
            startActivity(acceder)
        }

        val ruta11 = findViewById<ImageButton>(R.id.boton11)
        ruta11.setOnClickListener {
            val acceder = Intent(this, Ruta11::class.java)
            startActivity(acceder)
        }

        val ruta12 = findViewById<ImageButton>(R.id.boton12)
        ruta12.setOnClickListener {
            val acceder = Intent(this, Ruta12::class.java)
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
        val wikiloc = findViewById<ImageButton>(R.id.wikiloc1)
        wikiloc.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/wikiloc/user.do?id=6776439")))
        }
        val info = findViewById<ImageButton>(R.id.info)
        info.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
    }
}