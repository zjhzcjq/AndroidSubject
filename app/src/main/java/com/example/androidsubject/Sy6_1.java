package com.example.androidsubject;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.androidsubject.databinding.ActivitySy61Binding;

public class Sy6_1 extends AppCompatActivity {

    public static final String SMS_ACTION = "com.android.TinySMS.RESULT";

    private ActivitySy61Binding binding;

    private SentReceiver receiver = new SentReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySy61Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 1);

        Button button = binding.btn61;

        button.setOnClickListener(new View.OnClickListener() {

            String phoneNo = binding.edit61Number.getText().toString();
            String message = binding.edit61Message.getText().toString();

            @Override
            public void onClick(View view) {
                if (phoneNo.length()>0 && message.length()>0){
                    sendSMS(phoneNo, message);
                } else {
                    Toast.makeText(Sy6_1.this, "请重新输入电话号码和短信内容", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    private class SentReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(SMS_ACTION)) {
                int code = getResultCode();//短消息发送成功
                if(code == Activity.RESULT_OK)
                    Toast.makeText(Sy6_1.this, "收到短信", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void sendSMS(String address, String content)
    {
        SmsManager manager = SmsManager.getDefault();
        Intent i = new Intent(SMS_ACTION);//生成PendingIntent，当消息发送完成，接收到广播
        PendingIntent sentIntent = PendingIntent.getBroadcast(this, 0, i, PendingIntent.FLAG_ONE_SHOT);
        manager.sendTextMessage(address, null, content, sentIntent, null);
        Toast.makeText(Sy6_1.this, "短消息发送成功", Toast.LENGTH_SHORT).show();

    }


}