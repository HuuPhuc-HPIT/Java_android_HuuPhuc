package com.example.hoccheckbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


import static com.example.hoccheckbox.R.id.chkTest3;


public class MainActivity extends Activity {
    CheckBox chkTest1, chkTest2, chkTest3, chkTest4;
    Button btnChon;
    TextView txtMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvent();
    }


    private void addEvent() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xyLyChonMonHoc();
            }
        });
    }
    private void xyLyChonMonHoc() {
        String s="";
        if(chkTest1.isChecked()){
            s+=chkTest1.getText().toString();
        }
         if (chkTest2.isChecked()){
            s+= "\n" +chkTest2.getText().toString();
        }
         if (chkTest3.isChecked()){
            s+="\n"+chkTest3.getText().toString();
        }
         if(chkTest4.isChecked()){
            s+="\n"+chkTest4.getText().toString();
        }

        txtMonHoc.setText(s);
    }
    private void addControls() {
        chkTest1= this.<CheckBox>findViewById(R.id.chkTest1);
        chkTest2= this.<CheckBox>findViewById(R.id.chkTest2);
        chkTest3= this.<CheckBox>findViewById(R.id.chkTest3);
        chkTest4= this.<CheckBox>findViewById(R.id.chkTest4);
        btnChon= this.<Button>findViewById(R.id.btnChon);
        txtMonHoc= this.<TextView>findViewById(R.id.txtMonHoc);
    }

}
