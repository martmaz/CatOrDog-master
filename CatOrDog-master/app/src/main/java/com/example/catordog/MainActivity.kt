package com.example.catordog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // W zasadzie tu sama nawigacja po przyciskach + sprawdzenie zgody

        supportActionBar?.setTitle("Kot czy pies")
        // binding do przycisków:
        val imgBtnRecord = findViewById<ImageButton>(R.id.imgBtnRecord)
        val btnReadFile = findViewById<Button>(R.id.btnReadFile)

        // instent do każdego kierunku
        val intentRecord = Intent(this, RecordVoiceActivity::class.java)
        val intentReadFile = Intent(this, ReadFileActivity::class.java)

        // listenery do przycisków
        imgBtnRecord.setOnClickListener{
            startActivity( intentRecord, null )
        }

        btnReadFile.setOnClickListener{
            startActivity( intentReadFile, null )
        }
    }
}