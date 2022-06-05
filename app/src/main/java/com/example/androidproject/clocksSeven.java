package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksSeven extends AppCompatActivity {
    private Button sevenMenu;
    private Button backSix;
    private Button FınıshClocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_seven);


        sevenMenu = findViewById(R.id.goMenuSevenClock);
        backSix = findViewById(R.id.backClockSix);
        FınıshClocks = findViewById(R.id.goMenuSevenClock);
        sevenMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksSeven.this,learn.class));
            }
        });
        backSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksSeven.this,clocksSix.class));
            }
        });
        FınıshClocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksSeven.this,learn.class));
            }
        });

    }
}