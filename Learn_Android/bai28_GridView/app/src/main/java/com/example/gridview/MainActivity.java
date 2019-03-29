package com.example.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.model.HinhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvHinh;
    ArrayList<Integer> dsHinh;
    HinhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        gvHinh=findViewById(R.id.gvHinh);
        dsHinh= new ArrayList<>();
        dsHinh.add(R.drawable.hinh1);
        dsHinh.add(R.drawable.hinh2);
        dsHinh.add(R.drawable.hinh3);
        dsHinh.add(R.drawable.hinh4);
        dsHinh.add(R.drawable.hinh5);
        dsHinh.add(R.drawable.hinh6);
        dsHinh.add(R.drawable.hinh7);
        dsHinh.add(R.drawable.hinh8);
        dsHinh.add(R.drawable.hinh9);
        dsHinh.add(R.drawable.hinh10)   ;

        adapter= new HinhAdapter(MainActivity.this, R.layout.item, dsHinh);
        gvHinh.setAdapter(adapter);


    }
}
