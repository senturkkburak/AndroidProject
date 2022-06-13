package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class seasons_two extends AppCompatActivity {
    VideoView vv3;
    VideoView vv4;
    private Button play3;
    private Button play4;
    private Button seasonTwoGoMenu;
    private Button seasonTwoGoBack;
    private Button seasonTwoGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_two);

        vv3=findViewById(R.id.videoView3);
        play3 = findViewById(R.id.button28);
        play4 = findViewById(R.id.button12);
        vv4=findViewById(R.id.videoView4);
        seasonTwoGoMenu=findViewById(R.id.button8);
        seasonTwoGoBack=findViewById(R.id.button24);
        seasonTwoGo=findViewById(R.id.button26);
        vv3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.spring);
        vv4.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.summer);
        MediaController med= new MediaController(this);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv3.start();
            }
        });
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv4.start();
            }
        });
        seasonTwoGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(seasons_two.this,learn.class));

            }
        });
        seasonTwoGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(seasons_two.this,seasonsOne.class));
            }
        });
        seasonTwoGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(seasons_two.this,learn.class));

            }
        });
    }
}