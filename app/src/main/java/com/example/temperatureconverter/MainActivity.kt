package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ctoF: Button
    private lateinit var ftoC: Button
    private lateinit var ctoK: Button
    private lateinit var ktoC: Button
    private lateinit var ktoF: Button
    private lateinit var ftoK: Button
    private lateinit var enterTemp: EditText
    private lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ctoF = findViewById(R.id.cTOf)
        ftoC = findViewById(R.id.fTOc)
        ctoK = findViewById(R.id.cTOk)
        ktoC = findViewById(R.id.kTOc)
        ktoF = findViewById(R.id.kTOf)
        ftoK = findViewById(R.id.fTOk)
        enterTemp = findViewById(R.id.InputTemp)
        result = findViewById(R.id.result)

        enterTemp.movementMethod = ScrollingMovementMethod()
        enterTemp.isActivated = true
        enterTemp.isPressed = true

        ctoF.setOnClickListener{
            val temp = enterTemp.text.toString()

            if (temp.isEmpty()){
                result.error ="Please enter the input!"
            }else{
                val celsius = temp.toDouble()
                val fahrenheit = (celsius * 9/5) + 32
                "Result: $fahrenheit °F".also { result.text = it }
            }
        }

        ftoC.setOnClickListener{
            val temp = enterTemp.text.toString()

            if (temp.isEmpty()){
                result.error ="Please enter the input!"
            }else{
                val fahrenheit = temp.toDouble()
                val celsius = (fahrenheit-32)*5/9
                "Result: $celsius °C".also { result.text = it }
            }
        }

        ctoK.setOnClickListener{
            val temp = enterTemp.text.toString()

            if (temp.isEmpty()){
                result.error ="Please enter the input!"
            }else{
                val celsius = temp.toDouble()
                val kelvin = celsius + 273.15
                "Result: $kelvin K".also { result.text = it }
            }
        }

        ktoC.setOnClickListener{
            val temp = enterTemp.text.toString()

            if (temp.isEmpty()){
                result.error ="Please enter the input!"
            }else{
                val kelvin = temp.toDouble()
                val celsius = kelvin - 273.15
                "Result: $celsius °C".also { result.text = it }
            }
        }

        ktoF.setOnClickListener{
            val temp = enterTemp.text.toString()

            if (temp.isEmpty()){
                result.error ="Please enter the input!"
            }else{
                val kelvin = temp.toDouble()
                val fahrenheit = (kelvin - 273.15)*1.8+32
                "Result: $fahrenheit °F".also { result.text = it }
            }
        }

        ftoK.setOnClickListener{
            val temp = enterTemp.text.toString()

            if (temp.isEmpty()){
                result.error ="Please enter the input!"
            }else{
                val fahrenheit = temp.toDouble()
                val kelvin = (fahrenheit - 32)*5/9 + 273.15
                "Result: $kelvin K".also { result.text = it }
            }
        }

    }

}