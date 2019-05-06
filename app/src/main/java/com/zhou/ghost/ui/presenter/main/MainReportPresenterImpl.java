package com.zhou.ghost.ui.presenter.main;


import mvp.com.zhou.mvp.ui.model.main.MainReportModel;
import mvp.com.zhou.mvp.ui.model.main.MainReportModelImpl;
import mvp.com.zhou.mvp.ui.presenter.base.BasePresenterImpl;
import mvp.com.zhou.mvp.ui.view.main.MainReportView;

/**
 * @Auther: LIUQNGFEI
 * @Date: 2018/7/27 15:27
 * @Description:
 */
public class MainReportPresenterImpl extends BasePresenterImpl<MainReportView, MainReportModel> {

    @Override
    public void initData() {
    }

    @Override
    public MainReportModel initModel() {
        return new MainReportModelImpl();
    }



    }


