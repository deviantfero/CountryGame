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
        this.data.add(new Country("El Salvador", "Bad Country", R.drawable.sv, "Español", 123));
        this.data.add(new Country("Mexico", "Bad Country", R.drawable.mx, "Español", 123));
        this.data.add(new Country("USA", "Bad Country", R.drawable.us, "Ingles", 123));
        this.data.add(new Country("Reino Unido", "Bad Country", R.drawable.uk, "Ingles", 123));
        this.data.add(new Country("Canada", "Canada es un país soberano de América del Norte, " +
                "cuya forma de gobierno es la monarquía parlamentaria federal. Su territorio está " +
                "organizado en diez provincias y tres territorios. Su capital es la ciudad de Ottawa " +
                "y la ciudad más poblada es Toronto.", R.drawable.ca, "Ingles", 9984670));
        this.data.add(new Country("Rusia", "Bad Country", R.drawable.ru, "Ruso", 123));
        this.data.add(new Country("Alemania", "Bad Country", R.drawable.de, "Aleman", 123));
    }

    public static CountryRepo getInstance() {
        if(instance == null)
            instance = new CountryRepo();
        return instance;
    }
}
