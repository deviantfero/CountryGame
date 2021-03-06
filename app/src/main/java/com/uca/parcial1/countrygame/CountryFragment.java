package com.uca.parcial1.countrygame;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryAdapter;
import com.uca.parcial1.countrygame.data.CountryRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fernando on 5/1/17.
 */

public class CountryFragment extends ListFragment {

    private ListView countryList;
    private CountryAdapter adapter;
    private List<Country> countries;

    onCountrySelectedListener eventCallback;

    public interface onCountrySelectedListener {
        public void onCountrySelected(int position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {

        //the activity that contains this fragment
        Activity activity = this.getActivity();
        this.countries = new ArrayList<Country>();

        //populating listView with list content
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        CountryRepo countries = CountryRepo.getInstance();

        this.countryList = (ListView) v.findViewById(android.R.id.list);
        this.adapter = new CountryAdapter(this.getActivity(), R.layout.list_element, countries.data);
        this.countryList.setAdapter(adapter);
        this.getActivity().setTitle(R.string.title_activity_learn);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

        if(getFragmentManager().findFragmentById(R.id.detailFragment) != null)
            this.countryList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if(context instanceof Activity)
            activity = (Activity) context;
        else
            activity = null;

        try {
            eventCallback = (onCountrySelectedListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + "must implement onCountrySelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        eventCallback.onCountrySelected(position);
        this.countryList.setItemChecked(position, true);
    }
}
