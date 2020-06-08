package com.example.androidsubject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sy5_3 extends SQLiteOpenHelper {

    private static final String DB_NAME = "stu.db";
    private static final String TBL_NAME = "stuTb1";
    private static final String CREATE_TBL = "CREATE TABLE " + "stuTb1(_id INTEGER DEFAULT '1' NOT" +
            " NULL PRIMARY KEY AUTOINCREMENT, name TEXT ,hobby TEXT )";

    private SQLiteDatabase db;
    public Sy5_3(Context context){
        super(context, DB_NAME, null, 2);
        System.out.printf("创建数据库");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        this.db = sqLiteDatabase;
        db.execSQL(CREATE_TBL);
        System.out.printf("创建表");
    }

    public void insert(ContentValues values){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TBL_NAME, null, values);
        db.close();
        System.out.printf("数据库插入操作");
    }

    public Cursor query(){
        System.out.printf("数据库查询方法");
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.query(TBL_NAME, null, null, null, null, null, null);
        return cursor;
    }

    public void del(int id){
        System.out.printf("数据库删除方法");
        if (db==null){
            SQLiteDatabase db = getWritableDatabase();
            db.delete(TBL_NAME, "_id=?", new String[]{String.valueOf(id)});
        }
    }

    public void close(){
        System.out.printf("数据库删除方法");
        if (db!=null){
            db.close();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
