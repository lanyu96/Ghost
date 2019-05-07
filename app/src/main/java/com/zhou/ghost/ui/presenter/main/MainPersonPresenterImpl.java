package com.zhou.ghost.ui.presenter.main;


import com.zhou.ghost.ui.model.main.MainPersonModel;
import com.zhou.ghost.ui.model.main.MainPersonModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.main.MainPersonView;

/**
 * @Auther: zhou
 * @Date: 2018/7/27 15:27
 * @Description:
 */
public class MainPersonPresenterImpl extends BasePresenterImpl<MainPersonView, MainPersonModel> {

    @Override
    public void initData(){
    }

    @Override
    public MainPersonModel initModel() {
        return new MainPersonModelImpl();
    }




}
