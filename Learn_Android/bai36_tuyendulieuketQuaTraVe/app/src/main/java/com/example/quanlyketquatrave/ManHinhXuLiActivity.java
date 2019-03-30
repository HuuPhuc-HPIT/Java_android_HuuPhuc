package com.example.quanlyketquatrave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManHinhXuLiActivity extends AppCompatActivity {
    TextView txtNhan;
    Button btnTinh;
    Intent intent;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_xu_li);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiUCLN();
            }
        });
    }

    private void xuLiUCLN() {
        int min=Math.min(a,b);
        int ucln=1;
        for(int i=min; i>=1; i--){
            if (a%i==0 && b%i==0){
                ucln=i;
                break;
            }
        }

        //Buoc 3: Thay doi thong tin, gán lại vào cho intent
        intent.putExtra("UCLN", ucln);

        // BUOC 4: Đánh dấu kết quả trả về:
        setResult(33, intent);

        //Buoc 5: Đóng màn hinh này lại.
        //Dể màn hình Main trở thành foreground lìeTime
        //vì nó chỉ tự động nhận dc kq trả về
        finish();

    }

    private void addControls() {
        txtNhan= this.<TextView>findViewById(R.id.txtNhan);
        btnTinh= this.<Button>findViewById(R.id.btnTinh);

        //Buoc2: Lay du lieu ra:
        intent=getIntent();
        a=intent.getIntExtra("a", -1);
        b=intent.getIntExtra("b", -1);
        txtNhan.setText("a= "+a+";b= "+b);
    }
}
