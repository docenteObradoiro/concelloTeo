package com.cursokotlin.concelloteo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OndeCelebrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_celebrar)

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

        /*Los Robles*/

        val telefonoRobles = findViewById<TextView>(R.id.telefonoRobles)
        telefonoRobles.setOnClickListener {
            val phone = "tel: +34 981806361";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionRobles = findViewById<TextView>(R.id.direccionRobles)
        direccionRobles.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Los+Robles+-+Bodas+en+Santiago/@42.8306851,-8.5476438,15z/data=!4m2!3m1!1s0x0:0xf1a5f51aab5b3573?sa=X&ved=2ahUKEwj-jpCTwof5AhUOVhoKHUFxBYYQ_BJ6BAhqEAU")
                )
            )
        }
        val webRestauranteRobles = findViewById<TextView>(R.id.webRestauranteRobles)
        webRestauranteRobles.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://losroblesdesantiago.com/")))
        }
        val emailRobles = findViewById<TextView>(R.id.emailRobles)
        emailRobles.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("losrobles@losroblesdesantiago.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Hotel Congreso*/

        val telefonoHotelCongreso = findViewById<TextView>(R.id.telefonoHotelCongreso)
        telefonoHotelCongreso.setOnClickListener {
            val phone = "tel: +34 981819080";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionHotelCongreso = findViewById<TextView>(R.id.direccionHotelCongreso)
        direccionHotelCongreso.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Hotel+SPA+Congreso/@42.8360822,-8.5465261,15z/data=!4m2!3m1!1s0x0:0x545ac11eafac67ed?sa=X&ved=2ahUKEwj1ydjmwof5AhUNRPEDHVYDBG4Q_BJ6BAhhEAU")
                )
            )
        }
        val webHotelCongreso = findViewById<TextView>(R.id.webHotelCongreso)
        webHotelCongreso.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://hotelcongreso.com/")))
        }
        val emailHotelCongreso = findViewById<TextView>(R.id.emailHotelCongreso)
        emailHotelCongreso.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("congreso@hotelcongreso.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Casa Grande de Cornide*/

        val telefonoCasaGrandeCornide = findViewById<TextView>(R.id.telefonoCasaGrandeCornide)
        telefonoCasaGrandeCornide.setOnClickListener {
            val phone = "tel: +34 981893044";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val telefono2CasaGrandeCornide = findViewById<TextView>(R.id.telefono2CasaGrandeCornide)
        telefono2CasaGrandeCornide.setOnClickListener {
            val phone = "tel: +34 981964248";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionCasaGrandeCornide = findViewById<TextView>(R.id.direccionCasaGrandeCornide)
        direccionCasaGrandeCornide.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Casa+Grande+de+Cornide/@42.8055105,-8.6038717,15z/data=!4m2!3m1!1s0x0:0x45d453f0403b7c84?sa=X&ved=2ahUKEwjl-uWYw4f5AhVOX_EDHcXwAlkQ_BJ6BAhwEAU")
                )
            )
        }
        val webCasaGrandeCornide = findViewById<TextView>(R.id.webCasaGrandeCornide)
        webCasaGrandeCornide.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://casagrandedecornide.es/")))
        }
        val emailCasaGrandeCornide = findViewById<TextView>(R.id.emailCasaGrandeCornide)
        emailCasaGrandeCornide.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("casagrandedecornide@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Pazo de Adrán*/

        val telefonoPazoDeAdran = findViewById<TextView>(R.id.telefonoPazoDeAdran)
        telefonoPazoDeAdran.setOnClickListener {
            val phone = "tel: +34 981570000";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionPazoDeAdran = findViewById<TextView>(R.id.direccionPazoDeAdran)
        direccionPazoDeAdran.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Pazo+de+Adr%C3%A1n/@42.8319321,-8.5851151,15z/data=!4m2!3m1!1s0x0:0xecb479c5f0974632?sa=X&ved=2ahUKEwi__PLvw4f5AhXMX_EDHVb_A2QQ_BJ6BAhsEAU")
                )
            )
        }

        val webPazoDeAdran = findViewById<TextView>(R.id.webPazoDeAdran)
        webPazoDeAdran.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://pazodeadran.com/")))
        }
        val emailPazoDeAdran = findViewById<TextView>(R.id.emailPazoDeAdran)
        emailPazoDeAdran.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@pazodeadran.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Restaurante San Martiño*/

        val telefonorRestauranteSanMartinho =
            findViewById<TextView>(R.id.telefonorRestauranteSanMartinho)
        telefonorRestauranteSanMartinho.setOnClickListener {
            val phone = "tel: +34 981548463";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionRestSanMartinho = findViewById<TextView>(R.id.direccionRestSanMartinho)
        direccionRestSanMartinho.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/maps/place/Restaurante+San+Marti%C3%B1o+(Teo)/@42.8156828,-8.6193059,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f02563dfaf759:0x6c5495dc4985aa04!8m2!3d42.8156789!4d-8.6171172")
                )
            )
        }
        val webRestauranteSanMartinho1 = findViewById<TextView>(R.id.webRestauranteSanMartinho)
        webRestauranteSanMartinho1.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.restaurantesanmartino.es/")
                )
            )
        }

        val emailRestauranteSanMartinho =
            findViewById<TextView>(R.id.emailRestauranteSanMartinho)
        emailRestauranteSanMartinho.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("sanmartino.teo@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
    }
}

