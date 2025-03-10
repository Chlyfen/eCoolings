package com.chlyfenrichard.ecooling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.badge.BadgeUtils;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_activity);

    username = findViewById(R.id.userName);
    password = findViewById(R.id.password);
    loginButton = findViewById(R.id.loginButton);

    textView = findViewById(R.id.signUpText);

    loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(username.getText().toString().equals("user") && password.getText().toString().equals("1234")){
                //Toast.makeText(LoginActivity.this,"Login Succesfull",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
            } else{
                Toast.makeText(LoginActivity.this,"Kombinasi username dan password salah",Toast.LENGTH_SHORT).show();
            }
        }
    });

    //
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

    }
}



