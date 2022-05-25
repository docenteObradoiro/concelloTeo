package com.cursokotlin.concelloteo.artesania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class Xeroca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xeroca)
        val logoTeo = findViewById<ImageButton>(R.id.logoTeo)

        logoTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
        val tv4 = findViewById<TextView>(R.id.tv8)
        val igBoton = findViewById<ImageButton>(R.id.igBoton)
//        val correoBoton1 = findViewById<ImageButton>(R.id.botonCorreo)
        val fbBoton = findViewById<ImageButton>(R.id.fbBoton)
        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@42.8451666,-8.5404057,3a,75y,153.7h,94.43t/data=!3m6!1e1!3m4!1sao3o2l5Lfwm1x4e_eKbcQA!2e0!7i13312!8i6656")))
        }
        val botonTelefono = findViewById<ImageButton>(R.id.botonTelefono)
        botonTelefono.setOnClickListener {
            val phone = "tel: +34 616952580";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        fbBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-la.facebook.com/obradoiro.xeroca/")))
        }
        igBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?next=/gaitas_xeroca/")))
        }
//        correoBoton1.setOnClickListener {
//            val intent = Intent(Intent.ACTION_SEND)
//            val recipients = arrayOf("")
//            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Información acerca de...")
//            intent.putExtra(Intent.EXTRA_TEXT, "Estimado Juan,...")
//            intent.type = "text/html"
//            intent.setPackage("com.google.android.gm")
//            startActivity(Intent.createChooser(intent, "Send mail"))
//        }
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

        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa )
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

    }
}