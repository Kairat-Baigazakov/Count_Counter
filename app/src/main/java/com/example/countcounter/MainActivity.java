package com.example.countcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    final int POINT_3 = 3;
    final int POINT_2 = 2;
    final int POINT_1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void point3A(View view) {
        goalsTeamA = goalsTeamA + POINT_3;
        displayForTeamA(goalsTeamA);
    }

    public void point2A(View view) {
        goalsTeamA = goalsTeamA + POINT_2;
        displayForTeamA(goalsTeamA);
    }

    public void freeThrowA(View view) {
        goalsTeamA = goalsTeamA + POINT_1;
        displayForTeamA(goalsTeamA);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void point3B(View view) {
        goalsTeamB = goalsTeamB + POINT_3;
        displayForTeamB(goalsTeamB);
    }

    public void point2B(View view) {
        goalsTeamB = goalsTeamB + POINT_2;
        displayForTeamB(goalsTeamB);
    }

    public void freeThrowB(View view) {
        goalsTeamB = goalsTeamB + POINT_1;
        displayForTeamB(goalsTeamB);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        displayForTeamA(goalsTeamA);
        displayForTeamB(goalsTeamB);
    }
}