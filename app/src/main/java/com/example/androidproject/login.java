package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://androidproject-c61f6-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText mail = findViewById(R.id.editTextTextEmailAddress);
        final EditText password = findViewById(R.id.editTextTextPassword);
        final Button loginBtn = findViewById(R.id.button2);
        final Button register = findViewById(R.id.btnSignup);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String mailtxt = mail.getText().toString();
                final String passwordtxt = password.getText().toString();

                if (mailtxt.isEmpty() || passwordtxt.isEmpty()){
                    Toast.makeText(login.this, "Please enter all information", Toast.LENGTH_SHORT).show();

                }else{
                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(mailtxt)){
                                final String getPassword = snapshot.child(mailtxt).child("password").getValue(String.class);
                                if (getPassword.equals(passwordtxt)){
                                    Toast.makeText(login.this, "Login Successfull!", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(login.this, play.class));
                                    finish();
                                }else{
                                    Toast.makeText(login.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                                }
                            }else{
                                Toast.makeText(login.this, "Invalid Username", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this, sign.class));
            }
        });



    }
}