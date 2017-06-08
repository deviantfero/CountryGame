package com.uca.parcial1.countrygame.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.Question;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alejandro on 6/7/17.
 */

public class CountryDBHelper extends SQLiteOpenHelper {

    private static final String COUNTRY_TABLE = "country";
    private static final String QUESTION_TABLE = "question";
    //COUNTRY ATTRIBUTES
    private static final String COUNTRY_NAME = "nombre";
    private static final String COUNTRY_DESC = "descripcion";
    private static final String COUNTRY_BANDERA = "bandera";
    private static final String COUNTRY_CAPITAL = "nombre";
    private static final String COUNTRY_AREA = "area";

    //PREGUNTA
    private static final String QUESTION_PREGUNTA = "pregunta";
    private static final String QUESTION_PAISCORR = "paisCorrecto";

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "CountryDB";

    public CountryDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_COUNTRY_TABLE = "CREATE TABLE country (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT, " +
                "descripcion TEXT, " +
                "bandera TEXT, " +
                "capital TEXT, " +
                "area DOUBLE )";

        db.execSQL(CREATE_COUNTRY_TABLE);

        String CREATE_QUESTION_TABLE = "CREATE TABLE question (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "pregunta TEXT, " +
                "paisCorrecto INTEGER, " +
                "FOREIGN KEY(paisCorrecto) REFERENCES country(id))";

        db.execSQL(CREATE_QUESTION_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS country");
        db.execSQL("DROP TABLE IF EXISTS question");

        this.onCreate(db);
    }

    public void addCountry(Country country){
        Log.d("addCountry", country.getName());

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COUNTRY_NAME, country.getName());
        values.put(COUNTRY_DESC, country.getDescription());
        values.put(COUNTRY_BANDERA, country.getFlagId());
        values.put(COUNTRY_CAPITAL, country.getCapital());

        //todo update singleton
        db.insert(COUNTRY_TABLE, null, values);
    }

    public void addQuestion(Question question){
        Log.d("addQuestion", question.toString());

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(QUESTION_PREGUNTA, question.getPregunta());
        values.put(QUESTION_PAISCORR, question.getPaisCorrecto());

        db.insert(QUESTION_TABLE, null, values);
    }

    public List<Country> getAllCountries(){
        List<Country> countries = new LinkedList<>();

        String query = "SELECT * FROM " + COUNTRY_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        int i = 0;
        if (cursor.moveToFirst()){
            do {
                Country country = new Country();
                //Log.d("cursor string 5:", cursor.getColumnName(5));
                country.set_id(Integer.parseInt(cursor.getString(0)));
                country.setName(cursor.getString(1));
                country.setDescription(cursor.getString(2));
                country.setFlagId(cursor.getString(3));
                country.setCapital(cursor.getString(4));
                country.setKilometers(Double.parseDouble(cursor.getString(5)));
                System.out.println(country);
                countries.add(country);
            }while(cursor.moveToNext());
        }

        return countries;
    }

    public List<Question> getAllQuestions(){
        List<Question> questions = new LinkedList<>();

        String query = "SELECT * FROM " + QUESTION_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Question question = null;

        if (cursor.moveToFirst()){
            do{
                question.setPregunta(cursor.getString(1));
                question.setPaisCorrecto(Integer.parseInt(cursor.getString(2)));
                questions.add(question);
            }while(cursor.moveToNext());
        }

        return questions;
    }
}
