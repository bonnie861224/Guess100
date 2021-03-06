package com.example.user.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static com.example.user.guess100.R.id.number;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int ram = random.nextInt(100) + 1;
    int max = 100;
    int min = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess100(View view) {
        TextView sec = (TextView) findViewById(R.id.secret);
        sec.setText(Integer.toString(ram));
        EditText edNumber = (EditText) findViewById(number);
        TextView s = (TextView) findViewById(R.id.secret);
        TextView i = (TextView) findViewById(R.id.info);
        Button b = (Button) findViewById(R.id.send);
        int num = Integer.parseInt(edNumber.getText().toString());
        if (num > ram) {
            new AlertDialog.Builder(this)
                    .setMessage(min +" to "+num)
                    .setPositiveButton("OK",null)
                    .show();
            max = num;
        } else if (ram > num) {
            new AlertDialog.Builder(this)
                    .setMessage(num +" to "+max)
                    .setPositiveButton("OK",null)
                    .show();
            min = num;
        } else {
            new AlertDialog.Builder(this)
                    .setMessage(num +"bomb!!!")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
}