package com.example.gebruiker.flashscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import static com.example.gebruiker.flashscore.R.id.winningTeamA;
import static com.example.gebruiker.flashscore.R.id.winningTeamB;
import static com.example.gebruiker.flashscore.R.string.reset;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Telt de score en toont de score voor team A
     */
    public void goalsA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
        if (scoreA == 10) {
            TextView winningA = (TextView) findViewById(winningTeamA);
            winningA.setVisibility(View.VISIBLE);

            findViewById(R.id.btnGoal1).setEnabled(false);
            findViewById(R.id.btnOwnGoal1).setEnabled(false);
            findViewById(R.id.btnfoul1).setEnabled(false);

            findViewById(R.id.btnGoal2).setEnabled(false);
            findViewById(R.id.btnOwnGoal2).setEnabled(false);
            findViewById(R.id.btnfoul2).setEnabled(false);


        } else {
            findViewById(R.id.btnGoal1).setEnabled(true);
            findViewById(R.id.btnOwnGoal1).setEnabled(true);
            findViewById(R.id.btnfoul1).setEnabled(true);

            findViewById(R.id.btnGoal2).setEnabled(true);
            findViewById(R.id.btnOwnGoal2).setEnabled(true);
            findViewById(R.id.btnfoul2).setEnabled(true);

        }


    }

    /**
     * Telt de score en toont de score voor team B
     */

    public void goalsB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);

        if (scoreB == 10) {
            TextView winningB = (TextView) findViewById(winningTeamB);
            winningB.setVisibility(View.VISIBLE);

            findViewById(R.id.btnGoal1).setEnabled(false);
            findViewById(R.id.btnOwnGoal1).setEnabled(false);
            findViewById(R.id.btnfoul1).setEnabled(false);

            findViewById(R.id.btnGoal2).setEnabled(false);
            findViewById(R.id.btnOwnGoal2).setEnabled(false);
            findViewById(R.id.btnfoul2).setEnabled(false);


        } else {
            findViewById(R.id.btnGoal1).setEnabled(true);
            findViewById(R.id.btnOwnGoal1).setEnabled(true);
            findViewById(R.id.btnfoul1).setEnabled(true);

            findViewById(R.id.btnGoal2).setEnabled(true);
            findViewById(R.id.btnOwnGoal2).setEnabled(true);
            findViewById(R.id.btnfoul2).setEnabled(true);

        }


    }

    /**
     * Als er een eigen goal wordt gemaakt, tegenstander 1 punt
     */

    public void ownGoalsA(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);

        if (scoreB == 10) {
            TextView winningB = (TextView) findViewById(winningTeamB);
            winningB.setVisibility(View.VISIBLE);

            findViewById(R.id.btnGoal1).setEnabled(false);
            findViewById(R.id.btnOwnGoal1).setEnabled(false);
            findViewById(R.id.btnfoul1).setEnabled(false);

            findViewById(R.id.btnGoal2).setEnabled(false);
            findViewById(R.id.btnOwnGoal2).setEnabled(false);
            findViewById(R.id.btnfoul2).setEnabled(false);


        } else {
            findViewById(R.id.btnGoal1).setEnabled(true);
            findViewById(R.id.btnOwnGoal1).setEnabled(true);
            findViewById(R.id.btnfoul1).setEnabled(true);

            findViewById(R.id.btnGoal2).setEnabled(true);
            findViewById(R.id.btnOwnGoal2).setEnabled(true);
            findViewById(R.id.btnfoul2).setEnabled(true);

        }


    }

    public void owngoalsB(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
        if (scoreA == 10) {
            TextView winningA = (TextView) findViewById(winningTeamA);
            winningA.setVisibility(View.VISIBLE);

            findViewById(R.id.btnGoal1).setEnabled(false);
            findViewById(R.id.btnOwnGoal1).setEnabled(false);
            findViewById(R.id.btnfoul1).setEnabled(false);

            findViewById(R.id.btnGoal2).setEnabled(false);
            findViewById(R.id.btnOwnGoal2).setEnabled(false);
            findViewById(R.id.btnfoul2).setEnabled(false);


        } else {
            findViewById(R.id.btnGoal1).setEnabled(true);
            findViewById(R.id.btnOwnGoal1).setEnabled(true);
            findViewById(R.id.btnfoul1).setEnabled(true);

            findViewById(R.id.btnGoal2).setEnabled(true);
            findViewById(R.id.btnOwnGoal2).setEnabled(true);
            findViewById(R.id.btnfoul2).setEnabled(true);

        }
    }

    /**
     * Telt de overtredingen op
     */

    public void foulsA(View view) {
        foulsA += 1;
        displayFoulsForTeamA(foulsA);

        /**Als de kaarten gelijk is aan 2, gele kaart voor team A*/

        if (foulsA >= 2) {
            ImageView geleKaart = (ImageView) findViewById(R.id.gelekaart);
            geleKaart.setVisibility(View.VISIBLE);
        }

        /**Als de kaarten gelijk is aan 6, rode kaart voor team A*/

        if (foulsA >= 6) {
            ImageView rodeKaart = (ImageView) findViewById(R.id.rodekaart);
            rodeKaart.setVisibility(View.VISIBLE);

        }
        /**Als de kaarten gelijk is aan 11, rode kaart voor team A*/

        if (foulsA >= 11) {
            ImageView rodeKaart = (ImageView) findViewById(R.id.rodekaart1);
            rodeKaart.setVisibility(View.VISIBLE);
        }
        if (foulsA + foulsB >= 30) {
            TextView staking = (TextView) findViewById(R.id.Textview_staking);
            staking.setVisibility(View.VISIBLE);

        }


    }

    /**
     * Telt de overtredingen op
     */

    public void foulsB(View view) {
        foulsB += 1;
        displayFoulsForTeamB(foulsB);

        /**Als de kaarten gelijk is aan 3, gele kaart voor team B*/

        if (foulsB >= 3) {
            ImageView geleKaart = (ImageView) findViewById(R.id.gelekaart1);
            geleKaart.setVisibility(View.VISIBLE);

        }

        /**Als de kaarten gelijk is aan 7, gele kaart voor team B*/

        if (foulsB >= 7) {
            ImageView geleKaart = (ImageView) findViewById(R.id.gelekaart2);
            geleKaart.setVisibility(View.VISIBLE);

        }
        /**Als de kaarten gelijk is aan 12, gele kaart voor team B*/

        if (foulsB >= 12) {
            ImageView geleKaart = (ImageView) findViewById(R.id.gelekaart3);
            geleKaart.setVisibility(View.VISIBLE);

        }
        if (foulsA + foulsB >= 30) {
            TextView staking = (TextView) findViewById(R.id.Textview_staking);
            staking.setVisibility(View.VISIBLE);


            findViewById(R.id.btnGoal1).setEnabled(false);
            findViewById(R.id.btnOwnGoal1).setEnabled(false);
            findViewById(R.id.btnfoul1).setEnabled(false);

            findViewById(R.id.btnGoal2).setEnabled(false);
            findViewById(R.id.btnOwnGoal2).setEnabled(false);
            findViewById(R.id.btnfoul2).setEnabled(false);


        } else {
            findViewById(R.id.btnGoal1).setEnabled(true);
            findViewById(R.id.btnOwnGoal1).setEnabled(true);
            findViewById(R.id.btnfoul1).setEnabled(true);

            findViewById(R.id.btnGoal2).setEnabled(true);
            findViewById(R.id.btnOwnGoal2).setEnabled(true);
            findViewById(R.id.btnfoul2).setEnabled(true);

        }

    }


    /**
     * Toont de score voor team A op het scherm
     */


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreEersteTeam);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Toont de score voor team B op het scherm
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTweedeTeam);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Toont de overtredingen voor team A op het scherm
     */

    public void displayFoulsForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.Textview_fouls1);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Toont de overtredingen voor team B op het scherm
     */

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Textview_fouls2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset knop
     **/

    public void btnResetting(View view) {
        scoreA = 0;
        displayForTeamA(scoreA);
        scoreB = 0;
        displayForTeamB(scoreB);
        foulsA = 0;
        displayFoulsForTeamA(foulsA);
        foulsB = 0;
        displayFoulsForTeamB(foulsB);

        ImageView geleKaart = (ImageView) findViewById(R.id.gelekaart);
        geleKaart.setVisibility(View.GONE);

        ImageView rodeKaart = (ImageView) findViewById(R.id.rodekaart);
        rodeKaart.setVisibility(View.GONE);

        ImageView rodeKaart1 = (ImageView) findViewById(R.id.rodekaart1);
        rodeKaart1.setVisibility(View.GONE);

        ImageView geleKaart1 = (ImageView) findViewById(R.id.gelekaart1);
        geleKaart1.setVisibility(View.GONE);

        ImageView geleKaart2 = (ImageView) findViewById(R.id.gelekaart2);
        geleKaart2.setVisibility(View.GONE);

        ImageView geleKaart3 = (ImageView) findViewById(R.id.gelekaart3);
        geleKaart3.setVisibility(View.GONE);

        TextView staking = (TextView) findViewById(R.id.Textview_staking);
        staking.setVisibility(View.GONE);

        TextView winningA = (TextView) findViewById(winningTeamA);
        winningA.setVisibility(View.GONE);

        TextView winningB = (TextView) findViewById(winningTeamB);
        winningB.setVisibility(View.GONE);


        findViewById(R.id.btnGoal1).setEnabled(true);
        findViewById(R.id.btnOwnGoal1).setEnabled(true);
        findViewById(R.id.btnfoul1).setEnabled(true);

        findViewById(R.id.btnGoal2).setEnabled(true);
        findViewById(R.id.btnOwnGoal2).setEnabled(true);
        findViewById(R.id.btnfoul2).setEnabled(true);


    }


}
