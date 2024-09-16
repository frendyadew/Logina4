package com.frendy.logina4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView welcomeMessage, emailMessage, phoneMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeMessage = findViewById(R.id.welcomeMessage);
        emailMessage = findViewById(R.id.emailMessage);
        phoneMessage = findViewById(R.id.phoneMessage);

        // Ambil data pengguna dari SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        String email = sharedPreferences.getString("email", "");
        String phone = sharedPreferences.getString("phone", "");

        // Tampilkan data pengguna
        welcomeMessage.setText("Welcome, " + username);
        emailMessage.setText("Your email: " + email);
        phoneMessage.setText("Your phone: " + phone);
    }
}
