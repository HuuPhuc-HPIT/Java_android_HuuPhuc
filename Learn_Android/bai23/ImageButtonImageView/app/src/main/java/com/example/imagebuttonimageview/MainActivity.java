package com.example.imagebuttonimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radHo, radXe;
    ImageView imgHinh;
    ImageButton btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }


    private void addEvents() {
        radHo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    imgHinh.setImageResource(R.drawable.son);
                }
            }
        });
        radXe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    imgHinh.setImageResource(R.drawable.moi);
                }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void addControls() {
        radHo= this.<RadioButton>findViewById(R.id.radHo);
        radXe= this.<RadioButton>findViewById(R.id.radXe);
        imgHinh= this.<ImageView>findViewById(R.id.imgHinh);
        btnThoat= this.<ImageButton>findViewById(R.id.btnThoat);
    }


}
