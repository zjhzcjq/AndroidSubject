package com.example.androidsubject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sy5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy5_1);

        final EditText edit_name = findViewById(R.id.edit_5_1_name);
        final EditText edit_like = findViewById(R.id.edit_5_1_like);
        Button btn_5_1 = findViewById(R.id.btn_5_1);
        btn_5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit_name.getText().toString();
                String like = edit_like.getText().toString();
                ContentValues values = new ContentValues();
                values.put("name", name);
                values.put("hobby", like);
                Sy5_3 helper = new Sy5_3(getApplicationContext());
                helper.insert(values);
                Intent intent = new Intent(Sy5_1.this, Sy5_2.class);
                startActivity(intent);
            }
        });
    }
}