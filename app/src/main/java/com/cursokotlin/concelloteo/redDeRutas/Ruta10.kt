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
import com.cursokotlin.concelloteo.patrimonio.areaArqueoloxicaDoMontePiquinho
import com.cursokotlin.concelloteo.patrimonio.petroglifoDaPenaBicudaDeLoureiro
import com.cursokotlin.concelloteo.patrimonio.petroglifoDoOuteiroDoCorno
import com.cursokotlin.concelloteo.patrimonio.petroglifoDoRioAngueiraOuDoMonteDeCornide

class Ruta10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta10)

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

        val pdfPetroglifo=findViewById<TextView>(R.id.pdfDescargaPetrofligo)
        pdfPetroglifo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/rutas-senderismo/ruta-da-batalla-de-cacheiras-bamonde-montouto-56790959")))
        }
        val patrimoniopetroglifoangueira= findViewById<ImageButton>(R.id.botonPatrimoniopetroglifoangueira)
        patrimoniopetroglifoangueira.setOnClickListener {
            val acceder = Intent(this, petroglifoDoRioAngueiraOuDoMonteDeCornide::class.java)
            startActivity(acceder)
        }
        val patrimonioareaarqueologicamontepiquinho= findViewById<ImageButton>(R.id.botonPatrimonioMontePiquin)
        patrimonioareaarqueologicamontepiquinho.setOnClickListener {
            val acceder = Intent(this, areaArqueoloxicaDoMontePiquinho::class.java)
            startActivity(acceder)
        }
        val patrimoniopetroglifopenabicuda= findViewById<ImageButton>(R.id.botonPatrimonioPetroglifoBicuda)
        patrimoniopetroglifopenabicuda.setOnClickListener {
            val acceder = Intent(this, petroglifoDaPenaBicudaDeLoureiro::class.java)
            startActivity(acceder)
        }
        val patrimoniopetroglifoouteirodocorno= findViewById<ImageButton>(R.id.botonPatrimoniopetroglifodocorno)
        patrimoniopetroglifoouteirodocorno.setOnClickListener {
            val acceder = Intent(this, petroglifoDoOuteiroDoCorno::class.java)
            startActivity(acceder)
        }
        val boton = findViewById<Button>(R.id.wikiloc)
        boton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/rutas-senderismo/pr-g-238-ruta-dos-petroglifos-de-teo-56821024")))
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