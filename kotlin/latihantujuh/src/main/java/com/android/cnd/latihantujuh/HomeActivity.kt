package com.android.cnd.latihantujuh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.android.cnd.pertemuan1.base.BaseSplitActivity

class HomeActivity : BaseSplitActivity(), View.OnClickListener {
    private lateinit var btnLinear: Button
    private lateinit var btnRelative: Button
    private lateinit var btnConstraint: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnLinear = findViewById(R.id.btn_linear)
        btnRelative = findViewById(R.id.btn_relative)
        btnConstraint = findViewById(R.id.btn_constraint)
        btnLinear.setOnClickListener(this)
        btnRelative.setOnClickListener(this)
        btnConstraint.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_linear -> {
                Toast.makeText(this, "Biodata Linear", Toast.LENGTH_SHORT).show()
                val intentLinear = Intent(this, BiodataLinearActivity::class.java)
                intentLinear.putExtra("KEY_TITLE", "Biodata Linear")
                startActivity(intentLinear)
            }
            R.id.btn_relative -> {
                Toast.makeText(this, "Biodata Relative", Toast.LENGTH_SHORT).show()
                val intentRelative = Intent(this, BiodataRelativeActivity::class.java)
                intentRelative.putExtra("KEY_TITLE", "Biodata Relative")
                startActivity(intentRelative)
            }
            R.id.btn_constraint -> {
                Toast.makeText(this, "Biodata Constraint", Toast.LENGTH_SHORT).show()
                val intentConstraint = Intent(this, BiodataConstrainActivity::class.java)
                intentConstraint.putExtra("KEY_TITLE", "Biodata Constraint")
                startActivity(intentConstraint)
            }
        }
    }
}