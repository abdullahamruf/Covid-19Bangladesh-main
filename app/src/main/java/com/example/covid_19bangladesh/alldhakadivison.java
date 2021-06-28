package com.example.covid_19bangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class alldhakadivison extends AppCompatActivity {
ScrollView sc;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldhakadivison);
        sc=findViewById(R.id.scrl);
        sc.setVisibility(View.VISIBLE);
        b1=(Button)findViewById(R.id.btnTrac1);
        b2=(Button)findViewById(R.id.kash);
        b3=(Button)findViewById(R.id.SS);
        b4=(Button)findViewById(R.id.mutijodda);
        b5=(Button)findViewById(R.id.tungipara);
        b6=(Button)findViewById(R.id.btnfar);
        b7=(Button)findViewById(R.id.gazipurpur);
        b8=(Button)findViewById(R.id.tangail);
        b9=(Button)findViewById(R.id.narshingdi);
        b10=(Button)findViewById(R.id.madaripur);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),g1.class));

            }

        });
    }
}