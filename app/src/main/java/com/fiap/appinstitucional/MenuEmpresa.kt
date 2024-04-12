package com.fiap.appinstitucional

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MenuEmpresa: ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sobre_empresa)

        val buttonVoltar = findViewById<Button>(R.id.button3)

        buttonVoltar.setOnClickListener {
            finish()
        }

    }
}