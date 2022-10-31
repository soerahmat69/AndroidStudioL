package com.example.mhsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class data_diri extends AppCompatActivity {

    EditText textNpm,textNama,textKelas,textProdi;

    Button Saved;

    Intent intent;

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_diri);


        textNpm = findViewById(R.id.npm);
        textNama = findViewById(R.id.nama);
        textKelas = findViewById(R.id.kelas);
        textProdi = findViewById(R.id.prodi);
        Saved = findViewById(R.id.save);

        sharedPreferences = getSharedPreferences("shared", MODE_PRIVATE);
        sharedPreferences.contains("npm");
        sharedPreferences.contains("nama");
        sharedPreferences.contains("kelas");
        sharedPreferences.contains("prodi");

        Saved.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Npm = textNpm.getText().toString();
                String Nama = textNama.getText().toString();
                String Kelas = textKelas.getText().toString();
                String Prodi = textProdi.getText().toString();

                if (textNpm != null) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("npm", Npm);
                    editor.putString("nama", Kelas);
                    editor.putString("kelas", Nama);
                    editor.putString("prodi", Prodi);
                    editor.apply();
                    intent = new Intent(data_diri.this, shared.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(data_diri.this, "Data not valid", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );




    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Siklus hidup onStart",Toast.LENGTH_SHORT).show();
    }

}
