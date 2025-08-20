package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ImageButton buttonHome1 = findViewById(R.id.button_home);
        ImageButton buttonStar1 = findViewById(R.id.button_star);

        buttonHome1.setImageResource(R.drawable.mdi_house);
        buttonStar1.setImageResource(R.drawable.vectora);

        GridView gv = findViewById(R.id.gv_products);

        String[] names = {"Italian bedroom","American sofa","dining table","single sofa"};
        String[] prices = {"$1199", "$299", "$499", "$799"};
        int[] images = {R.drawable.start, R.drawable.thirdhome, R.drawable.homefifth, R.drawable.fourthhome};

        ProductAdapter adapter = new ProductAdapter(this, names, prices, images);
        gv.setAdapter(adapter);


        ImageButton buttonProfile = findViewById(R.id.button_profile);
        buttonProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity10.class);
            startActivity(intent);
        });

        ImageButton buttonCart = findViewById(R.id.button_cart);
        buttonCart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
            startActivity(intent);
        });

        ImageButton buttonSearch = findViewById(R.id.button_search);
        buttonSearch.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity9.class);
            startActivity(intent);
        });

        ImageButton buttonStar = findViewById(R.id.button_star);
        buttonStar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity9.class);
            startActivity(intent);
        });

        ImageButton buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity9.class);
            startActivity(intent);
        });
    }
}
