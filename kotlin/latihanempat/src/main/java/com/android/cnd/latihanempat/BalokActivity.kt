package com.android.cnd.latihanempat

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BalokActivity : AppCompatActivity() {
    private lateinit var titleActivity: TextView
    private var title: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)
        title = intent.getStringExtra("KEY_TITLE")
        titleActivity = findViewById(R.id.title_balok)
        titleActivity.text = title
    }
}