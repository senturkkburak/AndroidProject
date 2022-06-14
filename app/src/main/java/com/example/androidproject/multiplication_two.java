package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplication_two extends AppCompatActivity {
    private Button buttonMultiMenu;
    private Button buttonGoOne;
    private Button buttonMultiThree;
    private Button multTwoSoundsix;
    private Button multTwoSoundeight;
    private Button multTwoSoundten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_two);

        buttonMultiMenu = findViewById(R.id.buttonMultiMenu);
        buttonGoOne = findViewById(R.id.buttonGoOne);
        buttonMultiThree = findViewById(R.id.buttonMultiThree);
        multTwoSoundsix = findViewById(R.id.button);
        multTwoSoundeight = findViewById(R.id.button13);
        multTwoSoundten = findViewById(R.id.button25);

        buttonMultiMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_two.this,learn.class));
            }
        });

        buttonGoOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_two.this,multiplication_one.class));
            }
        });

        buttonMultiThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_two.this,multiplication_three.class));
            }
        });
        multTwoSoundsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_two.this,R.raw.sixdigit);
                mediaPlayer.start();
            }
        });
        multTwoSoundeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_two.this,R.raw.eightdigit);
                mediaPlayer.start();
            }
        });
        multTwoSoundten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplication_two.this,R.raw.tendigit);
                mediaPlayer.start();
            }
        });

    }
}