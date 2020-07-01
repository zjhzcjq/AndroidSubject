package com.example.androidsubject;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsubject.databinding.ActivitySy51Binding;

public class Sy5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySy51Binding binding = ActivitySy51Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn51.setOnClickListener(view -> {
            String name = binding.edit51Name.getText().toString();
            String like = binding.edit51Like.getText().toString();
            ContentValues values = new ContentValues();
            values.put("name", name);
            values.put("hobby", like);
            Sy5_3 helper = new Sy5_3(getApplicationContext());
            helper.insert(values);
            Intent intent = new Intent(Sy5_1.this, Sy5_2.class);
            startActivity(intent);
        });
    }
}