package com.shrunk.baskiecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA2Points(View view){
        teamAScore = teamAScore + 2;
        displayTeamAScore(teamAScore);
    }

    public void teamA3Points(View view){
        teamAScore = teamAScore + 3;
        displayTeamAScore(teamAScore);
    }

    public void teamAFreeThrow(View view){
        teamAScore = teamAScore + 5;
        displayTeamAScore(teamAScore);
    }

    public void displayTeamAScore(int score){
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(""+score);
    }

    public void teamB2Points(View view){
        teamBScore = teamBScore + 2;
        displayTeamBScore(teamBScore);
    }

    public void teamB3Points(View view){
        teamBScore = teamBScore + 3;
        displayTeamBScore(teamBScore);
    }

    public void teamBFreeThrow(View view){
        teamBScore = teamBScore + 5;
        displayTeamBScore(teamBScore);
    }

    public void displayTeamBScore(int score){
        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText(""+score);
    }



    public void reset(View view){
        TextView teamA = (TextView) findViewById(R.id.team_a_score);
        TextView teamB = (TextView) findViewById(R.id.team_b_score);
        teamA.setText(""+0);
        teamB.setText(""+0);
        teamAScore = 0;
        teamBScore = 0;
    }

}
