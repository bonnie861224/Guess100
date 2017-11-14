package com.example.user.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     EditText num = (EditText) findViewById(R.id.number);
     TextView sec = (TextView) findViewById(R.id.secret);
     TextView info = (TextView) findViewById(R.id.info);
     Button send = (Button) findViewById(R.id.send);
}
