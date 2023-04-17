package com.example.catordog

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class ReadFileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_file)

        supportActionBar?.setTitle("Klasyfikuj na podstawie pliku")

        // binding :
        val btnChooseFile = findViewById<Button>(R.id.btnChooseFile)
        val btnClassify = findViewById<Button>(R.id.btnClassify)
        val txtFileName = findViewById<TextView>(R.id.txtFileName)

        // instent
        val intentbtnClassify = Intent(this, ResultsActivity::class.java)



        // listenery do przycisków
        btnChooseFile.setOnClickListener{
            val intentChoose = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)

            startActivityForResult(Intent.createChooser(intentChoose, "Wybierz plik"), 111)

        }

        btnClassify.setOnClickListener{
            startActivity( intentbtnClassify, null )
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 111 && resultCode == RESULT_OK)
        {
            val selectedFile = data?.data // URI
            println(selectedFile.toString())
        }

    }



}