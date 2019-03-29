package com.example.animation2;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnStart, btnStop;
    ImageView imgHinh;

    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
            }
        });
    }

    private void addControls() {
        btnStart= this.<Button>findViewById(R.id.btnStart);
        btnStop= this.<Button>findViewById(R.id.btnStop);
        imgHinh= this.<ImageView>findViewById(R.id.imgAnimation);

        imgHinh.setBackgroundResource(R.drawable.hieuung);

        animationDrawable= (AnimationDrawable) imgHinh.getBackground();
    }
}
