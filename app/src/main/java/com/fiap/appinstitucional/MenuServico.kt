package com.fiap.appinstitucional

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MenuServico: ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_servico)

        val buttonVoltar = findViewById<Button>(R.id.button2)

        buttonVoltar.setOnClickListener {
            finish()
        }

    }
}