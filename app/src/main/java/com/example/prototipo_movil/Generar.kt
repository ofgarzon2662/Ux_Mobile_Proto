package com.example.prototipo_movil

import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class Generar : AppCompatActivity() {

    private val items = arrayOf("Transporte público", "Transporte privado", "Bicicleta", "Caminata")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generar)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val upArrow: Drawable? = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back)
        upArrow?.setColorFilter(resources.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP)
        supportActionBar?.setHomeAsUpIndicator(upArrow)

        val autoComplete = findViewById<AutoCompleteTextView>(R.id.mdt)
        val adapterItems = ArrayAdapter(this, R.layout.opcion, items)
        autoComplete.setAdapter(adapterItems)
    }

    fun generar(view: View) {
        val builder = AlertDialog.Builder(this, R.style.AlertDialog)
        builder.setMessage("Tu alarma ha sido programada exitosamente")
        builder.setOnDismissListener {
            finish()
        }
        val dialog = builder.create()
        dialog.show()
    }
}