package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.tryy.MainActivity;

public class Mindanao extends AppCompatActivity {

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
        setContentView(R.layout.activity_mindanao);


        imgBtn = findViewById(R.id.BackMindanaoBtn);
        imgBtn2 = findViewById(R.id.R9Btn);
        imgBtn3 = findViewById(R.id.R10Btn);
        imgBtn4 = findViewById(R.id.R11Btn);
        imgBtn5 = findViewById(R.id.R12Btn);
        imgBtn6 = findViewById(R.id.R13Btn);
        imgBtn7 = findViewById(R.id.BARMMBtn);


        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, Region9.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, Region10.class);
                startActivity(intent);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, Region11.class);
                startActivity(intent);
            }
        });

        imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, Region12.class);
                startActivity(intent);
            }
        });

        imgBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, Region13.class);
                startActivity(intent);
            }
        });

        imgBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mindanao.this, BARMM.class);
                startActivity(intent);
            }
        });
    }
}