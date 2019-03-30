package com.example.momanhinh_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.model.SinhVine;

public class ManHinh2Activity extends AppCompatActivity {
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        addControls();

    }

    private void addControls() {
        txtKetQua= this.<TextView>findViewById(R.id.txtKetQua);
        Intent intent=getIntent();
        boolean kieuBoolean= intent.getBooleanExtra("kieu_boolean", false);
        char kieuChar=intent.getCharExtra("Kieu_char", 'w');
        int kieuInt=intent.getIntExtra("Kieu_int", 0);
        double kieuDouble=intent.getDoubleExtra("kieu_Double", 0.0 );
        String kieuChuoi=intent.getStringExtra("Kieu_chuoi");

        SinhVine sv= (SinhVine) intent.getSerializableExtra("SINHVIEN");

        txtKetQua.setText("Kieu boolean= "+kieuBoolean+"\n"+
                            "Kieu char= "+kieuChar+"\n"+
                            "Kieu int= "+kieuInt+"\n"+
                            "Kieu double= "+kieuDouble+"\n"+
                            "Kieu string= "+kieuChuoi+"\n"+
                            "Kieu doi tuong= "+sv);

    }
}
