package com.uca.parcial1.countrygame.data;

/**
 * Created by fernando on 5/1/17.
 */

public class Country {

    private String name;
    private String description;
    private String flagRoute;
    private String language;
    private int kilometers;

    Country(String n, String d, String f, String l, int km) {
        this.name = n;
        this.description = d;
        this.flagRoute = f;
        this.language = l;
        this.kilometers = km;
    }

    Country(String n, String d, String l, int km) {
        this.name = n;
        this.description = d;
        this.language = l;
        this.kilometers = km;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
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

    public String getFlagRoute() {
        return flagRoute;
    }

    public void setFlagRoute(String flagRoute) {
        this.flagRoute = flagRoute;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
