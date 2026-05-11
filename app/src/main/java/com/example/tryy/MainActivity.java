package com.example.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    ImageButton button;
    TextView textView;
    FirebaseUser user;
    ImageButton imgBtn;
    ImageButton imgBtn2;
    ImageButton imgBtn3;
    ImageButton imgBtn4;
    ImageButton imgBtn5;
    ImageButton imgBtn6;
    ImageButton imgBtn7;
    ImageButton imgBtn8;
    ImageButton imgBtn9;
    ImageButton imgBtn10;
    Dialog myDialog;
    Dialog myDialog2;
    Dialog myDialog3;
    Dialog myDialog4;
    Dialog myDialog5;
    Dialog myDialog6;
    Dialog myDialog7;
    Dialog myDialog8;
    Dialog myDialog9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.logout);
        textView = findViewById(R.id.user_details);
        user = auth.getCurrentUser();
        if (user == null){
            Intent intent = new Intent(getApplicationContext(), Featured.class);
            startActivity(intent);
            finish();
        }
        else {
            textView.setText(user.getEmail());
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Featured.class);
                startActivity(intent);
                finish();
            }
        });

        imgBtn =  findViewById(R.id.LocationBtn);
        imgBtn2 = findViewById(R.id.UserBtn);
        imgBtn3 = findViewById(R.id.UserBtn2);
        imgBtn4 = findViewById(R.id.WeatherBtn);
        imgBtn5 = findViewById(R.id.FavoritesBtn);
        imgBtn6 = findViewById(R.id.HotelBtn);
        imgBtn7 = findViewById(R.id.NotificationsBtn);
        imgBtn8 = findViewById(R.id.R8Btn);
        imgBtn9 = findViewById(R.id.R6Btn);
        imgBtn10 = findViewById(R.id.R7Btn);
        myDialog = new Dialog(this);
        myDialog2 = new Dialog(this);
        myDialog3 = new Dialog(this);
        myDialog4 = new Dialog(this);
        myDialog5 = new Dialog(this);
        myDialog6 = new Dialog(this);
        myDialog7 = new Dialog(this);
        myDialog8 = new Dialog(this);
        myDialog9 = new Dialog(this);


        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Location.class);
                startActivity(intent);
            }
        });


        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, User.class);
                startActivity(intent);
            }
        });

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, User.class);
                startActivity(intent);
            }
        });

        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Weather.class);
                startActivity(intent);
            }
        });

        imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Favorites.class);
                startActivity(intent);
            }
        });

        imgBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hotel.class);
                startActivity(intent);
            }
        });

        imgBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Notifications.class);
                startActivity(intent);
            }
        });

        imgBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Luzon.class);
                startActivity(intent);
            }
        });

        imgBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Visayas.class);
                startActivity(intent);
            }
        });

        imgBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mindanao.class);
                startActivity(intent);
            }
        });

    }
    public void ShowPopup (View v){

        myDialog.setContentView(R.layout.lf1);
        myDialog.show();

    }

    public void ShowPopup2 (View v){

        myDialog2.setContentView(R.layout.lf2);
        myDialog2.show();

    }

    public void ShowPopup3 (View v){

        myDialog3.setContentView(R.layout.lf3);
        myDialog3.show();

    }

    public void ShowPopup4 (View v){

        myDialog4.setContentView(R.layout.vf1);
        myDialog4.show();

    }

    public void ShowPopup5 (View v){

        myDialog5.setContentView(R.layout.vf2);
        myDialog5.show();

    }

    public void ShowPopup6 (View v){

        myDialog6.setContentView(R.layout.vf3);
        myDialog6.show();

    }

    public void ShowPopup7 (View v){

        myDialog7.setContentView(R.layout.mf1);
        myDialog7.show();

    }

    public void ShowPopup8 (View v){

        myDialog8.setContentView(R.layout.mf2);
        myDialog8.show();

    }

    public void ShowPopup9 (View v){

        myDialog9.setContentView(R.layout.mf3);
        myDialog9.show();

    }


}