package com.example.catordog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecordVoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_voice)

        supportActionBar?.setTitle("Klasyfikuj na podstawie nagrania")

        // binding do przycisków:
        val btnChooseFile = findViewById<Button>(R.id.btnChooseFile)
        val btnCancel = findViewById<Button>(R.id.btnCancel1)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnClassify = findViewById<Button>(R.id.btnClassify1)

        // instent
        val intentbtnClassify = Intent(this, ResultsActivity::class.java)

        // listenery do przycisków
        btnClassify.setOnClickListener{
            startActivity( intentbtnClassify, null )
        }
    }
}