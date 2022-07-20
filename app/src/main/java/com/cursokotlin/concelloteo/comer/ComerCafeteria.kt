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

class ComerCafeteria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comer_cafeteria)

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

        /*Betos*/

        val telefonoBetos = findViewById<TextView>(R.id.telefonoBetos)
        telefonoBetos.setOnClickListener {
            val phone = "tel: +34 981806839";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionBetos = findViewById<TextView>(R.id.direccionBetos)
        direccionBetos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/BETOS/@42.8205917,-8.5472627,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01a136205095:0xfe6605ee64eb5090!8m2!3d42.8205878!4d-8.545074")))
        }
        val facebookBetos = findViewById<TextView>(R.id.webBetos)
        facebookBetos.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/people/cerveceria-betos/100063516612804/")))
        }

        /*Canaletto*/

        val telefonoBarCanaletto = findViewById<TextView>(R.id.telefonoBarCanaletto)
        telefonoBarCanaletto.setOnClickListener {
            val phone = "tel: +34 981806834";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionBarCanaletto = findViewById<TextView>(R.id.direccionBarCanaletto)
        direccionBarCanaletto.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Restaurante+Canaletto/@42.8271027,-8.5479889,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f019aead7cb99:0xbc9ded23a3657796!8m2!3d42.8270886!4d-8.5458533")))
        }
        val webBarCanaletto = findViewById<TextView>(R.id.webBarCanaletto)
        webBarCanaletto.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://canaletto.es/")))
        }
        val emailBarCanaletto = findViewById<TextView>(R.id.emailBarCanaletto)
        emailBarCanaletto.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("lcastineirascampos@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Che2*/

        val telefonoChe2 = findViewById<TextView>(R.id.telefonoChe2)
        telefonoChe2.setOnClickListener {
            val phone = "tel: +34 981806848";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionChe2 = findViewById<TextView>(R.id.direccionChe2)
        direccionChe2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/CHE+2/@42.8322329,-8.5486568,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01be96c60821:0xe821227bdd2af31d!8m2!3d42.832229!4d-8.5464681")))
        }
        val webChe2 = findViewById<TextView>(R.id.webChe2)
        webChe2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://canaletto.es/")))
        }
        val emailChe2 = findViewById<TextView>(R.id.emailChe2)
        emailChe2.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("panaderiache@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Bar Eme*/

        val telefonoBarEme = findViewById<TextView>(R.id.telefonoBarEme)
        telefonoBarEme.setOnClickListener {
            val phone = "tel: +34 981806133";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionBarEme = findViewById<TextView>(R.id.direccionBarEme)
        direccionBarEme.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+El+Eme/@43.2601741,-2.9366078,17z/data=!3m1!4b1!4m5!3m4!1s0xd4e4fd6e4b3c011:0x1a2fcd5eb0cd6f2f!8m2!3d43.260187!4d-2.9344417")))
        }
        val facebookEme = findViewById<TextView>(R.id.webParadaDeFrancos)
        facebookEme.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Bar-Restaurante-Eme-167666429937350/")))
        }
        val emailBarEme = findViewById<TextView>(R.id.emailBarEme)
        emailBarEme.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("vitaygus@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Mar Adentro*/

        val telefonoMaradentro = findViewById<TextView>(R.id.telefonoMaradentro)
        telefonoMaradentro.setOnClickListener {
            val phone = "tel: +34 981801447";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionMaradentro = findViewById<TextView>(R.id.direccionMaradentro)
        direccionMaradentro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/CAFETERIA+MARADENTRO/@42.8344277,-76.0463011,3z/data=!4m9!1m2!2m1!1smar+adentro!3m5!1s0xd2f01bf182319f7:0x942035966625a6b1!8m2!3d42.8344055!4d-8.5461886!15sCgttYXIgYWRlbnRyb1oNIgttYXIgYWRlbnRyb5IBCWNhZmV0ZXJpYQ")))
        }
        val emailMaradentro = findViewById<TextView>(R.id.emailMaradentro)
        emailMaradentro.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("genarosantasmarinas@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*NcCoffeBar*/

        val telefonoNcCoffeeBar = findViewById<TextView>(R.id.telefonoNcCoffeeBar)
        telefonoNcCoffeeBar.setOnClickListener {
            val phone = "tel: +34 981806581";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val direccionNcCoffeeBar = findViewById<TextView>(R.id.direccionNcCoffeeBar)
        direccionNcCoffeeBar.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Nc+Coffee+Bar/@42.8262268,-8.5465888,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01a4a8e41d8f:0x905145876559b94f!8m2!3d42.8262095!4d-8.5444124")))
        }

        /*Sauce*/

        val direccionSauce = findViewById<TextView>(R.id.direccionSauce)
        direccionSauce.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+El+Sauce/@42.8104659,-8.5471867,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01a2ffd8fe8b:0x9f8e6f2a97bf36fd!8m2!3d42.8104606!4d-8.5450242")))
        }

        /*Casa Touceda*/

        val telefonoCasaTouceda = findViewById<TextView>(R.id.telefonoCasaTouceda)
        telefonoCasaTouceda.setOnClickListener {
            val phone = "tel: +34 981548326";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionCasaTouceda = findViewById<TextView>(R.id.direccionCasaTouceda)
        direccionCasaTouceda.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Casa+Touceda/@42.8147878,-8.6197781,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f02ff14adb00b:0x6ebefc6488699130!8m2!3d42.8147641!4d-8.6175382")))
        }
        val facebookTouceda = findViewById<TextView>(R.id.webCasaTouceda)
        facebookTouceda.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/CasaTouceda/")))
        }

        /*Loncho*/

        val direccionLoncho = findViewById<TextView>(R.id.direccionLoncho)
        direccionLoncho.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+Loncho/@42.8222038,-8.7431515,12z/data=!4m9!1m2!2m1!1sloncho+teo!3m5!1s0xd2f03e3caef434b:0x7a54566d48427c94!8m2!3d42.8222007!4d-8.6113088!15sCgpsb25jaG8gdGVvWgwiCmxvbmNobyB0ZW-SAQNiYXI")))
        }

        /*Raña*/

        val telefonoRanha = findViewById<TextView>(R.id.telefonoRanha)
        telefonoRanha.setOnClickListener {
            val phone = "tel: +34 981548839";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionRanha = findViewById<TextView>(R.id.direccionRanha)
        direccionRanha.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cafe+Bar+Ra%C3%B1a/@42.8225693,-8.6128944,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f0259f665dc6d:0x4ebd821b8885cd25!8m2!3d42.8225685!4d-8.6107098")))
        }

        /*Tía María*/

        val telefonoTiaMaria = findViewById<TextView>(R.id.telefonoTiaMaria)
        telefonoTiaMaria.setOnClickListener {
            val phone = "tel: +34 981548570";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionTiaMaria = findViewById<TextView>(R.id.direccionTiaMaria)
        direccionTiaMaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Tia+Maria+Cafe+Bar/@42.8268679,-8.6698649,13z/data=!4m9!1m2!2m1!1sTia+maria!3m5!1s0xd2f0244a11633bb:0xed2652d13b248380!8m2!3d42.8269248!4d-8.6039796!15sCglUaWEgbWFyaWFaCyIJdGlhIG1hcmlhkgEDYmFy")))
        }
        val facebookTiaMaria = findViewById<TextView>(R.id.webTiaMaria)
        facebookTiaMaria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-la.facebook.com/pages/category/Cafeteria/Tia-Maria-Cafe-Bar-101292728355575/")))
        }

        /*A Ramallosa*/

        val telefonoRamallosa = findViewById<TextView>(R.id.telefonoRamallosa)
        telefonoRamallosa.setOnClickListener {
            val phone = "tel: +34 637562766";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionRamallosa = findViewById<TextView>(R.id.direccionRamallosa)
        direccionRamallosa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Galuresa+A+Ramallosa/@42.7981735,-8.5509934,17z/data=!4m13!1m7!3m6!1s0xd2f0115403bcb2d:0x4c6df59133542659!2sTraves%C3%ADa+da+Ramallosa,+6,+15883+Teo,+La+Coru%C3%B1a!3b1!8m2!3d42.7981696!4d-8.5488047!3m4!1s0xd2f0142b464771b:0x53ee87e9e57b0d38!8m2!3d42.7976815!4d-8.5474314")))
        }
        val instaRamallosa = findViewById<TextView>(R.id.webRamallosa)
        instaRamallosa.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafeteria_ramallosa/?hl=es")))
        }
        val emailRamallosa = findViewById<TextView>(R.id.emailRamallosa)
        emailRamallosa.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("ramallosacafeteria@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }

        /*Santa Sede*/

        val telefonoSantaSede = findViewById<TextView>(R.id.telefonoSantaSede)
        telefonoSantaSede.setOnClickListener {
            val phone = "tel: +34 981809228";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionSantaSede = findViewById<TextView>(R.id.direccionSantaSede)
        direccionSantaSede.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/A+Santa+Sede/@42.7967696,-8.5511659,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f013fc2ad092d:0xe56a89f56271a6a9!8m2!3d42.7967308!4d-8.5488723")))
        }
        val emailSantaSede = findViewById<TextView>(R.id.emailSantaSede)
        emailSantaSede.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("javi-sant@misvides.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        val webSantaSede = findViewById<TextView>(R.id.webSantaSede)
        webSantaSede.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asantasede.com/")))
        }

        /*O Pintor*/

        val telefonoOPintor = findViewById<TextView>(R.id.telefonoOPintor)
        telefonoOPintor.setOnClickListener {
            val phone = "tel: +34 661002667";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val direccionOPintor = findViewById<TextView>(R.id.direccionOPintor)
        direccionOPintor.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bar+O+Pintor/@42.7996402,-8.5777759,17z/data=!4m12!1m6!3m5!1s0xd2f031e66e07a07:0xd42f74b64204c94e!2sBar+O+Pintor!8m2!3d42.7996313!4d-8.5756483!3m4!1s0xd2f031e66e07a07:0xd42f74b64204c94e!8m2!3d42.7996313!4d-8.5756483")))
        }
        val emailOPintor = findViewById<TextView>(R.id.emailOPintor)
        emailOPintor.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("pilitabudy@hotmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        val facebookPintor = findViewById<TextView>(R.id.webOPintor)
        facebookPintor.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/pages/category/Bar/Bar-o-pintor-541471606261656/")))
        }

        /*Rincon de Koller*/

        val telefonoElRinconDeKoller = findViewById<TextView>(R.id.telefonoElRinconDeKoller)
        telefonoElRinconDeKoller.setOnClickListener {
            val phone = "tel: +34 981461358";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionElRinconDeKoller = findViewById<TextView>(R.id.direccionElRinconDeKoller)
        direccionElRinconDeKoller.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/El+Rinc%C3%B3n+de+Koller/@42.8432016,-8.5416974,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f01761460a2b7:0x13aa6cc85d3011d6!8m2!3d42.8431977!4d-8.5395087")))
        }
        val emailElRinconDeKoller = findViewById<TextView>(R.id.emailElRinconDeKoller)
        emailElRinconDeKoller.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("elrincondekoller@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        val facebookKoller = findViewById<TextView>(R.id.webElRinconDeKoller)
        facebookKoller.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ElRinconDeKoller/")))
        }

        /*Rincon escondido*/

        val telefonoRinconEscondido = findViewById<TextView>(R.id.telefonoRinconEscondido)
        telefonoRinconEscondido.setOnClickListener {
            val phone = "tel: +34 627453245";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionElRinconEscondido = findViewById<TextView>(R.id.direccionElRinconEscondido)
        direccionElRinconEscondido.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cafeteria+El+Rinc%C3%B3n+escondido/@42.8448457,-8.5421779,17z/data=!3m2!4b1!5s0xd2f01c5695fbb9f:0x3a01f083da9db248!4m5!3m4!1s0xd2f01c56a8f5d3f:0x605fe739af21eb08!8m2!3d42.8448418!4d-8.5399892")))
        }
        val emailRinconEscondido = findViewById<TextView>(R.id.emailRinconEscondido)
        emailRinconEscondido.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asantasede.com/")))
        }

        /*Piro*/

        val direccionPiro = findViewById<TextView>(R.id.direccionPiro)
        direccionPiro.setOnClickListener {
            val phone = "tel: +34 981807488";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        val telefonoPiro = findViewById<TextView>(R.id.telefonoPiro)
        telefonoPiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cafe+Bar+O+Piro/@42.7977041,-8.5361936,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f0121605e13d1:0x77a88df19c1271eb!8m2!3d42.797698!4d-8.5340087")))
        }

        /*Senra*/

        val telefonoAsenra = findViewById<TextView>(R.id.telefonoAsenra)
        telefonoAsenra.setOnClickListener {
            val phone = "tel: +34 981815744";
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
        val direccionAsenra = findViewById<TextView>(R.id.direccionAsenra)
        direccionAsenra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/A+Senra+Caf%C3%A9/@42.7635562,-8.5491034,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f06c11bffffff:0x5a7599ec9a046e0c!8m2!3d42.7635523!4d-8.5469147")))
        }
        val emailAsenra = findViewById<TextView>(R.id.emailAsenra)
        emailAsenra.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("asenracafe@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        val facebookSenra = findViewById<TextView>(R.id.webAsenra)
        facebookSenra.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/asenracafe/")))
        }
    }
}