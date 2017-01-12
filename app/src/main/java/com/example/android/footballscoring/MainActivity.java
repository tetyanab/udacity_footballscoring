package com.example.android.footballscoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscoring.R;

public class MainActivity extends AppCompatActivity {

    // Tracks the game score for team A.
    int scoreTeamA = 0;

    // Tracks the game score for team B.
    int scoreTeamB = 0;

    // Tracks the number of yellow cards for team A.
    int yellowCardsTeamA = 0;

    // Tracks the number of yellow cards for team B.
    int yellowCardsTeamB = 0;

    // Tracks the number of red cards for team A.
    int redCardsTeamA = 0;

    // Tracks the number of red cards for team B.
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Goal button for team A is clicked.
     */
    public void addGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the accumulated number of yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "Yellow card" button for team A is clicked.
     */
    public void addYellowCardTeamA(View view) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsTeamA);
    }

    /**
     * Displays the accumulated number of red cards for Team A.
     */
    public void displayRedCardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "Red card" button for team A is clicked.
     */
    public void addRedCardTeamA(View view) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Goal button for team B is clicked.
     */
    public void addGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the accumulated number of yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "Yellow card" button for team B is clicked.
     */
    public void addYellowCardTeamB(View view) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsTeamB);
    }

    /**
     * Displays the accumulated number of red cards for Team B.
     */
    public void displayRedCardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "Red card" button for team B is clicked.
     */
    public void addRedCardTeamB(View view) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void reset(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        yellowCardsTeamA = 0;
        displayYellowCardsForTeamA(yellowCardsTeamA);
        redCardsTeamA = 0;
        displayRedCardsForTeamA(redCardsTeamA);
        yellowCardsTeamB = 0;
        displayYellowCardsForTeamB(yellowCardsTeamB);
        redCardsTeamB = 0;
        displayRedCardsForTeamB(redCardsTeamB);
    }
}
