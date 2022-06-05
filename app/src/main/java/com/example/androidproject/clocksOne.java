package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksOne extends AppCompatActivity {
    private Button goLearn;
    private Button backOne;
    private Button goOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_one);

        goLearn = findViewById(R.id.menu);
        backOne = findViewById(R.id.backone);
        goOne = findViewById(R.id.goOne);

        goLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksOne.this,learn.class));
            }
        });
        backOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksOne.this,learn.class));
            }
        });
        goOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksOne.this,activityClocksTwo.class));
            }
        });
    }
}