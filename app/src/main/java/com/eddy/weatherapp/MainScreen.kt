package com.eddy.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    private lateinit var minTempMonday: TextView
    private lateinit var maxTempMonday: TextView
    private lateinit var minTempTuesday: TextView
    private lateinit var maxTempTuesday: TextView
    private lateinit var minTempWednesday: TextView
    private lateinit var maxTempWednesday: TextView
    private lateinit var minTempThursday: TextView
    private lateinit var maxTempThursday: TextView
    private lateinit var minTempFriday: TextView
    private lateinit var maxTempFriday: TextView
    private lateinit var minTempSaturday: TextView
    private lateinit var maxTempSaturday: TextView
    private lateinit var minTempSunday: TextView
    private lateinit var maxTempSunday: TextView
    private lateinit var averageTempTextView: TextView

    private val minTemps = IntArray(7)
    private val maxTemps = IntArray(7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        initializeViews()

        val viewDetailsButton: Button = findViewById(R.id.viewDetailsButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        viewDetailsButton.setOnClickListener {
            calculateAverageTemp()
            val intent = Intent(this,DetailActivity::class.java).apply {
                putExtra("minTemps", minTemps)
                putExtra("maxTemps", maxTemps)
            }
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initializeViews() {
        minTempMonday = findViewById(R.id.minTempMonday)
        maxTempMonday = findViewById(R.id.maxTempMonday)
        minTempTuesday = findViewById(R.id.minTempTuesday)
        maxTempTuesday = findViewById(R.id.maxTempTuesday)
        minTempWednesday = findViewById(R.id.minTempWednesday)
        maxTempWednesday = findViewById(R.id.maxTempWednesday)
        minTempThursday = findViewById(R.id.minTempThursday)
        maxTempThursday = findViewById(R.id.maxTempThursday)
        minTempFriday = findViewById(R.id.minTempFriday)
        maxTempFriday = findViewById(R.id.maxTempFriday)
        minTempSaturday = findViewById(R.id.minTempSaturday)
        maxTempSaturday = findViewById(R.id.maxTempSaturday)
        minTempSunday = findViewById(R.id.minTempSunday)
        maxTempSunday = findViewById(R.id.maxTempSunday)
        averageTempTextView = findViewById(R.id.main)
    }

    private fun calculateAverageTemp() {
        minTemps[0] = minTempMonday.text.toString().toIntOrNull() ?: 0
        maxTemps[0] = maxTempMonday.text.toString().toIntOrNull() ?: 0
        minTemps[1] = minTempTuesday.text.toString().toIntOrNull() ?: 0
        maxTemps[1] = maxTempTuesday.text.toString().toIntOrNull() ?: 0
        minTemps[2] = minTempWednesday.text.toString().toIntOrNull() ?: 0
        maxTemps[2] = maxTempWednesday.text.toString().toIntOrNull() ?: 0
        minTemps[3] = minTempThursday.text.toString().toIntOrNull() ?: 0
        maxTemps[3] = maxTempThursday.text.toString().toIntOrNull() ?: 0
        minTemps[4] = minTempFriday.text.toString().toIntOrNull() ?: 0
        maxTemps[4] = maxTempFriday.text.toString().toIntOrNull() ?: 0
        minTemps[5] = minTempSaturday.text.toString().toIntOrNull() ?: 0
        maxTemps[5] = maxTempSaturday.text.toString().toIntOrNull() ?: 0
        minTemps[6] = minTempSunday.text.toString().toIntOrNull() ?: 0
        maxTemps[6] = maxTempSunday.text.toString().toIntOrNull() ?: 0

        val totalMinTemp = minTemps.sum()
        val totalMaxTemp = maxTemps.sum()
        val daysCount = minTemps.count { it != 0 }

        val averageMinTemp = if (daysCount != 0) totalMinTemp / daysCount else 0
        val averageMaxTemp = if (daysCount != 0) totalMaxTemp / daysCount else 0

        averageTempTextView.text = "Average Min: $averageMinTemp, Average Max: $averageMaxTemp"
    }
    private fun enableEdgeToEdge() {
        // Your implementation for enabling edge-to-edge UI
    }
}

class DetailActivity {

}




