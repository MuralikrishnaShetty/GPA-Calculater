package com.example.markcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class eightsem extends AppCompatActivity {
    EditText firstsub,secondsub,thirdsub,fourthsub,fifthsub;
    Button calculate;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightsem);
        firstsub=(EditText) findViewById(R.id.firstsub7);
        secondsub = (EditText) findViewById(R.id.secondsub7);
        thirdsub = (EditText) findViewById(R.id.thirdsub7);
        fourthsub = (EditText) findViewById(R.id.fourthsub7);
        fifthsub = (EditText) findViewById(R.id.fifthsub7);
        r = findViewById(R.id.result9);
        calculate=(Button) findViewById(R.id.calculate9);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int one=Integer.parseInt(firstsub.getText().toString());
                int two=Integer.parseInt(secondsub.getText().toString());
                int three=Integer.parseInt(thirdsub.getText().toString());
                int four=Integer.parseInt(fourthsub.getText().toString());
                int five=Integer.parseInt(fifthsub.getText().toString());


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



                double ans;
                ans=(grade*3)+(grade1*3)+(grade2*8)+(grade3*1)+(grade4*3);

                double total=ans/18;
                //  r.setText("S:" +grade+""+grade1+""+grade2+""+grade3+""+grade4+""+grade5+""+grade6+""+ans);

                r.setText("SGPA:"+total);

            }
        });
    }
}