package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class multiplicationQuestionTwo extends AppCompatActivity {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_question_two);
        option1= findViewById(R.id.button5);
        option2= findViewById(R.id.button22);
        option3= findViewById(R.id.button29);
        option4= findViewById(R.id.button30);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int score = extras.getInt("score");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionTwo.this,R.raw.wrong);
                    mediaPlayer.start();
                    Intent i = new Intent(multiplicationQuestionTwo.this, multiplicationQuestionThree.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
            });
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionTwo.this,R.raw.correct);
                    mediaPlayer.start();
                    Intent i = new Intent(multiplicationQuestionTwo.this, multiplicationQuestionThree.class);
                    i.putExtra("score",score+10);
                    startActivity(i);
                }
            });
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionTwo.this,R.raw.wrong);
                    mediaPlayer.start();
                    Intent i = new Intent(multiplicationQuestionTwo.this, multiplicationQuestionThree.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
            });
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(multiplicationQuestionTwo.this,R.raw.wrong);
                    mediaPlayer.start();
                    Intent i = new Intent(multiplicationQuestionTwo.this, multiplicationQuestionThree.class);
                    i.putExtra("score",score);
                    startActivity(i);
                }
            });
        }
    }
}