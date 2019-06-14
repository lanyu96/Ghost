package com.zhou.ghost.httputil;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.bean.AppInfo;
import com.zhou.ghost.ui.bean.weather.WeatherBean;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.ui.view.base.BaseView;
import com.zhou.ghost.utils.DataUtils;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * @Auther: zhou
 * @Date: 2018/11/7 17:00
 * @Description:
 */
public class HttpRequest {

    public static void login(BaseView context, CallBackListener<String> listener) {
        new HttpCallBack(context).login(listener);
    }

    public static void getPermission(final BaseView context, final boolean tryAgain, final List<String> permissions, final CallBackListener<JsonObject> listener) {
        JsonObject object = new JsonObject();
        object.addProperty("userId", MyApp.getPreferencesService().getValue(SPConstants.USERID, ""));
        JsonArray array = new JsonArray();
        for (int i = 0; i < permissions.size(); i++) {
            array.add(permissions.get(i));
        }
        object.add("permissionNumber", array);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(object));
        RetrofitManager.getService().getPermission(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                getPermission(context, false, permissions, listener);
            }
        }));
    }


    public static void getData(final BaseView context, final boolean tryAgain, final HashMap<String, String> jsonParams, final CallBackListener<JsonObject> listener) {
        checkParams(jsonParams);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonParams));
        RetrofitManager.getService().getData(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                getData(context, false, jsonParams, listener);
            }
        }));
    }

    public static void getData(final BaseView context, final boolean tryAgain, final JsonObject jsonObject, final CallBackListener<JsonObject> listener) {
        checkParams(jsonObject);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        RetrofitManager.getService().getData(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                getData(context, false, jsonObject, listener);
            }
        }));
    }

    public static void getList(final BaseView context, final boolean tryAgain, final HashMap<String, String> jsonParams, final CallBackListener<JsonObject> listener) {
        checkParams(jsonParams);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonParams));
        RetrofitManager.getService().getList(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                getList(context, false, jsonParams, listener);
            }
        }));
    }


    public static void uploadData(final BaseView context, final boolean tryAgain, final JsonObject object, final String bosType, final CallBackListener<JsonObject> listener) {
        object.addProperty("APP_BIZTYPE_CONSTANT", "PigFarmAll");
        object.addProperty("APP_BIZBOSTYPE_CONSTANT", bosType);

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(object));
        RetrofitManager.getService().uploadData(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                uploadData(context, false, object, bosType, listener);
            }
        }));
    }

    /**
     * App 天气接口
     */
    public static void getWeatherInfo(final String location, final CallBackListener<WeatherBean.HeWeather6Bean> listener) {

        RetrofitManager.getWeatherInfo().getWeatherInfo(location).enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {

                WeatherBean.HeWeather6Bean heWeather6Bean = response.body().getHeWeather6().get(0);
                if (heWeather6Bean.getStatus().equals("ok")) {
                    listener.onSuccess(response.body().getHeWeather6().get(0));
                } else {
                    listener.onError("请求成功，但返回失败"+heWeather6Bean.getStatus());
                }

            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {
                    listener.onError(t.toString());
            }
        });
    }


    /**
     * App更新接口
     * @param listener
     */
    public static void getAppData(final CallBackListener<AppInfo> listener) {


//        RequestBody requestBody = RequestBody.create(MediaType.parse("application/text"), "newString=1");
        RetrofitManager.getAppService().getAppInfo(1).enqueue(new Callback<AppInfo>() {
            @Override
            public void onResponse(Call<AppInfo> call, Response<AppInfo> response) {


                    if (response.body() !=null) {
                        listener.onSuccess(response.body());
                    } else {
                        listener.onError("");
                    }


            }

            @Override
            public void onFailure(Call<AppInfo> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        });
    }


    public static void deleteData(final BaseView context, final boolean tryAgain, final String bosType, final List<String> ids, final CallBackListener<JsonObject> listener) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bosType", bosType);

        JsonArray ja = new JsonArray();
        for (int i = 0; i < ids.size(); i++) {
            ja.add(ids.get(i));
        }
        jsonObject.add("Ids", ja);
        checkParams(jsonObject);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        RetrofitManager.getService().deleteData(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                deleteData(context, false, bosType, ids, listener);
            }
        }));
    }

    public static void checkData(final BaseView context, final boolean tryAgain, final String bosType, final String id, final CallBackListener<JsonObject> listener) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bosType", bosType);

        jsonObject.addProperty("functionName", "AUDIT");
        //审核操作添加id
        JsonObject obj = new JsonObject();
        obj.addProperty("id", id);
        jsonObject.add("params", obj);
        checkParams(jsonObject);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        RetrofitManager.getService().checkData(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                checkData(context, false, bosType, id, listener);
            }
        }));
    }

    public static void unCheckData(final BaseView context, final boolean tryAgain, final String bosType, final String id, final CallBackListener<JsonObject> listener) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bosType", bosType);

        jsonObject.addProperty("functionName", "UNAUDIT");
        //审核操作添加id
        JsonObject obj = new JsonObject();
        obj.addProperty("id", id);
        jsonObject.add("params", obj);
        checkParams(jsonObject);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        RetrofitManager.getService().unCheckData(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                unCheckData(context, false, bosType, id, listener);
            }
        }));
    }

    private static void checkParams(HashMap<String, String> jsonParams) {
        if (!jsonParams.containsKey("APP_BIZTYPE_CONSTANT")) {
            jsonParams.put("APP_BIZTYPE_CONSTANT", "PigFarmAll");
        }
    }

    private static void checkParams(JsonObject jsonObject) {
        if (!jsonObject.has("APP_BIZTYPE_CONSTANT")) {
            jsonObject.addProperty("APP_BIZTYPE_CONSTANT", "PigFarmAll");
        }
    }

    /**
     * 上传单张图片
     *
     * @param context
     * @param tryAgain
     * @param file
     * @param id
     * @param listener
     */
    public static void putFile(final BaseView context, final boolean tryAgain, final File file, final String id, final CallBackListener<JsonObject> listener) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("billId", id);

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        // 创建 RequestBody，用于封装构建RequestBody
        RequestBody requestFile =
                RequestBody.create(MediaType.parse("multipart/form-data"), file);

// MultipartBody.Part  和后端约定好Key，这里的partName是用image
        MultipartBody.Part body =
                MultipartBody.Part.createFormData("file", file.getName(), requestFile);


        RetrofitManager.getService().putFile(requestBody, body).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                putFile(context, false, file, id, listener);
            }
        }));
    }

    /**
     * 上传多张图片
     *
     * @param context
     * @param tryAgain
     * @param files
     * @param id
     * @param listener
     */
    public static void putFiles(final BaseView context, final boolean tryAgain, final List<File> files, final String id, final CallBackListener<JsonObject> listener) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("billId", id);

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        List<MultipartBody.Part> bodys = new ArrayList<>();
        for (int i = 0; i < files.size(); i++) {
            // 创建 RequestBody，用于封装构建RequestBody
            RequestBody requestFile =
                    RequestBody.create(MediaType.parse("multipart/form-data"), files.get(i));

// MultipartBody.Part  和后端约定好Key，这里的partName是用image
            MultipartBody.Part body =
                    MultipartBody.Part.createFormData("file", files.get(i).getName(), requestFile);
            bodys.add(body);

        }

        RetrofitManager.getService().putFiles(requestBody, bodys).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                putFiles(context, false, files, id, listener);
            }
        }));
    }

    /**
     * 获取附件列表
     *
     * @param context
     * @param tryAgain
     * @param id
     * @param listener
     */
    public static void getFilesInfo(final BaseView context, final boolean tryAgain, final String id, final CallBackListener<JsonObject> listener) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("billId", id);

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        RetrofitManager.getService().getFilesInfo(requestBody).enqueue(new HttpCallBack(context, tryAgain, listener, new HttpCallBack.TryAgainListener() {
            @Override
            public void onTryAgainListener() {
                getFilesInfo(context, false, id, listener);
            }
        }));
    }

    /**
     * 获取附件列表
     *
     * @param context
     * @param id
     * @param listener
     */
    public static void getFile(final BaseView context, final String id, final CallBackListener<String> listener) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", id);

        final RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), DataUtils.getJsonString(jsonObject));
        RetrofitManager.getService().getFile(requestBody).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (context == null) {
                    return;
                } else {
                    if (context instanceof Activity && ((Activity) context).isFinishing()) {
                        return;
                    }
                    if (context instanceof Fragment && ((Fragment) context).getActivity().isFinishing()) {
                        return;
                    }
                }
                writeResponseBodyToDisk(context, response.body(), listener);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (context == null) {
                    return;
                } else {
                    if (context instanceof Activity && ((Activity) context).isFinishing()) {
                        return;
                    }
                    if (context instanceof Fragment && ((Fragment) context).getActivity().isFinishing()) {
                        return;
                    }
                }
                listener.onError("获取图片失败");
            }
        });
    }

    /**
     * 保存下载的图片流写入SD卡文件
     *
     * @param body     image stream
     * @param listener
     */
    public static void writeResponseBodyToDisk(BaseView context, ResponseBody body, CallBackListener<String> listener) {
        String path = null;
        if (body == null) {
            context.showToast("图片源错误");
            return;
        }
        try {
            InputStream is = body.byteStream();

            String imageName = new Date().getTime() + "_img_from_net.jpg";

            File file = new File(MyApp.getContext().getCacheDir().getPath(), imageName);
            if (file.exists()) {
                file.delete();
                file = new File(MyApp.getContext().getCacheDir().getPath(), imageName);
            }


            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buffer = new byte[1024];
            int len;
            FileOutputStream fos = new FileOutputStream(file);
            while ((len = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            path = file.getPath();
            fos.flush();
            fos.close();
            bis.close();
            is.close();
            listener.onSuccess(path);
        } catch (IOException e) {
            e.printStackTrace();
            listener.onError("下载失败");
        }
    }


}
