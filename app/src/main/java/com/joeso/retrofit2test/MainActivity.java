package com.joeso.retrofit2test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

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
                        .baseUrl("http://fitstop.pixelforcesystems.com.au/")
                        .build();
                XxxAPI api= retrofit.create(XxxAPI.class);

                Call<User> call = api.signIn("0405060781","1111");
                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        Log.d("jjjj","OK");
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.d("jjjj","Fail");
                    }
                });
            }
        });
    }
}
