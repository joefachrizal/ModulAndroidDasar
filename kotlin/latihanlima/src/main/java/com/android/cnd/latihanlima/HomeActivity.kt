package com.android.cnd.latihanlima

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.android.cnd.pertemuan1.base.BaseSplitActivity

class HomeActivity : BaseSplitActivity(), View.OnClickListener {
    private lateinit var biodata: Button
    private lateinit var luasBalok: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        biodata = findViewById(R.id.btn_biodata)
        luasBalok = findViewById(R.id.btn_balok)
        biodata.setOnClickListener(this)
        luasBalok.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_biodata -> {
                Toast.makeText(this, "Tombol Biodata", Toast.LENGTH_SHORT).show()
                val intentBiodata = Intent(this, BiodataActivity::class.java)
                startActivity(intentBiodata)
            }
            R.id.btn_balok -> {
                Toast.makeText(this, "Tombol Luas Balok", Toast.LENGTH_SHORT).show()
                val intentBalok = Intent(this, BalokActivity::class.java)
                intentBalok.putExtra("KEY_TITLE", "Luas Balok")
                startActivity(intentBalok)
            }
        }
    }
}