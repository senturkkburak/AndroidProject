package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class seasonsOne extends AppCompatActivity {
VideoView vv;
VideoView vv2;
private Button play1;
private Button play2;
private Button seasonOneGoMenu;
private Button seasonOneGoBack;
private Button seasonOneGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_one);
        vv=findViewById(R.id.videoView);
        play1 = findViewById(R.id.button11);
        play2 = findViewById(R.id.button12);
        vv2=findViewById(R.id.videoView2);
        seasonOneGoMenu=findViewById(R.id.button8);
        seasonOneGoBack=findViewById(R.id.button24);
        seasonOneGo=findViewById(R.id.button26);
        vv.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.winter);
        vv2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.fall);
        MediaController med= new MediaController(this);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv.start();
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv2.start();
            }
        });
        seasonOneGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(seasonsOne.this,learn.class));

            }
        });
        seasonOneGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(seasonsOne.this,learn.class));
            }
        });
        seasonOneGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(seasonsOne.this,seasons_two.class));
            }
        });


    }
}