package com.zhou.ghost.ui.model.base;



/**
 * @Auther: zhou
 * @Date: 2018/7/30 18:00
 * @Description:
 */
public class BaseModelImpl implements BaseModel{

    @Override
    public void onDestroy() {
        //根据 Tag 取消请求
       // OkHttpUtils.getInstance().cancelTag(this);
    }

    @Override
    public boolean isEmpty(String str) {
        return str == null || ("").equals(str);
    }
}
