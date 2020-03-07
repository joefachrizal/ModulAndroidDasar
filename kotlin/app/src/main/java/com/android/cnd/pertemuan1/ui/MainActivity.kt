package com.android.cnd.pertemuan1.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.cnd.pertemuan1.R
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var manager: SplitInstallManager? = null
    var packageNameModule = ""
    var dynamicModuleClassName = ""
    var toastText = ""
    private lateinit var latihanSatu: Button
    private lateinit var latihanDua: Button
    private lateinit var latihanTiga: Button
    private lateinit var latihanEmpat: Button
    private lateinit var latihanLima: Button
    private lateinit var latihanEnam: Button
    private lateinit var latihanTujuh: Button
    private lateinit var latihanDelapan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = SplitInstallManagerFactory.create(this)
        packageNameModule = packageName
        initButton()
        buttonSetClicked()
    }

    /*ini untuk Inisialisasi Button*/
    private fun initButton() {
        latihanSatu = findViewById(R.id.task_one_one)
        latihanDua = findViewById(R.id.task_one_two)
        latihanTiga = findViewById(R.id.task_two_one)
        latihanEmpat = findViewById(R.id.task_two_two)
        latihanLima = findViewById(R.id.task_tree_one)
        latihanEnam = findViewById(R.id.task_tree_two)
        latihanTujuh = findViewById(R.id.task_five_one)
        latihanDelapan = findViewById(R.id.task_six_one)
    }

    /*ini untuk Mengaktifkan Button*/
    private fun buttonSetClicked() {
        latihanSatu.setOnClickListener(this)
        latihanDua.setOnClickListener(this)
        latihanTiga.setOnClickListener(this)
        latihanEmpat.setOnClickListener(this)
        latihanLima.setOnClickListener(this)
        latihanEnam.setOnClickListener(this)
        latihanTujuh.setOnClickListener(this)
        latihanDelapan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.task_one_one -> {
                toastText = "Modul Latihan 1"
                dynamicModuleClassName = "com.android.cnd.latihansatu.BiodataActivity"
            }
            R.id.task_one_two -> {
                toastText = "Modul Latihan 2"
                dynamicModuleClassName = "com.android.cnd.latihandua.BiodataActivity"
            }
            R.id.task_two_one -> {
                toastText = "Modul Latihan 3"
                dynamicModuleClassName = "com.android.cnd.latihantiga.HomeActivity"
            }
            R.id.task_two_two -> {
                toastText = "Modul Latihan 4"
                dynamicModuleClassName = "com.android.cnd.latihanempat.HomeActivity"
            }
            R.id.task_tree_one -> {
                toastText = "Modul Latihan 5"
                dynamicModuleClassName = "com.android.cnd.latihanlima.HomeActivity"
            }
            R.id.task_tree_two -> {
                toastText = "Modul Latihan 6"
                dynamicModuleClassName = "com.android.cnd.latihanenam.HomeActivity"
            }
            R.id.task_five_one -> {
                toastText = "Modul Latihan 6"
                dynamicModuleClassName = "com.android.cnd.latihantujuh.HomeActivity"
            }
            R.id.task_six_one -> {
                toastText = "Modul Latihan 8"
                dynamicModuleClassName = "com.android.cnd.latihandelapan.DataMahasiswaActivity"
            }
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show()
        val intent = Intent().setClassName(packageNameModule, dynamicModuleClassName)
        intent.putExtra("TITLE_NAME", toastText)
        startActivity(intent)
    }
}