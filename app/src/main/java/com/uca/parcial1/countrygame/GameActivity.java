package com.uca.parcial1.countrygame;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    ArrayList<Country> countries = CountryRepo.getInstance().data;
    ImageView flag;
    Button ans1, ans2, ans3, ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_question);
        flag = (ImageView)findViewById(R.id.questionFlagImageView);
        ans1 = (Button)findViewById(R.id.firstAnsRadioButton);
        ans2 = (Button)findViewById(R.id.secondAnsRadioButton);
        ans3 = (Button)findViewById(R.id.thirdAnsRadioButton);
        ans4 = (Button)findViewById(R.id.fourthAnsRadioButton);

        startGame();
    }

    private void startGame(){
        ArrayList<Country> questionCountries = (ArrayList<Country>)countries.clone();

        for (int i = 0; i < 10; i++){
            questionCountries.remove((int)Math.random() * (questionCountries.size() + 1));
        }

        Collections.shuffle(questionCountries);
        flag.setImageResource(questionCountries.get(0).getFlagId());

    }

    public void answerSelected(View view){
        Integer aciertos = 0;
        ImageView flag = (ImageView)findViewById(R.id.questionFlagImageView);
        Button ans1, ans2, ans3, ans4;

        ans1 = (Button)findViewById(R.id.firstAnsRadioButton);
        ans2 = (Button)findViewById(R.id.secondAnsRadioButton);
        ans3 = (Button)findViewById(R.id.thirdAnsRadioButton);
        ans4 = (Button)findViewById(R.id.fourthAnsRadioButton);

        flag.setImageResource(R.drawable.ca);
        ans1.setText(countries.get(1).getName());
    }
}
