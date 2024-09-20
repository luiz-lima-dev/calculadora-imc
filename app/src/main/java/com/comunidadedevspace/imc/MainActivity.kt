package com.comunidadedevspace.imc

import android.adservices.measurement.DeletionRequest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        // Criar uma variavel e associar o componente de UI <EditText>

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btncalcular = findViewById<Button>(R.id.button)

        btncalcular.setOnClickListener{}
        val peso= edtpeso.text
        val altura = edtaltura.text

           println("Luiz açao do botao")
    }
}