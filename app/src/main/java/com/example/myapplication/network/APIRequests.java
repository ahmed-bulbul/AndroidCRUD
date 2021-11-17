package com.example.myapplication.network;

import com.example.myapplication.model.BaseModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIRequests {

    @GET("data/2.5/weather")
    Call<ResponseBody> getWeatherData(@Query("q") String location,
                                      @Query("appid") String app_id);

    @GET("products/index/20/page:{page_number}")
    Call<BaseModel> getAllProducts(@Path("page_number") int pageNumber);

}
