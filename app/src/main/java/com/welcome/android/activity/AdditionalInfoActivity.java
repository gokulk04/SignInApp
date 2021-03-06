package com.welcome.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.welcome.android.R;

public class AdditionalInfoActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnNext2to3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_info);
        btnNext2to3 = (Button) this.findViewById(R.id.btnNext2to3);
        btnNext2to3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btnNext2to3:
                Intent AddInfoToProfPic = new Intent(AdditionalInfoActivity.this, ProfilePictureActivity.class);
                startActivity(AddInfoToProfPic);
                break;
            default:
                break;
        }
    }
}
