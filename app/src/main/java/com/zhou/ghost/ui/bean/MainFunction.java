package com.zhou.ghost.ui.bean;

import android.content.Intent;

/**
 * @Auther: zhou
 * @Date: 2018/10/19 15:43
 * @Description:
 */
public class MainFunction {
    private String name;
    private int imgRes = 0;
    private int order = 0;
    private Intent mIntent;

    public MainFunction() {
    }

    public MainFunction(String name, int imgRes, Intent intent) {
        this.name = name;
        this.imgRes = imgRes;
        this.mIntent = intent;
    }

    public Intent getIntent() {
        return mIntent;
    }

    public void setIntent(Intent intent) {
        mIntent = intent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
