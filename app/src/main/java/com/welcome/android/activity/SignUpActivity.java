package com.welcome.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.welcome.android.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {


    TextView txtRegToLogin;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtRegToLogin = (TextView) this.findViewById(R.id.txtRegToLogin);
        txtRegToLogin.setOnClickListener(this);

        btnSignUp = (Button) this.findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.txtRegToLogin:
                Intent regToLogin = new Intent(SignUpActivity.this, LogInActivity.class);
                startActivity(regToLogin);
                break;
            case R.id.btnSignUp:
                Intent regToOccupation = new Intent(SignUpActivity.this, OccupationActivity.class);
                startActivity(regToOccupation);
            default:
                break;
        }
    }
}
