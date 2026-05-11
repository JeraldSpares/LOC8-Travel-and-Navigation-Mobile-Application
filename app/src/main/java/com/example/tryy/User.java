package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class User extends AppCompatActivity {

    ImageButton imgBtn;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;
    ImageButton imgBtn5;
    ImageButton imgBtn6;
    ImageButton imgBtn7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        imgBtn = findViewById(R.id.LocationBtn);
        imgBtn2 = findViewById(R.id.HomeBtn);
        imgBtn3 = findViewById(R.id.BackUserBtn);
        imgBtn4 = findViewById(R.id.SettingsBtn);
        imgBtn5 = findViewById(R.id.EditBtn);
        imgBtn6 = findViewById(R.id.EditPictureBtn);
        imgBtn7 = findViewById(R.id.LogoutBtn);




        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, Location.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, MainActivity.class);
                startActivity(intent);
            }
        });


        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, Settings.class);
                startActivity(intent);
            }
        });

        imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, EditProfile.class);
                startActivity(intent);
            }
        });

        imgBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, Profile.class);
                startActivity(intent);
            }
        });

        imgBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}