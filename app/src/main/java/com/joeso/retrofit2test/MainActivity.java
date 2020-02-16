package com.joeso.retrofit2test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        final TextView result=findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create()) // 使用 Gson 解析
                        .baseUrl("http://dummy.restapiexample.com")
                        .build();
                XxxAPI api= retrofit.create(XxxAPI.class);

                Call<ResponseData> call = api.getData();
                call.enqueue(new Callback<ResponseData>() {
                    @Override
                    public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                        String list="Name                 Age"+"\n";
                        List<Employee> employees=response.body().getData();
                        for(int i=0;i<employees.size();i++) {
                            Employee employee=employees.get(i);
                            list += employee.getEmployeeName() +"      " +employee.getEmployeeAge()+"\n";
                        }
                        result.setText(list);
                    }
                    @Override
                    public void onFailure(Call<ResponseData> call, Throwable t) {
                        Log.d("jjjj",t.getMessage());
                    }
                });
            }
        });
    }
}
