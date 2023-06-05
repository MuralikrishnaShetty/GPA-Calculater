package com.example.markcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button CGPA,SGPA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CGPA=(Button)findViewById(R.id.CGPA);
        SGPA=(Button) findViewById(R.id.SGPA);
        CGPA.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View v)
                                    {
                                        Intent intent =new Intent(getApplicationContext(),cgpa.class);
                                        startActivity(intent);
                                    }


                               }
        );
        SGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),sgpa.class);
                startActivity(intent);
            }
        });
    }
}