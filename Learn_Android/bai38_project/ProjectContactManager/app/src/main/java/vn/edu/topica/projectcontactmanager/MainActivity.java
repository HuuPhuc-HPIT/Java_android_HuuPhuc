package vn.edu.topica.projectcontactmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import vn.edu.topica.adapter.ContactAdapter;
import vn.edu.topica.model.Contact;

public class MainActivity extends AppCompatActivity {

    EditText txtTen,txtPhone;
    Button btnLuu;

    ListView lvDanhBa;
    ArrayList<Contact>dsDanhBa;
    ContactAdapter adapterContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLuuDanhBa();
            }
        });
    }

    private void xuLyLuuDanhBa() {
        Contact contact=new Contact(
                txtTen.getText().toString(),
                txtPhone.getText().toString());
        dsDanhBa.add(contact);
        adapterContact.notifyDataSetChanged();
    }

    private void addControls() {
        txtTen= (EditText) findViewById(R.id.txtTen);
        txtPhone= (EditText) findViewById(R.id.txtPhone);
        btnLuu= (Button) findViewById(R.id.btnLuu);

        lvDanhBa= (ListView) findViewById(R.id.lvDanhBa);
        dsDanhBa=new ArrayList<>();
        adapterContact=new ContactAdapter(MainActivity.this,R.layout.item,dsDanhBa);
        lvDanhBa.setAdapter(adapterContact);
    }
}
