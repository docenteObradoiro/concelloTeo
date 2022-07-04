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
import com.cursokotlin.concelloteo.patrimonio.*

class Ruta3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta3)

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

        val boton = findViewById<Button>(R.id.wikiloc)
        boton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/rutas-senderismo/ruta-da-batalla-de-cacheiras-bamonde-montouto-56790959")))
        }

        val pdfBatalla=findViewById<TextView>(R.id.pdfDescargaBatalla)
        pdfBatalla.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/tripticos-informativos-teo.appspot.com/o/2019_Folleto%20batalla%20de%20Cacheiras.pdf?alt=media&token=c3f6e150-abfd-4d4f-b755-613f7f1c31a2")))
        }

        val botonCasaReitoralDeBamonde = findViewById<ImageButton>(R.id.botonCasaReitoralDeBamonde)
        botonCasaReitoralDeBamonde.setOnClickListener {
            val acceder = Intent(this, casaReitoralDeBamonde::class.java)
            startActivity(acceder)
        }

        val botonErmidaCruceiroDeSantaEufemia = findViewById<ImageButton>(R.id.botonErmidaCruceiroDeSantaEufemia)
        botonErmidaCruceiroDeSantaEufemia.setOnClickListener {
            val acceder = Intent(this, ermidaCruceiroDeSantaEufemia::class.java)
            startActivity(acceder)
        }

        val botonMiradoiroCumioDeMontoutoPenaEscorredia = findViewById<ImageButton>(R.id.botonMiradoiroCumioDeMontoutoPenaEscorredia)
        botonMiradoiroCumioDeMontoutoPenaEscorredia.setOnClickListener {
            val acceder = Intent(this, informacion_miradoiro_cumio::class.java)
            startActivity(acceder)
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
    }
}