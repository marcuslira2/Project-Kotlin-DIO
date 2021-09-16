package com.example.imcapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val alturaEdit: EditText = findViewById(R.id.altura)
        val pesoEdit: EditText = findViewById(R.id.peso)
        val buttonCalc : Button = findViewById(R.id.calcular)
        buttonCalc.setOnClickListener{calc(pesoEdit.text.toString(), alturaEdit.text.toString())}
    }

    private fun calc(peso: String, altura: String){
        val resultText: TextView = findViewById(R.id.titleText)

        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso !=null && altura != null){
            val imc = peso /(altura*altura)
            resultText.text = "Seu IMC é:${imc}"
        }
    }


}