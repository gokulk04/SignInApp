package com.example.gokul.signinapp_1_8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ProfilePictureActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnNext3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile_picture);

        btnNext3 = (Button) this.findViewById(R.id.btnNext3);
        btnNext3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.btnNext3:
                Intent profPicToWelcome = new Intent(ProfilePictureActivity.this, WelcomeActivity.class);
                startActivity(profPicToWelcome);

                break;
            default:
                break;
        }

    }
}
