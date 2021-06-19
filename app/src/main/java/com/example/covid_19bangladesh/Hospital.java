package com.example.covid_19bangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class Hospital extends AppCompatActivity {
    ScrollView scrollView;
    Button call1,call2,call3,call4,call5,call6,call7,call8,call9,btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        call1 = findViewById(R.id.callbutton2);
        call2 = findViewById(R.id.callbutton1);
        call3= findViewById(R.id.callbutton3);
        call4= findViewById(R.id.callbutton4);
        call5= findViewById(R.id.callbutton5);
        call6= findViewById(R.id.callbutton6);
        call7= findViewById(R.id.callbutton7);
        call8= findViewById(R.id.callbutton8);
        call9= findViewById(R.id.callbutton9);
        btn= findViewById(R.id.btnTrac);




        scrollView=findViewById(R.id.scrollStatss);


        scrollView.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(),"COVID-19 HOSPITAL IN DHAKA CITY",Toast.LENGTH_SHORT).show();

        call1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01711307069"));
                startActivity(intent);

            }
        });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01819221115"));
                startActivity(intent);

            }
        });
        call3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01711535042"));
                startActivity(intent);

            }
        });
        call4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01718884476"));
                startActivity(intent);

            }
        });
        call5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01720427959"));
                startActivity(intent);

            }
        });
        call6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01769010201"));
                startActivity(intent);

            }
        });
        call9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01737299248"));
                startActivity(intent);

            }
        });
        call7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01980222211"));
                startActivity(intent);

            }
        });
        call8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01980222211"));
                startActivity(intent);

            }
        });








    }
    public void goTrackhospital(View view) {

        startActivity(new Intent(getApplicationContext(), hospitalfind.class));

    }
}
