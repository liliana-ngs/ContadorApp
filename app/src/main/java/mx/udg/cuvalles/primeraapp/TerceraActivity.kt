package mx.udg.cuvalles.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceraActivity : AppCompatActivity() {
    lateinit var btnRegresar:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnRegresar.setOnClickListener {
            val inicioIntent = Intent(this, MainActivity::class.java)
            startActivity(inicioIntent)
        }







    }
}