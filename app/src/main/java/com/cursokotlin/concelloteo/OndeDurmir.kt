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


        /* Calo */

        /* Albergue Faramello */

        val direccionAlbergueFaramello = findViewById<TextView>(R.id.direccionAlbergueFaramello)
        direccionAlbergueFaramello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/tiocicaG1WExUrmJA")))
        }

        val telefonoAlbergueFaramello = findViewById<TextView>(R.id.telefonoAlbergueFaramello)
        telefonoAlbergueFaramello.setOnClickListener {
            val phone = "tel: + 34 636323569";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val webAlbergueFaramello = findViewById<TextView>(R.id.webAlbergueFaramello)
        webAlbergueFaramello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.caminodesantiago.gal")))
        }

        /* As Brasas */

        val direccionAsBrasas = findViewById<TextView>(R.id.direccionAsBrasas)
        direccionAsBrasas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/SftWrsfAqLxDj4ud7")))
        }

        val telefonoAsBrasas = findViewById<TextView>(R.id.telefonoAsBrasas)
        telefonoAsBrasas.setOnClickListener {
            val phone = "tel: + 34 981531536";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailAsBrasas = findViewById<TextView>(R.id.emailAsBrasas)
        emailAsBrasas.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("asbrasasparrillada@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webAsBrasas = findViewById<TextView>(R.id.webAsBrasas)
        webAsBrasas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/parrilladaasbrasas.teo")))
        }

        /* Casa Carolina */

        val direccionCasaCarolina = findViewById<TextView>(R.id.direccionCasaCarolina)
        direccionCasaCarolina.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/kHqdZokPsbyWneBd9")))
        }

        val telefonoCasaCarolina = findViewById<TextView>(R.id.telefonoCasaCarolina)
        telefonoCasaCarolina.setOnClickListener {
            val phone = "tel: + 34 981800205";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        /* Casa Grande Cornide */

        val direccionCasaGrandeCornide = findViewById<TextView>(R.id.direccioncasaGrandeCornide)
        direccionCasaGrandeCornide.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/2XVnn8wib4ZrCwqC8")))
        }

        val telefonoCasaGrandeCornide = findViewById<TextView>(R.id.telefonocasaGrandeCornide)
        telefonoCasaGrandeCornide.setOnClickListener {
            val phone = "tel: + 34 981893044";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val telefono2CasaGrandeCornide = findViewById<TextView>(R.id.telefono2casaGrandeCornide)
        telefono2CasaGrandeCornide.setOnClickListener {
            val phone = "tel: + 34 981964248";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailCasaGrandeCornide = findViewById<TextView>(R.id.emailcasaGrandeCornide)
        emailCasaGrandeCornide.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("casagrandedecornide@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webCasaGrandeCornide = findViewById<TextView>(R.id.webcasaGrandeCornide)
        webCasaGrandeCornide.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.casagrandedecornide.es")))
        }

        /* La calabaza del peregrino */

        val direccionCalabaza = findViewById<TextView>(R.id.direccionCalabaza)
        direccionCalabaza.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/drMoLn5NY5JkXwP26")))
        }

        val telefonoCalabaza = findViewById<TextView>(R.id.telefonoCalabaza)
        telefonoCalabaza.setOnClickListener {
            val phone = "tel: + 34 981194244";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailCalabaza = findViewById<TextView>(R.id.emailCalabaza)
        emailCalabaza.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("alberguecalabazaperegrino@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webCalabaza = findViewById<TextView>(R.id.webCalabaza)
        webCalabaza.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alberguescaminosantiago.com/camino-portugues/albergues/albergue-la-calabaza-del-peregrino-o-faramello-la-coruna/")))
        }

        /* Miladoiro Bella Boutique */

        val direccionmilladoiro = findViewById<TextView>(R.id.direccionmilladoiro)
        direccionmilladoiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/+3+Traves%C3%ADa+de+Reborido+Portal+II+2%C2%BAD,+15895+Teo,+Espa%C3%B1a/@42.8394293,-8.5822952,21z")))
        }

        /* Parada de Francos */

        val direccionParadaDeFrancos = findViewById<TextView>(R.id.direccionParadaDeFrancos)
        direccionParadaDeFrancos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/PxePZvmS5Tc1MBxj6")))
        }

        val telefonoParadaDeFrancos = findViewById<TextView>(R.id.telefonoParadaDeFrancos)
        telefonoParadaDeFrancos.setOnClickListener {
            val phone = "tel: + 34 981538004";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailParadaDeFrancos = findViewById<TextView>(R.id.emailParadaDeFrancos)
        emailParadaDeFrancos.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("reservas@paradadefrancos.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webParadaDeFrancos = findViewById<TextView>(R.id.webParadaDeFrancos)
        webParadaDeFrancos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.paradadefrancos.com")))
        }

        /* Pazo de Adrán */

        val direccionPazoDeAdran = findViewById<TextView>(R.id.direccionpazoDeAdran)
        direccionPazoDeAdran.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/WMajMfsk1HyNaTGz5")))
        }

        val telefonoPazoDeAdran = findViewById<TextView>(R.id.telefonopazoDeAdran)
        telefonoPazoDeAdran.setOnClickListener {
            val phone = "tel: + 34 981570000";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val telefono2PazoDeAdran = findViewById<TextView>(R.id.telefono2pazoDeAdran)
        telefono2PazoDeAdran.setOnClickListener {
            val phone = "tel: + 34 620906602";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailPazoDeAdran = findViewById<TextView>(R.id.emailPazoDeAdran)
        emailPazoDeAdran.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@pazodeadran.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webPazoDeAdran = findViewById<TextView>(R.id.webPazoDeAdran)
        webPazoDeAdran.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://pazodeadran.com/")))
        }

        /* Restaurante San Martiño */

        val direccionRestSanMartinho = findViewById<TextView>(R.id.direccionRestSanMartinho)
        direccionRestSanMartinho.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://g.page/restaurante-sanmartino?share")))
        }

        val telefonorRestauranteSanMartinho = findViewById<TextView>(R.id.telefonorRestauranteSanMartinho)
        telefonorRestauranteSanMartinho.setOnClickListener {
            val phone = "tel: + 34 981548463";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailRestauranteSanMartinho = findViewById<TextView>(R.id.emailRestauranteSanMartinho)
        emailRestauranteSanMartinho.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("sanmartino.teo@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webRestauranteSanMartinho = findViewById<TextView>(R.id.webRestauranteSanMartinho)
        webRestauranteSanMartinho.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.restaurantesanmartino.es/")))
        }

        /* Villa Jubells */

        val direccionVillaJubells = findViewById<TextView>(R.id.direccionVillaJubells)
        direccionVillaJubells.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Geo7xUWSae9n7BPCA")))
        }

        val telefonoVillaJubells = findViewById<TextView>(R.id.telefonoVillaJubells)
        telefonoVillaJubells.setOnClickListener {
            val phone = "tel: + 34 609560104";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        /* REIS */

        val direccionaalbeitaria = findViewById<TextView>(R.id.direccionaalbeitaria)
        direccionaalbeitaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/aVBKbmgWLT4e9epU9")))
        }

        val telefonoaalbeitaria = findViewById<TextView>(R.id.telefonoaalbeitaria)
        telefonoaalbeitaria.setOnClickListener {
            val phone = "tel: + 34 981809241";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailaalbeitaria = findViewById<TextView>(R.id.emailaalbeitaria)
        emailaalbeitaria.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@albeitaria.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webaalbeitaria = findViewById<TextView>(R.id.webaalbeitaria)
        webaalbeitaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://albeitaria.com")))
        }


        val direccionbuelinaDaCarballeira = findViewById<TextView>(R.id.direccionbueliñaDaCarballeira)
        direccionbuelinaDaCarballeira.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Z7CAHqtagz9hkEW18")))
        }

        val direccionMoradasNoUlla = findViewById<TextView>(R.id.direccionMoradasNoUlla)
        direccionMoradasNoUlla.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/FShbpzA6C3WNToNJ7")))
        }

        val telefonoMoradasNoUlla = findViewById<TextView>(R.id.telefonoMoradasNoUlla)
        telefonoMoradasNoUlla.setOnClickListener {
            val phone = "tel: + 34 652957783";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val emailMoradasNoUlla = findViewById<TextView>(R.id.emailMoradasNoUlla)
        emailMoradasNoUlla.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("reservas@moradasnoulla.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        val webMoradasNoUlla = findViewById<TextView>(R.id.webMoradasNoUlla)
        webMoradasNoUlla.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.moradasnoulla.com/es")))
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