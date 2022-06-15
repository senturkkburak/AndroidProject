package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seasonsQuestionOne extends AppCompatActivity {
    private Button option3;
    private Button option4;
    private Button sound;
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_question_one);
        option3= findViewById(R.id.button35);
        option4= findViewById(R.id.button32);
        sound= findViewById(R.id.button9);
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(seasonsQuestionOne.this,R.raw.correct);
                mediaPlayer.start();
                Intent i = new Intent(seasonsQuestionOne.this, seasonsQuestionTwo.class);
                i.putExtra("score",score+10);
                startActivity(i);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(seasonsQuestionOne.this,R.raw.wrong);
                mediaPlayer.start();
                Intent i = new Intent(seasonsQuestionOne.this, seasonsQuestionTwo.class);
                i.putExtra("score",score);
                startActivity(i);
            }
        });
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(seasonsQuestionOne.this,R.raw.wintersound);
                mediaPlayer.start();

            }
        });
    }
}