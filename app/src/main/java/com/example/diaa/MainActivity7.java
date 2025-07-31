package com.example.diaa;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        setContentView(R.layout.activity_main7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton buttonhome = findViewById(R.id.button_home);
        buttonhome.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity7.class);
            startActivity(intent);
        });
        ImageButton buttonSearch = findViewById(R.id.button_search);
        ImageButton buttonStar = findViewById(R.id.button_star);
        buttonStar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity9.class);
            startActivity(intent);
        });
        ImageButton buttonHome = findViewById(R.id.button_profile);
        buttonHome.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity10.class);
            startActivity(intent);
        });

        ImageButton buttonCart = findViewById(R.id.button_cart);
        buttonCart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
            startActivity(intent);
        });
    }
}
