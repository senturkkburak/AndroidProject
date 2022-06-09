package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class sign extends AppCompatActivity {
    private FirebaseAuth mAuth;

    private EditText fullname;
    private EditText mail;
    private EditText password;
    private Button welcome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        fullname = findViewById(R.id.editTextTextPersonName3);
        mail = findViewById(R.id.editTextTextEmailAddress2);
        password = findViewById(R.id.editTextTextPassword2);
        welcome = findViewById(R.id.welcome);

        final Button register = findViewById(R.id.buttonsign2);

        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sign.this, welcome.class));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth = FirebaseAuth.getInstance();
                registerUser();

            }
        });


    }

    private void registerUser(){
        String email =mail.getText().toString().trim();
        String pass=password.getText().toString().trim();
        String name =fullname.getText().toString().trim();

        if(email.isEmpty()){
            mail.setError("Mail is required");
            mail.requestFocus();
            return;
        }if(pass.isEmpty()){
            password.setError("Mail is required");
            password.requestFocus();
            return;
        }if(name.isEmpty()){
            fullname.setError("Mail is required");
            fullname.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            mail.setError("Email is not valid");
            mail.requestFocus();
            return;
        }
        if (pass.length() < 6){
            password.setError("Min password length should be 6 characters");
            password.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            User user = new User(name,email);
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if (task.isSuccessful()){
                                                Toast.makeText(sign.this, "User successfully registered", Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(sign.this, login.class));
                                            }else{
                                                Toast.makeText(sign.this, "Failed to registered", Toast.LENGTH_SHORT).show();

                                            }

                                        }
                                    });
                        }else{
                            Toast.makeText(sign.this, "Failed to registered", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }
}