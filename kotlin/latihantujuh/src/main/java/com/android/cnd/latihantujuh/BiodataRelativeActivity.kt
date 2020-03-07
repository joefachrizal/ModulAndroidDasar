package com.android.cnd.latihantujuh

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BiodataRelativeActivity : AppCompatActivity() {
    private lateinit var titleName: TextView
    private var title: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata_relative)
        titleName = findViewById(R.id.title)
        title = intent.getStringExtra("KEY_TITLE")
        titleName.text = title
    }
}