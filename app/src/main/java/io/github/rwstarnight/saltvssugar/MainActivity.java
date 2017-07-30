package io.github.rwstarnight.saltvssugar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void voteSalt(View view) {
        int udacicolaVotes = 0;
        udacicolaVotes = udacicolaVotes + 1;
    }

    public void voteSweet(View view) {
        int pepcityVotes;
        pepcityVotes = pepcityVotes + 1;
    }

    public void showMeVotes(View view) {
        display(udacicolaVotes + " vs. " + pepcityVotes);
    }

}
