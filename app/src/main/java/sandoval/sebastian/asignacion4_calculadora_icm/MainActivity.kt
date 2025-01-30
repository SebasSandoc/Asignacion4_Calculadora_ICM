package sandoval.sebastian.asignacion4_calculadora_icm

import android.annotation.SuppressLint
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
            range.setText(calcularIBM(range,res))
        }
    }

    @SuppressLint("ResourceAsColor")
    fun calcularIBM(rng: TextView, valor: Double):String{
        if(valor<18.5){
            rng.setBackgroundColor(R.color.greenish)
            return "Bajo peso"
        }else if(valor>=18.5 && valor < 25){
            rng.setBackgroundColor(R.color.green)
            return "normal"
        }else if(valor>=25 && valor < 30){
            rng.setBackgroundColor(R.color.yellow)
            return "Sobrepeso"
        }else if(valor>=30 && valor < 35){
            rng.setBackgroundColor(R.color.orange)
            return "Obesidad grado 1"
        }else if(valor>=35 && valor < 40){
            rng.setBackgroundColor(R.color.red)
            return "Obesidad grado 2"
        }else{
            rng.setBackgroundColor(R.color.brown)
            return "Obesidad grado 3"
        }

    }



}