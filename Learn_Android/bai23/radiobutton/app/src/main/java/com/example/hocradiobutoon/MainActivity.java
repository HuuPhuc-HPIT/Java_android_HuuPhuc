    package com.example.hocradiobutoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
    RadioButton radTuyetVoi, radDuoc, radKem;
    Button btnChon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

        private void addEvents() {
            btnChon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    xuLyBinhChon();
                }
            });
        }

        private void xuLyBinhChon() {
            String s="";
            if(radTuyetVoi.isChecked()){
                s=radTuyetVoi.getText().toString();
            }else if(radDuoc.isChecked()){
                s=radDuoc.getText().toString();
            }else if(radKem.isChecked()){
                s=radKem.getText().toString();
            }

            Toast.makeText(MainActivity.this,"Ban chon: "+s, Toast.LENGTH_LONG).show();
        }

        private void addControls() {
            radTuyetVoi= this.<RadioButton>findViewById(R.id.radTuyetVoi);
            radDuoc= this.<RadioButton>findViewById(R.id.radDuoc);
            radKem= this.<RadioButton>findViewById(R.id.radKem);
            btnChon= this.<Button>findViewById(R.id.btnChon);
        
        }
    }
