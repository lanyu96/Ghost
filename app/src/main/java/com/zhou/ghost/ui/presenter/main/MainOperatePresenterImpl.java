package com.zhou.ghost.ui.presenter.main;


import java.util.ArrayList;
import java.util.List;

import com.zhou.ghost.ui.bean.MainFunction;
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
    private List<MainFunction> mList;

    @Override
    public void initData() {
        mList = new ArrayList<>();
    }

    @Override
    public MainOperateModel initModel() {
        return new MainOperateModelImpl();
    }

    //将功能填入
    public List<MainFunction> getFunction() {
        if (mList.size() == 0) {
            mModel.addFunction(mList, getView().getContext());
        }
        return mList;
    }

}
