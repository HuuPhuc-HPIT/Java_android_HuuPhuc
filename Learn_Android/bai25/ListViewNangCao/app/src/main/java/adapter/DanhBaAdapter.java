package adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listviewnangcao.R;

import java.util.List;

import model.DanhBa;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    //
    Activity context;//Màn hình sử dụng layour này
    int resource; // Layout cho từng dòng muốn hiển thị(theo yêu cầu)
    List<DanhBa> objects; //Danh sách nguồn dữ liệu muốn hiển thị lên giao diện
    public DanhBaAdapter(Activity context,
                         int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater(); //Build layout thanh code Java
        View row= inflater.inflate(this.resource,null);

        TextView txtTen= row.<TextView>findViewById(R.id.txtTen);
        TextView txtPhone= row.<TextView>findViewById(R.id.txtPhone);
        ImageButton btnCall= row.<ImageButton>findViewById(R.id.btnCall);
        ImageButton btnSMS= row.<ImageButton>findViewById(R.id.btnSMS);
        ImageButton btnDetail= row.<ImageButton>findViewById(R.id.btnDetail);
        // Trả về danh bạ hiện tại muốn vẽ:
        final DanhBa danhBa=this.objects.get(position);
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyChiTiet(danhBa);
            }
        });
        return row;
    }

    private void xuLyChiTiet(DanhBa danhBa) {
        Toast.makeText(this.context,"Ban chon: "+danhBa.getTen(), Toast.LENGTH_LONG).show();
    }
}
