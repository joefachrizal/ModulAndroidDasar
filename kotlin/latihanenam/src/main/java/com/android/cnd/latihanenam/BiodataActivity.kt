package com.android.cnd.latihanenam

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BiodataActivity : AppCompatActivity() {
    private lateinit var name: TextView
    private var namaMhs : String? = "Maya"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        name = findViewById(R.id.your_name)
        name.text = namaMhs
    }
}