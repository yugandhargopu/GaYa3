package com.example.gy3



import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class login : AppCompatActivity() {
    var timer: Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@login, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }}
