package com.android.cnd.latihantiga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.cnd.pertemuan1.base.BaseSplitActivity;

public class HomeActivity extends BaseSplitActivity implements View.OnClickListener {
    Button biodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        biodata = findViewById(R.id.btn_biodata);

        biodata.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Tombol Biodata", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }
}
