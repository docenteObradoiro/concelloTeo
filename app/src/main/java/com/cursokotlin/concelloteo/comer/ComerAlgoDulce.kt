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

class ComerAlgoDulce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_algo_dulce)

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

        /*Amasa Nai*/

        val facebookMasanai = findViewById<TextView>(R.id.webAmasaNai)
        facebookMasanai.setOnClickListener {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/aMasaNai/posts/114976537768451/")))
        }

        val direccionAmasaNai = findViewById<TextView>(R.id.direccionAmasaNai)
        direccionAmasaNai.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Panader%C3%ADa+aMasa...Nai+%7C+pasteler%C3%ADa+cafeter%C3%ADa+%7C+Cacheiras/@42.8231304,-8.5474322,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01ec55815839:0xad874aeab6cbbad1!8m2!3d42.8230946!4d-8.5452649")))
        }

        /*Che2*/

        val telefonoChe2 = findViewById<TextView>(R.id.telefonoChe2)
        telefonoChe2.setOnClickListener {
            val phone = "tel: +34 981806848";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionChe2 = findViewById<TextView>(R.id.direccionChe2)
        direccionChe2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/CHE+2/@42.8322329,-8.5486568,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01be96c60821:0xe821227bdd2af31d!8m2!3d42.832229!4d-8.5464681")))
        }
        val webChe2 = findViewById<TextView>(R.id.webChe2)
        webChe2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://che-2.edan.io/")))
        }
        val emailChe2 = findViewById<TextView>(R.id.emailChe2)
        emailChe2.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("panaderiache@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*O forno Dauri*/

        val telefonoFornoDAuri = findViewById<TextView>(R.id.telefonoFornoDAuri)
        telefonoFornoDAuri.setOnClickListener {
            val phone = "tel: +34 626709347";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionFornoDAuri = findViewById<TextView>(R.id.direccionFornoDAuri)
        direccionFornoDAuri.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/O+Forno+D'Auri/@42.8341423,-8.5463131,15z/data=!4m2!3m1!1s0x0:0xb4243f07f6607f3c?sa=X&ved=2ahUKEwjF-Y7Nv4f5AhXWYPEDHX6OCVkQ_BJ6BAhFEAU")))
        }
        val facebookAuri = findViewById<TextView>(R.id.emailFornoDAuri)
        facebookAuri.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ofornodauri/?__tn__=-UC*F")))
        }

        /*O forno Dam II*/

        val direccionFornoDamii = findViewById<TextView>(R.id.direccionFornoDamii)
        direccionFornoDamii.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/O+Forno+D'am+II/@42.7951507,-8.5483522,15z/data=!4m2!3m1!1s0x0:0x6270138b644c83b4?sa=X&ved=2ahUKEwjn-O6swIf5AhXgQ_EDHaYRB4kQ_BJ6BAg_EAU")))
        }
        val facebookDamii = findViewById<TextView>(R.id.webFornoDamii)
        facebookDamii.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/profile.php?id=100065440451383&ref=py_c&_rdr")))
        }

    }
}