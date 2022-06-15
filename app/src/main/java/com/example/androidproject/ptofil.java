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

public class ptofil extends AppCompatActivity {
    private Button signout;
    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
    private Button profilGoMenu;
    private DatabaseReference r1;
    private DatabaseReference r2;
    private DatabaseReference r3;
    private DatabaseReference r4;
    private DatabaseReference r5;
    private DatabaseReference r6;
    private DatabaseReference r7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptofil);

        signout = findViewById(R.id.logout);
        profilGoMenu = findViewById(R.id.profilGoMenu);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ptofil.this,welcome.class));
            }
        });
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();
        final TextView fullnameTextView = findViewById(R.id.textView15);
        final TextView emailTextView = findViewById(R.id.textView16);
        final TextView scoresText = findViewById(R.id.textView21);
        r1 =FirebaseDatabase.getInstance().getReference("Users").child("scoreClocks");
        r2 =FirebaseDatabase.getInstance().getReference("Users").child("scoreDigits");
        r3 =FirebaseDatabase.getInstance().getReference("Users").child("scoreDirections");
        r4 =FirebaseDatabase.getInstance().getReference("Users").child("scoreMonths");
        r5 =FirebaseDatabase.getInstance().getReference("Users").child("scoreMultiplication");
        r6 =FirebaseDatabase.getInstance().getReference("Users").child("scoreSeasons");
        r7 =FirebaseDatabase.getInstance().getReference("Users").child("scoreWeekdays");

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if (userProfile != null){
                    String fullName = userProfile.fullname;
                    String email = userProfile.email;
                    fullnameTextView.setText("Fullname: "+fullName);
                    emailTextView.setText("E-Mail: "+email);


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ptofil.this, "Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });
        profilGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ptofil.this,home.class));
            }
        });
    }
}