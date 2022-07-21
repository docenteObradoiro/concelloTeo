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

class ComerVinosTapasRacions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_vinos_tapas_racions)

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



        val accesodireccionBetos = findViewById<TextView>(R.id.direccionBetos)
        accesodireccionBetos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/BETOS/@42.8205878,-8.545074,15z/data=!4m5!3m4!1s0x0:0xfe6605ee64eb5090!8m2!3d42.8205878!4d-8.545074")))
        }

        val telefonoBetos = findViewById<TextView>(R.id.telefonoBetos)
        telefonoBetos.setOnClickListener {
            val phone = "tel: +34 981 80 68 39";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesoBetosWeb = findViewById<TextView>(R.id.webBetos)
        accesoBetosWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/people/cerveceria-betos/100063516612804/")))
        }



        val accesodireccionOviveiroDaPoboa = findViewById<TextView>(R.id.direccionViviero)
        accesodireccionOviveiroDaPoboa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Viveiro+Da+Poboa/@42.8396249,-8.5510627,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01c1c04782e7:0xf9d25819c9fd4fcf!8m2!3d42.8396296!4d-8.548898")))
        }

        val telefonoOviveiroDaPoboa = findViewById<TextView>(R.id.telefonoViviero)
        telefonoOviveiroDaPoboa.setOnClickListener {
            val phone = "tel: + 34 619 67 08 88";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }



        val accesodireccionSauce = findViewById<TextView>(R.id.direccionSauce)
        accesodireccionSauce.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+El+Sauce/@42.8109625,-8.5493174,16.75z/data=!4m5!3m4!1s0xd2f01a2ffd8fe8b:0x9f8e6f2a97bf36fd!8m2!3d42.8104606!4d-8.5450242")))
        }



        val accesodireccionBraulio = findViewById<TextView>(R.id.direccionBraulio)
        accesodireccionBraulio.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Caf%C3%A9+Bar+Braulio/@42.8300039,-8.5999665,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f0241a0c8a04f:0x8078774eb1788c6c!8m2!3d42.8300468!4d-8.5978236")))
        }

        val telefonoBraulio = findViewById<TextView>(R.id.telefonoBraulio)
        telefonoBraulio.setOnClickListener {
            val phone = "tel: +34 615 57 14 67";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesoBraulioWeb = findViewById<TextView>(R.id.webBraulio)
        accesoBraulioWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/BraulioCafeBar/")))

        }




        val accesodireccionRanha = findViewById<TextView>(R.id.direccionRanha)
        accesodireccionRanha.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cafe+Bar+Ra%C3%B1a/@42.8225654,-8.6107057,15z/data=!4m5!3m4!1s0x0:0x4ebd821b8885cd25!8m2!3d42.8225685!4d-8.6107098")))
        }

        val telefonoRanha = findViewById<TextView>(R.id.telefonoRanha)
        telefonoRanha.setOnClickListener {
            val phone = "tel: +34 981 54 88 39";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesodireccionTiaMaria = findViewById<TextView>(R.id.direccionTiaMaria)
        accesodireccionTiaMaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Tia+Maria+Cafe+Bar/@42.8616061,-9.3468973,10z/data=!4m9!1m2!2m1!1stia+maria+!3m5!1s0xd2f0244a11633bb:0xed2652d13b248380!8m2!3d42.8269248!4d-8.6039796!15sCgl0aWEgbWFyaWFaCyIJdGlhIG1hcmlhkgEDYmFy")))
        }

        val telefonoTiaMaria = findViewById<TextView>(R.id.telefonoTiaMaria)
        telefonoTiaMaria.setOnClickListener {
            val phone = "tel: +34 981 54 85 70";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesoTiaMariaWeb = findViewById<TextView>(R.id.webTiaMaria)
        accesoTiaMariaWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Tia-Maria-Cafe-Bar-101292728355575/")))
        }




        val accesodireccionCasaJavier = findViewById<TextView>(R.id.direccionCasaJavier)
        accesodireccionCasaJavier.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Casa+javier/@42.8118082,-8.619785,15z/data=!4m5!3m4!1s0x0:0xa9643d72837b984!8m2!3d42.8118082!4d-8.619785")))
        }

        val telefonoCasaJavier = findViewById<TextView>(R.id.telefonoCasaJavier)
        telefonoCasaJavier.setOnClickListener {
            val phone = "tel: +34 635 53 66 42";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoCasaJavier=findViewById<TextView>(R.id.emailCasaJavier)
        correoCasaJavier.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("vsj2181@yahoo.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante Casa Javier ,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        val accesoCasaJavierWeb = findViewById<TextView>(R.id.webCasaJavier)
        accesoCasaJavierWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/people/Casa-Javier-O-Faramello/100063776103919/")))
        }



        val accesodireccionOrincon = findViewById<TextView>(R.id.direccionORincon)
        accesodireccionOrincon.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/BAR+%22O+RINC%C3%93N%22/@42.802731,-8.6898687,12.25z/data=!4m5!3m4!1s0xd2f03781dbde83d:0x9ae578cf6b5048f1!8m2!3d42.7824425!4d-8.6170669")))
        }

        val telefonoOrincon = findViewById<TextView>(R.id.telefonoORincon)
        telefonoOrincon.setOnClickListener {
            val phone = "tel: +34 981 89 31 19";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoOrincon=findViewById<TextView>(R.id.emailORincon)
        correoOrincon.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("restauranteorincon@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante O Rincon ,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        val accesoOrinconWeb = findViewById<TextView>(R.id.webORincon)
        accesoOrinconWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-la.facebook.com/restauranteorinconlampai")))
        }


        val accesodireccionOpintor = findViewById<TextView>(R.id.direccionOPintor)
        accesodireccionOpintor.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+O+Pintor/@42.7996402,-8.5755872,15z/data=!4m5!3m4!1s0x0:0xd42f74b64204c94e!8m2!3d42.7996313!4d-8.5756483")))
        }

        val telefonoOpintor = findViewById<TextView>(R.id.telefonoOPintor)
        telefonoOpintor.setOnClickListener {
            val phone = "tel: +34 661 00 26 67";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoOpintor=findViewById<TextView>(R.id.emailOPintor)
        correoOpintor.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("pilitabudy@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante O Pintor ,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }



        val accesodireccionAcantina = findViewById<TextView>(R.id.direccionCantina)
        accesodireccionAcantina.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/A+Cantina/@42.8031034,-8.5849923,15z/data=!4m2!3m1!1s0x0:0x2ea3b4b9b36171be?sa=X&ved=2ahUKEwijrdfBpIn5AhUQbRoKHX9sCwkQ_BJ6BAhIEAg")))
        }

        val telefonoAcantina = findViewById<TextView>(R.id.telefonoCantina)
        telefonoAcantina.setOnClickListener {
            val phone = "tel: +34 981 89 31 10";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val accesoAcantinaWeb = findViewById<TextView>(R.id.webCantina)
        accesoAcantinaWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/ACantinaLuou/")))
        }


        val accesodireccionElRincondeKoller = findViewById<TextView>(R.id.direccionElRinconDeKoller)
        accesodireccionElRincondeKoller.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/El+Rinc%C3%B3n+de+Koller/@42.8431977,-8.5395087,15z/data=!4m5!3m4!1s0x0:0x13aa6cc85d3011d6!8m2!3d42.8431977!4d-8.5395087")))
        }

        val telefonoElRincondeKoller = findViewById<TextView>(R.id.telefonoElRinconDeKoller)
        telefonoElRincondeKoller.setOnClickListener {
            val phone = "tel: +34 981 46 13 58";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val correoElRincondeKoller=findViewById<TextView>(R.id.emailElRinconDeKoller)
        correoElRincondeKoller.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("elrincondekoller@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto mediante web turismo Teo")
            intent.putExtra(Intent.EXTRA_TEXT, "A la atención de Restaurante El Rincon de Koller ,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        val accesoElRincondeKollerWeb = findViewById<TextView>(R.id.webElRinconDeKoller)
        accesoElRincondeKollerWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ElRinconDeKoller/")))
        }



        val accesodireccionPiccolo = findViewById<TextView>(R.id.direccionBarPiccolo)
        accesodireccionPiccolo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+Piccolo/@42.8433085,-8.5418196,14.5z/data=!3m1!5s0xd2f01c56be03f65:0x31a43792fbfc51a4!4m5!3m4!1s0xd2f01c55e6c4641:0xdcdb1764df103c13!8m2!3d42.8449642!4d-8.54002")))
        }


        val accesodireccionOpiro = findViewById<TextView>(R.id.direccionPiro)
        accesodireccionOpiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cafe+Bar+O+Piro/@42.7977002,-8.5340049,15z/data=!4m2!3m1!1s0x0:0x77a88df19c1271eb?sa=X&ved=2ahUKEwiusauFrYn5AhXXwYUKHSMwCQoQ_BJ6BAhgEAg")))
        }

        val telefonoOpiro  = findViewById<TextView>(R.id.telefonoPiro)
        telefonoOpiro.setOnClickListener {
            val phone = "tel: +34 981 80 74 88";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesodireccionAcolmena = findViewById<TextView>(R.id.direccionAcolmena)
        accesodireccionAcolmena.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cafe+Bar+A+Colmena+(restaurante)/@42.7621322,-8.5467358,15z/data=!4m2!3m1!1s0x0:0xa0215dc94e4b11a9?sa=X&ved=2ahUKEwibps7mp4n5AhUJ_RoKHUwfBwoQ_BJ6BAhTEAg")))
        }

        val telefonoAcolmena = findViewById<TextView>(R.id.telefonoAcolmena)
        telefonoAcolmena.setOnClickListener {
            val phone = "tel: +34 603 77 14 49";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesoAcolmenaWeb = findViewById<TextView>(R.id.webAcolmena)
        accesoAcolmenaWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/people/CAFE-BAR-A-Colmena/100057175820961/")))
        }


        val accesodireccionAtallo = findViewById<TextView>(R.id.direccionAtallo)
        accesodireccionAtallo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Atallo/@42.7618135,-8.5470372,15z/data=!4m2!3m1!1s0x0:0x70c647bdc6e37277?sa=X&ved=2ahUKEwi1q7PCqIn5AhUN4oUKHZZ3CwYQ_BJ6BAhKEAg")))
        }

        val telefonoAtallo = findViewById<TextView>(R.id.telefonoAtallo)
        telefonoAtallo.setOnClickListener {
            val phone = "tel: +34 630 85 49 09";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val accesodireccionCasaPernas = findViewById<TextView>(R.id.direccionCasaPernas)
        accesodireccionCasaPernas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Casa+Pernas/@42.7617047,-8.5467948,15z/data=!4m5!3m4!1s0x0:0x7ba5aef8eb76280f!8m2!3d42.7617047!4d-8.5467948")))
        }

        val telefonoCasaPernas = findViewById<TextView>(R.id.telefonoCasaPernas)
        telefonoCasaPernas.setOnClickListener {
            val phone = "tel: +34 981 80 92 31";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val accesodireccionOcruce = findViewById<TextView>(R.id.direccionOCruce)
        accesodireccionOcruce.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+O+Cruce/@42.7624761,-8.5468892,15z/data=!4m2!3m1!1s0x0:0x43d76c1315fc9b56?sa=X&ved=2ahUKEwi1w4rmqYn5AhWQhc4BHSmnCQkQ_BJ6BAhKEAg")))
        }

        val telefonoOcruce = findViewById<TextView>(R.id.telefonoOCruce)
        telefonoOcruce.setOnClickListener {
            val phone = "tel: +34 637 27 09 85";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val accesoOcruceWeb = findViewById<TextView>(R.id.weblOCruce)
        accesoOcruceWeb.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/category/Bar/Bar-o-cruce-333356107188515/")))
        }










    }
}