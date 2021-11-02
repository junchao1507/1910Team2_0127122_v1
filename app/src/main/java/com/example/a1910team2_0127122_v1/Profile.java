package com.example.a1910team2_0127122_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton editProfile = (ImageButton) findViewById(R.id.btn_edit_profile);
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = Profile.this;
                Intent intent;

                intent = new Intent(context, EditProfile.class);
                startActivity(intent);
            }
        });

        Button updateCovidStatus = (Button) findViewById(R.id.btn_update_covid);
        updateCovidStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = Profile.this;
                Intent intent;

                intent = new Intent(context, UpdateCovidStatus.class);
                startActivity(intent);
            }
        });

        Button updateVaccine = (Button) findViewById(R.id.btn_update_vacc);
        updateVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = Profile.this;
                Intent intent;

                intent = new Intent(context, UpdateVaccinationStatus.class);
                startActivity(intent);
            }
        });

        Button close = (Button) findViewById(R.id.btn_close_profile);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = Profile.this;
                Intent intent;

                intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}