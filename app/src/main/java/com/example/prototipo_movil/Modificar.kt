package com.example.prototipo_movil

import android.content.Intent
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class Modificar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modificar)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val upArrow: Drawable? = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back)
        upArrow?.setColorFilter(resources.getColor(R.color.white), PorterDuff.Mode.SRC_ATOP)
        supportActionBar?.setHomeAsUpIndicator(upArrow)
    }

    fun guardar(view: View) {
        val builder = AlertDialog.Builder(this, R.style.AlertDialog)
        builder.setMessage("Tu cita ha sido modificada exitosamente")
        builder.setOnDismissListener {
            finish()
        }
        val dialog = builder.create()
        dialog.show()
    }

    fun cancelar(view: View) {
        val intent = Intent(this, Cancelar::class.java)
        startActivity(intent)
    }
}