package com.example.androidsubject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsubject.databinding.ActivitySy41Binding;

public class Sy4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySy41Binding binding = ActivitySy41Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btn41Start.setOnClickListener(new StartListener());
        binding.btn41Stop.setOnClickListener(new StopListener());
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
            stopService(intent);
        }
    }
}