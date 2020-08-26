package com.example.thedaily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("THE_TAG", "THE COMMIT")
        println("The test 2")
        println("The test 3")
        println("The test 4")
        println("The test 5")
    }
}