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

class ComerTradicionalGalega : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_tradicional_galega)

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



        val accesodireccioncasaTortillas = findViewById<TextView>(R.id.direccionLacasadelastortillas)
             accesodireccioncasaTortillas.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https:www.google.com/maps/place/Restaurante+Armando+Blanco+-+La+casa+de+las+tortillas/@42.821219,-8.5448615,15z/data=!4m5!3m4!1s0x0:0x149975d6a0a3837a!8m2!3d42.8212314!4d-8.5449132")))
            }

        val telefonoCasaTortillas = findViewById<TextView>(R.id.telefonoLacasadelastortillas)
        telefonoCasaTortillas.setOnClickListener {
            val phone = "tel: +34 981 80 71 28";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }



        val accesodireccionbarCanaleto = findViewById<TextView>(R.id.direccionBarCanaletto)
        accesodireccionbarCanaleto.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Restaurante+Canaletto/@42.8270988,-8.5458002,15z/data=!4m5!3m4!1s0x0:0xbc9ded23a3657796!8m2!3d42.8270886!4d-8.5458533")))
        }

        val telefonobarCanaletto = findViewById<TextView>(R.id.telefonoBarCanaletto)
        telefonobarCanaletto.setOnClickListener {
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


        val accesocanalettoWeb = findViewById<TextView>(R.id.webBarCanaletto)
        accesocanalettoWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.canaletto.es/")))
        }



        val accesodireccionPortico = findViewById<TextView>(R.id.direccionPortico)
        accesodireccionPortico.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Restaurante+P%C3%B3rtico+(Teo)/@42.8194444,-8.545,15z/data=!4m5!3m4!1s0x0:0xfaada7b9fe397422!8m2!3d42.8194442!4d-8.5450242")))
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
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Portico,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        val accesoporticoWeb = findViewById<TextView>(R.id.webPortico)
        accesoporticoWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restauranteportico.es/")))
        }



        val accesodireccionpeteiroseEspinhas = findViewById<TextView>(R.id.direccionPeteirosEspinas)
        accesodireccionpeteiroseEspinhas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Tr.%C2%AA+de+Cacheiras,+145,+15883+Teo,+La+Coru%C3%B1a/@42.8096654,-8.5447432,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f010dd538a859:0x304b4393bdcfbfaa!8m2!3d42.8096654!4d-8.5447432")))
        }

        val telefonopeteiroseEspinhas = findViewById<TextView>(R.id.telefonoPeteirosEspinas)
        telefonopeteiroseEspinhas.setOnClickListener {
            val phone = "tel: +34 981 80 65 73";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val correopeteiroseEspinhas=findViewById<TextView>(R.id.emailPortico)
        correopeteiroseEspinhas.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("peteiro.restaurante@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Peteiro,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        val accesopeteiroseEspinhasWeb = findViewById<TextView>(R.id.webPeteirosEspinas)
        accesopeteiroseEspinhasWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://xn--peteirosespias-1nb.es/")))
        }




        val accesodireccioncasaTouceda = findViewById<TextView>(R.id.direccionCasaTouceda)
        accesodireccioncasaTouceda.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Casa+Touceda/@42.8147839,-8.6175894,15z/data=!4m5!3m4!1s0x0:0x6ebefc6488699130!8m2!3d42.8147641!4d-8.6175382")))
        }

        val telefonocasaTouceda = findViewById<TextView>(R.id.telefonoCasaTouceda)
        telefonocasaTouceda.setOnClickListener {
            val phone = "tel: +34 981 54 83 26";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesocasaToucedaWeb = findViewById<TextView>(R.id.webCasaTouceda)
        accesocasaToucedaWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CasaTouceda/timeline")))
        }



        val accesodireccionciertoBlanco = findViewById<TextView>(R.id.direccionCiertoBlanco)
        accesodireccionciertoBlanco.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Restaurante+Cierto+Blanco/@42.8256183,-8.6060805,15z/data=!4m5!3m4!1s0x0:0xc6bc5c2b62d37747!8m2!3d42.825611!4d-8.6060531")))
        }

        val telefonociertoBlanco = findViewById<TextView>(R.id.telefonoCiertoBlanco)
        telefonociertoBlanco.setOnClickListener {
            val phone = "tel: +34 981 54 83 26";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val telefonociertoBlanco2 = findViewById<TextView>(R.id.telefono2CiertoBlanco)
        telefonociertoBlanco2.setOnClickListener {
            val phone = "tel: +34 619 11 02 32";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correociertoBlanco=findViewById<TextView>(R.id.emailCiertoBlanco)
        correociertoBlanco.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@ciertoblanco.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Cierto Blanco,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        val accesociertoBlancoWeb = findViewById<TextView>(R.id.webCiertoBlanco)
        accesociertoBlancoWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://ciertoblanco.com/")))
        }




        val accesodireccionfogarDoSantiso = findViewById<TextView>(R.id.direccionFogarDoSantiso)
        accesodireccionfogarDoSantiso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Fogar+Do+Santiso/@42.7973289,-8.5931244,15z/data=!4m5!3m4!1s0x0:0x3e3b18c8da46ee48!8m2!3d42.7973289!4d-8.5843697")))
        }

        val telefonofogarDoSantiso = findViewById<TextView>(R.id.telefonoFogarDoSantiso)
        telefonofogarDoSantiso.setOnClickListener {
            val phone = "tel: +34 981 80 59 48";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correofogarDoSantiso=findViewById<TextView>(R.id.emailFogarDoSantiso)
        correofogarDoSantiso.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("fogar@fogardosantiso.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Fogar do Santiso,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }



        val accesofogarDoSantisoWeb = findViewById<TextView>(R.id.webFogarDoSantiso)
        accesofogarDoSantisoWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://fogardosantiso.es/fogar-do-santiso-teo/")))
        }



        val accesodireccionOsonDoMinho = findViewById<TextView>(R.id.direccionOSonDoMino)
        accesodireccionOsonDoMinho.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Restaurante+O+son+do+Mi%C3%B1o/@42.8006122,-8.5240436,15z/data=!4m5!3m4!1s0x0:0x9a8c42de677947da!8m2!3d42.8006083!4d-8.5240444")))
        }

        val telefonoOsondominho = findViewById<TextView>(R.id.telefonoOSonDoMino)
        telefonoOsondominho.setOnClickListener {
            val phone = "tel: +34 981 80 76 71";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoOsonDoMinho=findViewById<TextView>(R.id.emailOSonDoMino)
        correoOsonDoMinho.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@osondominho.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante O son do Miño ,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }



        val accesoOsonDoMinhoWeb = findViewById<TextView>(R.id.webOSonDoMino)
        accesoOsonDoMinhoWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.osondominho.com/")))
        }


    }


}
