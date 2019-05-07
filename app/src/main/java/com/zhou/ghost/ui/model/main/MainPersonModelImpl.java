package com.zhou.ghost.ui.model.main;


import org.greenrobot.eventbus.EventBus;

import com.zhou.ghost.MyApp;
import com.zhou.ghost.constant.SPConstants;
import com.zhou.ghost.httputil.NetUtil;
import com.zhou.ghost.ui.bean.PigFarmInfo;
import com.zhou.ghost.ui.bean.PigFieldInfo;
import com.zhou.ghost.ui.bean.eventbus.PigFieldMessage;
import com.zhou.ghost.ui.callback.CallBackListListener;
import com.zhou.ghost.ui.model.base.BaseModelImpl;
import com.zhou.ghost.ui.view.base.BaseView;
import com.zhou.ghost.utils.util.PreferencesService;

/**
 * @Auther: zhou
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
