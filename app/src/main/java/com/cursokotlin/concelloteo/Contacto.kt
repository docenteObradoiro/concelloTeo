package com.cursokotlin.concelloteo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Contacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)
        val logoTeo = findViewById<ImageButton>(R.id.logoTeo)

        logoTeo.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)}

        val equis= findViewById<ImageButton>(R.id.salir)
        equis.setOnClickListener {
            finish()
        }



        val texto=findViewById<EditText>(R.id.texto)
        val button=findViewById<Button>(R.id.button)
        val spinner=findViewById<Spinner>(R.id.spinner)
        val lista = arrayOf("Email", "SMS")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, lista)
        spinner.adapter = adaptador1
        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Email" -> {
                    val intent = Intent(Intent.ACTION_SEND)
                    val recipients = arrayOf("turismo@teo.gal")
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients)
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Formulario de contacto aplicación turismo")
                    intent.putExtra(Intent.EXTRA_TEXT, "${texto.text.toString()}")
                    intent.type = "text/html"
                    intent.setPackage("com.google.android.gm")
                    startActivity(Intent.createChooser(intent, "Send mail"))
                }
                "SMS" -> {
                    val sms_uri = Uri.parse("smsto:+34 698 183 421")
                    val sms_intent = Intent(Intent.ACTION_SENDTO, sms_uri)
                    sms_intent.putExtra("sms_body", texto.text.toString())
                    startActivity(sms_intent)
                }
            }
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/42%C2%B047'42.5%22N+8%C2%B032'56.2%22W/@42.7951522,-8.5502763,406m/data=!3m2!1e3!4b1!4m13!1m6!3m5!1s0xd2f013f84d3ac7d:0xc0dba7bec0954fa5!2sAuditorio+Constante+Liste!8m2!3d42.7952793!4d-8.5495341!3m5!1s0x0:0x977416a01df93a6e!7e2!8m2!3d42.7951511!4d-8.5489429?hl=es")))
        }

        val botonTelefono = findViewById<ImageButton>(R.id.botonTelefono)
        botonTelefono.setOnClickListener {
            val phone = "tel: +34 698 183 421";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
    }
}