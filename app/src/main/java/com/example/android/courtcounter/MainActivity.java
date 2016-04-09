package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Team A 3 Points button is clicked.
     */
    public void Team_A_3_Points(View v) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    /**
     * This method is called when the Team A 2 Points button is clicked.
     */
    public void Team_A_2_Points(View v) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }


    /**
     * This method is called when the Team A FreeThrow button is clicked.
     */
    public void Team_A_Freethrow(View v) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Team B 3 Points button is clicked.
     */
    public void Team_B_3_Points(View v) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    /**
     * This method is called when the Team B 2 Points button is clicked.
     */
    public void Team_B_2_Points(View v) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }


    /**
     * This method is called when the Team B FreeThrow button is clicked.
     */
    public void Team_B_Freethrow(View v) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View V) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }


}
