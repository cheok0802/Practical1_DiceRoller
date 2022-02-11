package com.example.diceroller

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        val btnClear: Button = findViewById(R.id.btnClear   )
        lateinit var diceImage: ImageView
        diceImage= findViewById(R.id.imageView)
        val diceImage2:ImageView = findViewById(R.id.imageView2)

        btnRoll.setOnClickListener() {

            diceImage.setImageResource(getRandomDiceImage())
            diceImage2.setImageResource(getRandomDiceImage())
        }

        btnClear.setOnClickListener() {
            diceImage.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }


    }
    private fun getRandomDiceImage(): Int {
        val drawableResource= when((1..6).random())
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        return (drawableResource)
    }
}