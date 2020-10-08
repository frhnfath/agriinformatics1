package com.example.cobian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().setTitle("Komunitas Mobile Apps Dev");

        RelativeLayout Counter = findViewById(R.id.Counter);
        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,CounterKehadiranActivity.class));
            }
        });

        RelativeLayout Tentang = findViewById(R.id.TentangSaya);
        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,TentangSayaActivity.class));
            }
        });

        RelativeLayout Gallery = findViewById(R.id.Gallery);
        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,GalleryActivity.class));
            }
        });
    }
}
