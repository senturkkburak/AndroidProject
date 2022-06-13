package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class months extends AppCompatActivity {
    VideoView vv6;
    private Button play6;
    private Button monthsGoMenu;
    private Button monthsGoBack;
    private Button monthsGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);
        vv6=findViewById(R.id.videoView6);
        play6 = findViewById(R.id.button12);
        monthsGoMenu=findViewById(R.id.button8);
        monthsGoBack=findViewById(R.id.button24);
        monthsGo=findViewById(R.id.button26);
        vv6.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.months);
        MediaController med= new MediaController(this);

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv6.start();
            }
        });
        monthsGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(months.this,learn.class));

            }
        });
        monthsGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(months.this,learn.class));
            }
        });
        monthsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(months.this,learn.class));

            }
        });
    }
}