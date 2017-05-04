package com.uca.parcial1.countrygame;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LearnActivty extends AppCompatActivity
    implements CountryFragment.onCountrySelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        if(this.findViewById(R.id.learnFragmentContainer) != null) {
            if(savedInstanceState != null)
                return;

            DetailsFragment countryDetail = (DetailsFragment)this.getSupportFragmentManager()
                    .findFragmentById(R.id.detailFragment);
            if(countryDetail == null) {
                CountryFragment countryListFragment = new CountryFragment();
                this.getSupportFragmentManager().beginTransaction()
                        .add(R.id.learnFragmentContainer, countryListFragment).commit();
            } else {
                countryDetail.setFocus(0);
            }
        }
    }

    public void onCountrySelected(int position) {
        DetailsFragment countryDetail = (DetailsFragment)this.getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);

        if(countryDetail != null) {
            countryDetail.setFocus(position);
        } else {
            DetailsFragment newDetail = new DetailsFragment();
            Bundle args = new Bundle();
            args.putInt(DetailsFragment.POSITION, position);
            newDetail.setArguments(args);
            FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.learnFragmentContainer, newDetail);
            transaction.addToBackStack(null);

            transaction.commit();
        }
    }
}
