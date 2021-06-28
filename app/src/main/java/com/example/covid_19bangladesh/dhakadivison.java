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
                "MUKTIJODDHA COMPLEX, MOKSEDPUR,GOPALGANJ", "TUNGIPARA UHC NEW BUILDING,GOPALGANJ"
                , "UPAZILLA SASTHOCOMPLEX,SALTA,   FARIDPUR", "SODOR HOSPITAL,SARIATPUR","MA OHS SHISHU KOLLAN KENDRO, MEGHDUBI,GAZIPUR"
                ,"ZILLA HOSPITAL,TRAUMACENTRE,TANGAIL","100 BED ZILLA HOSPITAL,NARSHINGDI","250 SOJJA HOSPITAL NEW,MADARIPUR"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0  ||position == 1  ||position == 2  ||position == 3  ||position == 4  || position==5 || position ==6 || position ==7 || position ==8 || position ==9) {
                    Intent myIntent = new Intent(view.getContext(),alldhakadivison.class);
                    startActivityForResult(myIntent, 0);
                }
            }

        });
    }
    }
