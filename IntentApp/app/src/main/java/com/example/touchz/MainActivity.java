package com.example.touchz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnTentang = findViewById(R.id.BtnTentang);

        BtnTentang.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Tentang.class)));

    }
}


