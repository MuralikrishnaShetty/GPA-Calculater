package com.example.markcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fifthsem extends AppCompatActivity {
    EditText firstsub,secondsub,thirdsub,fourthsub,fifthsub,sixthsub,seventhsub,eightsub,ninthsub;
    Button calculate;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthsem);
        firstsub=(EditText) findViewById(R.id.firstsub4);
        secondsub = (EditText) findViewById(R.id.secondsub4);
        thirdsub = (EditText) findViewById(R.id.thirdsub4);
        fourthsub = (EditText) findViewById(R.id.fourthsub4);
        fifthsub = (EditText) findViewById(R.id.fifthsub4);
        sixthsub = (EditText) findViewById(R.id.sixthsub4);
        seventhsub = (EditText) findViewById(R.id.seventhsub4);
        eightsub = (EditText) findViewById(R.id.eightsub4);
        ninthsub=(EditText)findViewById(R.id.ninthsub4);
        r = findViewById(R.id.result6);
        calculate=(Button) findViewById(R.id.calculate6);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int one=Integer.parseInt(firstsub.getText().toString());
                int two=Integer.parseInt(secondsub.getText().toString());
                int three=Integer.parseInt(thirdsub.getText().toString());
                int four=Integer.parseInt(fourthsub.getText().toString());
                int five=Integer.parseInt(fifthsub.getText().toString());
                int six=Integer.parseInt(sixthsub.getText().toString());
                int seven=Integer.parseInt(seventhsub.getText().toString());
                int eight=Integer.parseInt(eightsub.getText().toString());
                int ninth=Integer.parseInt(ninthsub.getText().toString());
                int grade ;
                if (one >= 90) {
                    grade = 10;
                } else if (one >= 80 && one<90) {
                    grade = 9;
                } else if (one >= 70 && one <80) {
                    grade = 8;
                } else if (one >= 60 && one <70) {
                    grade = 7;
                } else if (one >= 45 && one <60) {
                    grade = 6;
                } else if (one >= 40 && one <45) {
                    grade = 4;
                } else {
                    grade = 0;
                }
                int grade1 ;
                if (two >= 90) {
                    grade1 = 10;
                } else if (two >= 80 && two<90) {
                    grade1 = 9;
                } else if (two >= 70 && two <80) {
                    grade1 = 8;
                } else if (two >= 60 && two <70) {
                    grade1 = 7;
                } else if (two >= 45 && two <60) {
                    grade1 = 6;
                } else if (two >= 40 && two <45) {
                    grade1 = 4;
                } else {
                    grade1 = 0;
                }
                int grade2 ;
                if (three >= 90) {
                    grade2 = 10;
                } else if (three >= 80 && three<90) {
                    grade2 = 9;
                } else if (three >= 70 && three <80) {
                    grade2 = 8;
                } else if (three >= 60 && three <70) {
                    grade2 = 7;
                } else if (three >= 45 && three <60) {
                    grade2 = 6;
                } else if (three >= 40 && three <45) {
                    grade2 = 4;
                } else {
                    grade2 = 0;
                }
                int grade3 ;
                if (four >= 90) {
                    grade3 = 10;
                } else if (four >= 80 && four<90) {
                    grade3 = 9;
                } else if (four >= 70 && four <80) {
                    grade3 = 8;
                } else if (four >= 60 && four <70) {
                    grade3 = 7;
                } else if (four >= 45 && four <60) {
                    grade3 = 6;
                } else if (four >= 40 && four <45) {
                    grade3 = 4;
                } else {
                    grade3 = 0;
                }
                int grade4 ;
                if (five >= 90) {
                    grade4 = 10;
                } else if (five >= 80 && five<90) {
                    grade4 = 9;
                } else if (five >= 70 && five <80) {
                    grade4 = 8;
                } else if (five >= 60 && five <70) {
                    grade4 = 7;
                } else if (five >= 45 && five <60) {
                    grade4 = 6;
                } else if (five >= 40 && five <45) {
                    grade4 = 4;
                } else {
                    grade4 = 0;
                }
                int grade5 ;
                if (six >= 90) {
                    grade5 = 10;
                } else if (six >= 80 && six<90) {
                    grade5 = 9;
                } else if (six >= 70 && six <80) {
                    grade5 = 8;
                } else if (six >= 60 && six <70) {
                    grade5 = 7;
                } else if (six >= 45 && six <60) {
                    grade5 = 6;
                } else if (six >= 40 && six <45) {
                    grade5 = 4;
                } else {
                    grade5 = 0;
                }
                int grade6 ;
                if (seven >= 90) {
                    grade6 = 10;
                } else if (seven >= 80 && seven<90) {
                    grade6 = 9;
                } else if (seven >= 70 && seven <80) {
                    grade6 = 8;
                } else if (seven >= 60 && seven <70) {
                    grade6 = 7;
                } else if (seven >= 45 && seven <60) {
                    grade6 = 6;
                } else if (seven >= 40 && seven <45) {
                    grade6 = 4;
                } else {
                    grade6= 0;
                }
                int grade7 ;
                if (eight >= 90) {
                    grade7 = 10;
                } else if (eight >= 80 && eight<90) {
                    grade7 = 9;
                } else if (eight >= 70 && eight <80) {
                    grade7 = 8;
                } else if (eight >= 60 && eight <70) {
                    grade7 = 7;
                } else if (eight >= 45 && eight <60) {
                    grade7 = 6;
                } else if (eight >= 40 && eight <45) {
                    grade7 = 4;
                } else {
                    grade7 = 0;
                }
                int grade8 ;
                if (ninth >= 90) {
                    grade8 = 10;
                } else if (ninth >= 80 && ninth<90) {
                    grade8 = 9;
                } else if (ninth >= 70 && ninth <80) {
                    grade8 = 8;
                } else if (ninth >= 60 && ninth <70) {
                    grade8 = 7;
                } else if (ninth >= 45 && ninth <60) {
                    grade8 = 6;
                } else if (ninth >= 40 && ninth <45) {
                    grade8 = 4;
                } else {
                    grade8 = 0;
                }
                double ans;
                ans=(grade*3)+(grade1*4)+(grade2*4)+(grade3*3)+(grade4*3)+(grade5*3)+(grade6*2)+(grade7*2)+(grade8*1);

                double total=ans/25
                        ;
                // r.setText("SGPA:"+ans);
                r.setText("SGPA:"+total);

            }
        });
    }
}