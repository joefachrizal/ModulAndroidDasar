package com.android.cnd.latihanempat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BalokActivity extends AppCompatActivity {
    String title = "";
    TextView titleActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        title = getIntent().getStringExtra("KEY_TITLE");

        titleActivity = findViewById(R.id.title_balok);
        titleActivity.setText(title);
    }
}
