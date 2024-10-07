package com.example.customviewsui

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.customButton)

        // Sự kiện khi nhấn Button
        button.setOnClickListener {
            button.setBackgroundColor(getRandomColor())  // Đổi màu nền ngẫu nhiên
        }
    }

    // Hàm tạo màu ngẫu nhiên
    private fun getRandomColor(): Int {
        val random = Random
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }
}