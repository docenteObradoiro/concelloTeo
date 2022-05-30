package com.cursokotlin.concelloteo.patrimonio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class patrimonio_arqueoloxico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_arqueoloxico)

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

        val botonMarcoDaAgrela = findViewById<ImageButton>(R.id.botonMarcoDaAgrela)
        botonMarcoDaAgrela.setOnClickListener {
            val accederMarcoDaAgrela = Intent(this, marcoDaAgrela::class.java)
            startActivity(accederMarcoDaAgrela)
        }

        val botonAreaArqueoloxicaDoMontePiquinho = findViewById<ImageButton>(R.id.botonAreaArqueoloxicaDoMontePiquinho)
        botonAreaArqueoloxicaDoMontePiquinho.setOnClickListener {
            val accederAreaArqueoloxicaDoMontePiquinho = Intent(this, areaArqueoloxicaDoMontePiquinho::class.java)
            startActivity(accederAreaArqueoloxicaDoMontePiquinho)
        }

        val botonPetroglifoDaPenaBicudaDeLoureiro = findViewById<ImageButton>(R.id.botonPetroglifoDaPenaBicudaDeLoureiro)
        botonPetroglifoDaPenaBicudaDeLoureiro.setOnClickListener {
            val accederPetroglifoDaPenaBicudaDeLoureiro = Intent(this, petroglifoDaPenaBicudaDeLoureiro::class.java)
            startActivity(accederPetroglifoDaPenaBicudaDeLoureiro)
        }

        val botonPetroglifoDoOuteiroDoCorno = findViewById<ImageButton>(R.id.botonPetroglifoDoOuteiroDoCorno)
        botonPetroglifoDoOuteiroDoCorno.setOnClickListener {
            val accederPetroglifoDoOuteiroDoCorno = Intent(this, petroglifoDoOuteiroDoCorno::class.java)
            startActivity(accederPetroglifoDoOuteiroDoCorno)
        }

        val botonPetroglifoDoRioAngueiraOuDoMonteDeCornide = findViewById<ImageButton>(R.id.botonPetroglifoDoRioAngueiraOuDoMonteDeCornide)
        botonPetroglifoDoRioAngueiraOuDoMonteDeCornide.setOnClickListener {
            val accederPetroglifoDoRioAngueiraOuDoMonteDeCornide = Intent(this, petroglifoDoRioAngueiraOuDoMonteDeCornide::class.java)
            startActivity(accederPetroglifoDoRioAngueiraOuDoMonteDeCornide)
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