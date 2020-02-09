package com.android.cnd.pertemuan1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.cnd.pertemuan1.R;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SplitInstallManager manager;
    String packageNameModule = "";
    String dynamicModuleClassName = "";
    String toastText = "";

    private Button latihanSatu, latihanDua, latihanTiga, latihanEmpat, latihanLima, latihanEnam, latihanTujuh , latihanDelapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = SplitInstallManagerFactory.create(this);
        packageNameModule = getPackageName();

        initButton();
        buttonSetClicked();
    }

    /*ini untuk Inisialisasi Button*/
    private void initButton() {
        latihanSatu = findViewById(R.id.task_one_one);
        latihanDua = findViewById(R.id.task_one_two);
        latihanTiga = findViewById(R.id.task_two_one);
        latihanEmpat = findViewById(R.id.task_two_two);
        latihanLima = findViewById(R.id.task_tree_one);
        latihanEnam = findViewById(R.id.task_tree_two);
        latihanTujuh = findViewById(R.id.task_five_one);
        latihanDelapan = findViewById(R.id.task_six_one);
    }

    /*ini untuk Mengaktifkan Button*/
    private void buttonSetClicked() {
        latihanSatu.setOnClickListener(this);
        latihanDua.setOnClickListener(this);
        latihanTiga.setOnClickListener(this);
        latihanEmpat.setOnClickListener(this);
        latihanLima.setOnClickListener(this);
        latihanEnam.setOnClickListener(this);
        latihanTujuh.setOnClickListener(this);
        latihanDelapan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.task_one_one:
                toastText = "Modul Latihan 1";
                dynamicModuleClassName = "com.android.cnd.latihansatu.BiodataActivity";
                break;
            case R.id.task_one_two:
                toastText = "Modul Latihan 2";
                dynamicModuleClassName = "com.android.cnd.latihandua.BiodataActivity";
                break;
            case R.id.task_two_one:
                toastText = "Modul Latihan 3";
                dynamicModuleClassName = "com.android.cnd.latihantiga.HomeActivity";
                break;
            case R.id.task_two_two:
                toastText = "Modul Latihan 4";
                dynamicModuleClassName = "com.android.cnd.latihanempat.HomeActivity";
                break;
            case R.id.task_tree_one:
                toastText = "Modul Latihan 5";
                dynamicModuleClassName = "com.android.cnd.latihanlima.HomeActivity";
                break;
            case R.id.task_tree_two:
                toastText = "Modul Latihan 6";
                dynamicModuleClassName = "com.android.cnd.latihanenam.HomeActivity";
                break;
            case R.id.task_five_one:
                toastText = "Modul Latihan 6";
                dynamicModuleClassName = "com.android.cnd.latihantujuh.HomeActivity";
                break;
            case R.id.task_six_one:
                toastText = "Modul Latihan 8";
                dynamicModuleClassName = "com.android.cnd.latihandelapan.DataMahasiswaActivity";
                break;
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent().setClassName(packageNameModule, dynamicModuleClassName);
        intent.putExtra("TITLE_NAME", toastText);
        startActivity(intent);
    }
}
