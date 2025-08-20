package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        ImageButton buttonHome1 = findViewById(R.id.button_home);
        ImageButton buttonProfile1 = findViewById(R.id.button_profile);

        buttonHome1.setImageResource(R.drawable.mdi_house);
        buttonProfile1.setImageResource(R.drawable.frame);

        ImageButton buttonProfile = findViewById(R.id.button_home);
        buttonProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity10.this, MainActivity7.class);
            startActivity(intent);
        });
        ImageButton buttonCart = findViewById(R.id.button_cart);
        buttonCart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity10.this, MainActivity8.class);
            startActivity(intent);
        });
        ImageButton buttonSearch = findViewById(R.id.button_search);
        buttonSearch.setOnClickListener(v -> {
        });
        ImageButton buttonStar = findViewById(R.id.button_star);
        buttonStar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity10.this, MainActivity9.class);
            startActivity(intent);
        });
        ImageButton buttonHome = findViewById(R.id.button_profile);
        buttonHome.setOnClickListener(v -> {
        });
    }
}
