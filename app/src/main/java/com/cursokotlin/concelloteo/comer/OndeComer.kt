package com.cursokotlin.concelloteo.comer
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class OndeComer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_comer)

        val botonTeo = findViewById<ImageButton>(R.id.logoTeo)
        botonTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        val accesoMenu = findViewById<ImageButton>(R.id.menu)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        /*val botonTradicional = findViewById<ImageButton>(R.id.botonTradicionalGalega)
        botonTradicional.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonCerveceria = findViewById<ImageButton>(R.id.botonCervexería)
        botonCerveceria.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonViñoseTapas = findViewById<ImageButton>(R.id.botonViñosTapas)
        botonViñoseTapas.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonMarisqueria = findViewById<ImageButton>(R.id.botonMarisqueria)
        botonMarisqueria.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonMenuOndeComer = findViewById<ImageButton>(R.id.botonMenuOndeComer)
        botonMenuOndeComer.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonOpcionVegana = findViewById<ImageButton>(R.id.botonOpcionVegana)
        botonOpcionVegana.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonPulperia = findViewById<ImageButton>(R.id.botonPulperia)
        botonPulperia.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonAlgoDulce = findViewById<ImageButton>(R.id.botonAlgoDulce)
        botonAlgoDulce.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonParrillada = findViewById<ImageButton>(R.id.botonParrilla)
        botonParrillada.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }
        val botonXogosInfantiles = findViewById<ImageButton>(R.id.botonZonaXogo)
        botonXogosInfantiles.setOnClickListener {
            val acceder = Intent(this, ::class.java)
            startActivity(acceder)
        }*/

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
        val info = findViewById<ImageButton>(R.id.info)
        info.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
    }
}