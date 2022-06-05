package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clocksFive extends AppCompatActivity {
    private Button fiveMenu;
    private Button backFour;
    private Button goSix;
    private Button sixteenSound,seventeenSound,eighteenSound,nineteenSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocks_five);

        fiveMenu = findViewById(R.id.goMenuFive);
        backFour = findViewById(R.id.backClockFour);
        goSix = findViewById(R.id.goClockSix);
        sixteenSound=findViewById(R.id.clockSixteenSound);
        seventeenSound=findViewById(R.id.clockSeventeenSound);
        eighteenSound=findViewById(R.id.clockEighteenSound);
        nineteenSound=findViewById(R.id.clockNineteenSound);

        fiveMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(clocksFive.this, learn.class);
                startActivity(intent);
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
        sixteenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFive.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        seventeenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFive.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        eighteenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFive.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
        nineteenSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clocksFive.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
    }
}