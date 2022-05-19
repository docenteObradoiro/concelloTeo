package com.cursokotlin.concelloteo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cursokotlin.concelloteo.actividades.actividades
import com.cursokotlin.concelloteo.artesania.PaginaPrincipalArtesania
import com.cursokotlin.concelloteo.redDeRutas.PaxinaPrincipalRedeDeRutas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.botonMain1)
        val boton2 = findViewById<Button>(R.id.botonMain2)
        val boton3 = findViewById<Button>(R.id.botonMain3)
        val boton4 = findViewById<Button>(R.id.botonMain4)

        boton1.setOnClickListener {
            val acceder = Intent(this, PaxinaPrincipalRedeDeRutas::class.java)
            startActivity(acceder)
        }

        boton2.setOnClickListener {
            val acceder = Intent(this, actividades::class.java)
            startActivity(acceder)
        }

       boton3.setOnClickListener {
            val acceder = Intent(this, PaginaPrincipalArtesania::class.java)
            startActivity(acceder)
        }
        /*
        boton4.setOnClickListener {
            val acceder = Intent(this, patrimonio::class.java)
            startActivity(acceder)
        }*/

    }
}