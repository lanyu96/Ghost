package com.zhou.ghost.ui.presenter.main;


import com.zhou.ghost.ui.model.main.MainReportModel;
import com.zhou.ghost.ui.model.main.MainReportModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.main.MainReportView;

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


