package com.example.android.abnd_project2_jonathanfernandezgomez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Add 10 points to team One */
    public void addQuaffleToOne(View view) {
        scoreTeamOne = scoreTeamOne + 10;
        displayScoreOne(scoreTeamOne);
    }

    /**Add 30 points to team One */
    public void addSnitchToOne(View view) {
        scoreTeamOne = scoreTeamOne + 30;
        displayScoreOne(scoreTeamOne);
    }

    /**Display score of team One */
    public void displayScoreOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_one);
        scoreView.setText(String.valueOf(score));
    }

    /**Add 10 points to team Two */
    public void addQuaffleToTwo(View view) {
        scoreTeamTwo = scoreTeamTwo + 10;
        displayScoreTwo(scoreTeamTwo);
    }

    /**Add 30 points to team Two */
    public void addSnitchToTwo(View view) {
        scoreTeamTwo = scoreTeamTwo + 30;
        displayScoreTwo(scoreTeamTwo);
    }

    /**Display score of team Two */
    public void displayScoreTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_two);
        scoreView.setText(String.valueOf(score));
    }

    /**Resets both score values to 0 */
    public void endGame(View view) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        displayScoreOne(scoreTeamOne);
        displayScoreTwo(scoreTeamTwo);
    }
}