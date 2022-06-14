package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class clockQuestionOne extends AppCompatActivity {
    private Button clockplayGo;
    private Button option1;
    private Button option2;
    private Button option3;
    private int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_question_one);
        clockplayGo= findViewById(R.id.button14);
        option1= findViewById(R.id.button3);
        option2= findViewById(R.id.button4);
        option3= findViewById(R.id.button9);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clockQuestionOne.this,R.raw.wrong);
                mediaPlayer.start();
                Intent i = new Intent(clockQuestionOne.this, clockQuestionTwo.class);
                i.putExtra("score",score);
                startActivity(i);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clockQuestionOne.this,R.raw.wrong);
                mediaPlayer.start();
                Intent i = new Intent(clockQuestionOne.this, clockQuestionTwo.class);
                i.putExtra("score",score);
                startActivity(i);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(clockQuestionOne.this,R.raw.correct);
                mediaPlayer.start();
                Intent i = new Intent(clockQuestionOne.this, clockQuestionTwo.class);
                i.putExtra("score",score+10);
                startActivity(i);
            }
        });
    }
}