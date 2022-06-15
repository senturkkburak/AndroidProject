package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class home extends AppCompatActivity {
    private Button signout;
    private  Button profile;
    private Button learn;
    private Button play;
    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
    private TextView scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        signout = findViewById(R.id.logout);
        profile=findViewById(R.id.button);
        learn = findViewById(R.id.learn);
        play = findViewById(R.id.buttonPlay);
        scores=findViewById(R.id.textView103);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,ptofil.class));
            }
        });
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(home.this,welcome.class));
            }
        });
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,learn.class));
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,play.class));
            }
        });
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();
        final TextView greetingTextView = findViewById(R.id.textView4);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);
                Integer clock=snapshot.child("scoreClocks").getValue(Integer.class);
                Integer digit=snapshot.child("scoreDigits").getValue(Integer.class);
                Integer dir=snapshot.child("scoreDirections").getValue(Integer.class);
                Integer mon=snapshot.child("scoreMonths").getValue(Integer.class);
                Integer mul=snapshot.child("scoreMultiplication").getValue(Integer.class);
                Integer sea=snapshot.child("scoreSeasons").getValue(Integer.class);
                Integer week=snapshot.child("scoreWeekdays").getValue(Integer.class);
                Integer sum=clock+digit+dir+mon+mul+sea+week;

                if (userProfile != null){
                    String fullName = userProfile.fullname;
                    greetingTextView.setText("Welcome, "+fullName);
                    scores.setText("Clocks: "+clock+"/30\nDigits: "+digit+"/30\nDirections: "+dir+"/20\nMonths: "+mon+"/20\nMultiplication: "+mul+"/30\nSeasons: "+sea+"/20\nWeekdays: "+week+"/20\nTotal: "+sum+"/170");


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(home.this, "Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}