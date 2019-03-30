package com.example.doctinnhan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle=intent.getExtras();
        Object []arrPdus= (Object[]) bundle.get("pdus");
        for(int i=0; i<arrPdus.length; i++){
            SmsMessage smsMessage=  SmsMessage.createFromPdu((byte[]) arrPdus[i]);
            String noidung= smsMessage.getMessageBody();
            String phone= smsMessage.getOriginatingAddress();
            long time=smsMessage.getTimestampMillis(); //Time unix(may k hiu dc)

            //Bien dich thoi gian
            Date date= new Date(time);
            DateFormat format= new SimpleDateFormat("HH:mm:ss");
            String dateFormatted= format.format(date);

            Toast.makeText(context, "so phone: "+phone+"\t Noi dung: "+noidung+"" +
                    "\t Nhan luc: "+dateFormatted, Toast.LENGTH_LONG).show();
        }

    }
}
