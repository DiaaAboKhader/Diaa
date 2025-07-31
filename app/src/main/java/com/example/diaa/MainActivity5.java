package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button backBtn = findViewById(R.id.back);
        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
            startActivity(intent);
        });

        Button registerBtn = findViewById(R.id.button_register);
        registerBtn.setOnClickListener(v -> {
            // رسالة الترحيب عند التسجيل
            Toast.makeText(MainActivity5.this, "أهلاً بك، تم إنشاء حساب بنجاح", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity5.this, MainActivity7.class);
            startActivity(intent);
        });
    }
}
