package com.joeso.retrofit2test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface XxxAPI {
    @POST("/api/v1/auth/sign_in")
    Call<User> signIn(@Query("phone") String phone, @Query("code") String code);

}
