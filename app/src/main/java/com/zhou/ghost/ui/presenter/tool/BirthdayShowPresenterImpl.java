package com.zhou.ghost.ui.presenter.tool;

import com.zhou.ghost.ui.model.tool.BirthdayShowModel;
import com.zhou.ghost.ui.model.tool.BirthdayShowModelImpl;
import com.zhou.ghost.ui.presenter.base.BasePresenterImpl;
import com.zhou.ghost.ui.view.tool.BirthdayShowView;

public class BirthdayShowPresenterImpl extends BasePresenterImpl<BirthdayShowView, BirthdayShowModel> {
    @Override
    public void initData() {

    }

    @Override
    public BirthdayShowModel initModel() {
        return new BirthdayShowModelImpl();
    }
}
