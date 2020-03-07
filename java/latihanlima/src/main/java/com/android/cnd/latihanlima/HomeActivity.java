package com.android.cnd.latihanlima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.cnd.pertemuan1.base.BaseSplitActivity;

public class HomeActivity extends BaseSplitActivity implements View.OnClickListener  {

    Button biodata, luasBalok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        biodata = findViewById(R.id.btn_biodata);
        luasBalok = findViewById(R.id.btn_balok);

        biodata.setOnClickListener(this);
        luasBalok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_biodata:
                Toast.makeText(this, "Tombol Biodata", Toast.LENGTH_SHORT).show();
                Intent intentBiodata = new Intent(this, BiodataActivity.class);
                startActivity(intentBiodata);
                break;
            case R.id.btn_balok:
                Toast.makeText(this, "Tombol Luas Balok", Toast.LENGTH_SHORT).show();
                Intent intentBalok = new Intent(this, BalokActivity.class);
                intentBalok.putExtra("KEY_TITLE","Luas Balok");
                startActivity(intentBalok);
                break;
        }
    }
}