package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageButton backBtn = findViewById(R.id.back);
        backBtn.setOnClickListener(v -> {
            finish();
        });

        Button registerBtn = findViewById(R.id.button_register);
        registerBtn.setOnClickListener(v -> {
            Toast.makeText(MainActivity5.this, "أهلاً بك، تم إنشاء حساب بنجاح", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity5.this, MainActivity7.class);
            startActivity(intent);
            finish(); //
        });
    }
}
