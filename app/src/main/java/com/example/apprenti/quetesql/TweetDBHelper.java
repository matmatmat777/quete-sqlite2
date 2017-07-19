package com.example.apprenti.quetesql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by apprenti on 17/07/17.
 */

public class TweetDBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Tweet.db";

    public TweetDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_TWEET);
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_ORGANIZATION);
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_USER);
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_BELONG);


    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_TWEET);
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_ORGANIZATION);
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_USER);
        sqLiteDatabase.execSQL(DatabaseContract.SQL_CREATE_BELONG);
        onCreate(sqLiteDatabase);


    }

}
