package com.example.androidsubject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sy4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy4_1);

        Button btn_start = findViewById(R.id.btn_4_1_start);
        Button btn_stop = findViewById(R.id.btn_4_1_stop);
        btn_start.setOnClickListener(new StartListener());
        btn_stop.setOnClickListener(new StopListener());
    }


    private class StartListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Sy4_1.this, Sy4_2.class);
            startService(intent);
        }
    }

    private class StopListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Sy4_1.this, Sy4_2.class);
            intent.setPackage(getPackageName());
            stopService(intent);
        }
    }
}