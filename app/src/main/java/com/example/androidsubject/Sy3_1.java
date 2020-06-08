package com.example.androidsubject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sy3_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy3_1);

        Button btn_3_1 = findViewById(R.id.btn_3_1);
        final EditText edit_3_1 = findViewById(R.id.edit_3_1_user);

        btn_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = edit_3_1.getText().toString();
                Bundle data = new Bundle();
                data.putString("name", string);
                Intent intent = new Intent(Sy3_1.this, Sy3_2.class);
                intent.putExtra("name", string);
                startActivity(intent);
            }
        });
    }
}