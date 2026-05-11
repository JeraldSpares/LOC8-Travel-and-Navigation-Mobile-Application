package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Luzon extends AppCompatActivity {

    ImageButton imgBtn;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;
    ImageButton imgBtn5;
    ImageButton imgBtn6;
    ImageButton imgBtn7;
    ImageButton imgBtn8;
    ImageButton imgBtn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luzon);

        imgBtn = findViewById(R.id.BackLuzonBtn);
        imgBtn2 = findViewById(R.id.R1Btn);
        imgBtn3 = findViewById(R.id.R2Btn);
        imgBtn4 = findViewById(R.id.R3Btn);
        imgBtn5 = findViewById(R.id.R4ABtn);
        imgBtn6 = findViewById(R.id.R4BBtn);
        imgBtn7 = findViewById(R.id.R5Btn);
        imgBtn8 = findViewById(R.id.NCRBtn);
        imgBtn9 = findViewById(R.id.CARBtn);




        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, Region1.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, Region2.class);
                startActivity(intent);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, Region3.class);
                startActivity(intent);
            }
        });

        imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, Region4a.class);
                startActivity(intent);
            }
        });

        imgBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, Region4b.class);
                startActivity(intent);
            }
        });

        imgBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, Region5.class);
                startActivity(intent);
            }
        });

        imgBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, NCR.class);
                startActivity(intent);
            }
        });

        imgBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Luzon.this, CAR.class);
                startActivity(intent);
            }
        });

    }
}