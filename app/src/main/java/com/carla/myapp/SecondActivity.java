package com.carla.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String output = "";
    TextView raw;
    TextView fg;
    Button goBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        raw = (TextView) findViewById(R.id.RA);
        fg = (TextView) findViewById(R.id.FG);
        goBack = (Button) findViewById(R.id.goBack);

        int q1Score = getIntent().getExtras().getInt("q1Score");
        int q2Score = getIntent().getExtras().getInt("q2Score");
        int swScore = getIntent().getExtras().getInt("swScore");
        int labexerScore = getIntent().getExtras().getInt("labexerScore");
        int majorexamScore = getIntent().getExtras().getInt("majorexamScore");

       double ra = (q1Score * .10) + (q2Score * .10) + (swScore * .10)
                + (labexerScore * .40) + (majorexamScore * .30);

        if (ra < 60) {
            output = "5.0";
        } else if (ra >= 60 && ra <66) {
            output  = "3.0";
        } else if (ra >= 66 && ra <71) {
            output = "2.75";
        } else if (ra >= 71 && ra <76) {
            output = "2.5";
        } else if (ra >= 76 && ra <81) {
            output = "2.25";
        }else if (ra >= 81 && ra <86) {
            output = "2.0";
        } else if (ra >= 86 && ra <91) {
            output = "1.75";
        } else if (ra >= 91 && ra <93) {
            output = "1.5";
        } else if (ra >= 93 && ra <95) {
            output = "1.25";
        } else if (ra >= 95 && ra <101) {
            output = "1.0";
        } else {
            output ="INVALID";
        }

        String rawave = Double.toString(ra);
        raw.setText(rawave);
        fg.setText(output);


    }

    public void setGoBack (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}



