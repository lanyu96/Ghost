package com.zhou.ghost.ui.model;


import android.text.TextUtils;

import java.util.HashMap;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.httputil.HttpContants;
import com.zhou.ghost.httputil.HttpRequest;
import com.zhou.ghost.httputil.NetUtil;
import com.zhou.ghost.ui.bean.PigFarmInfo;
import com.zhou.ghost.ui.bean.PigFieldInfo;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.callback.CallBackListener;
import com.zhou.ghost.ui.model.base.BaseModelImpl;
import com.zhou.ghost.ui.view.base.BaseActivityView;
import com.zhou.ghost.utils.util.PreferencesService;


/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:51
 * @Description:
 */
public class LoginModelImpl extends BaseModelImpl implements LoginModel {


    @Override
    public void login(final BaseActivityView context, final String user, final String pass, final CallBackListListener<PigFarmInfo> listener) {
        saveLoginInfo(user, pass);
        final HashMap<String, String> jsonParams = new HashMap<>();
        jsonParams.put("userNum", user);

        if (HttpContants.USE_HTTP) {
            HttpRequest.login(context,new CallBackListener<String>() {
                @Override
                public void onSuccess(String s) {
                   NetUtil.getFarmInfoFromNet(context,listener);
                }

                @Override
                public void onError(String error) {
                    listener.onError(error);
                }
            });


        } else {

//
//            HashMap<String, String> params = new HashMap<>();
//            params.put("jsonStr", DataUtils.getJsonString(jsonParams));
//            WSBaseUtil.webServiceStart(WSContants.getInfoFacade(), WSContants.getPersonInfo, params, new WSBaseUtil.WsListener() {
//                @Override
//                public void onSuccess(String result) {
//                    Gson gson = new Gson();
//                    BaseListBean<PigFarmInfo> bean = gson.fromJson(result, new TypeToken<BaseListBean<PigFarmInfo>>() {
//                    }.getType());
//                    if (bean.isSuccess()) {
//                        listener.onSuccess(bean.getPigFarms());
//                    } else {
//                        listener.onError(bean.getMessage());
//                    }
//                }
//
//                @Override
//                public void onError(String error) {
//                    listener.onError(error);
//                }
//            });
        }
    }


    private void saveLoginInfo(String user, String pass) {
        PreferencesService ps = MyApp.getPreferencesService();
        ps.save(SPConstants.LOGIN_USER, user);
        ps.save(SPConstants.LOGIN_PASSWORD, pass);
    }

    /**
     * 保存农场信息
     */
    @Override
    public void keepFarmInfo(String farmName, String farmId) {
        PreferencesService ps = MyApp.getPreferencesService();
        if (TextUtils.isEmpty(ps.getValue(SPConstants.STYLE_ID,""))){
            ps.save(SPConstants.STYLE_ID,"简约");
        }

        if (isEmpty(ps.getValue(SPConstants.FARM_ID, ""))||
                !ps.getValue(SPConstants.FARM_ID, "").equals(farmId)) {
            ps.save(SPConstants.FIELD_ID, "");
            ps.save(SPConstants.FIELD_NAME, "");
            ps.save(SPConstants.FQ2PZ, "");
        }
        ps.save(SPConstants.FARM_NAME, farmName);
        ps.save(SPConstants.FARM_ID, farmId);
    }


    /**
     * 获取分场
     */
    public void getFieldInfoFromNet(BaseActivityView context, final CallBackListListener<PigFieldInfo> listener) {

        String queryStr = "Pigfarm.id='" + MyApp.getPreferencesService().getValue(SPConstants.FARM_ID, "") + "'";
        NetUtil.getFieldInfoFromNet(context,queryStr,listener);
    }

    @Override
    public void keepFieldInfo(String name, String id, String fq2pz) {
        PreferencesService ps = MyApp.getPreferencesService();
        ps.save(SPConstants.FIELD_NAME, name);
        ps.save(SPConstants.FIELD_ID, id);
        ps.save(SPConstants.FQ2PZ, id);

    }
}
