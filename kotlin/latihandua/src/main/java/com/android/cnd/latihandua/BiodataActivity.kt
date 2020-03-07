package com.android.cnd.latihandua

import android.os.Bundle
import android.widget.TextView
import com.android.cnd.pertemuan1.base.BaseSplitActivity

class BiodataActivity : BaseSplitActivity() {
    private lateinit var name: TextView
    private var namaMhs : String? = "Maya"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        name = findViewById(R.id.your_name)
        name.text = namaMhs
    }
}