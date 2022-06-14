package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class digitQuestionTwo extends AppCompatActivity {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    private Button sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_question_two);

        option1= findViewById(R.id.button5);
        option2= findViewById(R.id.button22); //
        option3= findViewById(R.id.button29);
        option4= findViewById(R.id.button30);
        sound=findViewById(R.id.button9);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int score = extras.getInt("score");

            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(digitQuestionTwo.this,R.raw.sixdigit);
                    mediaPlayer.start();
                }
            });
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(digitQuestionTwo.this,R.raw.correct);
                    mediaPlayer.start();
                    Intent i = new Intent(digitQuestionTwo.this, digitQuestionThree.class);
                    i.putExtra("score",score+10);
                    startActivity(i);
                }
            });
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(digitQuestionTwo.this,R.raw.wrong);
                    mediaPlayer.start();
                    Intent i = new Intent(digitQuestionTwo.this, digitQuestionThree.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
            });
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(digitQuestionTwo.this,R.raw.wrong);
                    mediaPlayer.start();
                    Intent i = new Intent(digitQuestionTwo.this, digitQuestionThree.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
            });
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(digitQuestionTwo.this,R.raw.wrong);
                    mediaPlayer.start();
                    Intent i = new Intent(digitQuestionTwo.this, digitQuestionThree.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
            });

        }

    }
}