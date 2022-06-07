package com.cursokotlin.concelloteo.redDeRutas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R
import com.cursokotlin.concelloteo.patrimonio.informacion_area_recreativa_xirimbao
import com.cursokotlin.concelloteo.patrimonio.informacion_burga_xermeade
import com.cursokotlin.concelloteo.patrimonio.informacion_ponte_colgante_xirimbao
import com.cursokotlin.concelloteo.patrimonio.informacion_ponte_medieval_pontevea

class Ruta9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta9)

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

        val botonPatrimonioPontePontevea=findViewById<ImageButton>(R.id.botonPatrimonioPontePontevea)
        botonPatrimonioPontePontevea.setOnClickListener {
            val acceder= Intent(this, informacion_ponte_medieval_pontevea::class.java)
            startActivity(acceder)
        }

        val botonPatrimonioXirimbao=findViewById<ImageButton>(R.id.botonPatrimonioXirimbao)
        botonPatrimonioXirimbao.setOnClickListener {
            val acceder= Intent(this, informacion_area_recreativa_xirimbao::class.java)
            startActivity(acceder)
        }
        val botonPatrimonioPonteXirimbao=findViewById<ImageButton>(R.id.botonPatrimonioPonteXirimbao)
        botonPatrimonioPonteXirimbao.setOnClickListener {
            val acceder= Intent(this, informacion_ponte_colgante_xirimbao::class.java)
            startActivity(acceder)
        }

        val boton = findViewById<Button>(R.id.wikiloc)
        boton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/rutas-mountain-bike/btt-xirimbao-a-pontevea-teo-56821594")))
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