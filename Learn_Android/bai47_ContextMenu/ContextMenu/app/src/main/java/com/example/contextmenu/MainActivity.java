package com.example.contextmenu;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAptech, btnHueCit, btnHueCity;

    Button btnLastedSelected=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnHueCity.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btnLastedSelected=btnHueCity;
                return false;
            }
        });

        btnHueCit.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btnLastedSelected=btnHueCit;
                return false;
            }
        });

        btnAptech.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btnLastedSelected=btnAptech;
                return false;
            }
        });


    }

    private void addControls() {
        btnAptech= this.<Button>findViewById(R.id.btnAptech);
        btnHueCit= this.<Button>findViewById(R.id.btnHueCit);
        btnHueCity= this.<Button>findViewById(R.id.btnHueCity);

        registerForContextMenu(btnAptech);
        registerForContextMenu(btnHueCit);
        registerForContextMenu(btnHueCity);
    }

    //Nap file contextmenu vao activity main
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.contextmenu_main,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.menuInDam){
            btnLastedSelected.setTypeface(null, Typeface.BOLD);
        }else if(item.getItemId()==R.id.menuToMau){
            btnLastedSelected.setTextColor(Color.BLUE);
        }else if(item.getItemId()==R.id.menuXoa){
            btnLastedSelected.setVisibility(View.INVISIBLE);
        }
        return super.onContextItemSelected(item);
    }
}
