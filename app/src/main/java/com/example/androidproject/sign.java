package com.example.androidproject;

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

public class sign extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://androidproject-c61f6-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        final EditText fullname = findViewById(R.id.editTextTextPersonName3);
        final EditText mail = findViewById(R.id.editTextTextEmailAddress2);
        final EditText password = findViewById(R.id.editTextTextPassword2);
        final Button loginBtn = findViewById(R.id.logout);
        final Button register = findViewById(R.id.buttonsign2);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fullnameTxt = fullname.getText().toString();
                final String mailTxt = mail.getText().toString();
                final String passwordTxt = password.getText().toString();

                if (fullnameTxt.isEmpty() || mailTxt.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(sign.this, "Please enter all information", Toast.LENGTH_SHORT).show();

                }else{
                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(mailTxt)){
                                Toast.makeText(sign.this, "User already registered!", Toast.LENGTH_SHORT).show();
                            }else{
                                databaseReference.child("users").child(mailTxt).child("fullname").setValue(fullnameTxt);
                                databaseReference.child("users").child(mailTxt).child("username").setValue(mailTxt);
                                databaseReference.child("users").child(mailTxt).child("password").setValue(passwordTxt);

                                Toast.makeText(sign.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                                finish();

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }

            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });





    }


}