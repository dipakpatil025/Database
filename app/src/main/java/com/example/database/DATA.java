
package com.example.database;

import androidx.annotation.Nullable;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.Toast;

public class DATA extends SQLiteOpenHelper {
    private static final String dbname = "mydb";
    private static final int version = 1;
    int age;
    ContentValues contentValues ;
    public DATA(@Nullable Context context) {
        super( context, dbname, null, version );



    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE DIPAK (_ID INTEGER PRIMARY KEY AUTOINCREMENT ,NAME TtEXT ,AGE TEXT ,CITY TEXT)";
        db.execSQL(create);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP TABLE DIPAK" );

    }


    
}

