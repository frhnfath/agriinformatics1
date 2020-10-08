package com.example.cobian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TentangSayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_saya);

        getSupportActionBar().setTitle("Tentang Saya");
    }
}
