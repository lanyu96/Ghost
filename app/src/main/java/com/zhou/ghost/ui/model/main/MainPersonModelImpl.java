package com.zhou.ghost.ui.model.main;


import org.greenrobot.eventbus.EventBus;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.constant.SPConstants;
import mvp.com.zhou.mvp.httputil.NetUtil;
import mvp.com.zhou.mvp.ui.bean.PigFarmInfo;
import mvp.com.zhou.mvp.ui.bean.PigFieldInfo;
import mvp.com.zhou.mvp.ui.bean.eventbus.PigFieldMessage;
import mvp.com.zhou.mvp.ui.callback.CallBackListListener;
import mvp.com.zhou.mvp.ui.model.base.BaseModelImpl;
import mvp.com.zhou.mvp.ui.view.base.BaseView;
import mvp.com.zhou.mvp.utils.util.PreferencesService;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:34
 * @Description:
 */
public class MainPersonModelImpl extends BaseModelImpl implements MainPersonModel {


    @Override
    public void getFarmInfoFromNet(BaseView view, CallBackListListener<PigFarmInfo> listListener) {
        NetUtil.getFarmInfoFromNet(view,listListener);
    }

    @Override
    public void getFieldInfoFromNet(BaseView view, CallBackListListener<PigFieldInfo> listListener) {
        String queryStr = "Pigfarm.id='" + MyApp.getPreferencesService().getValue(SPConstants.FARM_ID, "") + "'";
        NetUtil.getFieldInfoFromNet(view,queryStr,listListener);
    }

    /**
     * 保存农场信息
     */
    @Override
    public void keepFarmInfo(String farmName, String farmId) {
        PreferencesService ps = MyApp.getPreferencesService();
        if (isEmpty(ps.getValue(SPConstants.FARM_ID, ""))||
                !ps.getValue(SPConstants.FARM_ID, "").equals(farmId)) {
            ps.save(SPConstants.FIELD_ID, "");
            ps.save(SPConstants.FIELD_NAME, "");
            ps.save(SPConstants.FQ2PZ, "");
        }
        ps.save(SPConstants.FARM_NAME, farmName);
        ps.save(SPConstants.FARM_ID, farmId);
    }

    @Override
    public void keepFieldInfo(String name, String id, String fq2pz) {
        PreferencesService ps = MyApp.getPreferencesService();
        if(!ps.getValue(SPConstants.FIELD_ID, "").equals(id)) {
            ps.save(SPConstants.FIELD_NAME, name);
            ps.save(SPConstants.FIELD_ID, id);
            ps.save(SPConstants.FQ2PZ, fq2pz);
            // 发布事件
            EventBus.getDefault().post(new PigFieldMessage());

        }
    }
}
