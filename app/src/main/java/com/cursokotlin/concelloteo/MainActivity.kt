package com.cursokotlin.concelloteo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cursokotlin.concelloteo.actividades.actividades
import com.cursokotlin.concelloteo.artesania.PaginaPrincipalArtesania
import com.cursokotlin.concelloteo.patrimonio.tipos_patrimonio
import com.cursokotlin.concelloteo.redDeRutas.PaxinaPrincipalRedeDeRutas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val boton4 = findViewById<Button>(R.id.boton4)

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

        boton4.setOnClickListener {
            val acceder = Intent(this, tipos_patrimonio::class.java)
            startActivity(acceder)
        }

    }
}