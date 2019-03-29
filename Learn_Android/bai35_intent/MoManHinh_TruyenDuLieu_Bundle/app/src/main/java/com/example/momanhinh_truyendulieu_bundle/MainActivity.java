package com.example.momanhinh_truyendulieu_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.model.SanPham;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoTrang(View view) {
        Intent intent= new Intent(MainActivity.this, ManHinh2Activity.class);
        Bundle b= new Bundle();
        b.putInt("X", 113);
        b.putDouble("D", 114.123);
        SanPham coca= new SanPham(1, "Coca cola", 17000.0);
        b.putSerializable("SanPham", coca);

        intent.putExtra("Bundle_la_day", b);
        startActivity(intent);
    }
}
