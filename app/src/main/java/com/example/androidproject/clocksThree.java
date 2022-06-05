package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksThree extends AppCompatActivity {
    public Button backMenu;
    public Button backTwo;
    public Button goFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_three);

        backMenu = findViewById(R.id.backMenu);
        backTwo = findViewById(R.id.backClockTwo);
        goFour = findViewById(R.id.goClockFour);
        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksThree.this,learn.class));
            }
        });
        backTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksThree.this,activityClocksTwo.class));
            }
        });
        goFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksThree.this,clocksFour.class));
            }
        });


    }
}