package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplication_three extends AppCompatActivity {
    private Button buttonMultiMenuThree;
    private Button buttonMultiTwo;
    private Button buttonGoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_three);

        buttonMultiMenuThree = findViewById(R.id.buttonMultiMenuThree);
        buttonGoMenu = findViewById(R.id.buttonGoMenu);
        buttonMultiTwo = findViewById(R.id.buttonMultiTwo);

        buttonMultiMenuThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_three.this, home.class));
            }
        });

        buttonGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_three.this, home.class));
            }
        });

        buttonMultiTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(multiplication_three.this, multiplication_two.class));
            }
        });
    }
}