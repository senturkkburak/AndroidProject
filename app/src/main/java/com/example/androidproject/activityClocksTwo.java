package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityClocksTwo extends AppCompatActivity {
    private Button goMenu;
    private Button goOne;
    private Button goThree;
    private Button fourSound,fiveSound,sixSound,sevenSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_two);

        goMenu = findViewById(R.id.goMenu);
        goOne = findViewById(R.id.goClockOne);
        goThree = findViewById(R.id.goClockThree);
        fourSound=findViewById(R.id.clockFourSound);
        fiveSound=findViewById(R.id.clockFiveSound);
        sixSound=findViewById(R.id.clockSixSound);
        sevenSound=findViewById(R.id.clockSevenSound);

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
        fourSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(activityClocksTwo.this,R.raw.fouroclock);
                mediaPlayer.start();
            }
        });
        fiveSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(activityClocksTwo.this,R.raw.fiveoclock);
                mediaPlayer.start();
            }
        });
        sixSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(activityClocksTwo.this,R.raw.sixoclock);
                mediaPlayer.start();
            }
        });
        sevenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(activityClocksTwo.this,R.raw.sevenoclock);
                mediaPlayer.start();
            }
        });

    }
}