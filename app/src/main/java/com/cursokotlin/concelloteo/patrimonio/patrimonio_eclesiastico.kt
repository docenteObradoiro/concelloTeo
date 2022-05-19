package com.cursokotlin.concelloteo.patrimonio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.R

class patrimonio_eclesiastico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_eclesiastico)

        val botonCasaReitoralDeBamonde = findViewById<ImageButton>(R.id.botonCasaReitoralDeBamonde)
        botonCasaReitoralDeBamonde.setOnClickListener {
            val accederCasaReitoralDeBamonde = Intent(this, casaReitoralDeBamonde::class.java)
            startActivity(accederCasaReitoralDeBamonde)
        }

        val botonIgrexaCruceiroDeSantaMariaDeBamonde = findViewById<ImageButton>(R.id.botonIgrexaCruceiroDeSantaMariaDeBamonde)
        botonIgrexaCruceiroDeSantaMariaDeBamonde.setOnClickListener {
            val accederIgrexaCruceiroDeSantaMariaDeBamonde = Intent(this, igrexaCruceiroDeSantaMariaDeBamonde::class.java)
            startActivity(accederIgrexaCruceiroDeSantaMariaDeBamonde)
        }

        val botonCapelaDeSantaAnaDeLampai = findViewById<ImageButton>(R.id.botonCapelaDeSantaAnaDeLampai)
        botonCapelaDeSantaAnaDeLampai.setOnClickListener {
            val accederCapelaDeSantaAnaDeLampai = Intent(this, capelaDeSantaAnaDeLampai::class.java)
            startActivity(accederCapelaDeSantaAnaDeLampai)
        }

        val botonCapelaCruceiroDoEspiritoSanto = findViewById<ImageButton>(R.id.botonCapelaCruceiroDoEspiritoSanto)
        botonCapelaCruceiroDoEspiritoSanto.setOnClickListener {
            val accederCapelaCruceiroDoEspiritoSanto = Intent(this, capelaCruceiroDoEspiritoSanto::class.java)
            startActivity(accederCapelaCruceiroDoEspiritoSanto)
        }

        val botonIgrexaDeSantaMariaDeLampai = findViewById<ImageButton>(R.id.botonIgrexaDeSantaMariaDeLampai)
        botonIgrexaDeSantaMariaDeLampai.setOnClickListener {
            val accederIgrexaDeSantaMariaDeLampai = Intent(this, igrexaDeSantaMariaDeLampai::class.java)
            startActivity(accederIgrexaDeSantaMariaDeLampai)
        }

        val botonIgrexaDeSanMiguelDeRaris = findViewById<ImageButton>(R.id.botonIgrexaDeSanMiguelDeRaris)
        botonIgrexaDeSanMiguelDeRaris.setOnClickListener {
            val accederIgrexaDeSanMiguelDeRaris = Intent(this, igrexaDeSanMiguelDeRaris::class.java)
            startActivity(accederIgrexaDeSanMiguelDeRaris)
        }

        val botonErmidaCruceiroDeSantaEufemia = findViewById<ImageButton>(R.id.botonErmidaCruceiroDeSantaEufemia)
        botonErmidaCruceiroDeSantaEufemia.setOnClickListener {
            val accederErmidaCruceiroDeSantaEufemia = Intent(this, ermidaCruceiroDeSantaEufemia::class.java)
            startActivity(accederErmidaCruceiroDeSantaEufemia)
        }

        val botonIgrexaDeSantaMariaDeLuou = findViewById<ImageButton>(R.id.botonIgrexaDeSantaMariaDeLuou)
        botonIgrexaDeSantaMariaDeLuou.setOnClickListener {
            val accederIgrexaDeSantaMariaDeLuou = Intent(this, igrexaDeSantaMariaDeLuou::class.java)
            startActivity(accederIgrexaDeSantaMariaDeLuou)
        }

        val botonIgrexaDeSantaMariaDeTeo = findViewById<ImageButton>(R.id.botonIgrexaDeSantaMariaDeTeo)
        botonIgrexaDeSantaMariaDeTeo.setOnClickListener {
            val accederIgrexaDeSantaMariaDeTeo = Intent(this, igrexaDeSantaMariaDeTeo::class.java)
            startActivity(accederIgrexaDeSantaMariaDeTeo)
        }

        val botonIgrexadeSanSimonDeOnsCacheiras = findViewById<ImageButton>(R.id.botonIgrexadeSanSimonDeOnsCacheiras)
        botonIgrexadeSanSimonDeOnsCacheiras.setOnClickListener {
            val accederIgrexadeSanSimonDeOnsCacheiras = Intent(this, igrexadeSanSimonDeOnsCacheiras::class.java)
            startActivity(accederIgrexadeSanSimonDeOnsCacheiras)
        }

        val informacion = findViewById<ImageButton>(R.id.informacion)
        informacion.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }


    }
}