package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

/* lateinit helps to initialize a non-null variable, setting them initially
 to null but "promising" to not leave it as null by the time it is accessed*/
lateinit var diceResult: ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button) // ids are part of the R class
        rollButton.setOnClickListener {
            rollDice()
        }

        diceResult = findViewById(R.id.dice_image) // creates a field which optimizes code

    }

    private fun rollDice() {
        val randInt = Random.nextInt(6) + 1
        val drawableResource = when (randInt) {
             1 -> R.drawable.dice_1
             2 -> R.drawable.dice_2
             3 -> R.drawable.dice_3
             4 -> R.drawable.dice_4
             5 -> R.drawable.dice_5
             else -> R.drawable.dice_6
        }

        diceResult.setImageResource(drawableResource)
    }
}