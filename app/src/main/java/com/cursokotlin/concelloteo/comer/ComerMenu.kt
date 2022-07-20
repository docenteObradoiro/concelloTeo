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

class ComerMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_menu)

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

        val direccionCanaletto=findViewById<TextView>(R.id.direccionBarCanaletto)
        direccionCanaletto.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/cZ7W5m1oWh4AP1bS8")))
        }

        val telefonoCanaletto = findViewById<TextView>(R.id.telefonoBarCanaletto)
        telefonoCanaletto.setOnClickListener {
            val phone = "tel: +34 981 80 68 34";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoCanaletto=findViewById<TextView>(R.id.emailBarCanaletto)
        correoCanaletto.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("lcastineirascampos@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Canaletto,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webCanaletto=findViewById<TextView>(R.id.webBarCanaletto)
        webCanaletto.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://canaletto.es")))
        }


        val direccionNovoVinedo=findViewById<TextView>(R.id.direccionNovoVinedo)
        direccionNovoVinedo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Z4dQiwFb2rhJ2xLc6")))
        }

        val telefonoNovoVinedo = findViewById<TextView>(R.id.telefonoNovoVinedo)
        telefonoNovoVinedo.setOnClickListener {
            val phone = "tel: +34 697 47 28 14";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoNovoVinedo=findViewById<TextView>(R.id.emailNovoVinedo)
        correoNovoVinedo.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("novovinedo@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Novo Viñedo,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webNovoVinedo=findViewById<TextView>(R.id.webNovoVinedo)
        webNovoVinedo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://o-novo-vinedo.negocio.site/")))
        }


        val direccionVeiga=findViewById<TextView>(R.id.direccionAVeiga)
        direccionVeiga.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://g.page/asador-vinoteca-a-veiga?share")))
        }

        val telefonoVeiga = findViewById<TextView>(R.id.telefonoAVeiga)
        telefonoVeiga.setOnClickListener {
            val phone = "tel: +34 981 80 01 40";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val direccionPortico=findViewById<TextView>(R.id.direccionPortico)
        direccionPortico.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/hQvzKNMam9NzUFQZ8")))
        }

        val telefonoPortico = findViewById<TextView>(R.id.telefonoPortico)
        telefonoPortico.setOnClickListener {
            val phone = "tel: +34 981 80 74 97";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoPortico=findViewById<TextView>(R.id.emailPortico)
        correoPortico.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("restaurante@restauranteportico.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Pórtico,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webPortico=findViewById<TextView>(R.id.webPortico)
        webPortico.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restauranteportico.es")))
        }

        val direccionMarAdentro=findViewById<TextView>(R.id.direccionMaradentro)
        direccionMarAdentro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/zR4Fv1LxGS3a6kBLA")))
        }

        val telefonoMarAdentro = findViewById<TextView>(R.id.telefonoMaradentro)
        telefonoMarAdentro.setOnClickListener {
            val phone = "tel: +34 981 80 14 47";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoMarAdentro=findViewById<TextView>(R.id.emailMaradentro)
        correoMarAdentro.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("genarosantamarinas@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Maradentro,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val direccionParadaFrancos=findViewById<TextView>(R.id.direccionParadaDeFrancos)
        direccionParadaFrancos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/aRX4fe1YLnt5RpbJA")))
        }

       val telefonoParadaFrancos = findViewById<TextView>(R.id.telefonoParadaDeFrancos)
        telefonoParadaFrancos.setOnClickListener {
            val phone = "tel: +34 981 53 80 04";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoParadaFrancos=findViewById<TextView>(R.id.emailParadaDeFrancos)
        correoParadaFrancos.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("reservas@paradadefrancos.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Parada de Francos,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webParadaFrancos=findViewById<TextView>(R.id.webParadaDeFrancos)
        webParadaFrancos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paradadefrancos.com")))
        }

        val direccionLaPausa=findViewById<TextView>(R.id.direccionLaPausa)
        direccionLaPausa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://g.page/la-pausa-as-compostela?share")))
        }

        val telefonoLaPausa = findViewById<TextView>(R.id.telefonoLaPausa)
        telefonoLaPausa.setOnClickListener {
            val phone = "tel: +34 981 80 55 14";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoLaPausa=findViewById<TextView>(R.id.emailLaPausa)
        correoLaPausa.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("vitaygus@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de La Pausa,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val direccionRincon=findViewById<TextView>(R.id.direccionORincon)
        direccionRincon.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/7u3U2xgXZJgVhQbF7")))
        }

        val telefonoRincon = findViewById<TextView>(R.id.telefonoORincon)
        telefonoRincon.setOnClickListener {
            val phone = "tel: +34 981 89 31 19";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoRincon=findViewById<TextView>(R.id.emailORincon)
        correoRincon.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("restauranteorincon@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante O Rincón,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webRincon=findViewById<TextView>(R.id.webORincon)
        webRincon.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/restauranteorinconlampai/")))
        }

        val direccionASenra=findViewById<TextView>(R.id.direccionAsenra)
        direccionASenra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://g.page/asenracafe?share")))
        }

        val telefonoASenra = findViewById<TextView>(R.id.telefonoAsenra)
        telefonoASenra.setOnClickListener {
            val phone = "tel: +34 981 81 57 44";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoASenra=findViewById<TextView>(R.id.emailAsenra)
        correoASenra.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("asenracafe@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de A Senra,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webASenra=findViewById<TextView>(R.id.webAsenra)
        webASenra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/asenracafe/")))
        }

    }
}