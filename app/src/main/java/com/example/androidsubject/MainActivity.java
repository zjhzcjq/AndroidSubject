package com.example.androidsubject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsubject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        binding.btnSY21.setOnClickListener(onClick);
        binding.btnSY22.setOnClickListener(onClick);
        binding.btnSY23.setOnClickListener(onClick);
        binding.btnSY31.setOnClickListener(onClick);
        binding.btnSY41.setOnClickListener(onClick);
        binding.btnSY51.setOnClickListener(onClick);
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