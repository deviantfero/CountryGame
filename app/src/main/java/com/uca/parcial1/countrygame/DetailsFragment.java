package com.uca.parcial1.countrygame;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryRepo;

/**
 * Created by fernando on 5/2/17.
 */

public class DetailsFragment extends Fragment {

    final static String POSITION = "position";
    private int currentPos = -1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {

        //the activity that contains this fragment
        Activity activity = this.getActivity();

        //populating listView with list content
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        if(savedInstaceState != null)
            this.currentPos = savedInstaceState.getInt(this.POSITION);
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle args = this.getArguments();
        if(args != null)
            this.setFocus(args.getInt(this.POSITION));
        else if(this.currentPos != -1)
            this.setFocus(this.currentPos);
    }

    public int setFocus(int position) {
        CountryRepo repo = CountryRepo.getInstance();
        Country selectedCountry = repo.data.get(position);

        ImageView countryFlag = (ImageView) this.getActivity().findViewById(R.id.detailFlag);
        TextView countryName = (TextView) this.getActivity().findViewById(R.id.detailName);
        TextView countryDesc = (TextView) this.getActivity().findViewById(R.id.detailDescription);
        TextView countryLang = (TextView) this.getActivity().findViewById(R.id.detailLanguage);
        TextView countrySize = (TextView) this.getActivity().findViewById(R.id.detailSize);

        countryFlag.setImageResource(selectedCountry.getFlagId());
        countryName.setText(selectedCountry.getName());
        countryDesc.setText(selectedCountry.getDescription());
        countryLang.setText(selectedCountry.getLanguage());
        countrySize.setText("" + selectedCountry.getKilometers());
        return position;
    }
}
