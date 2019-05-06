package com.zhou.ghost.ui.view.main;


import java.util.List;

import mvp.com.zhou.mvp.ui.callback.CallBackPositionListener;
import mvp.com.zhou.mvp.ui.view.base.BaseFragmentView;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:22
 * @Description:
 */
public interface MainPersonView extends BaseFragmentView {

    void showSelectDialog(List<String> list, CallBackPositionListener listener);

    void setFarm(String farm);

    void setField(String field);
}
