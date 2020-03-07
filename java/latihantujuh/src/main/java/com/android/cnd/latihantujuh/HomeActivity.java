package com.android.cnd.latihantujuh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.cnd.pertemuan1.base.BaseSplitActivity;

public class HomeActivity extends BaseSplitActivity implements View.OnClickListener  {

    Button btnLinear, btnRelative, btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnConstraint = findViewById(R.id.btn_constraint);

        btnLinear.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnConstraint.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_linear:
                Toast.makeText(this, "Biodata Linear", Toast.LENGTH_SHORT).show();
                Intent intentLinear = new Intent(this, BiodataLinearActivity.class);
                intentLinear.putExtra("KEY_TITLE","Biodata Linear");
                startActivity(intentLinear);
                break;
            case R.id.btn_relative:
                Toast.makeText(this, "Biodata Relative", Toast.LENGTH_SHORT).show();
                Intent intentRelative= new Intent(this, BiodataRelativeActivity.class);
                intentRelative.putExtra("KEY_TITLE","Biodata Relative");
                startActivity(intentRelative);
                break;
            case R.id.btn_constraint:
                Toast.makeText(this, "Biodata Constraint", Toast.LENGTH_SHORT).show();
                Intent intentConstraint = new Intent(this, BiodataConstrainActivity.class);
                intentConstraint.putExtra("KEY_TITLE","Biodata Constraint");
                startActivity(intentConstraint);
                break;
        }
    }
}