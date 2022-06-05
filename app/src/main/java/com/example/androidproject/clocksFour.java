package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksFour extends AppCompatActivity {
    private Button fourMenu;
    private Button backThree;
    private Button goFive;
    private Button twelveSound,thirteenSound,fourteenSound,fifteenSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_four);

        fourMenu = findViewById(R.id.fourMenu);
        backThree = findViewById(R.id.backClockThree);
        goFive = findViewById(R.id.goClockFive);
        twelveSound=findViewById(R.id.clockTwelveSound);
        thirteenSound=findViewById(R.id.clockThirteenSound);
        fourteenSound=findViewById(R.id.clockFourteenSound);
        fifteenSound=findViewById(R.id.clockFifteenSound);
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
        twelveSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFour.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        thirteenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFour.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        fourteenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFour.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        fifteenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFour.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });


    }
}