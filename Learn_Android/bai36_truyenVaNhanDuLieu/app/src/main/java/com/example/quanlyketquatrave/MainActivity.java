package com.example.quanlyketquatrave;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtA, txtB;
    Button btnXuLi;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnXuLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyUCLN();
            }
        });
    }

    private void xuLyUCLN() {
        Intent intent=new Intent(MainActivity.this, ManHinhXuLiActivity.class);
        intent.putExtra("a", Integer.parseInt(txtA.getText().toString()));
        intent.putExtra("b", Integer.parseInt(txtB.getText().toString()));

        // Gọi startActivityForResult
        startActivityForResult(intent, 99); //goi ma gui
    }

    //Buoc 6:
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==99 && resultCode==33){
            txtKetQua.setText("UCLN la: "+ data.getIntExtra("UCLN", 1));
        }
    }

    private void addControls() {
        txtA= this.<EditText>findViewById(R.id.txtA);
        txtB= this.<EditText>findViewById(R.id.txtB);
        btnXuLi= this.<Button>findViewById(R.id.btnXuLy);
        txtKetQua= this.<TextView>findViewById(R.id.txtKetQua);


    }
}
