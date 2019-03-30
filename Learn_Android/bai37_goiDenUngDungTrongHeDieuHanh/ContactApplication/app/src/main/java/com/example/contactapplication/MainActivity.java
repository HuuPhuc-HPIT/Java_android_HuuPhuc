package com.example.contactapplication;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.contactapplication.R.id.txtPhone;

public class MainActivity extends AppCompatActivity {
    EditText txtPhone, txtTinNhan;
    Button btnQuaySo, btnGoiLuon, btnNhanTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnQuaySo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyQuaySo();
            }
        });

        btnGoiLuon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyGoiLuon();
            }
        });

        btnNhanTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyNhanTinVaQuanLyKetQua();
            }
        });
    }

    private void xuLyNhanTinVaQuanLyKetQua() {
        final SmsManager sms= SmsManager.getDefault();
        Intent msgintent= new Intent("ACTION_MSG_SENT");

        //Lenh cho
        final PendingIntent pendingMsgSent =
                PendingIntent.getBroadcast(this, 0, msgintent, 0);

        //Trr ve ket qua
        registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                int result = getResultCode();
                String msg="Đã gửi tin nhắn thành công";
                if (result != Activity.RESULT_OK) {
                    msg="Gửi tin nhắn thất bại";
                }
                Toast.makeText(MainActivity.this, msg,
                        Toast.LENGTH_LONG).show();
            }
        }, new IntentFilter("ACTION_MSG_SENT"));

        sms.sendTextMessage(txtPhone.getText().toString(), null, txtTinNhan.getText()+"",
                pendingMsgSent, null);

    }

    private void xuLyGoiLuon() {

        Intent intent= new Intent(Intent.ACTION_CALL);
        Uri uri= Uri.parse("tel:" + txtPhone.getText().toString());
        intent.setData(uri);
        startActivity(intent);

    }

    private void xuLyQuaySo() {
        Uri uri=Uri.parse("tel:" +txtPhone.getText().toString());
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(uri);
        startActivity(intent);
    }

    private void addControls() {
        txtPhone= this.<EditText>findViewById(R.id.txtPhone);
        txtPhone= this.<EditText>findViewById(R.id.txtTinNhan);
        btnGoiLuon= this.<Button>findViewById(R.id.btnGoiLuon);
        btnQuaySo= this.<Button>findViewById(R.id.btnQuaySo);
        btnNhanTin= this.<Button>findViewById(R.id.btnNhanTin);
    }
}
