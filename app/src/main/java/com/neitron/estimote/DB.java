package com.neitron.estimote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB extends SQLiteOpenHelper{

    public static final String LOG_TAG = DB.class.getName();

    public DB(
            Context context,
            String name,
            SQLiteDatabase.CursorFactory factory,
            int version)
    {
        super(context, name, null, version);

        Log.d(LOG_TAG, "Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(LOG_TAG, "onCreate");

        db.execSQL(
                "CREATE TABLE beacon ("
                        + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + "beacon_major INTEGER, "
                        + "hello_msg text, "
                        + "bye_msg text, "
                        + "site_url text, "
                        + "image_url text" + ");" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
