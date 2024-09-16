package com.frendy.logina4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameRegister, emailRegister, phoneRegister, passwordRegister;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameRegister = findViewById(R.id.usernameRegister);
        emailRegister = findViewById(R.id.email);
        phoneRegister = findViewById(R.id.phone);
        passwordRegister = findViewById(R.id.passwordRegister);
        registerButton = findViewById(R.id.registerButton);

        // Event listener untuk tombol Register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameRegister.getText().toString();
                String email = emailRegister.getText().toString();
                String phone = phoneRegister.getText().toString();
                String password = passwordRegister.getText().toString();

                // Validasi sederhana untuk memastikan semua field diisi
                if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    // Simpan data pengguna di SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.putString("email", email);
                    editor.putString("phone", phone);
                    editor.putString("password", password);
                    editor.apply();

                    // Tampilkan pesan sukses dan pindah ke halaman Login
                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Menutup RegisterActivity agar pengguna tidak bisa kembali dengan tombol back
                }
            }
        });
    }
}
