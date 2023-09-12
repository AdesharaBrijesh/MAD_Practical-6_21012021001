package com.example.mad_practical_6_21012021001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonPlay: Button = findViewById(R.id.playbtn)
        buttonPlay.setOnClickListener {
            playPause()
        }

        val buttonStop: Button = findViewById(R.id.stopbtn)
        buttonStop.setOnClickListener {
            stop()
        }
    }



    fun playPause(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply { startService(this) }
    }
    fun stop(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply { stopService(this) }

    }
}