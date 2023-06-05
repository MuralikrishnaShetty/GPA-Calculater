package com.example.markcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sgpa extends AppCompatActivity {
    Button physics,chemistry,thirdSem,fourthSem,fifthSem,sixthSem,seventhSem,eightSem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa);
        seventhSem=(Button)findViewById(R.id.seventhSem);
        physics=(Button)findViewById(R.id.physics);
        chemistry=(Button)findViewById(R.id.chemisty);
        thirdSem=(Button)findViewById(R.id.thirdSem);
        fourthSem=(Button)findViewById(R.id.fourthSem);
        fifthSem=(Button)findViewById(R.id.fifthSem);
        eightSem=(Button)findViewById(R.id.eightSem) ;
        sixthSem=(Button)findViewById(R.id.sixthSem);
        //eight sem button
        eightSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),eightsem.class);
                startActivity(intent);
            }
        });
        //sixth sem button
        sixthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),sixthsem.class);
                startActivity(intent);
            }
        });
        //fifth sem button
        fifthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),fifthsem.class);
                startActivity(intent);
            }
        });
        //fourth sem button
        fourthSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),fourthsem.class);
                startActivity(intent);
            }
        });

        //third sem button
        thirdSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),thirdsem.class);
                startActivity(intent);


            }
        });
        //chemistry button
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),firshsem_chem.class);
                startActivity(intent);

            }
        });
        //physics button
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),firstsemPhy.class);
                startActivity(intent);

            }
        });
        //seventhSem button
        seventhSem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),seventhsembtn.class);
                startActivity(intent);
            }
        });
    }
}