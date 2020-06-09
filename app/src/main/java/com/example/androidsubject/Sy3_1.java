package com.example.androidsubject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsubject.databinding.ActivitySy31Binding;

public class Sy3_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySy31Binding binding = ActivitySy31Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = binding.edit31User.getText().toString();
                Bundle data = new Bundle();
                data.putString("name", string);
                Intent intent = new Intent(Sy3_1.this, Sy3_2.class);
                intent.putExtra("name", string);
                startActivity(intent);
            }
        });
    }
}