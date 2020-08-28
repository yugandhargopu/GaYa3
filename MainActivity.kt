package com.example.gy3



import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import com.mikhaellopez.circularimageview.CircularImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var mp:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        message_txt.setOnClickListener {
            val intent = Intent(this,Message::class.java)
            startActivity(intent)
        }

        cake_imgbtn.setOnClickListener{
            val intent = Intent(this,music_click::class.java)
            startActivity(intent)
        }

        surprise_btn.setOnClickListener{

            val intent = Intent(this,image1::class.java)
            startActivity(intent)
        }

        mp = MediaPlayer.create(this,R.raw.happy_birthday_bells)
        mp.start()
        mp.isLooping=true
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        mp.stop()
    }


}
