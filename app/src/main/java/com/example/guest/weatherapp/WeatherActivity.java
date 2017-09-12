package com.example.guest.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        mWeatherTextView = (TextView) findViewById(R.id.weatherTextView);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mWeatherTextView.setText("Here is the weather near: " + location);
    }
}
