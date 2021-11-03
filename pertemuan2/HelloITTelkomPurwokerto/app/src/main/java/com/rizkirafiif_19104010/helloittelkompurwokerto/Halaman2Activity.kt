package com.rizkirafiif_19104010.helloittelkompurwokerto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Halaman2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)
    }
    override fun onStart(){
        super.onStart()
        printState("Halaman satu onStart")
    }

    override fun onResume(){
        super.onResume()
        printState("Halaman satu onResume")
    }

    override fun onPause(){
        super.onPause()
        printState("Halaman satu onStop")
    }

    private fun printState(msg: String) {
        Log.d("Activity State", msg)
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }
}