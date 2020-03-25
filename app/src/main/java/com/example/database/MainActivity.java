package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    ContentValues contentValues;
    SQLiteDatabase database;
    DATA d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        t1 = findViewById( R.id.name );
        t2 = findViewById( R.id.age);
        t3 = findViewById( R.id.city );


         d = new DATA( this );



     }
     public void click(View v)
     {
         database= d.getReadableDatabase();

         Cursor c = database.query( "DIPAK", null,null,null,null,null,null );
         c.moveToFirst();
         while(c.isAfterLast() == false)
         {

             t1.setText(  c.getString(  1));
             t2.setText(  c.getString( 2 ));
             t3.setText(  c.getString( 3 ));
             c.moveToNext();


         }


     }
     public void insert(View v)
     {
         database= d.getReadableDatabase();
         contentValues = new ContentValues(  );
         contentValues.put( "NAME",t1.getText().toString() );
         contentValues.put( "AGE",t2.getText().toString());
         contentValues.put( "CITY",t3.getText().toString());
         database.insert(  "DIPAK",null,contentValues);
         t1.setText( "" );
         t2.setText( "" );
         t3.setText( "" );
     }
}
