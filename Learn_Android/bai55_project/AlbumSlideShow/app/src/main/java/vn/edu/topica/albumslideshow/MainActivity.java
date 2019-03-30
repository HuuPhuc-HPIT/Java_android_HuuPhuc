package vn.edu.topica.albumslideshow;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView imgHinh;
    CheckBox chkTuDong;
    ImageButton btnPrevious,btnNext;

    int currentPosition=-1;
    ArrayList<String>albums;

    Timer timer=null;
    TimerTask timerTask=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXemHinhKeTiep();
            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXemHinhDangTruoc();
            }
        });
        chkTuDong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    btnPrevious.setEnabled(false);
                    btnNext.setEnabled(false);

                    xuLyTuDongChayHinh();
                } else {
                    btnPrevious.setEnabled(true);
                    btnNext.setEnabled(true);
                    if(timer!=null)
                        timer.cancel();
                }
            }
        });
    }

    private void xuLyTuDongChayHinh() {
        timerTask=new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        currentPosition++;
                        if(currentPosition==albums.size())
                            currentPosition=0;
                        ImageTask task=new ImageTask();
                        task.execute(albums.get(currentPosition));
                    }
                });
            }
        };
        timer=new Timer();
        timer.schedule(timerTask,0,5000);
    }

    private void xuLyXemHinhDangTruoc() {
        currentPosition--;
        if(currentPosition==-1)
            currentPosition=albums.size()-1;
        ImageTask task=new ImageTask();
        task.execute(albums.get(currentPosition));
    }

    private void xuLyXemHinhKeTiep() {
        currentPosition++;
        if(currentPosition==albums.size())
            currentPosition=0;
        ImageTask task=new ImageTask();
        task.execute(albums.get(currentPosition));
    }

    private void addControls() {
        imgHinh= (ImageView) findViewById(R.id.imgHinh);
        chkTuDong= (CheckBox) findViewById(R.id.chkTuDong);
        btnPrevious= (ImageButton) findViewById(R.id.btnPrevous);
        btnNext= (ImageButton) findViewById(R.id.btnNext);
        albums=new ArrayList<>();
        albums.add("http://www.clker.com/cliparts/7/d/9/9/13683021751423003088baby%20girl%20laughing-256-md.png");
        albums.add("http://www.clker.com/cliparts/f/9/d/1/136830214460390060baby%20girl%20idea-256-md.png");
        albums.add("http://www.art4apps.org/images/downloadable/baby.png");
        albums.add("http://yttalk.com/data/attachments/2/2795-d3ddb52d4f37af2bb3362e3efd78db5a.jpg");
        albums.add("http://www.clker.com/cliparts/Q/O/4/I/f/0/beach-baby-md.png");
        albums.add("http://www.angoliskola.com/wp-content/uploads/2012/10/Success-baby.png");
        albums.add("http://www.polyvore.com/cgi/img-thing?.out=jpg&size=l&tid=148788426");
        albums.add("http://cliparts101.com/files/403/FC614E4B231C042B66B75694F19E87EE/Baby_boy_crawling.png");
        albums.add("http://ai-i2.infcdn.net/icons_siandroid/png/300/1435/1435912.png");
        albums.add("http://www.cornerstorkbabygifts.com/blog/wp-content/uploads/2011/05/Season-Baby.png");
        currentPosition=0;
        ImageTask task=new ImageTask();
        task.execute(albums.get(currentPosition));
    }
    class ImageTask extends AsyncTask<String,Void,Bitmap>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imgHinh.setImageBitmap(bitmap);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Bitmap doInBackground(String... params) {
            Bitmap bitmap=null;
            try
            {
                String link=params[0];
                bitmap = BitmapFactory.decodeStream((InputStream) new URL(link).getContent());
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
