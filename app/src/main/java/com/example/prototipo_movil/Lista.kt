package com.example.prototipo_movil

import android.content.Intent
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class Lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val upArrow: Drawable? = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back)
        upArrow?.setColorFilter(resources.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP)
        supportActionBar?.setHomeAsUpIndicator(upArrow)
    }

    fun generar(view: View) {
        val intent = Intent(this, Generar::class.java)
        startActivity(intent)
    }

    fun modificar(view: View) {
        val intent = Intent(this, Modificar::class.java)
        startActivity(intent)
    }
}