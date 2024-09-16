package com.frendy.logina4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        // Event listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = usernameEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                // Ambil data pengguna dari SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                String savedUsername = sharedPreferences.getString("username", "");
                String savedPassword = sharedPreferences.getString("password", "");

                // Validasi username dan password
                if (inputUsername.equals(savedUsername) && inputPassword.equals(savedPassword)) {
                    // Jika valid, pindah ke halaman HomeActivity
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("username", savedUsername);
                    startActivity(intent);
                    finish();
                } else {
                    // Jika tidak valid, tampilkan pesan error
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Fungsi untuk pindah ke RegisterActivity jika belum punya akun
    public void launchRegisterActivity(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
