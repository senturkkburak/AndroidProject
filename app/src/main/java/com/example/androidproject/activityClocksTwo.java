package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityClocksTwo extends AppCompatActivity {
    private Button goMenu;
    private Button goOne;
    private Button goThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_two);

        goMenu = findViewById(R.id.goMenu);
        goOne = findViewById(R.id.goClockOne);
        goThree = findViewById(R.id.goClockThree);

        goMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activityClocksTwo.this,learn.class));
            }
        });
        goOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activityClocksTwo.this,clocksOne.class));
            }
        });
        goThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activityClocksTwo.this,clocksThree.class));
            }
        });
    }
}