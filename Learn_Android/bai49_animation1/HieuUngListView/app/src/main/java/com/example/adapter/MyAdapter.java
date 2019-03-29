package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hieuunglistview.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<String> {
    Activity context;
    int resource;
    List<String> objects;
    public MyAdapter(Activity context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row= inflater.inflate(this.resource, null);
        TextView txtTen= row.<TextView>findViewById(R.id.txtTen);
        txtTen.setText(this.objects.get(position));

        Animation animation= AnimationUtils.loadAnimation(this.context, R.anim.hieuunglistview);
        row.startAnimation(animation);

        return row;
    }
}
