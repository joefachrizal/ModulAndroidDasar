package com.android.cnd.latihanlima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BalokActivity extends AppCompatActivity implements View.OnClickListener {
    String title = "";
    TextView titleActivity, hasil;
    Button btnProses;
    EditText inputPanjang, inputLebar, inputTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        inputPanjang = findViewById(R.id.input_panjang);
        inputLebar = findViewById(R.id.input_lebar);
        inputTinggi = findViewById(R.id.input_tinggi);
        titleActivity = findViewById(R.id.title_balok);
        btnProses = findViewById(R.id.btn_proses);
        hasil = findViewById(R.id.hasil);

        title = getIntent().getStringExtra("KEY_TITLE");
        titleActivity.setText(title);

        btnProses.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String panjang = inputPanjang.getText().toString().trim();
        String lebar = inputLebar.getText().toString().trim();
        String tinggi = inputTinggi.getText().toString().trim();

        boolean isEmpty = false;

        if (TextUtils.isEmpty(panjang)){
            isEmpty = true;
            inputPanjang.setError("Tidak boleh Kosong");
        }
        if (TextUtils.isEmpty(lebar)){
            isEmpty = true;
            inputLebar.setError("Tidak boleh Kosong");
        }
        if (TextUtils.isEmpty(tinggi)){
            isEmpty = true;
            inputTinggi.setError("Tidak boleh Kosong");
        }
        if (!isEmpty) {
            double volumeBalok = Double.valueOf(panjang) * Double.valueOf(lebar) * Double.valueOf(tinggi);
            hasil.setText(String.valueOf(volumeBalok));
        }
    }
}
