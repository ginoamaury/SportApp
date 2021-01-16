package com.ginoamaury.sportapp.Model.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.Image;


import com.ginoamaury.sportapp.Model.Object.Team;

import java.util.ArrayList;
import java.util.Arrays;

import static com.ginoamaury.sportapp.Util.Utility.ATRIBUTE_TEAM_ID;
import static com.ginoamaury.sportapp.Util.Utility.ATRIBUTE_TEAM_IMAGE;
import static com.ginoamaury.sportapp.Util.Utility.ATRIBUTE_TEAM_NAME;
import static com.ginoamaury.sportapp.Util.Utility.CREATE_TABLE_FAV;
import static com.ginoamaury.sportapp.Util.Utility.TABLE_FAVORITE;


public class SQLConnection  extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "favDatabase";
    private static final int DATABASE_VERSION = 1;


    private static SQLConnection sInstance;

    public static synchronized SQLConnection getInstance(Context context){
        if (sInstance == null) {
            sInstance = new SQLConnection(context.getApplicationContext());
        }
        return sInstance;
    }

    private SQLConnection (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_FAV);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS favorite");
            onCreate(db);
        }
    }

    public boolean addFav (Team team){
        SQLiteDatabase db = getWritableDatabase();
        db.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            values.put(ATRIBUTE_TEAM_ID, team.getIdTeam());
            values.put(ATRIBUTE_TEAM_NAME, team.getStrTeam());
            values.put(ATRIBUTE_TEAM_IMAGE,team.getStrTeamBadge());
            db.insertOrThrow(TABLE_FAVORITE, ATRIBUTE_TEAM_ID, values);
            db.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
           return false;
        } finally {
            db.endTransaction();
        }
    }


    public boolean deleteFav (Team team){
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        try{
            String where = ATRIBUTE_TEAM_ID+"=?";
            String whereArgs [] ={String.valueOf(team.getIdTeam())};
            db.delete(TABLE_FAVORITE,where,whereArgs);
            db.setTransactionSuccessful();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            db.endTransaction();
        }
    }

    public boolean ifExist (Team team){
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_FAVORITE + " WHERE "
                + ATRIBUTE_TEAM_ID + " = " + team.getIdTeam();

        Cursor c = db.rawQuery(selectQuery, null);

        try{
            if (c.moveToFirst()) {
                do {
                    Team s = new Team();
                    s.setIdTeam(c.getString(c.getColumnIndex(ATRIBUTE_TEAM_ID)));
                    if(s.getIdTeam().equals(team.getIdTeam())){
                        return true;
                    }else{
                        return false;
                    }
                } while(c.moveToNext());
            }else{
                return false;
            }

        }catch (Exception e){
                return false;
        }

    }

    public ArrayList<Team> getFavorites() {
        ArrayList<Team> response = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_FAVORITE;

        Cursor c = db.rawQuery(selectQuery, null);

        try {
            if (c.moveToFirst()) {
                do {
                    Team s = new Team();
                    s.setIdTeam(c.getString(c.getColumnIndex(ATRIBUTE_TEAM_ID)));
                    s.setStrTeam(c.getString(c.getColumnIndex(ATRIBUTE_TEAM_NAME)));
                    s.setStrTeamBadge(c.getString(c.getColumnIndex(ATRIBUTE_TEAM_IMAGE)));
                    response.add(s);
                } while (c.moveToNext());
                return response;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
