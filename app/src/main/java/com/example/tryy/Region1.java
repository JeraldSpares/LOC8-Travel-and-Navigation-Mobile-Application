package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Region1 extends AppCompatActivity {

    ImageButton imgBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region1);

        imgBtn = findViewById(R.id.R1BackBtn);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Region1.this, Luzon.class);
                startActivity(intent);
            }
        });

    }
}