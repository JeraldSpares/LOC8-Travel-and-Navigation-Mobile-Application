package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Favorites extends AppCompatActivity {

    ImageButton imgBtn;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        imgBtn = findViewById(R.id.HomeBtn);
        imgBtn2 = findViewById(R.id.LocationBtn);
        imgBtn3 = findViewById(R.id.UserBtn);
        imgBtn4 = findViewById(R.id.BackFavoritesBtn);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, Location.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, User.class);
                startActivity(intent);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}