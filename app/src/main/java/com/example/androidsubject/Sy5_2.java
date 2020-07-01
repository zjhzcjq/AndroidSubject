package com.example.androidsubject;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
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
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            final long temp = l;
            builder.setMessage("是否删除记录?").setPositiveButton("是", (dialogInterface, i1) -> {
                helper.del((int) temp);
                Cursor cursor1 = helper.query();
                String[] from1 = {"_id", "name", "hobby"};
                int[] to1 = {R.id.text_5_2_id,R.id.text_5_2_name,R.id.text_5_2_like};
                SimpleCursorAdapter adapter1 = new SimpleCursorAdapter(getApplicationContext(),R.layout.activity_sy5_2,cursor1, from1, to1);
                ListView listView1 = getListView();
                listView1.setAdapter(adapter1);
            }).setNegativeButton("否", (dialogInterface, i12) -> {

            });
            AlertDialog ad = builder.create();
            ad.show();
        });
        helper.close();
    }
}