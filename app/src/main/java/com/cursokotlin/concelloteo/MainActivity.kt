package com.cursokotlin.concelloteo

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.concelloteo.actividades.actividades
import com.cursokotlin.concelloteo.artesania.PaginaPrincipalArtesania
import com.cursokotlin.concelloteo.patrimonio.tipos_patrimonio
import com.cursokotlin.concelloteo.redDeRutas.PaxinaPrincipalRedeDeRutas

class MainActivity : AppCompatActivity() {

    protected lateinit var video: VideoView
    protected lateinit var reproductorVideo: MediaPlayer
    protected var mCurrentVideoPosition:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        video=findViewById(R.id.videoBenvidos)
        val uri= Uri.parse("android.resource://"
                + packageName
                + "/"
                + R.raw.videobenvidos)
        video.keepScreenOn = true

        video.setVideoURI(uri)
        video.start()
        video.setOnPreparedListener { mp ->
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
    }


    override fun onPause() {
        super.onPause()

        mCurrentVideoPosition=reproductorVideo.currentPosition
        video.pause()
    }

    override fun onResume() {
        super.onResume()

        video.start()
    }

    /*override fun onDestroy() {
        super.onDestroy()
        reproductorVideo.release()
    }*/
}