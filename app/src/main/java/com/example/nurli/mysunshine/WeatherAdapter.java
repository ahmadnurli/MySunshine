package com.example.nurli.mysunshine;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nurli on 13/08/17.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather,parent,false);

        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder{

        private final ImageView mWeatherImage;
        private final TextView mWeatherDate;
        private final TextView mWeatherDesc;
        private final TextView mWeatherTeamperatur;
        private final CardView mWeatherCardView;

        public WeatherViewHolder(View itemView) {

            super(itemView);

            mWeatherImage = (ImageView) itemView.findViewById(R.id.img_weather);
            mWeatherDate = (TextView) itemView.findViewById(R.id.txt_adapter_weather_day);
            mWeatherDesc = (TextView) itemView.findViewById(R.id.txt_weather_desc);
            mWeatherTeamperatur = (TextView) itemView.findViewById(R.id.txt_adapter_weather_suhu);
            mWeatherCardView = (CardView) itemView.findViewById(R.id.cv_adapter_weather);


        }
    }
}
