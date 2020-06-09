package com.example.androidsubject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsubject.databinding.ActivitySy23Binding;

public class Sy2_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySy23Binding binding = ActivitySy23Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"You have clicked a button!",Toast.LENGTH_LONG).show();
            }
        });
    }

}