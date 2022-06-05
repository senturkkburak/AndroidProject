package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksSix extends AppCompatActivity {
    private Button sixMenu;
    private Button backFive;
    private Button goSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_six);

        sixMenu = findViewById(R.id.goMenuFive);
        backFive = findViewById(R.id.backClockFour);
        goSeven = findViewById(R.id.goClockSix);
        sixMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksSix.this,learn.class));
            }
        });
        backFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksSix.this,clocksFive.class));
            }
        });
        goSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksSix.this,clocksSeven.class));
            }
        });
    }
}