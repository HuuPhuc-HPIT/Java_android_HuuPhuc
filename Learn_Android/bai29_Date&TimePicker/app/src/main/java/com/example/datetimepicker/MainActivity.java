package com.example.datetimepicker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView txtDate, txtTime;
    ImageButton btnDate, btnTime;
    Calendar calendar= Calendar.getInstance();

    SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2= new SimpleDateFormat("HH:mm");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyHienThi();
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTime();
            }
        });
    }

    private void xuLyTime() {
        TimePickerDialog.OnTimeSetListener callback= new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                calendar.set(Calendar.MINUTE, minute);
                txtTime.setText(sdf2.format(calendar.getTime()));
            }
        };
        TimePickerDialog timepicker= new TimePickerDialog(
                MainActivity.this,
                callback,
                calendar.get(Calendar.HOUR),
                calendar.get(Calendar.MINUTE),
                true);

        timepicker.show();
    }

    private void xuLyHienThi() {
        DatePickerDialog.OnDateSetListener callback= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                txtDate.setText(sdf1.format(calendar.getTime()));
            }
        };
        DatePickerDialog datepicker= new DatePickerDialog(
                MainActivity.this,
                callback,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));

        datepicker.show();
    }

    private void addControls() {
        txtDate= this.<TextView>findViewById(R.id.txtDate);
        txtTime= this.<TextView>findViewById(R.id.txtTime);
        btnDate= this.<ImageButton>findViewById(R.id.btnDate);
        btnTime= this.<ImageButton>findViewById(R.id.btnTime);

        calendar=Calendar.getInstance();
        txtDate.setText(sdf1.format(calendar.getTime()));
        txtTime.setText(sdf2.format(calendar.getTime()));
    }
}
