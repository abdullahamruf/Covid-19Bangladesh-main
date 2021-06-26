package com.example.covid_19bangladesh;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class dhakadivison  extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhakadivison);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"DOCTORS QUARTER SHEKSAHERAKHATUN MCH,GOPALGANJ ","KASHIANI NEW HOSPITAL ,GOPALGANJ",
                "MUKTIJODDHA COMPLEX, MOKSEDPUR,GOPALGANJ", "TUNGIPARA UHC NEW BUILDING,GOPALGANJ",
                "UPOZILASASTHO COMPLEX NEW BUILDING, SALTA", "List View onClick Source Code", "List View Array Adapter Item Click",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), list_item_1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), kahsiani.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(),muktijodda.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(),tungipara.class);
                    startActivityForResult(myIntent, 0);
                }
            }

        });
    }
    }
