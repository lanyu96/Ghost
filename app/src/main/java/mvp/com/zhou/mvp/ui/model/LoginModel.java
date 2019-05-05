package mvp.com.zhou.mvp.ui.model;


import mvp.com.zhou.mvp.ui.bean.PigFarmInfo;
import mvp.com.zhou.mvp.ui.bean.PigFieldInfo;
import mvp.com.zhou.mvp.ui.callback.CallBackListListener;
import mvp.com.zhou.mvp.ui.model.base.BaseModel;
import mvp.com.zhou.mvp.ui.view.base.BaseActivityView;

/**
 * @Auther: LIUQNGFEI
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
