package com.uca.parcial1.countrygame.data;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.uca.parcial1.countrygame.R;

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
    public View getView(int pos, View v, ViewGroup parent) {
        if(v == null) {
            LayoutInflater vi = LayoutInflater.from(this.getContext());
            v = vi.inflate(R.layout.list_element, null);
        }

        Country itemCountry = this.getItem(pos);

        if(itemCountry != null) {
            ImageView countryFlag = (ImageView) v.findViewById(R.id.countryFlag);
            TextView countryName = (TextView) v.findViewById(R.id.countryName);

            if(countryFlag != null && countryName != null) {
                countryName.setText(itemCountry.getName());
                //countryFlag.setImageDrawable(ContextCompat.getDrawable(this.getContext(), itemCountry.getFlagId()));
            }
        }
        return v;
    }

}
