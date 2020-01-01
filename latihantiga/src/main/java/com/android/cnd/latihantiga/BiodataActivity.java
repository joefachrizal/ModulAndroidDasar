package com.android.cnd.latihantiga;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BiodataActivity extends AppCompatActivity {
    TextView name;
    String namaMhs = "Maya";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        name = findViewById(R.id.your_name);

        name.setText(namaMhs);
    }
}
