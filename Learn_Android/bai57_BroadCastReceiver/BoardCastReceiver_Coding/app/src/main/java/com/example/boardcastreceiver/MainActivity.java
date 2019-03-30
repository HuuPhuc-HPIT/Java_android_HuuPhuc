package com.example.boardcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap;

    BroadcastReceiver wifiReceiver= new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager=
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if(connectivityManager.getActiveNetworkInfo()!=null){
                btnDangNhap.setEnabled(true);
                Toast.makeText(context,"Ban vua mo internet", Toast.LENGTH_LONG).show();
            }else{
                btnDangNhap.setEnabled(false);
                Toast.makeText(context,"Ban vua tat internet", Toast.LENGTH_LONG).show();
            }
        }
    };

    //ham lang nghe


    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter= new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(wifiReceiver, filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(wifiReceiver!=null){
            unregisterReceiver(wifiReceiver);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();

    }

    private void addControls() {
        btnDangNhap=findViewById(R.id.btnDangNhap);
    }
}
