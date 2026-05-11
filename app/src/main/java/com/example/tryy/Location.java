package com.example.tryy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Location extends AppCompatActivity implements OnMapReadyCallback {

    ImageButton imgBtn;
    ImageButton imgBtn2;
    private GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.location);
        mapFragment.getMapAsync(this);
        imgBtn = findViewById(R.id.HomeBtn);
        imgBtn2 = findViewById(R.id.UserBtn);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Location.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Location.this, User.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        LatLng location = new LatLng(12.8797, 121.7740);
        googleMap.addMarker(new MarkerOptions().position(location).title("Philippines"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,12));
    }
}