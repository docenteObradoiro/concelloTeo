package com.cursokotlin.concelloteo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OndeDurmir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ondedormir)

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

        /*CACHEIRAS*/

        /* A casiña de Esther*/
        val direccionACasinaDeEsther = findViewById<TextView>(R.id.direccionACasinaDeEsther)
        direccionACasinaDeEsther.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/guM83KY4hf6i5pVU8")))
        }

        val telefonoACasinaDeEsther = findViewById<TextView>(R.id.telefonoACasinaDeEsther)
        telefonoACasinaDeEsther.setOnClickListener {
            val phone = "tel: + 34 647411884";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailACasinaDeEsther = findViewById<TextView>(R.id.emailACasinaDeEsther)
        emailACasinaDeEsther.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@casitadeesther.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webACasinaDeEsther = findViewById<TextView>(R.id.webACasinaDeEsther)
        webACasinaDeEsther.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://casitadeesther.com/")))
        }

        /* Casa Cacheiras*/

        val direccionCasaCacheiras = findViewById<TextView>(R.id.direccionCasaCacheiras)
        direccionCasaCacheiras.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/auRe4b5dHuuG7ijZ8")))
        }

        val telefonoCasaCacheiras = findViewById<TextView>(R.id.telefonoCasaCacheiras)
        telefonoCasaCacheiras.setOnClickListener {
            val phone = "tel: + 34 689004986";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        /*Compostela INN*/

        val direccionCompostelaInn = findViewById<TextView>(R.id.direccionCompostelaINN)
        direccionCompostelaInn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/51ZmFTMdNofKmfTg9")))
        }

        val telefonoCompostelaInn = findViewById<TextView>(R.id.telefonoCompostelaINN)
        telefonoCompostelaInn.setOnClickListener {
            val phone = "tel: + 34 981819124";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val telefonoCompostelaInn1 = findViewById<TextView>(R.id.telefono2CompostelaINN)
        telefonoCompostelaInn1.setOnClickListener {
            val phone = "tel: + 34 981819080";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailCompostelaInn = findViewById<TextView>(R.id.emailCompostelaINN)
        emailCompostelaInn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf(" info@compostelainn.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webCompostelaInn = findViewById<TextView>(R.id.webCompostelaINN)
        webCompostelaInn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse( "http://www.compostelainn.com/")))
        }

        /*Hotel Congreso*/


        val direccionHotelCongreso = findViewById<TextView>(R.id.direccionHotelCongreso)
        direccionHotelCongreso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/pg19Jb6sirqcGVfa7")))
        }

        val telefonoHotelCongreso = findViewById<TextView>(R.id.telefonoHotelCongreso)
        telefonoHotelCongreso.setOnClickListener {
            val phone = "tel: + 34 981819080";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val emailHotelCongreso = findViewById<TextView>(R.id.emailHotelCongreso)
        emailHotelCongreso.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf(" hcongreso@hotelcongreso.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        val webHotelCongreso = findViewById<TextView>(R.id.webHotelCongreso)
        webHotelCongreso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelcongreso.com")))

        }

        /*Villa Salgueiros*/


        val direccionVillaSalgueiros = findViewById<TextView>(R.id.direccionVillaSalgueiros)
        direccionVillaSalgueiros.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/c1CcdEK14KpQmc5cA")))
        }

        val telefonoVillaSalgueiros= findViewById<TextView>(R.id.telefonoVillaSalgueiros)
        telefonoVillaSalgueiros.setOnClickListener {
            val phone = "tel: + 34 616926698";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);

        }
        val emailVillaSalgueiros = findViewById<TextView>(R.id.emailVillaSalgueiros)
        emailVillaSalgueiros.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf(" http://www.greenspainholidays.com/")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


        /*LUCÍ*/

        /*Maria Castaña*/

        val direccionMariaCastaña = findViewById<TextView>(R.id.direccionmariaCastaña)
        direccionMariaCastaña.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/p8QWgLVHTKJf63BeA")))
        }

        val telefonoMariaCastaña = findViewById<TextView>(R.id.telefonomariaCastaña)
        telefonoMariaCastaña.setOnClickListener {
            val phone = "tel: + 34 981809628";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val telefonoMariacastaña1 = findViewById<TextView>(R.id.telefono2mariaCastaña)
        telefonoMariacastaña1.setOnClickListener {
            val phone = "tel: + 34 981803943";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        val webMariaCastaña = findViewById<TextView>(R.id.webmariaCastaña)
        webMariaCastaña.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse( "http://mariacastanha.com/")))
        }


        /*LUOU*/

        /* A Gandarela*/

        val direccionAGandarela = findViewById<TextView>(R.id.direccionaGandarela)
        direccionAGandarela.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/wCyiUKcZCdGqmBtt9")))
        }

        val telefonoAGandarela = findViewById<TextView>(R.id.telefonoaGandarela)
        telefonoAGandarela.setOnClickListener {
            val phone = "tel: + 34 981805868";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailAGandarela = findViewById<TextView>(R.id.emailaGandarela)
        emailAGandarela.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("  agrodagandarela@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webAGandarela = findViewById<TextView>(R.id.webaGandarela)
        webAGandarela.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse( "http://www.agrodagandarela.com/contacto")))
        }


        /* Motel Venus*/

        val direccionMotelvenus = findViewById<TextView>(R.id.direccionmotel)
        direccionMotelvenus.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/sQoMR7tdCZRaQzS5A")))
        }

        val telefonoMotelVenus = findViewById<TextView>(R.id.telefonomotel)
        telefonoMotelVenus.setOnClickListener {
            val phone = "tel: + 34  981800205";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailMotelvenus = findViewById<TextView>(R.id.emailmotel)
        emailMotelvenus.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("  recepcionsantiago@motel-venus.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webMotelvenus = findViewById<TextView>(R.id.webmotel)
        webMotelvenus.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.motelvenussantiago.com/")))
        }


        /* OS TILOS*/

        /* City House Los Tilos*/

        val direccionCityHouse = findViewById<TextView>(R.id.direccioncityHouse)
        direccionCityHouse.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/WzcJQSxFCVnyEDDKA")))
        }

        val telefonoCityHouse = findViewById<TextView>(R.id.telefonocityHouse)
        telefonoCityHouse.setOnClickListener {
            val phone = "tel: + 34  981819200";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailCityHouse = findViewById<TextView>(R.id.emailcityHouse)
        emailCityHouse.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("   reservas.tilos@farandahotels.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webCityHouse = findViewById<TextView>(R.id.webcityHouse)
        webCityHouse.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.hoteltilos.com/")))
        }



        /*RARIS*/

        /* A Casa de Blanco*/
        val direccionCasaBlanco = findViewById<TextView>(R.id.direccionCasaDeBlanco)
        direccionCasaBlanco.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://g.page/acasadeblanco1?share")))
        }

        val telefonoCasaBlanco = findViewById<TextView>(R.id.telefonoCasaDeBlanco)
        telefonoCasaBlanco.setOnClickListener {
            val phone = "tel: + 34 666523707";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }



        /* Casa Manola*/
        val direccionCasaManola = findViewById<TextView>(R.id.direccioncasaManola)
        direccionCasaManola.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/7v4LBBVPzH2Vd8kM6")))
        }

        val telefonoCasaManola = findViewById<TextView>(R.id.telefonocasaManola)
        telefonoCasaManola.setOnClickListener {
            val phone = "tel:+ 34 981809374";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val telefonoCasaManola1 = findViewById<TextView>(R.id.telefono2casaManola)
        telefonoCasaManola1.setOnClickListener {
            val phone = "tel:  + 34 669789153";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailCasaManola = findViewById<TextView>(R.id.emailcasaManola)
        emailCasaManola.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf(" info@casamanola.gal")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webCasaManola = findViewById<TextView>(R.id.webcasaManola)
        webCasaManola.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.casamanola.gal/")))
        }

    }
}