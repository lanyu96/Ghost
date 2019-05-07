package com.zhou.ghost.ui.view;


import android.support.v4.app.FragmentManager;

import com.zhou.ghost.ui.view.base.BaseActivityView;


/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:22
 * @Description:
 */
public interface MainView extends BaseActivityView {
    FragmentManager getSupportFragmentManager();


    void selectTab(int position);
}
