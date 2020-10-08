package com.example.cobian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterKehadiranActivity extends AppCompatActivity {
    int angka = 0;
    TextView tvAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_kehadiran);

        getSupportActionBar().setTitle("Counter Kehadiran");
        tvAngka = findViewById(R.id.angka);

        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka--;
                tvAngka.setText(String.valueOf(angka));
            }
        });
        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka++;
                tvAngka.setText(String.valueOf(angka));
            }
        });



    }
}
