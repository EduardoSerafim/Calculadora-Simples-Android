package com.example.desafiocalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etValor1: EditText = findViewById(R.id.etValor1)
        val etValor2: EditText = findViewById(R.id.etValor2)
        val btAdicao: Button = findViewById(R.id.btAdicao)
        val btSubtracao: Button = findViewById(R.id.btSubtracao)
        val btMultiplicacao: Button = findViewById(R.id.btMultiplicacao)
        val btDivisao: Button = findViewById(R.id.btDivisao)
        val tvResultado: TextView = findViewById(R.id.tvResultado)


        btAdicao.setOnClickListener {
            val resultado =
                soma(etValor1.text.toString().toDouble(), etValor2.text.toString().toDouble())
            tvResultado.text = resultado.toString()
        }

        btSubtracao.setOnClickListener {
            val resultado =
                subtracao(etValor1.text.toString().toDouble(), etValor2.text.toString().toDouble())
            tvResultado.text = resultado.toString()
        }

        btMultiplicacao.setOnClickListener {
            val resultado = multiplicacao(
                etValor1.text.toString().toDouble(), etValor2.text.toString().toDouble()
            )
            tvResultado.text = resultado.toString()
        }

        btDivisao.setOnClickListener {
            val resultado =
                divisao(etValor1.text.toString().toDouble(), etValor2.text.toString().toDouble())
            tvResultado.text = resultado.toString()
        }
    }


    fun soma(valor1: Double, valor2: Double): Double {
        return valor1 + valor2
    }

    fun subtracao(valor1: Double, valor2: Double): Double {
        return valor1 - valor2
    }

    fun multiplicacao(valor1: Double, valor2: Double): Double {
        return valor1 * valor2
    }

    fun divisao(valor1: Double, valor2: Double): Double {
        return valor1 / valor2
    }

}