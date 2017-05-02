package com.uca.parcial1.countrygame;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fernando on 5/1/17.
 */

public class ListFragment extends Fragment {

    private ListView countryList;
    private CountryAdapter adapter;
    private List<Country> countries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {

        //the activity that contains this fragment
        Activity activity = this.getActivity();
        this.countries = new ArrayList<Country>();

        //populating listView with list content
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        this.countries.add(new Country("El Salvador", "Bad Country", R.drawable.sv_flag, "Spanish", 123));
        this.countries.add(new Country("US AND A", "Bad Country", R.drawable.us_flag, "English", 123));
        this.countries.add(new Country("RUSHIIA", "Bad Country", R.drawable.rs_flag, "Russian", 123));
        this.countries.add(new Country("YERMANI", "Bad Country", R.drawable.de_flag, "German", 123));

        this.countryList = (ListView) v.findViewById(R.id.countryList);
        this.adapter = new CountryAdapter(this.getActivity(), R.layout.list_element, countries);
        this.countryList.setAdapter(adapter);

        return v;
    }
}
