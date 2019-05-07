package com.zhou.ghost.ui.presenter.main;


import com.zhou.ghost.ui.model.main.MainOperateModel;
import com.zhou.ghost.ui.model.main.MainOperateModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.main.MainOperateView;

/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:27
 * @Description:
 */
public class MainOperatePresenterImpl extends BasePresenterImpl<MainOperateView, MainOperateModel> {


    @Override
    public void initData() {

    }

    @Override
    public MainOperateModel initModel() {
        return new MainOperateModelImpl();
    }

}
