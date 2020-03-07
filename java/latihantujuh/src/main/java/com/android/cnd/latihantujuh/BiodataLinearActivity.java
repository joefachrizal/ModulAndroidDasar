package com.android.cnd.latihantujuh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BiodataLinearActivity extends AppCompatActivity {
    String title = "";
    TextView titleName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_linear);
        titleName = findViewById(R.id.title);
        title = getIntent().getStringExtra("KEY_TITLE");
        titleName.setText(title);

    }
}
