package com.example.androidsubject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsubject.databinding.ActivitySy32Binding;

public class Sy3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySy32Binding binding = ActivitySy32Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = null;
        if (bundle != null) {
            name = bundle.getString("name");
        }
        binding.text32.setText(name);
    }
}