package sandoval.sebastian.asignacion4_calculadora_icm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height: EditText = findViewById(R.id.height)
        val weight: EditText = findViewById(R.id.weight)
        val imc: TextView = findViewById(R.id.imc)
        val range: TextView = findViewById(R.id.range)
        val calculate: Button = findViewById(R.id.calculate)


        calculate.setOnClickListener {
            var h = height.text.toString().toDouble()
            var w = weight.text.toString().toDouble()
            var res = w/(h.pow(2))
            imc.setText(res.toString())
            range.setText(calcularIBM(res))
        }
    }

    fun calcularIBM(valor: Double):String{
        if(valor<18.5){
            return "Bajo peso"
        }else if(valor>=18.5 && valor < 25){
            return "normal"
        }else if(valor>=25 && valor < 30){
            return "Sobrepeso"
        }else if(valor>=30 && valor < 35){
            return "Obesidad grado 1"
        }else if(valor>=35 && valor < 40){
            return "Obesidad grado 2"
        }else{
            return "Obesidad grado 3"
        }

    }

}