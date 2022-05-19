package com.cursokotlin.concelloteo.patrimonio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.concelloteo.R

class patrimonio_etnografico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_etnografico)

        val boton12 = findViewById<ImageButton>(R.id.boton12)
        boton12.setOnClickListener {
            val accederCruceiroTribaldes = Intent(this, informacion_cruceiro_tribaldes::class.java)
            startActivity(accederCruceiroTribaldes)
        }
        val boton13 = findViewById<ImageButton>(R.id.boton13)
        boton13.setOnClickListener {
            val accederBurgaXermeade = Intent(this, informacion_burga_xermeade::class.java)
            startActivity(accederBurgaXermeade)
        }
        val boton14 = findViewById<ImageButton>(R.id.boton14)
        boton14.setOnClickListener {
            val accederCrucerioGoticoFrancos =
                Intent(this, informacion_cruceiro_gotico_francos::class.java)
            startActivity(accederCrucerioGoticoFrancos)
        }
        val boton15 = findViewById<ImageButton>(R.id.boton15)
        boton15.setOnClickListener {
            val accederMarcoMedievalPorto =
                Intent(this, informacion_marco_medieval_porto::class.java)
            startActivity(accederMarcoMedievalPorto)
        }
        val boton16 = findViewById<ImageButton>(R.id.boton16)
        boton16.setOnClickListener {
            val accederPonteMedievalPontevea =
                Intent(this, informacion_ponte_medieval_pontevea::class.java)
            startActivity(accederPonteMedievalPontevea)
        }
        val boton17 = findViewById<ImageButton>(R.id.boton17)
        boton17.setOnClickListener {
            val accederPonteParadela = Intent(this, informacion_ponte_paradela::class.java)
            startActivity(accederPonteParadela)
        }
        val boton18 = findViewById<ImageButton>(R.id.boton18)
        boton18.setOnClickListener {
            val accederPousadaSanAntoniño =
                Intent(this, informacion_pousada_san_antoninho::class.java)
            startActivity(accederPousadaSanAntoniño)
        }
        val boton19 = findViewById<ImageButton>(R.id.boton19)
        boton19.setOnClickListener {
            val accederEscolaFrancos = Intent(this, informacion_escola_francos::class.java)
            startActivity(accederEscolaFrancos)
        }
        val boton20 = findViewById<ImageButton>(R.id.boton20)
        boton20.setOnClickListener {
            val accederPonteLavadoiroRioTinto =
                Intent(this, informacion_ponte_lavadoiro_rio_tinto::class.java)
            startActivity(accederPonteLavadoiroRioTinto)
        }
        val boton21 = findViewById<ImageButton>(R.id.boton21)
        boton21.setOnClickListener {
            val accederLavadoiroFrancos = Intent(this, informacion_lavadoiro_francos::class.java)
            startActivity(accederLavadoiroFrancos)
        }
        val boton22 = findViewById<ImageButton>(R.id.boton22)
        boton22.setOnClickListener {
            val accederPonteColganteXirimbao =
                Intent(this, informacion_ponte_colgante_xirimbao::class.java)
            startActivity(accederPonteColganteXirimbao)
        }
        val boton23 = findViewById<ImageButton>(R.id.boton23)
        boton23.setOnClickListener {
            val accederLavadoiroCasalonga =
                Intent(this, informacion_lavadoiro_casalonga::class.java)
            startActivity(accederLavadoiroCasalonga)
        }
        val boton24 = findViewById<ImageButton>(R.id.boton24)
        boton24.setOnClickListener {
            val accederFonteLavadoiroFlorida =
                Intent(this, informacion_fonte_lavadoiro_florida::class.java)
            startActivity(accederFonteLavadoiroFlorida)
        }
        val boton25 = findViewById<ImageButton>(R.id.boton25)
        boton25.setOnClickListener {
            val accederNucleoradicionalPontevea =
                Intent(this, informacion_nucleo_tradicional_pontevea::class.java)
            startActivity(accederNucleoradicionalPontevea)
        }
        val boton26 = findViewById<ImageButton>(R.id.boton26)
        boton26.setOnClickListener {
            val accederPonteNovaRaris = Intent(this, informacion_ponte_nova_raris::class.java)
            startActivity(accederPonteNovaRaris)
        }
        val boton27 = findViewById<ImageButton>(R.id.boton27)
        boton27.setOnClickListener {
            val accederTunelFaramello = Intent(this, informacion_tunel_faramello::class.java)
            startActivity(accederTunelFaramello)
        }
        val boton28 = findViewById<ImageButton>(R.id.boton28)
        boton28.setOnClickListener {
            val accederFonteEscolaCasalonga = Intent(this, informacion_escola_casalonga::class.java)
            startActivity(accederFonteEscolaCasalonga)
        }
        val informacion = findViewById<ImageButton>(R.id.informacion)
        informacion.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
        val facebook = findViewById<ImageButton>(R.id.facebook_3_)
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }
        val twitter = findViewById<ImageButton>(R.id.twitter_4_)
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }
        val instagram = findViewById<ImageButton>(R.id.instagram_3_)
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo")))
        }


    }
}
