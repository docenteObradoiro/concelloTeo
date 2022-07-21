package com.cursokotlin.concelloteo.comer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.concelloteo.MainActivity
import com.cursokotlin.concelloteo.Menu
import com.cursokotlin.concelloteo.R

class ComerVegana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_vegana)

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

        /* Fogar do Santiso */

        val direccionFogarDoSantiso = findViewById<TextView>(R.id.direccionFogarDoSantiso)
        direccionFogarDoSantiso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/6fCAxx7cdZMccZ9CA")))
        }

        val telefonoFogarDoSantiso = findViewById<TextView>(R.id.telefonoFogarDoSantiso)
        telefonoFogarDoSantiso.setOnClickListener {
            val phone = "tel: + 34 981805948";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailFogarDoSantiso = findViewById<TextView>(R.id.emailFogarDoSantiso)
        emailFogarDoSantiso.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("fogar@fogardosantiso.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webFogarDoSantiso = findViewById<TextView>(R.id.webFogarDoSantiso)
        webFogarDoSantiso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fogardosantiso.es")))
        }

        /* A Senra */

        val direccionAsenra = findViewById<TextView>(R.id.direccionAsenra)
        direccionAsenra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://g.page/asenracafe?share")))
        }

        val telefonoAsenra = findViewById<TextView>(R.id.telefonoAsenra)
        telefonoAsenra.setOnClickListener {
            val phone = "tel: + 34 981815744";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailAsenra = findViewById<TextView>(R.id.emailAsenra)
        emailAsenra.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("asenracafe@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webAsenra = findViewById<TextView>(R.id.webAsenra)
        webAsenra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.asenracafe.es/presentacion.html")))
        }

        /* O Son do Miño*/

        val direccionOSonDoMino = findViewById<TextView>(R.id.direccionOSonDoMino)
        direccionOSonDoMino.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Zrbn7wMP8bcFgZoo7")))
        }

        val telefonoOSonDoMino = findViewById<TextView>(R.id.telefonoOSonDoMino)
        telefonoOSonDoMino.setOnClickListener {
            val phone = "tel: + 34 981807671";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailOSonDoMino = findViewById<TextView>(R.id.emailOSonDoMino)
        emailOSonDoMino.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@osondominho.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webOSonDoMino = findViewById<TextView>(R.id.webOSonDoMino)
        webOSonDoMino.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.osondominho.com")))
        }

    }
}