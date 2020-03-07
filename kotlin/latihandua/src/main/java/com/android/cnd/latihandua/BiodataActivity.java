package com.android.cnd.latihandua;


import android.os.Bundle;
import android.widget.TextView;

import com.android.cnd.pertemuan1.base.BaseSplitActivity;

public class BiodataActivity extends BaseSplitActivity {
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
