package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUp: Button = findViewById(R.id.count_up)
        countUp.setOnClickListener { countUpText() }

    }

    private fun rollDice() {
        /*Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/
        val randomInt = Random.nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUpText() {
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "roll me!") {
            resultText.text = "1"
        }
        else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6)
                resultInt ++
            resultText.text = resultInt.toString()
        }
    }
}
