package com.fiap.appinstitucional

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonContato = findViewById<Button>(R.id.menu_contato)
        val buttonServico = findViewById<Button>(R.id.menu_servico)
        val buttonEmpresa = findViewById<Button>(R.id.menu_empresa)
        val buttonCliente = findViewById<Button>(R.id.menu_cliente)

        buttonEmpresa.setOnClickListener {
            val navegar = Intent(this, MenuEmpresa::class.java).apply {
                putExtra("Chave", "voltar")
            }
            startActivity(navegar)
        }

        buttonCliente.setOnClickListener {
            val navegar = Intent(this, MenuCliente::class.java).apply {
                putExtra("Chave", "voltar")
            }
            startActivity(navegar)
        }

        buttonContato.setOnClickListener {
            val navegar = Intent(this, MenuContato::class.java).apply {
                putExtra("Chave", "voltar")
            }
            startActivity(navegar)
        }

        buttonServico.setOnClickListener {
            val navegar = Intent(this, MenuServico::class.java).apply {
                putExtra("Chave", "voltar")
            }
            startActivity(navegar)
        }
    }
}