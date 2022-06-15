package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class play extends AppCompatActivity {
    private Button playGoMenu;
    private Button playClocks;
    private Button playSeasons;
    private Button playWeekdays;
    private Button playMonths;
    private Button playDigits;
    private Button playDirections;
    private Button playMultiplication;
    private Button myScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        final Button logoutBtn = findViewById(R.id.logout);
        playGoMenu = findViewById(R.id.playGoMenu);
        playClocks = findViewById(R.id.button15);
        playSeasons = findViewById(R.id.button16);
        playWeekdays = findViewById(R.id.button17);
        playMonths = findViewById(R.id.button18);
        playDigits = findViewById(R.id.button20);
        playDirections = findViewById(R.id.button21);
        playMultiplication = findViewById(R.id.button19);
        myScores=findViewById(R.id.btnSignup10);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this, login.class));
                finish();
            }
        });

        playGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,home.class));
            }
        });
        playClocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,clockQuestionOne.class));
            }
        });
        playWeekdays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,weekdays_monday.class));
            }
        });
        playMonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,monthsJanuary.class));
            }
        });
        playDigits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,digitQuestionOne.class));
            }
        });
        playDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,directionsQuestionOne.class));
            }
        });
        playMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,multiplicationQuestionOne.class));
            }
        });
        playSeasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,seasonsQuestionOne.class));
            }
        });
        myScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(play.this,ptofil.class));
            }
        });

    }
}