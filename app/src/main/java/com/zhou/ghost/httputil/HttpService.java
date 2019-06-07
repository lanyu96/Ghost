package com.zhou.ghost.httputil;


import com.google.gson.JsonObject;

import java.util.List;

import com.zhou.ghost.ui.bean.AppInfo;
import com.zhou.ghost.ui.bean.Login;
import com.zhou.ghost.ui.bean.base.BaseObjectBean;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.ui.bean.weather.WeatherJson;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @Auther: zhou
 * @Date: 2018/11/6 16:26
 * @Description:
 */
public interface HttpService {

    @POST("appinterface/checkPermission.json")
    Call<JsonObject> getPermission(@Body RequestBody info);

    @POST("appinterface/login.json")
    Call<BaseObjectBean<Login>> login(@Body RequestBody info);

    @POST("appinterface/getList.json")
    Call<JsonObject> getList(@Body RequestBody info);

    @POST("appinterface/getData.json")
    Call<JsonObject> getData(@Body RequestBody info);

//    @POST("appinterface/getEnumInfo.json")
//    Call<JsonObject> getEumInfo(@Body RequestBody info);

    @POST("appinterface/uploadData.json")
    Call<JsonObject> uploadData(@Body RequestBody info);

    @POST("appinterface/deleteData.json")
    Call<JsonObject> deleteData(@Body RequestBody info);

    @POST("appinterface/auditData.json")
    Call<JsonObject> checkData(@Body RequestBody info);

    @POST("appinterface/unAuditData.json")
    Call<JsonObject> unCheckData(@Body RequestBody info);

    @Multipart
    @POST("appinterface/uploadAttachment.json")
    Call<JsonObject> putFile(@Part("params") RequestBody params,
                             @Part() MultipartBody.Part parts);

    @Multipart
    @POST("appinterface/uploadAttachment.json")
    Call<JsonObject> putFiles(@Part("params") RequestBody params,
                              @Part() List<MultipartBody.Part> parts);

    @POST("appinterface/getAttachmentList.json")
    Call<JsonObject> getFilesInfo(@Body RequestBody info);

    @POST("appinterface/getAttachmentData.json")
    Call<ResponseBody> getFile(@Body RequestBody info);

    @FormUrlEncoded
    @POST("app_update_zhou.json")
    Call<AppInfo> getAppInfo(@Field("isAble") int isAble);

//    @GET("weather/{weather-type}?{parameters}")
//    Call<ResponseBody> getWeatherInfo(@Query("weather-type") String weatherType, @Query("parameters") String parameters);
    @GET("weather/now?location=jiaozhou&key=e01c51cd6f67440a93cc2b764a93d122")
    Call<WeatherBean> getWeatherInfo();




//    @POST("appinterface/changePassword.json")
//    Call<JsonObject> changePassword(@Body RequestBody info);
//
//    @POST("appinterface/getNumByBuilding.json")
//    Call<JsonObject> getNumByBuilding(@Body RequestBody info);
//
//    @POST("appinterface/rpt.json")
//    Call<JsonObject> getRptData(@Body RequestBody info);



}
