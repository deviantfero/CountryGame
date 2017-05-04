package com.uca.parcial1.countrygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.uca.parcial1.countrygame.data.Country;
import com.uca.parcial1.countrygame.data.CountryRepo;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    ArrayList<Country> countries = CountryRepo.getInstance().data;
    ArrayList<Country> questionCountries;
    ImageView flag;
    Button ans1, ans2, ans3, ans4;
    int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_question);
        flag = (ImageView)findViewById(R.id.questionFlagImageView);
        ans1 = (Button)findViewById(R.id.firstAnsRadioButton);
        ans2 = (Button)findViewById(R.id.secondAnsRadioButton);
        ans3 = (Button)findViewById(R.id.thirdAnsRadioButton);
        ans4 = (Button)findViewById(R.id.fourthAnsRadioButton);

        questionCountries = (ArrayList<Country>)countries.clone();

        startGame();
    }

    private void startGame(){
        for (int i = 0; i < 10; i++){
            questionCountries.remove((int)Math.random() * (questionCountries.size()));
        }

        Collections.shuffle(questionCountries);
        generateQuestionLayout();
    }

    public void answerSelected(View view){
        if (((Button)view).getText().toString() == questionCountries.get(0).getName().toString())
            setCont(getCont() + 1);

        System.out.println(getCont());
        questionCountries.remove(0);

        if (questionCountries.size() > 0){
            generateQuestionLayout();
        }else{
            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra("score", this.getCont() + "");
            startActivity(intent);
        }
    }

    private void generateQuestionLayout(){
        ArrayList<Country> auxiliarCountries = (ArrayList<Country>)countries.clone();
        auxiliarCountries.remove(questionCountries.get(0));
        ArrayList<Country> buttons = new ArrayList<>();
        buttons.add(questionCountries.get(0));

        Collections.shuffle(auxiliarCountries);

        for (int i = 0; i < 3; i++){
            buttons.add(auxiliarCountries.get(i));
        }

        flag.setImageResource(questionCountries.get(0).getFlagId());

        Collections.shuffle(buttons);

        ans1.setText(buttons.get(0).getName());
        ans2.setText(buttons.get(1).getName());
        ans3.setText(buttons.get(2).getName());
        ans4.setText(buttons.get(3).getName());
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public ArrayList<Country> getQuestionCountries() {
        return questionCountries;
    }

    public void setQuestionCountries(ArrayList<Country> questionCountries) {
        this.questionCountries = questionCountries;
    }
}
