package com.zhou.ghost.ui.bean.base;

import java.util.List;

/**
 * @Auther: zhou
 * @Date: 2018/7/23 9:16
 * @Description:
 */
public class BaseListBean<T> extends BaseBean{

    protected List<T> data;
    //获取农场信息特加字段
    protected List<T> pigFarms;

    public List<T> getPigFarms() {
        return pigFarms;
    }

    public void setPigFarms(List<T> pigFarms) {
        this.pigFarms = pigFarms;
    }


    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


}
