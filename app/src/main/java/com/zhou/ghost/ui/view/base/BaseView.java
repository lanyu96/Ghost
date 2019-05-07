package com.zhou.ghost.ui.view.base;

import android.content.Context;
import android.view.View;

/**
 * @Auther: zhou
 * @Date: 2018/7/29 13:48
 * @Description:
 */
public interface BaseView {

    void showToast(String message);

    void showProgress(String message);

    void showProgress(String message, boolean flag);

    void hideProgress();

    void finishUI();

    Context getContext();

    void onMyClick(View v);

}
