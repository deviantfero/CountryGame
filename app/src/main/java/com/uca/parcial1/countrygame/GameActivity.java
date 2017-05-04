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
    int corrAnswer;
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
            questionCountries.remove((int)Math.random() * (questionCountries.size() + 1));
        }

        Collections.shuffle(questionCountries);
        this.setCorrAnswer((int) Math.random() * 4);
        generateQuestionLayout();
    }

    public void answerSelected(View view){
        switch (getCorrAnswer()){
            case 0:
                if (view.getId() == R.id.firstAnsRadioButton)
                    setCont(getCont() + 1);
                break;

            case 1:
                if (view.getId() == R.id.secondAnsRadioButton)
                    setCont(getCont() + 1);
                break;

            case 2:
                if (view.getId() == R.id.thirdAnsRadioButton)
                    setCont(getCont() + 1);
                break;

            case 3:
                if (view.getId() == R.id.fourthAnsRadioButton)
                    setCont(getCont() + 1);
                break;
        }

        this.setCorrAnswer((int)Math.random()*4);

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

        System.out.println(auxiliarCountries.size());
        flag.setImageResource(questionCountries.get(0).getFlagId());

        int aux;
        switch (getCorrAnswer()){
            case 0:
                ans1.setText(questionCountries.get(0).getName());
                auxiliarCountries.remove(questionCountries.get(0));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans2.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));


                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans3.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans4.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));

                break;

            case 1:
                ans2.setText(questionCountries.get(0).getName());
                auxiliarCountries.remove(questionCountries.get(0));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans1.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));


                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans3.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans4.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));
                break;

            case 2:
                ans3.setText(questionCountries.get(0).getName());
                auxiliarCountries.remove(questionCountries.get(0));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans2.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));


                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans1.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans4.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));
                break;

            case 3:
                ans4.setText(questionCountries.get(0).getName());
                auxiliarCountries.remove(questionCountries.get(0));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans2.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));


                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans3.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));

                aux = (int)Math.random() * (auxiliarCountries.size() + 1);
                ans1.setText(auxiliarCountries.get(aux).getName());
                auxiliarCountries.remove(auxiliarCountries.get(aux));
                break;
        }

        questionCountries.remove(0);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }


    public int getCorrAnswer() {
        return corrAnswer;
    }

    public void setCorrAnswer(int corrAnswer) {
        this.corrAnswer = corrAnswer;
    }

    public ArrayList<Country> getQuestionCountries() {
        return questionCountries;
    }

    public void setQuestionCountries(ArrayList<Country> questionCountries) {
        this.questionCountries = questionCountries;
    }
}
