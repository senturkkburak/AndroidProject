package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class digits extends AppCompatActivity {
    private Button goMenu;
    private Button back;
    private Button go;
    private Button digitSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digits);

        goMenu = findViewById(R.id.digitsMenu);
        back = findViewById(R.id.digitsBack);
        go = findViewById(R.id.digitsGo);
        digitSound = findViewById(R.id.digitSoundButton);
        goMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(digits.this,learn.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(digits.this,learn.class));
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(digits.this,learn.class));
            }
        });
        digitSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(digits.this,R.raw.zyzz);
                mediaPlayer.start();
            }
        });
    }
}