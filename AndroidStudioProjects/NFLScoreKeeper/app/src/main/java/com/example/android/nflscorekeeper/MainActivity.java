package com.example.android.nflscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int Team_A_Score = 0;
    int Team_B_Score = 0;

    public void TeamAtouchdown(View view){
        Team_A_Score += 6;
        displayForTeamA(Team_A_Score);
    }
    public void TeamAfieldgoal(View view){
        Team_A_Score += 3;
        displayForTeamA(Team_A_Score);
    }
    public void TeamAextra2(View view){
        Team_A_Score += 2;
        displayForTeamA(Team_A_Score);
    }
    public void TeamAextra1(View view){
        Team_A_Score += 1;
        displayForTeamA(Team_A_Score);
    }
    public void TeamAsafety(View view){
        Team_A_Score += 2;
        displayForTeamA(Team_A_Score);
    }


    public void TeamBtouchdown(View view){
        Team_B_Score += 6;
        displayForTeamB(Team_B_Score);
    }
    public void TeamBfieldgoal(View view){
        Team_B_Score += 3;
        displayForTeamB(Team_B_Score);
    }
    public void TeamBextra2(View view){
        Team_B_Score += 2;
        displayForTeamB(Team_B_Score);
    }
    public void TeamBextra1(View view){
        Team_B_Score += 1;
        displayForTeamB(Team_B_Score);
    }

    public void TeamBsafety(View view){
        Team_B_Score += 2;
        displayForTeamB(Team_B_Score);
    }

    public void Reset(View view){
        Team_A_Score = 0;
        Team_B_Score = 0;
        displayForTeamA(Team_A_Score);
        displayForTeamB(Team_B_Score);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}