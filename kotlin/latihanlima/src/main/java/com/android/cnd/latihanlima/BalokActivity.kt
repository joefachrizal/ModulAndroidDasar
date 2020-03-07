package com.android.cnd.latihanlima

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BalokActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var titleActivity: TextView
    private lateinit var hasil: TextView
    private lateinit var btnProses: Button
    private lateinit var inputPanjang: EditText
    private lateinit var inputLebar: EditText
    private lateinit var inputTinggi: EditText

    private var title: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)
        inputPanjang = findViewById(R.id.input_panjang)
        inputLebar = findViewById(R.id.input_lebar)
        inputTinggi = findViewById(R.id.input_tinggi)
        titleActivity = findViewById(R.id.title_balok)
        btnProses = findViewById(R.id.btn_proses)
        hasil = findViewById(R.id.hasil)
        title = intent.getStringExtra("KEY_TITLE")
        titleActivity.text = title
        btnProses.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val panjang = inputPanjang.text.toString().trim { it <= ' ' }
        val lebar = inputLebar.text.toString().trim { it <= ' ' }
        val tinggi = inputTinggi.text.toString().trim { it <= ' ' }
        var isEmpty = false
        if (TextUtils.isEmpty(panjang)) {
            isEmpty = true
            inputPanjang.error = "Tidak boleh Kosong"
        }
        if (TextUtils.isEmpty(lebar)) {
            isEmpty = true
            inputLebar.error = "Tidak boleh Kosong"
        }
        if (TextUtils.isEmpty(tinggi)) {
            isEmpty = true
            inputTinggi.error = "Tidak boleh Kosong"
        }
        if (!isEmpty) {
            val volumeBalok = java.lang.Double.valueOf(panjang) * java.lang.Double.valueOf(lebar) * java.lang.Double.valueOf(tinggi)
            hasil.text = volumeBalok.toString()
        }
    }
}