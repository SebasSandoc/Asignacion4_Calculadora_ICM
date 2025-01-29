package sandoval.sebastian.asignacion4_calculadora_icm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val height: EditText = findViewById(R.id.height)
    val weight: EditText = findViewById(R.id.weight)
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}