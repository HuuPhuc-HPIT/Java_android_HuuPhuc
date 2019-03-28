package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.karaoke.R;
import com.example.model.Music;

import java.util.List;



public class MusicAdapter extends ArrayAdapter<Music>
{
    Activity context;
    int resource;
    List<Music> objects;
    public MusicAdapter(Activity context, int resource, List<Music> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource, null);
        TextView txtMa= (TextView) row.findViewById(R.id.txtMa);
        TextView txtTen= (TextView) row.findViewById(R.id.txtTen);
        TextView txtCasi= (TextView) row.findViewById(R.id.txtCaSi);
        ImageButton btnLike= (ImageButton) row.findViewById(R.id.btnLike);
        ImageButton btnDislike= (ImageButton) row.findViewById(R.id.btnDislike);

        final Music music=this.objects.get(position);
        txtTen.setText(music.getTen());
        txtMa.setText(music.getMa());
        txtCasi.setText(music.getCaSi());
        if(music.isThich())
        {
            btnLike.setVisibility(View.INVISIBLE);
            btnDislike.setVisibility(View.VISIBLE);
        }
        else
        {
            btnLike.setVisibility(View.VISIBLE);
            btnDislike.setVisibility(View.INVISIBLE);
        }

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyThich(music);
            }
        });

        return row;
    }

    private void xuLyThich(Music music) {
        music.setThich(true);
    }
}

