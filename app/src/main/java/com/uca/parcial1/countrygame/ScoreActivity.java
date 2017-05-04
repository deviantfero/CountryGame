package com.uca.parcial1.countrygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView view = ((TextView)findViewById(R.id.scoreView));
        view.setText(view.getText() + getIntent().getStringExtra("score"));
    }

    @Override
    public void onBackPressed(){
        this.startActivity(new Intent(ScoreActivity.this, MainActivity.class));
    }
}
