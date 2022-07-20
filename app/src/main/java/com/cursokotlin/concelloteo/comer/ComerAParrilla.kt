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

class ComerAParrilla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_a_parrilla)

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


        val direccionBrasa=findViewById<TextView>(R.id.direccionAbrasa)
        direccionBrasa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/1dCngV8b7YumPMd66")))
        }

        val telefonoBrasa = findViewById<TextView>(R.id.telefonoAbrasa)
        telefonoBrasa.setOnClickListener {
            val phone = "tel: +34 981 80 68 80";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoBrasa=findViewById<TextView>(R.id.emailAbrasa)
        correoBrasa.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("abrasacacheiras@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención A Brasa,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webBrasa=findViewById<TextView>(R.id.webAbrasa)
        webBrasa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restauranteabrasa.com/web/index.asp")))
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



        val direccionSanMartinho=findViewById<TextView>(R.id.direccionRestSanMartinho)
        direccionSanMartinho.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/hQvzKNMam9NzUFQZ8")))
        }

        val telefonoSanMartinho = findViewById<TextView>(R.id.telefonorRestauranteSanMartinho)
        telefonoSanMartinho.setOnClickListener {
            val phone = "tel: +34 981 54 84 63";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoSanMartinho=findViewById<TextView>(R.id.emailRestauranteSanMartinho)
        correoSanMartinho.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("sanmartino.teo@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante San Martiño,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webSanMartinho=findViewById<TextView>(R.id.webRestauranteSanMartinho)
        webSanMartinho.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restaurantesanmartino.es")))
        }

        val direccionCarmelo=findViewById<TextView>(R.id.direccionAsadorOCarmelo)
        direccionCarmelo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/xzJeedq7dtV4AsbE9")))
        }

        val telefonoCarmelo = findViewById<TextView>(R.id.telefonoAsadorOCarmelo)
        telefonoCarmelo.setOnClickListener {
            val phone = "tel: +34 981 53 90 45";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val webCarmelo=findViewById<TextView>(R.id.webAsadorOCarmelo)
        webCarmelo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asadorocarmelo.es")))
        }


        val direccionAsBrasas=findViewById<TextView>(R.id.direccionAsBrasas)
        direccionAsBrasas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/JiQQcArVobQULiRH8")))
        }

        val telefonoAsBrasas = findViewById<TextView>(R.id.telefonoAsBrasas)
        telefonoAsBrasas.setOnClickListener {
            val phone = "tel: +34 981 53 15 36";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoAsBrasas=findViewById<TextView>(R.id.emailAsBrasas)
        correoAsBrasas.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("asbrasparrillada@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Parrillada As Brasas,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webAsBrasas=findViewById<TextView>(R.id.webAsBrasas)
        webAsBrasas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/parrilladaasbrasas.teo")))
        }

        val direccionBustelo=findViewById<TextView>(R.id.direccionBarBustelo)
        direccionBustelo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/JiQQcArVobQULiRH8")))
        }

        val telefonoBustelo = findViewById<TextView>(R.id.telefonoBarBustelo)
        telefonoBustelo.setOnClickListener {
            val phone = "tel: +34 981 54 82 79";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val telefonoBustelo2 = findViewById<TextView>(R.id.telefono2BarBustelo)
        telefonoBustelo2.setOnClickListener {
            val phone = "tel: +34 616 22 17 15";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val direccionChaves=findViewById<TextView>(R.id.direccionParrilladaChaves)
        direccionChaves.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/itCyJVJHgDcq7qAw7")))
        }

        val telefonoChaves = findViewById<TextView>(R.id.telefonoParrilladaChaves)
        telefonoChaves.setOnClickListener {
            val phone = "tel: +34 981 80 55 45";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoChaves=findViewById<TextView>(R.id.emailParrilladaChaves)
        correoChaves.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("parrilladachaves@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Parrillada Chaves,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webChaves=findViewById<TextView>(R.id.webParrilladaChaves)
        webChaves.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/pg/parrilladachavesluou/posts/")))
        }

        val direccionFogarSantiso=findViewById<TextView>(R.id.direccionFogarDoSantiso)
        direccionFogarSantiso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/itCyJVJHgDcq7qAw7")))
        }

        val telefonoFogarSantiso = findViewById<TextView>(R.id.telefonoFogarDoSantiso)
        telefonoFogarSantiso.setOnClickListener {
            val phone = "tel: +34 981 80 59 48";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoFogarSantiso=findViewById<TextView>(R.id.emailFogarDoSantiso)
        correoFogarSantiso.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("fogar@fogardosantiso.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Fogar do Santiso,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webFogarSantiso=findViewById<TextView>(R.id.webFogarDoSantiso)
        webFogarSantiso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://fogardosantiso.es")))
        }

        val direccionAtallo=findViewById<TextView>(R.id.direccionAtallo)
        direccionAtallo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/EgjW3eqZERF6viVf6")))
        }

        val telefonoAtallo = findViewById<TextView>(R.id.telefonoAtallo)
        telefonoAtallo.setOnClickListener {
            val phone = "tel: +34 630 85 49 09";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val direccionLaGranja=findViewById<TextView>(R.id.direccionLaGranja)
        direccionLaGranja.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/oBHsMtoVE8vsvjZT8")))
        }

        val telefonoLaGranja = findViewById<TextView>(R.id.telefonoLaGranja)
        telefonoLaGranja.setOnClickListener {
            val phone = "tel: +34 981 80 94 89";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

    }
}