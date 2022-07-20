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

class ComerCervexeria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_cervexeria)

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

        val direccionBetos=findViewById<TextView>(R.id.direccionBetos)
        direccionBetos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Jd7GJ54EfXqbuj6KA")))
        }

        val telefonoBetos = findViewById<TextView>(R.id.telefonoBetos)
        telefonoBetos.setOnClickListener {
            val phone = "tel: +34 981 80 68 39";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val facebookBetos=findViewById<TextView>(R.id.webBetos)
        facebookBetos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/people/cerveceria-betos/100063516612804/?rf=263299670423791")))
        }

        val direccionPortugalicia=findViewById<TextView>(R.id.direccionPortugalicia)
        direccionPortugalicia.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/qEDov2neomCVdEDD9")))
        }

        val telefonoPortugalicia = findViewById<TextView>(R.id.telefonoPortugalicia)
        telefonoPortugalicia.setOnClickListener {
            val phone = "tel: +34 676 39 61 41";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoPortugalicia=findViewById<TextView>(R.id.webPortugalicia)
        correoPortugalicia.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("elisardobernardez@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "Estimado Elisardo,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val direccionManu=findViewById<TextView>(R.id.direccionCerveceriaManu)
        direccionManu.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/qgXMWtmjfgpxYuof8")))
        }

        val telefonoManu = findViewById<TextView>(R.id.telefonoCerveceriaManu)
        telefonoManu.setOnClickListener {
            val phone = "tel: +34 981 45 84 67";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoManu=findViewById<TextView>(R.id.emailCerveceriaManu)
        correoManu.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("cerveceriamanu49@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de la cervecería Manu,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val direccionSantaSede=findViewById<TextView>(R.id.direccionSantaSede)
        direccionSantaSede.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/DBzeWYbQivjiYxdU9")))
        }

        val telefonoSantaSede = findViewById<TextView>(R.id.telefonoSantaSede)
        telefonoSantaSede.setOnClickListener {
            val phone = "tel: +34 981 84 92 28";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoSantaSede=findViewById<TextView>(R.id.emailSantaSede)
        correoSantaSede.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("javi-sant@misvides.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "Estimado Javi,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webSantaSede=findViewById<TextView>(R.id.webSantaSede)
        webSantaSede.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asantasede.com/")))
        }


        val direccionRamallosa=findViewById<TextView>(R.id.direccionRamallosa)
        direccionRamallosa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/wjt3iGnNzfoqyAWu7")))
        }

        val telefonoRamallosa = findViewById<TextView>(R.id.telefonoRamallosa)
        telefonoRamallosa.setOnClickListener {
            val phone = "tel: +34 637 56 27 66";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoRamallosa=findViewById<TextView>(R.id.emailRamallosa)
        correoRamallosa.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("ramallosacafeteria@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención Cafetería Ramallosa,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val instagramRamallosa=findViewById<TextView>(R.id.webRamallosa)
        instagramRamallosa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafeteriaramallosa/?hl=es")))
        }





    }
}