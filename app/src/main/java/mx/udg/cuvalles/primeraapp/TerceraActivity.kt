package mx.udg.cuvalles.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceraActivity : AppCompatActivity() {
    lateinit var btnRegresar:Button
    lateinit var btnSeg:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnSeg = findViewById(R.id.btnSeg)

        btnRegresar.setOnClickListener {
            val inicioIntent = Intent(this, MainActivity::class.java)
            startActivity(inicioIntent)
        }

        btnSeg.setOnClickListener {
            val segIntent = Intent(this, SegundaActivity::class.java)
            startActivity(segIntent)
        }







    }
}