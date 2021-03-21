package mx.udg.cuvalles.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    //Declaracion de variables
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar:Button
    lateinit var tvContador:TextView

    lateinit var btnInicio:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //inicializacion de las variables
        btnIncrementar = findViewById(R.id.btnIncrementar)
        tvContador = findViewById(R.id.tvNumero)

        btnIncrementar.setOnClickListener {
            contador++
            tvContador.text = "$contador"

        btnDecrementar = findViewById(R.id.btnDecrementar)
        tvContador = findViewById(R.id.tvNumero)

         btnDecrementar.setOnClickListener {
             if (contador<0){
                 contador--
             }else{
                 btnDecrementar.isEnabled = false
             }
             tvContador.text = "$contador"
         }
        }
        btnInicio = findViewById(R.id.btnInicio)

        btnInicio.setOnClickListener {
            val iniIntent = Intent(this, MainActivity::class.java)
            startActivity(iniIntent)
        }
    }
}