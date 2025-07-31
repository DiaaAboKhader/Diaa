package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;  // استيراد مهم
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button goToPage7Btn = findViewById(R.id.button);
        goToPage7Btn.setOnClickListener(v -> {
            Toast.makeText(MainActivity4.this, "تم تسجيل الدخول بنجاح", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity4.this, MainActivity7.class);
            startActivity(intent);
        });

        // نص إرشادي لمربع البريد الإلكتروني
        EditText emailEditText = findViewById(R.id.editText);
        emailEditText.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(MainActivity4.this, "من فضلك أدخل بريدك الإلكتروني", Toast.LENGTH_SHORT).show();
            }
        });

        // نص إرشادي لمربع كلمة المرور
        EditText passwordEditText = findViewById(R.id.editText2);
        passwordEditText.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(MainActivity4.this, "من فضلك أدخل كلمة المرور", Toast.LENGTH_SHORT).show();
            }
        });

        Button forgetPassBtn = findViewById(R.id.fotgetpass);
        forgetPassBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity6.class);
            startActivity(intent);
        });

        Button backBtn = findViewById(R.id.back);
        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
            startActivity(intent);
        });

        ImageButton imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, Links.class);
            startActivity(intent);
        });

        ImageButton apl = findViewById(R.id.apl);
        apl.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, Links.class);
            startActivity(intent);
        });

        ImageButton imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity4.this, Links.class);
            startActivity(intent);
        });
    }
}
