package com.example.sharepreference_dangnhap;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtUserName, txtPassword;
    Button btnDangNhap, btnThoat;
    CheckBox chkLuuThongTin;

    String tenThongTinDangNhap="login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        txtUserName= this.<EditText>findViewById(R.id.txtUserName);
        txtPassword= this.<EditText>findViewById(R.id.txtPassword);
        btnDangNhap= this.<Button>findViewById(R.id.btnDangNhap);
        btnThoat= this.<Button>findViewById(R.id.btnThoat);
        chkLuuThongTin= this.<CheckBox>findViewById(R.id.chkLuuThongTin);

    }

    @Override
    protected void onPause() {
        super.onPause();

        //Luu thong tin
        SharedPreferences preferences=getSharedPreferences(tenThongTinDangNhap, MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();
        editor.putString("UserName", txtUserName.getText().toString());
        editor.putString("Password", txtPassword.getText().toString());
        editor.putBoolean("Save", chkLuuThongTin.isChecked());
        editor.commit();

    }

    @Override
    protected void onResume() {
        super.onResume();

        //Hien thi thong tin da luu
        SharedPreferences preferences=getSharedPreferences(tenThongTinDangNhap, MODE_PRIVATE);
        String userName= preferences.getString("UserName","");
        String passWord= preferences.getString("Password","");
        boolean save= preferences.getBoolean("Save", false);
        if(save==true){
            txtUserName.setText(userName);
            txtPassword.setText(passWord);
        }

    }
}
