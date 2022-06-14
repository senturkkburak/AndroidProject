package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class clockQuestionThree extends AppCompatActivity {
    private Button option1;
    private Button option2;
    private Button option3;
    private DatabaseReference reference;
    private FirebaseUser user;
    private String userID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_question_three);
        option1= findViewById(R.id.button3);
        option2= findViewById(R.id.button4);
        option3= findViewById(R.id.button9);
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int score = extras.getInt("score");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(clockQuestionThree.this,R.raw.correct);
                    mediaPlayer.start();

                    reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            User userProfile = snapshot.getValue(User.class);

                            if (userProfile != null){
                                reference.child(userID).child("scoreClocks").setValue(score+10);

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(clockQuestionThree.this, "Something is wrong", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Intent i = new Intent(clockQuestionThree.this, play.class);
                    startActivity(i);
                }
            });
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(clockQuestionThree.this,R.raw.wrong);
                    mediaPlayer.start();
                    reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            User userProfile = snapshot.getValue(User.class);
                            if (userProfile != null){
                                reference.child(userID).child("scoreClocks").setValue(score);
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(clockQuestionThree.this, "Something is wrong", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Intent i = new Intent(clockQuestionThree.this, play.class);
                    startActivity(i);
                }
            });
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(clockQuestionThree.this,R.raw.wrong);
                    mediaPlayer.start();
                    reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            User userProfile = snapshot.getValue(User.class);

                            if (userProfile != null){
                                reference.child(userID).child("scoreClocks").setValue(score);

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(clockQuestionThree.this, "Something is wrong", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Intent i = new Intent(clockQuestionThree.this, play.class);
                    startActivity(i);
                }
            });

        }else{

        }
    }
}