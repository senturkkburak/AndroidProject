package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksFive extends AppCompatActivity {
    private Button fiveMenu;
    private Button backFour;
    private Button goSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_five);

        fiveMenu = findViewById(R.id.goMenuFive);
        backFour = findViewById(R.id.backClockFour);
        goSix = findViewById(R.id.goClockSix);
        fiveMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksFive.this,learn.class));
            }
        });
        backFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksFive.this,clocksFour.class));
            }
        });
        goSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clocksFive.this,clocksSix.class));
            }
        });
    }
}