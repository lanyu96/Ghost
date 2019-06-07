package com.zhou.ghost.utils.api;

import android.util.Log;

import com.zhou.ghost.httputil.RetrofitManager;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.utils.DataUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherAPI {
    private String string;
    public String getWeatherInfo() {

        RetrofitManager.getWeatherInfo()
                .getWeatherInfo()

                .enqueue(new Callback<WeatherBean>() {

                    @Override
                    public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                        String status = response.body().getStatus();
                        if (status.equals("ok")) {
                            Log.i("ZHOUT","天气数据请求成功");
                            WeatherBean.BasicBean basic = response.body().getBasic();
                            Log.i("ZHOUT", DataUtils.getJsonString(basic));

                        }
                        string = DataUtils.getJsonString(response.body());


                    }

                    @Override
                    public void onFailure(Call<WeatherBean> call, Throwable t) {
                        string = "error";
                    }
                });


        return string;
    }
}
