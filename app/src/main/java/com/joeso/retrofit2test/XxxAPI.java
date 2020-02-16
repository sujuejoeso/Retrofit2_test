package com.joeso.retrofit2test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface XxxAPI {
    @GET("/api/v1/employees")
    Call<ResponseData> getData();

}
