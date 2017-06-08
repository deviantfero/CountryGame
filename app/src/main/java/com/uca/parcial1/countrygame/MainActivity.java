package com.uca.parcial1.countrygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.model.CountryDBHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CountryDBHelper db = new CountryDBHelper(this);

        //db.addCountry(new Country("El Salvador", "Pais seguro y bueno (:", "../kepex.png", "khe", 200, "La uca"));
        List<Country> countries = db.getAllCountries();
        System.out.println("holi");
        setContentView(R.layout.activity_main);
    }

    public void setGame(View v) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void setLearning(View v) {
        Intent intent = new Intent(this, LearnActivty.class);
        startActivity(intent);
    }
}
