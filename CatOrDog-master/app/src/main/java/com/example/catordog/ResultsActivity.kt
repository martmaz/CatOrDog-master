package com.example.catordog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        supportActionBar?.setTitle("Wyniki klasyfikacji")


    }

}