package com.zhou.ghost.ui.presenter.tool;

import com.zhou.ghost.ui.model.tool.BirthdayModel;
import com.zhou.ghost.ui.model.tool.BirthdayModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.tool.BirthdayView;

public class BirthdayPresenterImpl extends BasePresenterImpl<BirthdayView, BirthdayModel> {
    @Override
    public void initData() {

    }

    @Override
    public BirthdayModel initModel() {
        return new BirthdayModelImpl();
    }
}
