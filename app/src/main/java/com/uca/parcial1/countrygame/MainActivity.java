package com.uca.parcial1.countrygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView countryList;
    private CountryAdapter adapter;
    private List<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.countries = new ArrayList<Country>();

        this.countries.add(new Country("El Salvador", "Bad Country", "spanish", 123));
        this.countries.add(new Country("USA", "Bad Country", "spanish", 123));
        this.countries.add(new Country("Testo", "Bad Country", "spanish", 123));

        this.countryList = (ListView) this.findViewById(R.id.countryList);
        adapter = new CountryAdapter(this, R.layout.list_element, countries);
        this.countryList.setAdapter(adapter);
    }
}
