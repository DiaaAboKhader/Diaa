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

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main13);

        ImageButton buttonHome1 = findViewById(R.id.button_home);
        ImageButton buttonCart1 = findViewById(R.id.button_cart);

        buttonHome1.setImageResource(R.drawable.mdi_house);
        buttonCart1.setImageResource(R.drawable.mdi_light_cart);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity13.this, MainActivity14.class);
            startActivity(intent);
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity13.this, MainActivity8.class);
            startActivity(intent);
        });


    }
}
