package com.uca.parcial1.countrygame;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uca.parcial1.countrygame.data.Country;

/**
 * Created by fernando on 5/2/17.
 */

public class DetailsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {

        //the activity that contains this fragment
        Activity activity = this.getActivity();

        //populating listView with list content
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        return v;
    }
}
