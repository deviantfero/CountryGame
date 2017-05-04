package com.uca.parcial1.countrygame.data;

/**
 * Created by fernando on 5/1/17.
 */

public class Country {

    private String name;
    private String description;
    private String capital;
    private int flagId;
    private String language;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    private double kilometers;

    public Country(String n, String d, int f, String l, int km, String ca) {
        this.name = n;
        this.description = d;
        this.flagId = f;
        this.language = l;
        this.kilometers = km;
        this.capital = ca;
    }

    public Country(String n, String d, String l, int km) {
        this.name = n;
        this.description = d;
        this.language = l;
        this.kilometers = km;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
