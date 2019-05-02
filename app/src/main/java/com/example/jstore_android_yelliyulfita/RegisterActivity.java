package com.example.jstore_android_yelliyulfita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText userInput =(EditText) findViewById(R.id.userInput);
        final EditText emailInput= (EditText) findViewById(R.id.emailInput) ;
        final EditText passInput = (EditText) findViewById(R.id.passInput);
        final Button registerButton = (Button) findViewById(R.id.loginButton);

        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

            }
        });
    }
}
