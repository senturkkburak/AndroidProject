package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksSeven extends AppCompatActivity {
    private Button sevenMenu;
    private Button backSix;
    private Button FınıshClocks;
    private Button pastQuarterSound,halfSound,toQuarterSound,oclockSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_seven);


        sevenMenu = findViewById(R.id.goMenuSevenClock);
        backSix = findViewById(R.id.backClockSix);
        FınıshClocks = findViewById(R.id.goMenuSevenClock);
        pastQuarterSound=findViewById(R.id.clockPastQuarterSound);
        halfSound=findViewById(R.id.clockHalfSound);
        toQuarterSound=findViewById(R.id.clockToQuarterSound);
        oclockSound=findViewById(R.id.OclockSound);
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
        pastQuarterSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSeven.this,R.raw.quarter);
                mediaPlayer.start();
            }
        });
        halfSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSeven.this,R.raw.half);
                mediaPlayer.start();
            }
        });
        toQuarterSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSeven.this,R.raw.quarterto);
                mediaPlayer.start();
            }
        });
        oclockSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksSeven.this,R.raw.twelvenight);
                mediaPlayer.start();
            }
        });

    }
}