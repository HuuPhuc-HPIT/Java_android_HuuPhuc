package com.example.momotmanhinh_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoMotManHinh(View view) {

        //doi so 1: man hinh hien tai
        //doi so 2: man hinh muon mo
        Intent i=new Intent(MainActivity.this, ManHinh2Activity.class);
        //gui lenh toi Android system de mo man hinh
        startActivity(i);
    }
}
