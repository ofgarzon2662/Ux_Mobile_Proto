package com.example.prototipo_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registro(view: View) {
        val intent = Intent(this, Registro::class.java)
        startActivity(intent)
    }

    fun lista(view: View) {
        val intent = Intent(this, Lista::class.java)
        startActivity(intent)
    }

    fun huella(view: View) {
        val intent = Intent(this, Huella::class.java)
        startActivity(intent)
    }
}