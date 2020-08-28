package com.example.gy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image2.*

class image2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)

        back_btn.setOnClickListener {
            val intent = Intent(this,image1::class.java)
            startActivity(intent)
        }
    }
}