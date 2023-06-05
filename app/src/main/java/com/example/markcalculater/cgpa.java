package com.example.markcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cgpa extends AppCompatActivity {
    EditText first,second,third,fourth,fifth,sixth,seventh,eight;
    Button calculate;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        calculate=(Button) findViewById(R.id.calculate);
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        third = (EditText) findViewById(R.id.third);
        fourth = (EditText) findViewById(R.id.fourth);
        fifth = (EditText) findViewById(R.id.fifth);
        sixth = (EditText) findViewById(R.id.sixth);
        seventh = (EditText) findViewById(R.id.seventh);
        eight = (EditText) findViewById(R.id.eight);
        r = findViewById(R.id.result);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float one = Float.parseFloat(first.getText().toString());
                float two=Float.parseFloat(second.getText().toString());
                float three=Float.parseFloat(third.getText().toString());
                float four=Float.parseFloat(fourth.getText().toString());
                float five=Float.parseFloat(fifth.getText().toString());
                float six=Float.parseFloat(sixth.getText().toString());
                float seven=Float.parseFloat(seventh.getText().toString());
                float eigh=Float.parseFloat(eight.getText().toString());
                int div=8;

                if (one == 0) {
                    div--;
                }
                if (two == 0) {
                    div--;
                }
                if (three == 0) {
                    div--;
                }
                if (four == 0) {
                    div--;
                }
                if (five == 0) {
                    div--;
                }
                if (six == 0) {
                    div--;
                }
                if (seven == 0) {
                    div--;
                }
                if (eigh == 0) {
                    div--;
                }
                float result=one+two+three+four+five+six+seven+eigh;
                float ans=result/div;
                r.setText("CGPA:"+ans);

            }
        });

    }
}