package com.example.diaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageButton backBtn = findViewById(R.id.back);
        backBtn.setOnClickListener(v -> finish());

        Button loginBtn = findViewById(R.id.button);
        loginBtn.setOnClickListener(v -> {
            Toast.makeText(MainActivity4.this, "تم تسجيل الدخول بنجاح", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity4.this, MainActivity7.class));
            finish();
        });

        TextView forgetBtn = findViewById(R.id.fotgetpass);
        forgetBtn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity4.this, MainActivity6.class))
        );

        ImageButton googleBtn = findViewById(R.id.imageView4);
        ImageButton appleBtn = findViewById(R.id.apl);
        ImageButton facebookBtn = findViewById(R.id.imageView3);

        googleBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, Links.class)));
        appleBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, Links.class)));
        facebookBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, Links.class)));

        EditText emailEditText = findViewById(R.id.editText);
        EditText passwordEditText = findViewById(R.id.editText2);

        emailEditText.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) Toast.makeText(MainActivity4.this, "من فضلك أدخل بريدك الإلكتروني", Toast.LENGTH_SHORT).show();
        });

        passwordEditText.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) Toast.makeText(MainActivity4.this, "من فضلك أدخل كلمة المرور", Toast.LENGTH_SHORT).show();
        });
    }
}
