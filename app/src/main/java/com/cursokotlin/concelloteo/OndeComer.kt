package com.cursokotlin.concelloteo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.comer.*

class OndeComer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_comer)

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

        var accesoTradicionalGalega=findViewById<ImageButton>(R.id.botonTradicionalGalega)
        accesoTradicionalGalega.setOnClickListener {
            val acceder= Intent(this, ComerTradicionalGalega::class.java)
            startActivity(acceder)
        }

        var accesoCervexeria=findViewById<ImageButton>(R.id.botonCerveceria)
        accesoCervexeria.setOnClickListener {
            val acceder= Intent(this, ComerCervexeria::class.java)
            startActivity(acceder)
        }

        var accesoVinosTapas=findViewById<ImageButton>(R.id.botonVinos)
        accesoVinosTapas.setOnClickListener {
            val acceder= Intent(this, ComerVinosTapasRacions::class.java)
            startActivity(acceder)
        }

        var accesoMarisqueria=findViewById<ImageButton>(R.id.botonMarisqueria)
        accesoMarisqueria.setOnClickListener {
            val acceder= Intent(this, ComerMarisqueria::class.java)
            startActivity(acceder)
        }

        var accesoComerMenu=findViewById<ImageButton>(R.id.botonMenuDiario)
        accesoComerMenu.setOnClickListener {
            val acceder= Intent(this, ComerMenu::class.java)
            startActivity(acceder)
        }

        var accesoOpcionVegana=findViewById<ImageButton>(R.id.botonOpcionVegana)
        accesoOpcionVegana.setOnClickListener {
            val acceder= Intent(this, ComerVegana::class.java)
            startActivity(acceder)
        }

        var accesoPulperia=findViewById<ImageButton>(R.id.botonPulperia)
        accesoPulperia.setOnClickListener {
            val acceder= Intent(this, ComerPulperia::class.java)
            startActivity(acceder)
        }


        var accesoAlgoDulce=findViewById<ImageButton>(R.id.botonAlgoDulce)
        accesoAlgoDulce.setOnClickListener {
            val acceder= Intent(this, ComerAlgoDulce::class.java)
            startActivity(acceder)
        }

        var accesoParrilla=findViewById<ImageButton>(R.id.botonParrilla)
        accesoParrilla.setOnClickListener {
            val acceder= Intent(this, ComerAParrilla::class.java)
            startActivity(acceder)
        }

        var accesoCafeteria=findViewById<ImageButton>(R.id.botonCafeteria)
        accesoCafeteria.setOnClickListener {
            val acceder= Intent(this, ComerCafeteria::class.java)
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

    }
}