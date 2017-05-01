package com.uca.parcial1.countrygame.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by fernando on 5/1/17.
 */

public class CountryAdapter extends ArrayAdapter<Country> {

    public CountryAdapter(Context context, int textViewRid){
        super(context, textViewRid);
    }

    public CountryAdapter(Context context, int resource, List<Country> countries){
        super(context, resource, countries);
    }

    @Override
    public View getView(int pos, View result, ViewGroup parent) {
        if(result == null) {
            LayoutInflater vi = LayoutInflater.from(this.getContext());
        }
    }

}
