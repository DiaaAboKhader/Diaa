package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main12);

        ImageButton buttonHome1 = findViewById(R.id.button_home);
        ImageButton buttonCart1 = findViewById(R.id.button_cart);

        buttonHome1.setImageResource(R.drawable.mdi_house);
        buttonCart1.setImageResource(R.drawable.mdi_light_cart);


        Button button36 = findViewById(R.id.button36);
        button36.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity12.this, MainActivity13.class);
            startActivity(intent);
        });
        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity12.this, MainActivity13.class);
            startActivity(intent);
        });
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity12.this, MainActivity13.class);
            startActivity(intent);
        });

    }
}
