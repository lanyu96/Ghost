package com.zhou.ghost.httputil;

import android.app.Activity;
import android.app.Fragment;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.ui.bean.Login;
import com.zhou.ghost.ui.bean.base.BaseBean;
import com.zhou.ghost.ui.bean.base.BaseObjectBean;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.ui.view.base.BaseView;
import com.zhou.ghost.utils.NetworkUtils;
import com.zhou.ghost.utils.util.PreferencesService;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @Auther: zhou
 * @Date: 2018/11/8 9:40
 * @Description:
 */
public class HttpCallBack implements Callback<JsonObject> {
    private CallBackListener<JsonObject> listener;

    private TryAgainListener tryAgainlistener;

    private boolean tryAgain;

    private BaseView mBaseView;

    public HttpCallBack(BaseView context) {

        mBaseView = context;
    }
    public HttpCallBack(BaseView context, boolean tryAgain, CallBackListener<JsonObject> listener, TryAgainListener tryAgainlistener) {
        this.listener = listener;
        this.tryAgainlistener = tryAgainlistener;
        this.tryAgain = tryAgain;
        mBaseView = context;
    }

    @Override
    public void onResponse(Call<JsonObject> call, final Response<JsonObject> response) {
        if(mBaseView==null){
            return;
        }else{
            if(mBaseView instanceof Activity &&((Activity) mBaseView).isFinishing()){
                return;
            }
            if(mBaseView instanceof Fragment &&((Fragment) mBaseView).getActivity().isFinishing()){
                return;
            }
        }
        checkResponse(response);
    }

    private void checkResponse(final Response<JsonObject> response) {
        if (response.isSuccessful()) {
            BaseBean bean = new Gson().fromJson(response.body(), new TypeToken<BaseBean>() {
            }.getType());
            if (bean.isSuccess()) {
                listener.onSuccess(response.body());
            } else if (bean.isLogOut()) {
                login(new CallBackListener<String>() {
                    @Override
                    public void onSuccess(String s) {
                        if (tryAgain) {
                            tryAgainlistener.onTryAgainListener();
                        } else {
                            listener.onError("连接失败");
                        }
                    }

                    @Override
                    public void onError(String error) {
                        listener.onError(error);
                    }
                });

            } else {
                listener.onError(bean.getMessage());
            }
        } else {
            listener.onError("错误代码：" + response.code() + "");
        }
    }

    @Override
    public void onFailure(Call<JsonObject> call, Throwable t) {
        if(mBaseView==null){
            return;
        }else{
            if(mBaseView instanceof Activity &&((Activity) mBaseView).isFinishing()){
                return;
            }
            if(mBaseView instanceof Fragment &&((Fragment) mBaseView).getActivity().isFinishing()){
                return;
            }
        }
        if(NetworkUtils.isAvailable(MyApp.getContext())) {
            listener.onError("服务器连接失败");
        }else{
            listener.onError("请检查本地网络");
        }
    }

    /**
     * 登陆
     *
     * @param listener
     */
    public void login(final CallBackListener<String> listener) {
        JSONObject root = new JSONObject();

        try {
            root.put("eid", HttpContants.TEST);
            root.put("userNum", MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""));
            root.put("pwd", MyApp.getPreferencesService().getValue(SPConstants.LOGIN_PASSWORD, ""));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), root.toString());
        RetrofitManager.getService().login(requestBody).enqueue(new Callback<BaseObjectBean<Login>>() {
            @Override
            public void onResponse(Call<BaseObjectBean<Login>> call, Response<BaseObjectBean<Login>> response) {
                if(mBaseView==null){
                    return;
                }else{
                    if(mBaseView instanceof Activity &&((Activity) mBaseView).isFinishing()){
                        return;
                    }
                    if(mBaseView instanceof Fragment &&((Fragment) mBaseView).getActivity().isFinishing()){
                        return;
                    }
                }
                BaseObjectBean<Login> baseObjectBean = response.body();
                if(baseObjectBean==null){
                    listener.onError("服务器未返回信息");
                    return;
                }
                if (baseObjectBean.isSuccess()) {
                    PreferencesService ps = MyApp.getPreferencesService();
                    ps.save(SPConstants.SESSIONID, baseObjectBean.getData().getSessionId());
                    ps.save(SPConstants.USERID,baseObjectBean.getData().getUserId());
                    ps.save(SPConstants.USERNAME,baseObjectBean.getData().getUserName());
                    listener.onSuccess("success");
                } else {
                    listener.onError(baseObjectBean.getMessage());
                }
            }

            @Override
            public void onFailure(Call<BaseObjectBean<Login>> call, Throwable t) {
                if(mBaseView==null){
                    return;
                }else{
                    if(mBaseView instanceof Activity &&((Activity) mBaseView).isFinishing()){
                        return;
                    }
                    if(mBaseView instanceof Fragment &&((Fragment) mBaseView).getActivity().isFinishing()){
                        return;
                    }
                }
                if(NetworkUtils.isAvailable(MyApp.getContext())) {
                    listener.onError("服务器连接失败");
                }else{
                    listener.onError("请检查本地网络");
                }
            }
        });
    }

    public interface TryAgainListener {
        void onTryAgainListener();
    }
}
