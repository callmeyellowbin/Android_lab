package com.example.yellow.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = (Button)findViewById(R.id.login);
        Button registerButton = (Button) findViewById(R.id.register);
        final RadioButton student = (RadioButton) findViewById(R.id.student);
        final TextView account_number = (TextView)findViewById(R.id.accout_number);
        final TextView password_number = (TextView)findViewById(R.id.password_number);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (account_number.getText().length() == 0)
                    Toast.makeText(MainActivity.this, "Please input your account!", Toast.LENGTH_SHORT).show();
                else if (password_number.length() == 0)
                    Toast.makeText(MainActivity.this, "Please input your password!", Toast.LENGTH_SHORT).show();
                else {
                    if (student.isChecked())
                        Log.d("Yellow", "Type: Student");
                    else
                        Log.d("Yellow", "Type: Staff");
                    Log.d("Yellow", "Account: " + account_number.getText().toString());
                    Log.d("Yellow", "Password: " + password_number.getText().toString());
                    Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
