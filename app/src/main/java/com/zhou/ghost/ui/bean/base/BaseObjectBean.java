package com.zhou.ghost.ui.bean.base;

/**
 * @Auther: zhou
 * @Date: 2018/7/23 9:16
 * @Description:
 */
public class BaseObjectBean<T> extends BaseBean{

    protected T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
