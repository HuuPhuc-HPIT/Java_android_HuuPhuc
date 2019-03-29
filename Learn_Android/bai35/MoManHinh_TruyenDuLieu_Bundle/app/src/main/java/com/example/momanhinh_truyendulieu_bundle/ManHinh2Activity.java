package com.example.momanhinh_truyendulieu_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.model.SanPham;

public class ManHinh2Activity extends AppCompatActivity {
    TextView txtKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
        addControls();
    }

    private void addControls() {
        txtKQ= this.<TextView>findViewById(R.id.txtKetQua);



        Intent intent=getIntent();
        Bundle b= intent.getBundleExtra("Bundle_la_day");

        SanPham sp= (SanPham) b.getSerializable("SanPham");

        txtKQ.setText("X= "+b.getInt("X")+"\n"+
                        "D= "+b.getDouble("D")+"\n"+
                        "SP= "+sp);
    }
}
