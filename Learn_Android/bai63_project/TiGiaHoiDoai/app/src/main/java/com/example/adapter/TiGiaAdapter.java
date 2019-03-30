package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tigia.TiGia;
import com.example.tigiahoidoai.R;

import java.util.List;

public class TiGiaAdapter extends ArrayAdapter<TiGia> {
    Activity context;
    int resource;
    List<TiGia> objects;
    public TiGiaAdapter(Activity context, int resource, List<TiGia> objects) {
        super(context, resource, objects);
        this.context=context;
        this.objects=objects;
        this.resource=resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View item= inflater.inflate(this.resource, null);

        TiGia tiGia= this.objects.get(position);

        ImageView imgHinh= item.<ImageView>findViewById(R.id.imgHinh);
        TextView txtType= item.<TextView>findViewById(R.id.txtType);
        TextView txtMuatm= item.<TextView>findViewById(R.id.txtMuatm);
        TextView txtBantm= item.<TextView>findViewById(R.id.txtBantm);
        TextView txtMuack= item.<TextView>findViewById(R.id.txtMuack);
        TextView txtBanck= item.<TextView>findViewById(R.id.txtBanck);

        imgHinh.setImageBitmap(tiGia.getBitmap());
        txtType.setText(tiGia.getType());
        txtBanck.setText(tiGia.getBanck());
        txtBantm.setText(tiGia.getBanTienMat());
        txtMuack.setText(tiGia.getMuack());
        txtMuatm.setText(tiGia.getMuaTienMat());



        return item;
    }
}
