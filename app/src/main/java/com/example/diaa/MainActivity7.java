package com.example.diaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        GridView gridView1 = findViewById(R.id.gridview);
        CustomAdapter adapter1 = new CustomAdapter(this, 4);
        gridView1.setAdapter(adapter1);

        ImageButton btnHome = findViewById(R.id.button_home);
        ImageButton btnCart = findViewById(R.id.button_cart);
        ImageButton btnSearch = findViewById(R.id.button_search);
        ImageButton btnStar = findViewById(R.id.button_star);
        ImageButton btnProfile = findViewById(R.id.button_profile);

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity7.class);
            startActivity(intent);
            finish();
        });

        btnCart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
            startActivity(intent);
        });



        btnStar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity9.class);
            startActivity(intent);
        });

        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity10.class);
            startActivity(intent);
        });
    }
}
