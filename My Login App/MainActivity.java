package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton loginbutton =(MaterialButton) findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("bidipta") && password.getText().toString().equals("2001")){
                    Toast.makeText(MainActivity.this, "SUCCESSFUllY LOGGED IN", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "LOGIN UNSUCCESSFULL!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
