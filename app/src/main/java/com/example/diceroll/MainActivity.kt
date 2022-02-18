package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val rollLabel: TextView = findViewById(R.id.roll_label);
        // Create new Dice object with 6 sides and roll it
        var dice = Dice(6);
        val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT);
        toast.show();
        // Update the screen with the dice roll
        rollLabel.text = "${dice.roll()}"
    }
}


