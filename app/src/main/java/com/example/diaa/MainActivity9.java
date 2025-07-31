package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton button1 = findViewById(R.id.button_profile);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity7.class);
            startActivity(intent);
        });
        ImageButton button2 = findViewById(R.id.button_cart);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
            startActivity(intent);
        });
        ImageButton button3 = findViewById(R.id.button_search);
        button3.setOnClickListener(v -> {
        });
        ImageButton button4 = findViewById(R.id.button_star);
        button4.setOnClickListener(v -> {
        });
        ImageButton button5 = findViewById(R.id.button_home);
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity10.class);
            startActivity(intent);
        });


    }
}
