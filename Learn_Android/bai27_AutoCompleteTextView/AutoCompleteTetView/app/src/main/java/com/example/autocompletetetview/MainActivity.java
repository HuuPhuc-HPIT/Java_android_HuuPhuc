package com.example.autocompletetetview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtTen;

    AutoCompleteTextView autotxtTinhThanh;
    String []arrTinhThanh;
    ArrayAdapter<String>adapterTinhThanh;

    Button btnOK;
    TextView txtThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyOK();
            }
        });
    }

    private void xuLyOK() {
        String s=txtTen.getText().toString()+ "\n"+ autotxtTinhThanh.getText().toString();
        txtThongTin.setText(s);
    }

    private void addControls() {
        txtTen= this.<EditText>findViewById(R.id.txtTen);
        txtThongTin= this.<TextView>findViewById(R.id.txtThongTin);
        autotxtTinhThanh= this.<AutoCompleteTextView>findViewById(R.id.autotxtTinhThanh);
        btnOK= this.<Button>findViewById(R.id.btnOK);

        arrTinhThanh=getResources().getStringArray(R.array.arrTinhThanh);
        adapterTinhThanh= new ArrayAdapter<String>(MainActivity.this,
                                                android.R.layout.simple_list_item_1,
                                                arrTinhThanh);

        autotxtTinhThanh.setAdapter(adapterTinhThanh);
    }
}
