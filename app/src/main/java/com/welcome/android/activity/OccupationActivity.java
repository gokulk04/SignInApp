package com.welcome.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.welcome.android.R;

public class OccupationActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar mToolbar;


    Button btnNext1to2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occupation);
        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);

        btnNext1to2 = (Button) this.findViewById(R.id.btnNext1to2);
        btnNext1to2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btnNext1to2:
                Intent occupationToAddInfo = new Intent(OccupationActivity.this, AdditionalInfoActivity.class);
                startActivity(occupationToAddInfo);
                break;
            default:
                break;
        }
    }
}
