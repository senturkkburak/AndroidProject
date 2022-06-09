package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplication_one extends AppCompatActivity {
    private Button buttonMenuMultiOne;
    private Button buttonMultiBack;
    private Button buttonMultiGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_one);

        buttonMenuMultiOne = findViewById(R.id.buttonMenuMultiOne);
        buttonMultiBack = findViewById(R.id.buttonMultiBack);
        buttonMultiGo = findViewById(R.id.buttonMultiGo);

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
    }
}