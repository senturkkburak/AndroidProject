package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class directions extends AppCompatActivity {
    private Button goMenuDirection;
    private Button goBackDirection;
    private Button goDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);

        goMenuDirection = findViewById(R.id.directionsMenu);
        goBackDirection = findViewById(R.id.directionsBack);
        goDirection = findViewById(R.id.directionsGo);

        goMenuDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(directions.this,learn.class));
            }
        });
        goBackDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(directions.this,learn.class));
            }
        });
        goDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(directions.this,learn.class));
            }
        });
    }
}