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

class ComerPulperia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_pulperia)

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


        val direccionDMaria = findViewById<TextView>(R.id.direccionDMaria)
        direccionDMaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/rTtwghwVpy9XuCia8")))
        }

        val telefonoDMaria = findViewById<TextView>(R.id.telefonoDMaria)
        telefonoDMaria.setOnClickListener {
            val phone = "tel: + 34 981800103";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val telefono2DMaria = findViewById<TextView>(R.id.telefono2DMaria)
        telefono2DMaria.setOnClickListener {
            val phone = "tel: + 34 609166523";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val webDMaria = findViewById<TextView>(R.id.webDMaria)
        webDMaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://pulperiadmaria.wixsite.com/pulperiadmaria")))
        }

    }
}