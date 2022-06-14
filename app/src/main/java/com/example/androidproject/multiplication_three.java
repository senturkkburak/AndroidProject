package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplication_three extends AppCompatActivity {
    private Button buttonMultiMenuThree;
    private Button buttonMultiTwo;
    private Button buttonGoMenu;
    private Button multTwoSound14;
    private Button multTwoSound9;
    private Button multTwoSound12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_three);

        buttonMultiMenuThree = findViewById(R.id.buttonMultiMenuThree);
        buttonGoMenu = findViewById(R.id.buttonGoMenu);
        buttonMultiTwo = findViewById(R.id.buttonMultiTwo);
        multTwoSound14 = findViewById(R.id.button);
        multTwoSound9 = findViewById(R.id.button27);
        multTwoSound12 = findViewById(R.id.button2r);

        buttonMultiMenuThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_three.this, learn.class));
            }
        });

        buttonGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_three.this, learn.class));
            }
        });

        buttonMultiTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_three.this, multiplication_two.class));
            }
        });
        multTwoSound14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_three.this,R.raw.fourteendigit);
                mediaPlayer.start();
            }
        });
        multTwoSound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_three.this,R.raw.ninedigit);
                mediaPlayer.start();
            }
        });
        multTwoSound12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_three.this,R.raw.twelvedigit);
                mediaPlayer.start();
            }
        });


    }
}