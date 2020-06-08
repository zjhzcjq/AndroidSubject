package com.example.androidsubject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Sy5_2 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Sy5_3 helper = new Sy5_3(this);
        Cursor cursor = helper.query();
        String[] from = {"_id", "name", "hobby"};
        int[] to = {R.id.text_5_2_id,R.id.text_5_2_name,R.id.text_5_2_like};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,R.layout.activity_sy5_2,cursor,from,to);
        ListView listView = getListView();
        listView.setAdapter(adapter);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final long temp = l;
                builder.setMessage("是否删除记录?").setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        helper.del((int) temp);
                        Cursor cursor1 = helper.query();
                        String[] from = {"_id", "name", "hobby"};
                        int[] to = {R.id.text_5_2_id,R.id.text_5_2_name,R.id.text_5_2_like};
                        SimpleCursorAdapter adapter1 = new SimpleCursorAdapter(getApplicationContext(),R.layout.activity_sy5_2,cursor1,from,to);
                        ListView listView = getListView();
                        listView.setAdapter(adapter1);
                    }
                }).setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog ad = builder.create();
                ad.show();
            }
        });
        helper.close();
    }
}