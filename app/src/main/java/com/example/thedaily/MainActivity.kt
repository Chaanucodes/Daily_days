package com.example.thedaily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("THE_TAG", "THE COMMIT")
        println("The test 5")
        println("The test 6")
        println("The test 7")

    }

    fun dost(){
        val s = 2+1
        println("function 1")
        println("fun.. 2")
        println("fun.. 3")
    }
}