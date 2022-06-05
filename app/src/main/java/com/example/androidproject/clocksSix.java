package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksSix extends AppCompatActivity {
    private Button sixMenu;
    private Button backFive;
    private Button goSeven;
    private Button twentySound,twentyoneSound,twentytwoSound,twentythreeSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_six);

        sixMenu = findViewById(R.id.goMenuFive);
        backFive = findViewById(R.id.backClockFour);
        goSeven = findViewById(R.id.goClockSix);
        twentySound=findViewById(R.id.clockTwentySound);
        twentyoneSound=findViewById(R.id.clockTwentyoneSound);
        twentytwoSound=findViewById(R.id.clockTwentytwoSound);
        twentythreeSound=findViewById(R.id.clockTwentythreeSound);
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
        twentySound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSix.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        twentyoneSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSix.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        twentytwoSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSix.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        twentythreeSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSix.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
    }
}