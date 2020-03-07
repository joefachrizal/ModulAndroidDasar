package com.android.cnd.latihantiga

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.android.cnd.pertemuan1.base.BaseSplitActivity

class HomeActivity : BaseSplitActivity(), View.OnClickListener {
    private lateinit var biodata: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        biodata = findViewById(R.id.btn_biodata)
        biodata.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        Toast.makeText(this, "Tombol Biodata", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, BiodataActivity::class.java)
        startActivity(intent)
    }
}