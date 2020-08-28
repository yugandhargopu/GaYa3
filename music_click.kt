package com.example.gy3


import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_music_click.*

class music_click : AppCompatActivity() {

    private lateinit var mp:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_click)

        backmain_btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



        mp = MediaPlayer.create(this,R.raw.happy_bday_gaya3)
        mp.start()
        mp.isLooping=true
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_music_click)
        mp.stop()
    }}
