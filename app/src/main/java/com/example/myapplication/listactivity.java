package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listactivity extends AppCompatActivity {


    ListView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);
       listView = (ListView) findViewById(R.id.list);
        final ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("Windows");
        arrayList.add("Iphone");
        arrayList.add("Linux");
        arrayList.add("Blackberry");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent si=new Intent(listactivity.this,DeviceDetail.class);
                startActivity(si);
            }
        });

    }
}
