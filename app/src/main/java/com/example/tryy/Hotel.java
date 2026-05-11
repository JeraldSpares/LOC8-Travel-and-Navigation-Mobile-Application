package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.tryy.MainActivity;

public class Hotel extends AppCompatActivity {


    ImageButton imgBtn;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        imgBtn = findViewById(R.id.UserBtn);
        imgBtn2 = findViewById(R.id.LocationBtn);
        imgBtn3 = findViewById(R.id.HomeBtn);
        imgBtn4 = findViewById(R.id.BackHotelBtn);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel.this, User.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel.this, Location.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}