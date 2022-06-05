package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksFour extends AppCompatActivity {
    private Button fourMenu;
    private Button backThree;
    private Button goFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_four);

        fourMenu = findViewById(R.id.fourMenu);
        backThree = findViewById(R.id.backClockThree);
        goFive = findViewById(R.id.goClockFive);
        fourMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksFour.this,learn.class));
            }
        });
        backThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksFour.this,clocksThree.class));
            }
        });
        goFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksFour.this,clocksFive.class));
            }
        });


    }
}