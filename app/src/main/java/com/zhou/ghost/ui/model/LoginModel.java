package com.zhou.ghost.ui.model;


import com.zhou.ghost.ui.bean.PigFarmInfo;
import com.zhou.ghost.ui.bean.PigFieldInfo;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.model.base.BaseModel;
import com.zhou.ghost.ui.view.base.BaseActivityView;

/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:50
 * @Description:
 */
public interface LoginModel extends BaseModel {
    void login(BaseActivityView context, String user, String pass, CallBackListListener<PigFarmInfo> listener);
   //void get(String user, String pass, CallBackListener<PigFarmInfo> listener);
    void keepFarmInfo(String farmName, String farmId);

    //获取分厂信息
    void getFieldInfoFromNet(BaseActivityView context, final CallBackListListener<PigFieldInfo> listener);

    void keepFieldInfo(String name, String id, String fq2pz);
}
