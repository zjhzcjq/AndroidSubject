package com.example.androidsubject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSY2_1;
    private Button mBtnSY2_2;
    private Button mBtnSY2_3;
    private Button mBtnSY3_1;
    private Button mBtnSY4_1;
    private Button mBtnSY5_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSY2_1 = findViewById(R.id.btn_SY2_1);
        mBtnSY2_2 = findViewById(R.id.btn_SY2_2);
        mBtnSY2_3 = findViewById(R.id.btn_SY2_3);
        mBtnSY3_1 = findViewById(R.id.btn_SY3_1);
        mBtnSY4_1 = findViewById(R.id.btn_SY4_1);
        mBtnSY5_1 = findViewById(R.id.btn_SY5_1);
        setListeners();
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        mBtnSY2_1.setOnClickListener(onClick);
        mBtnSY2_2.setOnClickListener(onClick);
        mBtnSY2_3.setOnClickListener(onClick);
        mBtnSY3_1.setOnClickListener(onClick);
        mBtnSY4_1.setOnClickListener(onClick);
        mBtnSY5_1.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_SY2_1:
                    intent = new Intent(MainActivity.this, Sy2_1.class);
                    break;

                case R.id.btn_SY2_2:
                    intent = new Intent(MainActivity.this, Sy2_2.class);
                    break;

                case R.id.btn_SY2_3:
                    intent = new Intent(MainActivity.this, Sy2_3.class);
                    break;

                case R.id.btn_SY3_1:
                    intent = new Intent(MainActivity.this, Sy3_1.class);
                    break;

                case R.id.btn_SY4_1:
                    intent = new Intent(MainActivity.this, Sy4_1.class);
                    break;

                case R.id.btn_SY5_1:
                    intent = new Intent(MainActivity.this, Sy5_1.class);
                    break;
            }
            startActivity(intent);
        }
    }
}