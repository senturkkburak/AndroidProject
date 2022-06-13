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
    private Button forwardSound;
    private Button backSound;
    private Button leftSound;
    private Button rightSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);

        goMenuDirection = findViewById(R.id.directionsMenu);
        goBackDirection = findViewById(R.id.directionsBack);
        goDirection = findViewById(R.id.directionsGo);
        forwardSound = findViewById(R.id.digitSoundButton2);
        backSound = findViewById(R.id.digitSoundButton3);
        leftSound = findViewById(R.id.digitSoundButton4);
        rightSound = findViewById(R.id.digitSoundButton5);

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
        forwardSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(directions.this,R.raw.forward);
                mediaPlayer.start();
            }
        });
        backSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(directions.this,R.raw.back);
                mediaPlayer.start();
            }
        });
        leftSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(directions.this,R.raw.left);
                mediaPlayer.start();
            }
        });
        rightSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(directions.this,R.raw.right);
                mediaPlayer.start();
            }
        });
    }
}