package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksThree extends AppCompatActivity {
    public Button backMenu;
    public Button backTwo;
    public Button goFour;
    private Button eightSound,nineSound,tenSound,elevenSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_three);

        backMenu = findViewById(R.id.backMenu);
        backTwo = findViewById(R.id.backClockTwo);
        goFour = findViewById(R.id.goClockFour);
        eightSound=findViewById(R.id.clockEightSound);
        nineSound=findViewById(R.id.clockNineSound);
        tenSound=findViewById(R.id.clockTenSound);
        elevenSound=findViewById(R.id.clockElevenSound);
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
        eightSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksThree.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        nineSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksThree.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        tenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksThree.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        elevenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksThree.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });


    }
}