package com.example.gy3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.content.Intent
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_image1.*
import java.util.*

class image1 : AppCompatActivity() {

    private lateinit var mp:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image1)

        next_btn.setOnClickListener{
            val intent = Intent(this,image2::class.java)
            startActivity(intent)
        }
        previous_btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        start_btn.setOnClickListener{
            view_flipper.isAutoStart=true
            view_flipper.setFlipInterval(2000)
            view_flipper.startFlipping()
        }
        pause_nxt.setOnClickListener{
            view_flipper.stopFlipping()
        }

        mp = MediaPlayer.create(this,R.raw.happy_background)
        mp.start()
        mp.isLooping=true
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_image1)
        mp.stop()
    }

}

