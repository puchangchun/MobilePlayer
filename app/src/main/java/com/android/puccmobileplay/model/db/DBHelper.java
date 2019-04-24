package com.android.puccmobileplay.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.android.puccmobileplay.model.dao.ContactTable;



public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context, String name) {
        super(context, name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建联系人的表
        db.execSQL(ContactTable.CREATE_TAB);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
