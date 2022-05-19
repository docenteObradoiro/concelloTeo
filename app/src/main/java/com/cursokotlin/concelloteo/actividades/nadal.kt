package com.cursokotlin.concelloteo.actividades

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.R

class nadal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nadal)
        val imageButton13 = findViewById<ImageButton>(R.id.imageButton13)
        val imageButton15 = findViewById<ImageButton>(R.id.imageButton15)
        val imageButton17 = findViewById<ImageButton>(R.id.imageButton17)

        imageButton13.setOnClickListener {
            val acceder = Intent(this, concertos::class.java)
            startActivity(acceder)
        }
        imageButton15.setOnClickListener {
            val acceder = Intent(this, obradoiros::class.java)
            startActivity(acceder)
        }
        imageButton17.setOnClickListener {
            val acceder = Intent(this, mercados::class.java)
            startActivity(acceder)

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
}
