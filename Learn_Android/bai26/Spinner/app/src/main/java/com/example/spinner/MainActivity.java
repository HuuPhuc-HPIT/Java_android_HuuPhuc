package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.model.NhanVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtTen, txtSoNgay;
    Button btnXacNhan;
    Spinner spNgay;

    ArrayList<String >dsNgay;
    ArrayAdapter<String>adapterNgay;

    int lastedSelected= -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXacNhan();
            }
        });

        spNgay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Ban chon: "+dsNgay.get(position),
                                Toast.LENGTH_LONG).show();
                lastedSelected= position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void xuLyXacNhan() {
        if(lastedSelected==-1){
            Toast.makeText(MainActivity.this, "Ban chua chon!", Toast.LENGTH_LONG).show();
            return;
        }

        NhanVien nv= new NhanVien( );
        nv.setTen(txtTen.getText().toString());
        nv.setThuBatDau(dsNgay.get(lastedSelected));
        nv.setSoNgay(Integer.parseInt(txtSoNgay.getText().toString()));

        Toast.makeText(MainActivity.this, nv.toString(), Toast.LENGTH_LONG).show();
    }

    private void addControls() {
        txtTen= this.<EditText>findViewById(R.id.txtTen);
        txtSoNgay= this.<EditText>findViewById(R.id.txtSoNgay);
        btnXacNhan= this.<Button>findViewById(R.id.btnXacNhan);
        spNgay= this.<Spinner>findViewById(R.id.spNgay);

        dsNgay= new ArrayList<>();
        dsNgay.add("Ngay đầu tiên");
        dsNgay.add("Ngày thứ 2");
        dsNgay.add("Ngày thứ 3");
        dsNgay.add("Ngày thứ 4");
        dsNgay.add("Ngày thứ 5");
        dsNgay.add("Ngày cuối cùng");

        adapterNgay= new ArrayAdapter<String>(MainActivity.this,
                                                android.R.layout.simple_spinner_item,
                                                dsNgay);
        adapterNgay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNgay.setAdapter(adapterNgay);

    }
}
