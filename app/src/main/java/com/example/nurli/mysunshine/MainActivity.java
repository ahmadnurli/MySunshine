package com.example.nurli.mysunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMainToday;
    private ImageView mMainWeather;
    private TextView mMainWeatherDesc;
    private RecyclerView mMainWeatherList;
    private TextView mMainTemperature;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mMainToday = (TextView) findViewById(R.id.txt_day);
        mMainWeather = (ImageView) findViewById(R.id.img_weather);
        mMainWeatherDesc = (TextView) findViewById(R.id.txt_weather_desc);
        mMainTemperature = (TextView) findViewById(R.id.txt_temperature);
        mMainWeatherList = (RecyclerView) findViewById(R.id.rv_weather_list);

        mMainToday.setText("Minggu");
        mMainWeather.setImageResource(R.mipmap.ic_launcher);
        mMainTemperature.setText("32 Derajat");
        mMainWeatherDesc.setText("Petir Siang Bolong");

        GridLayoutManager layoutManager = new GridLayoutManager(this, 1, LinearLayoutManager.VERTICAL, false);
        mMainWeatherList.setLayoutManager(layoutManager);





    }


}
