package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton goToPage7Btn = findViewById(R.id.button_profile);
        goToPage7Btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity7.class);
            startActivity(intent);
        });
        ImageButton goToPage9Btn = findViewById(R.id.button_star);
        goToPage9Btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
            startActivity(intent);
        });
        ImageButton goToPage10Btn = findViewById(R.id.button_home);
        goToPage10Btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
            startActivity(intent);
        });
        ImageButton buttonProfile = findViewById(R.id.button_cart);
        buttonProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity8.class);
            startActivity(intent);
        });
        Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity12.class);
            startActivity(intent);
        });
    }
}
