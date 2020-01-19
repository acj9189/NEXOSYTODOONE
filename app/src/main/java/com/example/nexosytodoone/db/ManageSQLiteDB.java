package com.example.nexosytodoone.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.nexosytodoone.utils.Constants;

import java.util.List;

public class ManageSQLiteDB {

    private SQLiteDatabase db;
    private SqlOpenHelperConection sqlC;
    private Context contex;
    private byte tipoCOn;

    public ManageSQLiteDB() {
        MakeConecctionW();
    }

    public ManageSQLiteDB(Context contex) {
        this.contex = contex;
        MakeConecctionW();
    }

    public ManageSQLiteDB(Context contex, byte tipoCOn) {
        this.contex = contex;
        this.tipoCOn = tipoCOn;
        if(tipoCOn == 0){
            MakeConecctionW();
        }
        else{
            MakeConecctionR();

        }

    }

    public Context getContex() {
        return contex;
    }

    public void setContex(Context contex) {
        this.contex = contex;
    }

    private void MakeConecctionW(){
        sqlC = new SqlOpenHelperConection(contex,"WEATHER_DB",null, 1);
        db = sqlC.getWritableDatabase();
    }

    private void MakeConecctionR(){
        sqlC = new SqlOpenHelperConection(contex,"WEATHER_DB",null, 1);
        db = sqlC.getReadableDatabase();
    }

    public void closeCoMakeConecction(){
        db.close();
    }
    public void OpenCoMakeConecction(){
       MakeConecctionW();
    }

   public boolean addTable(String tableName, List<Object> data){
       switch (tableName){
           case Constants.WEATHER_TABLE:
               return addTableWEATHER(data);
       }
       return false;
   }

    private boolean addTableWEATHER(List<Object> data) {
       boolean response = false;
        ContentValues values = new ContentValues();
        values.put(Constants.WEATHER_TABLE_FIELD_IDS, (double) data.get(0));
        values.put(Constants.WEATHER_TABLE_FIELD_CITY, (String) data.get(1));
        values.put(Constants.WEATHER_TABLE_FIELD_TEMPERATURE, (String) data.get(2));
        db.insert(Constants.WEATHER_TABLE, Constants.WEATHER_TABLE_FIELD_IDS, values);
        response = true;
       return response;
    }

    /*public List<Object> readTable(){

    }*/

    public byte getTipoCOn() {
        return tipoCOn;
    }

    public void setTipoCOn(byte tipoCOn) {
        this.tipoCOn = tipoCOn;
    }
}

