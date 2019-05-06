package com.zhou.ghost.ui.model.main;


import com.zhou.ghost.ui.bean.PigFarmInfo;
import com.zhou.ghost.ui.bean.PigFieldInfo;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.model.base.BaseModel;
import com.zhou.ghost.ui.view.base.BaseView;

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
