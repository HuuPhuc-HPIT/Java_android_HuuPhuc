package com.example.momanhinh_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.model.SinhVine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGuiDuLieu(View view) {
        Intent i= new Intent(MainActivity.this, ManHinh2Activity.class);
        i.putExtra("kieu_boolean", true);
        i.putExtra("Kieu_char", 'x');
        i.putExtra("Kieu_int", 100);
        i.putExtra("kieu_Double", 15.99);
        i.putExtra("Kieu_chuoi", "HAHAHA");

        SinhVine aptech= new SinhVine(1, "Nguyen Van A");
        i.putExtra("SINHVIEN", aptech);

        startActivity(i);
    }
}
