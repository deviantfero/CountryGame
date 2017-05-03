package com.uca.parcial1.countrygame.data;

import com.uca.parcial1.countrygame.R;

import java.util.ArrayList;

/**
 * Created by fernando on 5/2/17.
 */

public class CountryRepo {
    public static ArrayList<Country> data;
    private static CountryRepo instance = null;

    protected CountryRepo() {
        this.data = new ArrayList<>();
        this.data.add(new Country("El Salvador", "Bad Country", R.drawable.sv_flag, "Spanish", 123));
        this.data.add(new Country("USA", "Bad Country", R.drawable.us_flag, "English", 123));
        this.data.add(new Country("Rusia", "Bad Country", R.drawable.rs_flag, "Russian", 123));
        this.data.add(new Country("Alemania", "Bad Country", R.drawable.de_flag, "German", 123));
    }

    public static CountryRepo getInstance() {
        if(instance == null)
            instance = new CountryRepo();
        return instance;
    }
}
