package com.zhou.ghost.ui.model.main;


import mvp.com.zhou.mvp.ui.bean.PigFarmInfo;
import mvp.com.zhou.mvp.ui.bean.PigFieldInfo;
import mvp.com.zhou.mvp.ui.callback.CallBackListListener;
import mvp.com.zhou.mvp.ui.model.base.BaseModel;
import mvp.com.zhou.mvp.ui.view.base.BaseView;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public interface MainPersonModel extends BaseModel {
    void getFarmInfoFromNet(BaseView view, CallBackListListener<PigFarmInfo> listListener);

    void getFieldInfoFromNet(BaseView view, CallBackListListener<PigFieldInfo> listListener);

    void keepFarmInfo(String farmName, String farmId);

    void keepFieldInfo(String name, String id, String fq2pz);
}
