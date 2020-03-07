package com.android.cnd.latihandelapan

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvDesc = findViewById<TextView>(R.id.tv_description)
        val ivPhoto = findViewById<ImageView>(R.id.iv_photo)
        val bundle = intent.extras
        if (bundle != null) {
            val name = bundle.getString("NAME")
            val desc = bundle.getString("DESC")
            val picture = bundle.getInt("PHOTO")
            tvName.text = name
            tvDesc.text = desc
            ivPhoto.setImageResource(picture)
            if (supportActionBar != null) {
                supportActionBar!!.title = "Detail Mahasiswa : $name"
            }
        }
    }
}