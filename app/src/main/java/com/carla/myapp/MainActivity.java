package com.carla.myapp;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText q1;
    EditText q2;
    EditText seatworks;
    EditText labexer;
    EditText majorexams;
    Button btnCompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        seatworks = (EditText) findViewById(R.id.seatworks);
        labexer = (EditText) findViewById(R.id.labexer);
        majorexams = (EditText) findViewById(R.id.majorexam);
        btnCompute = (Button) findViewById(R.id.btnCompute);
    }

    public void callSecondActivity (View view) {

       Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("q1", Integer.parseInt(q1.getText().toString()));
        intent.putExtra("q2", Integer.parseInt(q2.getText().toString()));
        intent.putExtra("seatworks", Integer.parseInt(seatworks.getText().toString()));
        intent.putExtra("labexer", Integer.parseInt(labexer.getText().toString()));
        intent.putExtra("majorexams", Integer.parseInt(majorexams.getText().toString()));

        startActivity(intent);





    }
}
