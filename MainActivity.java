package com.example.myapplication;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private long pauseOffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);


        button.setOnClickListener(view -> chronometer.start());

        button2.setOnClickListener(view -> chronometer.stop());
        button3.setOnClickListener(view -> {
            chronometer.setBase(SystemClock.elapsedRealtime());
            pauseOffset=0;
        });

    }

}
