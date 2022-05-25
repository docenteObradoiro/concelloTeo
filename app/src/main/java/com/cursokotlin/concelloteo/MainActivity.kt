package com.cursokotlin.concelloteo

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.concelloteo.actividades.actividades
import com.cursokotlin.concelloteo.artesania.PaginaPrincipalArtesania
import com.cursokotlin.concelloteo.patrimonio.tipos_patrimonio
import com.cursokotlin.concelloteo.redDeRutas.PaxinaPrincipalRedeDeRutas

class MainActivity : AppCompatActivity() {

    protected lateinit var vv_fondo: VideoView
    protected lateinit var reproductorVideo: MediaPlayer
    protected var mCurrentVideoPosition:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vv_fondo=findViewById(R.id.videoBenvidos)
        val uri= Uri.parse("android.resource://"
                + packageName
                + "/"
                + R.raw.videobenvidos)

        vv_fondo.setVideoURI(uri)
        vv_fondo.start()
        vv_fondo.setOnPreparedListener { mp ->
            reproductorVideo=mp
            reproductorVideo.isLooping=true

            if (mCurrentVideoPosition !=0){
                reproductorVideo.seekTo(mCurrentVideoPosition)
                reproductorVideo.start()
            }

            //este cachito de abaixo é para mutear o video.
            if (mp.isPlaying()) {
                mp.stop()
                mp.release()
            }
            mp.setVolume(0f, 0f)
        }


        val boton1 = findViewById<Button>(R.id.botonMain1)
        val boton2 = findViewById<Button>(R.id.botonMain2)
        val boton3 = findViewById<Button>(R.id.botonMain3)
        val boton4 = findViewById<Button>(R.id.botonMain4)

        boton1.setOnClickListener {
            val acceder = Intent(this, PaxinaPrincipalRedeDeRutas::class.java)
            startActivity(acceder)
        }

        boton2.setOnClickListener {
            val acceder = Intent(this, actividades::class.java)
            startActivity(acceder)
        }

       boton3.setOnClickListener {
            val acceder = Intent(this, PaginaPrincipalArtesania::class.java)
            startActivity(acceder)
        }

        boton4.setOnClickListener {
            val acceder = Intent(this, tipos_patrimonio::class.java)
            startActivity(acceder)
        }

        val accesoMenu= findViewById<ImageButton>(R.id.hamburguesa2)
        accesoMenu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        /*val facebook = findViewById<ImageView>(R.id.facebook)
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }

        val twitter = findViewById<ImageView>(R.id.twitter)
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }

        val instagram = findViewById<ImageView>(R.id.instagram)
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo/")))
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/42%C2%B047'02.9%22N+8%C2%B030'41.1%22W/@42.784135,-8.5201508,15z/data=!3m1!4b1!4m5!3m4!1s0x0:0xa4a5ed7542603c47!8m2!3d42.7841353!4d-8.5114175")))
        }*/
    }

    override fun onPause() {
        super.onPause()

        mCurrentVideoPosition=reproductorVideo.currentPosition
        vv_fondo.pause()
    }

    override fun onResume() {
        super.onResume()

        vv_fondo.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        //reproductorVideo.release()
    }
}