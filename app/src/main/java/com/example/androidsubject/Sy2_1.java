package com.example.androidsubject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Sy2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy2_1);

        TextView textView = findViewById(R.id.text_2_1);
        Button button = findViewById(R.id.btn_2_1);
    }
}