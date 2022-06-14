package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplicationQuestionOne extends AppCompatActivity {
    private Button option11;
    private Button option22;
    private Button option33;
    private Button option44;
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_question_one);
        option11= findViewById(R.id.button5);
        option22= findViewById(R.id.button22);
        option33= findViewById(R.id.button29);
        option44= findViewById(R.id.button30);

        option11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionOne.this,R.raw.correct);
                mediaPlayer.start();
                Intent i = new Intent(multiplicationQuestionOne.this, multiplicationQuestionTwo.class);
                i.putExtra("score",score+10);
                startActivity(i);
            }
        });
        option22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionOne.this,R.raw.wrong);
                mediaPlayer.start();
                Intent i = new Intent(multiplicationQuestionOne.this, multiplicationQuestionTwo.class);
                i.putExtra("score",score);
                startActivity(i);
            }
        });
        option33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionOne.this,R.raw.wrong);
                mediaPlayer.start();
                Intent i = new Intent(multiplicationQuestionOne.this, multiplicationQuestionTwo.class);
                i.putExtra("score",score);
                startActivity(i);
            }
        });
        option44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionOne.this,R.raw.wrong);
                mediaPlayer.start();
                Intent i = new Intent(multiplicationQuestionOne.this, multiplicationQuestionTwo.class);
                i.putExtra("score",score);
                startActivity(i);
            }
        });
    }
}