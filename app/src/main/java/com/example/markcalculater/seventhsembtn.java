package com.example.markcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seventhsembtn extends AppCompatActivity {
    Button ise,eee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventhsembtn);
        ise=(Button) findViewById(R.id.isecse);
        eee=(Button) findViewById(R.id.eee);
        //ise button
        ise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Iseseventhsem.class);
                startActivity(intent);

            }
        });
        //eee button
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),eeeseventhsem
                        .class);
                startActivity(intent);

            }
        });
    }
}