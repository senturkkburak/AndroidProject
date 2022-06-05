package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksOne extends AppCompatActivity {
    private Button goLearn;
    private Button backOne;
    private Button goOne;
    private Button zeroSound,oneSound,twoSound,threeSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_one);

        goLearn = findViewById(R.id.menu);
        backOne = findViewById(R.id.backone);
        goOne = findViewById(R.id.goOne);
        zeroSound=findViewById(R.id.clockZeroSound);
        oneSound=findViewById(R.id.clockOneSound);
        twoSound=findViewById(R.id.clockTwoSound);
        threeSound=findViewById(R.id.clockThreeSound);

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
        zeroSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksOne.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        oneSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksOne.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        twoSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksOne.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        threeSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksOne.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });

    }
}