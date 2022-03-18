package com.PBM.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView txtViewUsername;
        String username;
        Button btn;

        txtViewUsername = findViewById(R.id.txt_view_username);
        btn = findViewById(R.id.back);

        Intent intent = getIntent();
        username = intent.getStringExtra("username");

        txtViewUsername.setText(username);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah activity Main
                Intent intent2 = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}