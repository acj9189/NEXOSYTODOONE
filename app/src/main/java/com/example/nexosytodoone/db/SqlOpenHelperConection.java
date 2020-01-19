package com.example.nexosytodoone.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.nexosytodoone.utils.Constants;

/***
 *   Desarrollado por el ingeniero Andrés Eduardo Cárdenas Jaramillo del 18 de enero la 19 de eneroe del 2020.
 */

public class SqlOpenHelperConection extends SQLiteOpenHelper {



    public SqlOpenHelperConection(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Constants.CREATE_WEATHER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(Constants.DROP_WEATHER_TABLE);
        onCreate(sqLiteDatabase);

    }
}
