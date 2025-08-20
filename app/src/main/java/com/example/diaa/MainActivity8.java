package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ImageButton buttonHome1 = findViewById(R.id.button_home);
        ImageButton buttonCart1 = findViewById(R.id.button_cart);

        buttonHome1.setImageResource(R.drawable.mdi_house);
        buttonCart1.setImageResource(R.drawable.mdi_light_cart);

        GridView gvCart = findViewById(R.id.gv_products);

        String[] names = {"Italian bedroom", "American sofa", "Dining table", "Single sofa"};
        int[] images = {R.drawable.start, R.drawable.thirdhome, R.drawable.homefifth, R.drawable.secondhome};

        CartAdapter adapter = new CartAdapter(this, names, images);
        gvCart.setAdapter(adapter);

        ImageButton buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity7.class);
            startActivity(intent);
        });

        ImageButton buttonStar = findViewById(R.id.button_star);
        buttonStar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
            startActivity(intent);
        });

        ImageButton buttonProfile = findViewById(R.id.button_profile);
        buttonProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
            startActivity(intent);
        });

        ImageButton buttonCart = findViewById(R.id.button_cart);
        buttonCart.setOnClickListener(v -> {
        });

        Button btn = findViewById(R.id.btn_continue);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity8.this, MainActivity12.class);
            startActivity(intent);
        });

    }
}
