package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.tryy.MainActivity;

public class Notifications extends AppCompatActivity {

    ImageButton imgBtn;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        imgBtn = findViewById(R.id.HomeBtn);
        imgBtn2 = findViewById(R.id.LocationBtn);
        imgBtn3 = findViewById(R.id.UserBtn);
        imgBtn4 = findViewById(R.id.BackNotificationBtn);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notifications.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notifications.this, Location.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notifications.this, User.class);
                startActivity(intent);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notifications.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}