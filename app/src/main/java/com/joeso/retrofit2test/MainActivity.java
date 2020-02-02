package com.joeso.retrofit2test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create()) // 使用 Gson 解析
                        .baseUrl("http://192.168.3.103/")
                        .build();
                XxxAPI api= retrofit.create(XxxAPI.class);

                Call<List<WeatherForecast>> call = api.getWeatherList();
                call.enqueue(new Callback<List<WeatherForecast>>() {
                    @Override
                    public void onResponse(Call<List<WeatherForecast>> call, Response<List<WeatherForecast>> response) {
                        List<WeatherForecast> weatherList=response.body();
                        for(int i=0;i<weatherList.size();i++){

                            Log.d("jjjj",weatherList.get(i).getSummary()==null?"null":"not null");
                        }
                    }
                    @Override
                    public void onFailure(Call<List<WeatherForecast>> call, Throwable t) {
                        Log.d("jjjj",t.getMessage());
                    }
                });
            }
        });
    }
}
