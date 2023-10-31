package com.example.uisencillaguiatask05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Vamos a recuperar la informacion de los ids del layout creados y a guardarla en una variable
        // en este caso solo necesitamos la del boton y la perteneciente al video
        val boton = findViewById<Button>(R.id.button)
        val video = findViewById<VideoView>(R.id.videoView)
        //para que se lance una accion cuando hagamos click
        //aqui emplearemos el setOnClickListener
        //en la variable en la que guardemos
        boton.setOnClickListener{
            //ahora haremos que el video se cargue desde la ruta  que le digamos mediante la siguiente linea
            val videopath = "android.resource://"+ getPackageName() + "/"+ R.raw.videollados
            //ruta que introducimo en este metodo
            video.setVideoPath(videopath)
            //con esto iniciaremos el video
            video.start()
            //con esto hacemos que la app se centre en el videoView lo maximo posible aun estando escribiendo
            video.requestFocus()
        }

    }
}