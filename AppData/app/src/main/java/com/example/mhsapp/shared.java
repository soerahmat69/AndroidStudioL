package com.example.mhsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class shared extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView nama,npm,kelas,prodi;
    Button selesai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared);


         npm = findViewById(R.id.npm);
        nama = findViewById(R.id.nama);
        kelas = findViewById(R.id.kelas);
        prodi = findViewById(R.id.prodi);
        selesai = findViewById(R.id.selesai);

        sharedPreferences = getSharedPreferences("shared", MODE_PRIVATE);

        nama.setText(sharedPreferences.getString("nama",null));
        kelas.setText(sharedPreferences.getString("kelas",null));
        prodi.setText(sharedPreferences.getString("prodi",null));
        npm.setText(sharedPreferences.getString("npm",null));

        selesai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                Intent intent = new Intent(shared.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
