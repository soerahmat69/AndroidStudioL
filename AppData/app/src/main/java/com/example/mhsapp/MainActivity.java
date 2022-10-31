package com.example.mhsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bshare = findViewById(R.id.share);
        Bshare.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, shared.class)));

        Button Broom = findViewById(R.id.room);
        Broom.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, data_diri.class)));

    }
}