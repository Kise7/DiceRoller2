package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1



        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)


        if (resultText.text == "Hello World!" ) {
            resultText.text = "1"
        } else {

            var result = resultText.text.toString().toInt()

            if (result < 6) {
                result++
                resultText.text = result.toString()
            }
        }
    }
}
