package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplication_one extends AppCompatActivity {
    private Button buttonMenuMultiOne;
    private Button buttonMultiBack;
    private Button buttonMultiGo;
    private Button multOneSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_one);

        buttonMenuMultiOne = findViewById(R.id.buttonMenuMultiOne);
        buttonMultiBack = findViewById(R.id.buttonMultiBack);
        buttonMultiGo = findViewById(R.id.buttonMultiGo);
        multOneSound = findViewById(R.id.button);
        buttonMenuMultiOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_one.this,learn.class));
            }
        });
        buttonMultiBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_one.this,learn.class));
            }
        });
        buttonMultiGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_one.this,multiplication_two.class));
            }
        });
        multOneSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_one.this,R.raw.ninedigit);
                mediaPlayer.start();
            }
        });
    }
}