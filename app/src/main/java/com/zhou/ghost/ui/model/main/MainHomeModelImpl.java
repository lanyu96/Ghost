package com.zhou.ghost.ui.model.main;

import android.util.Log;

import com.zhou.ghost.httputil.HttpContants;
import com.zhou.ghost.httputil.RetrofitManager;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.ui.bean.weather.WeatherJson;
import com.zhou.ghost.ui.model.base.BaseModelImpl;
import com.zhou.ghost.utils.DataUtils;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public class MainHomeModelImpl extends BaseModelImpl implements MainHomeModel {


    @Override
    public void getWeatherInfo() {
//        "location=beijing" + "&" + "key=" + HttpContants.WEATHER_KEY
//        RetrofitManager.getWeatherInfo()
//                .getWeatherInfo()
//
//        .enqueue(new Callback<WeatherBean>() {
//
//            private WeatherBean.HeWeather6Bean.NowBean now;
//
//            @Override
//            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
//                String status = response.body().getHeWeather6().get(0).getStatus();
//                for (int i = 0; i < response.body().getHeWeather6().size(); i++) {
//                    now = response.body().getHeWeather6().get(i).getNow();
//                }
//                if (status.equals("ok")) {
//                    Log.i("ZHOUT","天气数据请求成功");
//                    Log.i("ZHOUT", DataUtils.getJsonString(response.body().getHeWeather6()));
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<WeatherBean> call, Throwable t) {
//
//            }
//        });

    }


}
