package com.example.karaoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import com.example.adapter.MusicAdapter;
import com.example.model.Music;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    ListView lvBaiHatGoc;
    ArrayList<Music>dsBaiHatGoc;
    MusicAdapter adapterBaiHatGoc;

    ListView lvBaiHatYeuThich;
    ArrayList<Music>dsBaiHatYeuThich;
    MusicAdapter adapterBaiHatYeuThich;

    TabHost tabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if (tabId.equalsIgnoreCase("t1")) {
                    xuLyHienThiBaiHatGoc();
                } else if (tabId.equalsIgnoreCase("t2")) {
                    xuLyHienThiBaiHatYeuThich();
                }
            }
        });
    }

    private void xuLyHienThiBaiHatGoc() {

    }

    private void xuLyHienThiBaiHatYeuThich() {
        dsBaiHatYeuThich.clear();//xóa giữ liệu
        for(Music music: dsBaiHatGoc)
        {
            if(music.isThich())
                dsBaiHatYeuThich.add(music);
        }
        adapterBaiHatYeuThich.notifyDataSetChanged();
    }

    private void addControls() {

        tabHost= (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("",getResources().getDrawable(R.drawable.music));
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("",getResources().getDrawable(R.drawable.favorite));
        tabHost.addTab(tab2);


        lvBaiHatGoc= (ListView) findViewById(R.id.lvBaiHatGoc);
        dsBaiHatGoc=new ArrayList<>();
        adapterBaiHatGoc=new MusicAdapter(MainActivity.this,R.layout.item,dsBaiHatGoc);
        lvBaiHatGoc.setAdapter(adapterBaiHatGoc);

        lvBaiHatYeuThich= (ListView) findViewById(R.id.lvBaiHatYeuThich);
        dsBaiHatYeuThich=new ArrayList<>();
        adapterBaiHatYeuThich=new MusicAdapter(MainActivity.this,R.layout.item,dsBaiHatYeuThich);
        lvBaiHatYeuThich.setAdapter(adapterBaiHatYeuThich);

        giaLapBaiHat();
    }
    private void giaLapBaiHat() {
        dsBaiHatGoc.add(new Music("55555","Niệm khúc cuối","Tuấn Ngọc",false));
        dsBaiHatGoc.add(new Music("33333","Phôi Pha","Tuấn Ngọc",true));
        dsBaiHatGoc.add(new Music("12345","Riêng một góc trời","Tuấn Ngọc",false));
        dsBaiHatGoc.add(new Music("67890","Rong Rêu","Tuấn Ngọc",false));
        adapterBaiHatGoc.notifyDataSetChanged();
    }
}

