package com.example.listviewcoban_dulieuthaydoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String >arrTen;
    ArrayAdapter<String>adapterTen;
    ListView lvTen;

    EditText txtTen;
    Button btnLuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLuu();
            }
        });
    }

    private void xuLyLuu() {
        String ten=txtTen.getText().toString();
        arrTen.add(ten); //them du lieu moi
        adapterTen.notifyDataSetChanged(); //ra lenh cho listview cap nhat lai giao dien
        txtTen.setText("");
        txtTen.requestFocus();
    }

    private void addControls() {
        arrTen= new ArrayList<String>();
        adapterTen= new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, arrTen);
        lvTen= this.<ListView>findViewById(R.id.lvTen);
        lvTen.setAdapter(adapterTen);

        txtTen= this.<EditText>findViewById(R.id.txtTen);
        btnLuu= this.<Button>findViewById(R.id.btnLuu);

    }
}
