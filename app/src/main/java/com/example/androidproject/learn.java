package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class learn extends AppCompatActivity {
    private Button clockButton;
    private Button backButton;
    private Button digitsButton;
    private Button signout;
    private Button learnDirections;
    private Button Multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        clockButton = findViewById(R.id.clock);
        backButton = findViewById(R.id.back);
        digitsButton = findViewById(R.id.digits);
        signout = findViewById(R.id.logout);
        learnDirections = findViewById(R.id.learnDirections);
        Multiplication = findViewById(R.id.learnMultiplication);

        clockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,clocksOne.class));
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,home.class));
            }
        });
        digitsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,digits.class));
            }
        });
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(learn.this,welcome.class));
            }
        });
        learnDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(learn.this,directions.class));
            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(learn.this,multiplication_one.class));
            }
        });
    }
}