package com.example.assetsharepreference;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView txtFont;
    ListView lvFont;
    ArrayList<String>dsFont;
    ArrayAdapter<String>fontAdapter;

    String tenLuuTru="TrangThaiFont";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        lvFont.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                xuLyDoiFontChu(position);
            }
        });
    }

    private void xuLyDoiFontChu(int position) {
        Typeface typeface= Typeface.createFromAsset(getAssets(),"font/"+dsFont.get(position));
        txtFont.setTypeface(typeface);

        //Luu font chu
        SharedPreferences sharedPreferences=getSharedPreferences(tenLuuTru,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("FONTCHU", "font/"+dsFont.get(position));
        editor.commit();//xac nhan luu xuong file xml
    }

    private void addControls()  {
        txtFont= this.<TextView>findViewById(R.id.txtFont);
        lvFont= this.<ListView>findViewById(R.id.lvFont);
        dsFont= new ArrayList<>();
        fontAdapter= new ArrayAdapter<String>(MainActivity.this,
                                    android.R.layout.simple_list_item_1, dsFont);

        lvFont.setAdapter(fontAdapter);


        try{
            AssetManager assetManager=getAssets(); //Su dung asset
            String []arrFontName= assetManager.list("font"); //doc tep tin trong asset
            dsFont.addAll(Arrays.asList(arrFontName));
            fontAdapter.notifyDataSetChanged();

            SharedPreferences sharedPreferences=getSharedPreferences(tenLuuTru,MODE_PRIVATE);
            String font=sharedPreferences.getString("FONTCHU", "");
            if(font.length()>0){
                Typeface typeface= Typeface.createFromAsset(getAssets(),font);
                txtFont.setTypeface(typeface);
            }


        }catch(Exception ex){
            Log.e("LOI FONT", ex.toString());
        }



    }
}
