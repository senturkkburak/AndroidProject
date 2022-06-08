package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplication_two extends AppCompatActivity {
    private Button buttonMultiMenu;
    private Button buttonGoOne;
    private Button buttonMultiThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_two);

        buttonMultiMenu = findViewById(R.id.buttonMultiMenu);
        buttonGoOne = findViewById(R.id.buttonGoOne);
        buttonMultiThree = findViewById(R.id.buttonMultiThree);

        buttonMultiMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_two.this,home.class));
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

    }
}