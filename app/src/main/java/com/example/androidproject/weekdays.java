package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class weekdays extends AppCompatActivity {

    VideoView vv5;
    private Button play5;
    private Button weekDaysGoMenu;
    private Button weekDaysGoBack;
    private Button weekDaysGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekdays);
        vv5=findViewById(R.id.videoView5);
        play5 = findViewById(R.id.button12);
        weekDaysGoMenu=findViewById(R.id.button8);
        weekDaysGoBack=findViewById(R.id.button24);
        weekDaysGo=findViewById(R.id.button26);
        vv5.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.weekdays);
        MediaController med= new MediaController(this);

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv5.start();
            }
        });
        weekDaysGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(weekdays.this,learn.class));

            }
        });
        weekDaysGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(weekdays.this,learn.class));
            }
        });
        weekDaysGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(weekdays.this,learn.class));

            }
        });
    }
}