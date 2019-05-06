package com.zhou.ghost.httputil;


import com.google.gson.JsonObject;

import java.util.List;

import mvp.com.zhou.mvp.ui.bean.AppInfo;
import mvp.com.zhou.mvp.ui.bean.Login;
import mvp.com.zhou.mvp.ui.bean.base.BaseObjectBean;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * @Auther: LIUQNGFEI
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

    @POST("appinterface/getEnumInfo.json")
    Call<JsonObject> getEumInfo(@Body RequestBody info);

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
    @POST("getAppRecord.json")
    Call<AppInfo> getAppInfo(@Field("newString") String info, @Field("appName") String appName);

    @POST("appinterface/changePassword.json")
    Call<JsonObject> changePassword(@Body RequestBody info);

    @POST("appinterface/getNumByBuilding.json")
    Call<JsonObject> getNumByBuilding(@Body RequestBody info);

    @POST("appinterface/rpt.json")
    Call<JsonObject> getRptData(@Body RequestBody info);

}
