package com.PBM.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername, etPassword;
        Button btnLogin;

        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.trim().equals("") && password.trim().equals("")) {
                    etUsername.setError("Kolom username wajib diisi!");
                    etUsername.setError("Kolom username wajib diisi!");
                } else if (username.trim().equals("") ) {
                    etUsername.setError("Kolom username wajib diisi!");
                } else if (password.trim().equals("")) {
                    etPassword.setError("Kolom password wajib diisi!");
                } else {

                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "Selamat Datang " + username, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}