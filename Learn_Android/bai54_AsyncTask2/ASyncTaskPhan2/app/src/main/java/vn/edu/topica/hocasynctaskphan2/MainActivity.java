package vn.edu.topica.hocasynctaskphan2;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnTaiHinh;
    ImageView imgHinh;
    ProgressDialog dialog;

    String link="http://c0.f21.img.vnecdn.net/2014/12/07/1-JPG-4586-1417897531.jpg";
    String link2="http://img.v3.news.zdn.vn/w660/Uploaded/ycgmvvbt/2015_12_23/iraqentertainment1.jpg";
    String link3="http://i.imgur.com/WIDgzAS.jpg";
    String link4="http://ihay.thanhnien.com.vn/Pictures20136/THANHCHAU/5_6/hh1.jpg";

    ArrayList<String>dsHinh;

    Random random=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnTaiHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTaiHinh();
            }
        });
    }

    private void xuLyTaiHinh() {

        int n=random.nextInt(4);

        ImageTask task=new ImageTask();
        task.execute(dsHinh.get(n));
    }

    private void addControls() {
        btnTaiHinh= (Button) findViewById(R.id.btnTaiHinh);
        imgHinh= (ImageView) findViewById(R.id.imgHinh);

        dialog=new ProgressDialog(MainActivity.this);
        dialog.setTitle("Thông báo");
        dialog.setMessage("Đang tải hình vui lòng chờ....");
        dialog.setCanceledOnTouchOutside(false);

        dsHinh=new ArrayList<>();
        dsHinh.add(link);
        dsHinh.add(link2);
        dsHinh.add(link3);
        dsHinh.add(link4);
    }
    class ImageTask extends AsyncTask<String,Void,Bitmap>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog.show();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imgHinh.setImageBitmap(bitmap);
            dialog.dismiss();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Bitmap doInBackground(String... params) {
            try
            {
                String link=params[0];
                Bitmap bitmap= BitmapFactory.decodeStream((InputStream) new URL(link).getContent());
                return  bitmap;
            }
            catch (Exception ex)
            {
                Log.e("LOI",ex.toString());
            }
            return null;
        }
    }
}
