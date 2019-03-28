package com.example.cackithuatxulisukien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.cackithuatxulisukien.R.id.btnThoat;
import static com.example.cackithuatxulisukien.R.id.btnTru;
import static com.example.cackithuatxulisukien.R.id.txtB;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    EditText txtA, txtB;

    Button btnTru;

    Button btnNhan, btnChia;

    Button btnAn;

    Button btnThoat;

    View.OnClickListener suKienChiaSe= null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();

        addEvent();


    }

    private void addEvent() {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyPhepTru();
            }
        });

        suKienChiaSe= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.btnNhan){
                    xyLyPhepNhan();
                }else if(view.getId()==R.id.btnChia){
                    xyLyPhepChia();
                }
            }
        };
        btnNhan.setOnClickListener(suKienChiaSe);
        btnChia.setOnClickListener(suKienChiaSe);

        btnAn.setOnLongClickListener(this);

        btnThoat.setOnClickListener(new MyEvent());

    }

    private void xyLyPhepChia() {
        int a= Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a/b;

        Toast.makeText(MainActivity.this,"Nhan ="+c, Toast.LENGTH_LONG).show();
    }

    private void xyLyPhepNhan() {
        int a= Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a*b;

        Toast.makeText(MainActivity.this,"Nhan ="+c, Toast.LENGTH_LONG).show();
    }

    private void xuLyPhepTru() {
        int a= Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a-b;

        Toast.makeText(MainActivity.this, "Tru= "+c, Toast.LENGTH_LONG).show();
    }

    private void addControls() {
        txtA= this.<EditText>findViewById(R.id.txtA);
        txtB= this.<EditText>findViewById(R.id.txtB);
        btnTru= this.<Button>findViewById(R.id.btnTru);

        btnNhan= this.<Button>findViewById(R.id.btnNhan);
        btnChia= this.<Button>findViewById(R.id.btnChia);

        btnAn= this.<Button>findViewById(R.id.btnAn);

        btnThoat= this.<Button>findViewById(R.id.btnThoat);

    }

    public void xuLyPhepCong(View v){
        int a= Integer.parseInt(txtA.getText().toString());
        int b= Integer.parseInt(txtB.getText().toString());
        int c= a+b;

        Toast.makeText(MainActivity.this,"Tổng ="+c, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onLongClick(View view) {
        if(view.getId()==R.id.btnAn){
            btnAn.setVisibility(View.INVISIBLE);
        }
        return false;
    }
    public class MyEvent implements View.OnClickListener, View.OnLongClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btnThoat){
                finish();
            }
        }

        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }

    public void xuLyDoiManHinhKhac(View view){
        Button btnMoi= new Button(MainActivity.this){
            @Override
            public boolean performClick() {
                setContentView(R.layout.activity_main);

                addControls();

                addEvent();

                return super.performClick();
            }
        };

        btnMoi.setText("Quay ve");
        btnMoi.setWidth(200);
        btnMoi.setHeight(200);

        setContentView(btnMoi);
    }
}
