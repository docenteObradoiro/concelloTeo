package com.cursokotlin.concelloteo.redDeRutas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R
import com.cursokotlin.concelloteo.patrimonio.igrexadeSanSimonDeOnsCacheiras
import com.cursokotlin.concelloteo.patrimonio.informacion_fonte_lavadoiro_florida
import com.cursokotlin.concelloteo.patrimonio.informacion_ponte_medieval_pontevea

class Ruta12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta12)

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
        val pontemedievalpuenteva= findViewById<ImageButton>(R.id.botonPatrimoniopontemedievalpontevea)
        pontemedievalpuenteva.setOnClickListener {
            val acceder = Intent(this, informacion_ponte_medieval_pontevea::class.java)
            startActivity(acceder)
        }
        val fontelavadoiroflorida= findViewById<ImageButton>(R.id.botonPatrimoniofonteflorida)
        fontelavadoiroflorida.setOnClickListener {
            val acceder = Intent(this, informacion_fonte_lavadoiro_florida::class.java)
            startActivity(acceder)
        }
        val iglesiaSanSimon= findViewById<ImageButton>(R.id.botonPatrimonioigrexasansimondeons)
        iglesiaSanSimon.setOnClickListener {
            val acceder = Intent(this, igrexadeSanSimonDeOnsCacheiras::class.java)
            startActivity(acceder)
        }
        val boton = findViewById<Button>(R.id.wikiloc)
        boton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/rutas-senderismo/camino-da-geira-e-dos-arrieiros-en-teo-59054627")))
        }
        val redeRutas = findViewById<ImageButton>(R.id.logoRedeRutas)
        redeRutas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/storage/attachments/50aGWdgYuYtFhm3AeipFktHw42vhrx3uMfAmykpF.pdf")))
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

        val pdfDescargaArrieiros=findViewById<TextView>(R.id.pdfDescargaArrieiros)
        pdfDescargaArrieiros.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/rutas-senderismo/ruta-da-batalla-de-cacheiras-bamonde-montouto-56790959")))
        }

    }
}