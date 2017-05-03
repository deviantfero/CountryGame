package com.uca.parcial1.countrygame;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(this.findViewById(R.id.countryFrameContainer) != null) {
            if(savedInstanceState != null)
                return;

            ListFragment countryListFragment = new ListFragment();
            //countryListFragment.setArguments(this.getIntent().getExtras());
            this.getSupportFragmentManager().beginTransaction()
                    .add(R.id.countryFrameContainer, countryListFragment).commit();
        }
    }
}
