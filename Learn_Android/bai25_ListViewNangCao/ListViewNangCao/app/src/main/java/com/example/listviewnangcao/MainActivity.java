package com.example.listviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.DanhBaAdapter;
import model.DanhBa;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhBa;
    ArrayList<DanhBa>dsDanhBa;
    DanhBaAdapter danhBaAdapter;
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
        lvDanhBa= this.<ListView>findViewById(R.id.lvDanhBa);
        dsDanhBa= new ArrayList<>();
        dsDanhBa.add(new DanhBa(1,"Nguyen Văn A", "012356789"));
        dsDanhBa.add(new DanhBa(2,"Nguyen Văn B", "012356654"));
        dsDanhBa.add(new DanhBa(3,"Nguyen Thị C", "012356389"));

        danhBaAdapter= new DanhBaAdapter(MainActivity.this, R.layout.item, dsDanhBa);

        lvDanhBa.setAdapter(danhBaAdapter);

    }
}
